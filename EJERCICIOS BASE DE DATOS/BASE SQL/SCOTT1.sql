SELECT ENAME AS "LOS PANITAS", SAL AS "PAVETES", LPAD ('*', SAL/100, '*') AS GRAFICO
FROM EMP
ORDER BY SAL DESC;
