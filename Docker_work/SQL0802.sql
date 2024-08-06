-- 9) 평균 급여가 가장 높은 부서번호를 출력하세요.
SELECT DEPTNO
FROM(SELECT MAX(AVG)
FROM (
SELECT AVG(SAL) 'AVG'
FROM EMP E
GROUP BY DEPTNO) 
)AS MAX_SAL;

SELECT MAX(avg_salary)
FROM (
    SELECT AVG(SAL) avg_salary
    FROM EMP
    GROUP BY DEPTNO
) dept_avg_salaries;

-- 10) 세일즈맨(SALESMAN)을 제외하고, 업무별 사원의 급여가 3,000 이상인 각 업무에 대해서, 업무명과 업무별 평균 급여를 출력하세요. 단 평균 급여는 내림차순으로 출력합니다.
-- 11) 전체 사원 가운데 직속상관이 있는 사원의 수를 출력하세요.
-- 12) EMP테이블에서 이름, 겹여, 커미션(COMM)금액, 총액(SAL+COMM)을 구하여 총액이 많은 순서대로 출력하세요. 단 커미션이 NULL인 사람은 제외합니다.
-- 13) 부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무이름, 인원수를 출력하세요.
-- 14) 사원이 한 명도 없는 부서의 이름을 출력하세요.
-- 15) 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수를 출력하세요.
-- 16) 사원번호가 7400이상 7600이하인 사원의 이름을 출력하세요.

SELECT cs.name,SUM(od.saleprice),'total'
FROM(
SELECT custid,name
FROM Customer
WHERE custid <=2) cs,
Orders od
WHERE cs.custid=od.custid
group by cs.name;

-- 학생테이블  
-- P.K: 연도+학년+학반+학번
-- 학생이름 : VARCHAR
-- 연도 : INT,CHAR,VARCHAR,DATE
-- 학년 : INT,CHAR,VARCHAR
-- 학번 : INT,CHAR,VARCHAR
-- 패스워드 : VARCHAR

-- 선생님테이블  
-- ID : P.K
-- 패스워드 : VARCHAR
-- 이름 : VARCHAR
-- 과목 : VARCHAR
-- 교사상태 : CHAR(1)

