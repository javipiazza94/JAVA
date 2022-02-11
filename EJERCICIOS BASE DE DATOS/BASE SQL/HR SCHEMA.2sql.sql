
--1. Muestre el nombre del departamento, la dirección y la ciudad de aquellos departamentos que se encuentren en algún estado/provincia que empiece por T--
--2. Muestre salario medio y el job_id de los empleados agrupados por trabajo, teniendo en cuenta que únicamente deberán mostrarse los datos de aquellos grupos con más de 5 empleados.
--3. Muestre cuántos antiguos trabajadores dejaron de trabajar a día 31.
--4. Muestre un mensaje cuyo formato de salida sea: "Calle: STREET_ADDRESS, Ciudad: CITY" con el alias direccion para aquellas filas cuyo código postal tenga una longitud de 4 caracteres.
--5. Muestre el nombre de los países junto con la información del campo region_id de la siguiente forma: Si el id es 1 se mostrará 'EU', si el id es 2 se mostrará 'AM', si el id es 3 se mostrará 'AS', y por defecto se mostrará 'ME'. Ordena los resultados de manera descendente según el nombre del país.
--6. Muestre el número de teléfono al revés de aquellos empleados con trabajo de programador (Programmer). Obtenga esta información a través de una subconsulta. 

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
