/*1. Employees와 Departments 테이블에 저장된 행의 개수를 출력하세요.
2. Employees 테이블에 대한 employee_id, last_name, job_id, hire_date를 출력하세요.
3. Employees 테이블에서 salary가 12,000 이상인 직원의 last_name과 salary를 출력하세요.
4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 department_id를 last_name에 대하여 오름차순으로 출력하세요.
5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.
6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.
7. 급여(salary)의 최대값과 최소값의 차이를 구하세요.
8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요.
*/
-- 1. 성(last name)이 Matos와 Taylor인 직원의 성, 직무 ID(job_id), 시작 날짜(start date)를 출력하는 보고서를 작성하세요. 쿼리를 시작 날짜 기준 오름차순으로 정렬하세요.
select E.last_name, E.job_id, J.start_date
from  job_history J
join  employees E on J.job_id = E.job_id 
where last_name = 'Matos' || last_name = 'Taylor'
order by start_date;
-- 2. 1994년에 고용된 모든 직원의 성(last name)과 입사 날짜(hire date)를 출력하는 보고서가 인사부서에 필요합니다.
select E.last_name, J.start_date
from  job_history J
join  employees E on J.job_id = E.job_id 
where year(start_date) = 1994;
-- 3. 직무가 영업 대표(sales representative) 또는 재고 사원(stock clerk)인 모든 직원의 성(last name), 직무(job), 급여(salary)를 출력하며, 급여가 $2,500, $3,500 또는 $7,000가 아닌 직원들을 포함하세요. 
select E.last_name,J.job_title,E.salary 
from employees E , jobs J
where E.job_id = J.job_id && job_title like 'Sales representative' or 'Stock Clerk' or E.salary not in(2500,3500,7000)

4. 매니저 수를 나열하지 않고 구하세요. 열 이름을 '매니저 수(Number of Managers)'로 표시하세요.
5. 매니저의 번호(manager number)와 해당 매니저 밑에서 가장 낮은 급여를 받는 직원의 급여를 출력하는 보고서를 작성하세요. 매니저가 알려지지 않은 경우와 최소 급여가 $6,000 이하인 그룹은 제외하세요. 출력 값을 급여 내림차순으로 정렬하세요.
6. 직원의 성(last name)과 직원 번호(employee number), 그리고 그들의 매니저의 성(last name)과 매니저 번호(manager number)를 함께 출력하는 보고서를 작성하세요. 열 이름은 각각 'Employee', 'Emp#', 'Manager', 'Mgr#'로 표시하세요.
7. 같은 부서에서 일하는 모든 직원의 성(last name), 부서 번호(department number)를 출력하는 보고서를 인사부서에 작성하세요.
8. 임원 부서(Executive department)에 있는 모든 직원의 부서 번호(department number), 성(last name), 직무 ID(job_id)를 출력하는 보고서를 작성하세요.
9. King에게 보고하는 모든 직원의 성(last name)과 급여(salary)를 출력하는 보고서를 작성하세요.
10. 'ST_CLERK' 직무 ID를 포함하지 않는 부서의 부서 ID 목록이 인사부서에 필요합니다.


-- 1. Employees와 Departments 테이블에 저장된 행의 개수를 출력하세요.
select count(*)
from employees,departments;


select count(department_id)
from departments
union all
select count(employee_id)
from employees;


-- 2. Employees 테이블에 대한 employee_id, last_name, job_id, hire_date를 출력하세요.
select E.employee_id, E.last_name, E.job_id, E.hire_date, J.job_title
from employees E
join jobs J on E.job_id = J.job_id;

select e.employee_id, e.last_name, j.job_title, e.hire_date
from employees e, jobs j
where e.job_id = j.job_id;

-- 3. Employees 테이블에서 salary가 12,000 이상인 직원의 last_name과 salary를 출력하세요.
select last_name, salary 
from employees
where salary > 12000;

-- 4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 department_id를 last_name에 대하여 오름차순으로 출력하세요.
select E.last_name, D.department_id
from departments D
join employees E on D.department_id = E.department_id
where E.department_id = 20 || E.department_id = 50
order by last_name;

select E.last_name, D.department_id
from departments D
join employees E on D.department_id = E.department_id
where D.department_id = 20 || D.department_id = 50
order by last_name;

-- 5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.
select last_name
from employees
where last_name like '__a%';

-- 6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.
select job_title, count(distinct E1.employee_id)
from employees E1, employees E2, jobs J
where E1.employee_id = E2.employee_id and J.job_id = E1.job_id and E1.job_id = E2.job_id
group by job_title
having count(E1.job_id) >= 2;

select job_id, count(*)
from employees
group by job_id
having count(job_id) >= 2;

-- 7. 급여(salary)의 최대값과 최소값의 차이를 구하세요.
select max(salary)-min(salary)
from employees;

select job_title, max_salary- min_salary '차이'
from jobs;

-- 8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요.
select E.last_name, J.job_title, E.department_id, D.department_name
from locations L, departments D, employees E, jobs J
where L.location_id = D.location_id && D.department_id = E.department_id && J.job_id = E.job_id && L.city = 'Toronto';



