
--1. Muestre el nombre del departamento, la direcci�n y la ciudad de aquellos departamentos que se encuentren en alg�n estado/provincia que empiece por T--
--2. Muestre salario medio y el job_id de los empleados agrupados por trabajo, teniendo en cuenta que �nicamente deber�n mostrarse los datos de aquellos grupos con m�s de 5 empleados.
--3. Muestre cu�ntos antiguos trabajadores dejaron de trabajar a d�a 31.
--4. Muestre un mensaje cuyo formato de salida sea: "Calle: STREET_ADDRESS, Ciudad: CITY" con el alias direccion para aquellas filas cuyo c�digo postal tenga una longitud de 4 caracteres.
--5. Muestre el nombre de los pa�ses junto con la informaci�n del campo region_id de la siguiente forma: Si el id es 1 se mostrar� 'EU', si el id es 2 se mostrar� 'AM', si el id es 3 se mostrar� 'AS', y por defecto se mostrar� 'ME'. Ordena los resultados de manera descendente seg�n el nombre del pa�s.
--6. Muestre el n�mero de tel�fono al rev�s de aquellos empleados con trabajo de programador (Programmer). Obtenga esta informaci�n a trav�s de una subconsulta. 

--1--
SELECT D.DEPARTMENT_NAME, L.STREET_ADDRESS, L.CITY
FROM DEPARTMENTS D, LOCATIONS L
WHERE L.LOCATION_ID = D.LOCATION_ID;

--2--
SELECT AVG(SALARY), JOB_ID
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING COUNT (JOB_ID)>5;

--3--
SELECT COUNT (END_DATE)
FROM JOB_HISTORY
WHERE TO_CHAR (END_DATE, 'DD') =31;

--4--
SELECT 'Calle:' ||STREET_ADDRESS|| 'Ciudad:' ||CITY AS Direccion
FROM LOCATIONS
WHERE POSTAL_CODE LIKE '____';

--5--
SELECT COUNTRY_NAME, DECODE(REGION_ID, 1, 'EU', 2, 'AM', 3, 'AS',  'ME')
FROM COUNTRIES
ORDER BY 1 DESC;

--6--
SELECT REVERSE (PHONE_NUMBER)
FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG';
