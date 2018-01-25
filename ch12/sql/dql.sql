# SQL은 비절차적 언어이다.

# 1. 부서번호가 10번 부서 직원의 사원번호, 이름, 월급을 출력
SELECT empno, ename, sal FROM emp WHERE deptno = 10; 

# 2. 사원번호가 7369인 직원의 이름, 입사일, 부서번호를 출력
SELECT ename, hiredate, deptno FROM emp WHERE empno = 7369;

# 3. 이름이 ALLEN인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE ename = 'ALLEN';

# 4. 입사일이 81/12/03인 사원들의 이름, 부서번호, 월급, 입사일을 출력
SELECT ename, deptno, sal, hiredate FROM emp WHERE hiredate = '1981-12-03';

# 5. 직무가 MANAGER가 아닌 직원의 모든 정보를 직무명으로 오름차순 정렬하여 출력 -> 오름차순: ASC 내림차순: DESC
SELECT * FROM emp WHERE job != 'MANAGER' ORDER BY job ASC;

# 6. 입사일이 1981/12/31 이후에 입사한 사원의 정보를 최근 입사한 직원 순서대로 출력
SELECT * FROM emp WHERE hiredate >= '1981-12-31' ORDER BY hiredate DESC;

# 7. 급여가 800 이상인 직원의 이름, 급여, 부서번호를 급여가 작은 순서대로 출력
SELECT ename, sal, deptno FROM emp WHERE sal >= 800 ORDER BY sal ASC;

# 8. 부서번호가 20번 이상인 사원의 모든 정보를 부서번호가 작은 순서대로 출력
SELECT * FROM emp WHERE deptno >= 20 ORDER BY deptno ASC;

# 9. 입사일이 1981-06-01 보다 먼저 입사한 직원들의 모든 정보를 출력
SELECT * FROM emp WHERE hiredate < '1981-06-01'

# 10. 입사일이 81년 하반기에 입사한 사원의 이름, 월급, 입사일을 입사한 순서대로 출력
SELECT ename, sal, hiredate FROM emp WHERE hiredate >= '1981-07-01' && hiredate <= '1981-12-31' ORDER BY hiredate ASC;  
SELECT ename, sal, hiredate FROM emp WHERE hiredate BETWEEN '1981-07-01' AND '1981-12-31'
ORDER BY hiredate ASC;

# 11. 급여가 1600보다 크고 3000보다 작은 직원의 이름, 직무, 급여를 출력
SELECT ename, job, sal FROM emp WHERE sal > 1600 AND sal < 3000;

# 12. 사원번호가 7654와 7782 사이 이외의 사원의 모든 정보를 출력
SELECT * FROM emp WHERE NOT(empno > 7654 AND empno < 7782);

# 13. 이름이 K로 시작하는 직원들보다 높은 이름을 가진 직원의 모든정보 출력, 단, K로 시작하는 직원의 이름도 제외한다.
# ename >= 'L%' -> 이름의 처음이 L부터 Z까지 시작하는 사람 출력 
SELECT * FROM emp WHERE ename >= 'L%';

# 14. 이름이 B와 J사이의 모든 사원의 정보를 출력
SELECT * FROM emp WHERE ename > 'B' AND ename <= 'I%';

# 15. 입사일이 81년 이외에 입사한 직원의 모든 정보를 출력
SELECT * FROM emp WHERE hiredate < '1981-01-01' OR hiredate > '1981-12-31';

# 16. 직무가 MANAGER와 SALESMAN인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE job = 'MANAGER' OR job = 'SALESMAN';

# 17. 부서번호의 20, 30번을 제외한 모든 직원의 이름, 사원번호, 부서번호를 출력
SELECT ename, empno, deptno FROM emp WHERE NOT(deptno = 20 or deptno = 30); 

# 18. 이름이 S로 시작하는 사원의 사원번호, 이름, 입사일, 부서번호를 출력
SELECT empno, ename, hiredate, deptno FROM emp WHERE ename LIKE 'S%';
SELECT empno, ename, hiredate, deptno FROM emp WHERE ename >= 'S%' AND ename < 'T';

# 19. 입사일이 82년도인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE hiredate >= '1982-01-01' AND hiredate <= '1982-12-31';

# 20. 이름 중 대소문자 구분없이 's' 또는 'S'자가 들어가 있는 직원의 모든 정보를 출력 
SELECT * FROM emp WHERE ename LIKE '%S%' OR ename LIKE '%s%'; 

# 21. 이름이 'S'로 시작하고 마지막 글자가 'T'인 직원이 정보를 출력 (단 이름은 전체 5자리이다.)
SELECT * FROM WHERE ename LIKE 'S%T' AND LENGTH(ename) <= 5;
SELECT * FROM WHERE ename LIKE 'S___T';

# 22. 첫번째 문자는 관계없고 두번째 문자가 'A'인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE ename LIKE '_A%';

# 23. 성과급이 null인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE comm IS NULL;

# 24. 커미션이 null이 아닌 직원의 정보를 출력
SELECT * FROM emp WHERE comm IS NOT NULL;

# 25. 커미션이 null이 아니고 0이 아닌 직원의 정보를 출력
SELECT * FROM emp WHERE comm IS NOT NULL AND comm != 0;

# 26. 부서가 30번 부서원중에서 급여가 1500 이상인 직원의 이름, 부서, 월급을 출력
SELECT ename, deptno, sal FROM emp WHERE deptno = 30 AND sal >= 1500;

# 27. 이름의 첫글자가 'K'로 시작하거나 부서번호가 30인 직원의 사원번호, 이름, 부서번호를 출력
SELECT empno, ename, deptno FROM emp WHERE ename LIKE 'K%' OR deptno = 30;

# 28. 급여가 1500 이상이고 부서번호가 30번인 사원중 직무가 MANAGER인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE sal >= 1500 AND deptno = 30 AND job = 'MANAGER';

# 29. 부서번호가 30인 직원의 모든정보를 사원번호에 대하여 오름차순으로 정렬하여 출력
SELECT * FROM emp WHERE deptno = 30 ORDER BY empno ASC;

# 30. 부서번호로 내림차순 하고 이름순으로 오름차순, 급여순으로 내림차순 출력 -> ORDER BY 뒤의 정렬순서는 맨앞이 최우선순위가 됨  
SELECT * FROM emp ORDER BY deptno DESC, ename ASC, sal DESC;

# 부서번호와 그 부서에 속한 사원들의 급여액 합계를 보이시오.
# GROUP BY deptno -> 그룹별로 구분지어서 월급의 합을 구한다
SELECT deptno, SUM(sal) FROM emp GROUP BY deptno;

# 가장 많은 급여를 받는 사원의 급여액과 가장 적은 급여를 받는 사원의 급여액을 보이시오.
SELECT MAX(sal), MIN(sal) FROM emp;
SELECT deptno, MAX(sal), MIN(sal) FROM emp GROUP BY deptno;

# 가장 많은 급여를 받는 사원의 이름을 보이시오.
SELECT ename FROM emp WHERE sal = (SELECT MAX(sal) FROM emp);
SELECT ename, MAX(sal) FROM emp WHERE sal = (SELECT MAX(sal) FROM emp);

# 사원들의 현재 급여와 급여를 10% 인상했을 때의 예상급여를 보이시오.
SELECT ename, sal, sal * 1.1 FROM emp;

# 모든 사원들의 이름과 부서를 보이시오 (EQUAL - JOIN 사용) (dept기본키(PK)-emp외래키(FK)가 같은경우만 가능) 
SELECT emp.ename, dept.dname FROM emp, dept WHERE emp.deptno = dept.deptno;

# 테이블에 별칭을 붙일 수 있다. 
SELECT e.ename, d.dname FROM emp e, dept d WHERE e.deptno = d.deptno;

# SMITH 사원이 속한 부서의 위치는 얼마인가
SELECT d.dname, d.loc FROM emp e, dept d WHERE e.deptno = d.deptno AND e.ename = 'SMITH';

# 사원의 이름과 그 사원의 상사 이름을 보이시오.
# 자기 자신의 테이블을 참조한다 -> 자기참조 
SELECT e.ename, m.ename FROM emp e, emp m WHERE e.mgr = m.empno;












