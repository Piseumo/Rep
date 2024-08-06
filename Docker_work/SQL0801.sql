SELECT ABS(-78), ABS(+78);

SELECT ROUND(4.217891,3);

SELECT concat('마당','서점');

SELECT lower('MR.SCOTT');

SELECT upper('MR.SCOTT');

SELECT lpad('PAGE 1',10,"*");

SELECT replace('jack & jue','j','bl');

SELECT substr('ABCDEFG',3, 4);

SELECT trim('='from "=a=b=c=d=e");

-- 고객별 평균 주문금액을 100원 단위로 반올림하세요

SELECT avg(saleprice)
FROM Orders 
WHERE saleprice in(
SELECT saleprice
FROM Orders O
group by Saleprice);
-- 고객별 나눈 뒤 평균
-- 평균구한뒤 고객별나눔
SELECT O.saleprice
FROM Orders O
WHERE O.custid in(
SELECT Customer.custid
FROM Orders O,Customer C
Where O.custid = C.custid
group by C.custid);
-- 고객별 주문금액
SELECT C.custid,O.saleprice
FROM Orders O,Customer C
Where O.custid = C.custid
group by C.custid,O.saleprice;

-- 도서 제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목목을 나타내세요

SELECT replace(bookname,'야구','농구')
FROM Book;

-- 굿스포츠에서 출판한 도서의 제목과 제목의 문자수,바이트수를 출력하세요
SELECT LENGTH(Book.Bookname),CHAR_LENGTH(Book.Bookname),bookname,publisher
FROM Book
WHERE Book.publisher='굿스포츠';

-- 마당서점의 고객중에서 성이 같은 사람이 몇명이 되는지 알고싶다 성별의인원수를 구하시오.

SELECT substr(name,1,1)'성',count(*)'인원'
FROM Customer C
GROUP BY substr(name,1,1);

SELECT ADDDATE('2024-07-01',INTERVAL -5 DAY) before5,
	   ADDDATE('2024-07-01',INTERVAL +5 DAY) after5;

-- 마당서점은 주문일로부터 10일 후에 매출을 확정한다. 각 주문의 확정일자를 구하세요

SELECT ADDDATE(orderdate,INTERVAL +10 DAY) 
FROM Orders;

-- 2042년 7월 4일 주문받은 도서를 모두 나태내시오 단 주문일을 240704형태

SELECT B.bookname,STR_TO_DATE(O.orderdate,'%Y-%m-%d') 
FROM Orders O,Book B
WHERE O.bookid = B.bookid;

SELECT B.bookname, DATE_FORMAT(O.orderdate, '%y%m%d') AS 데이터번호
FROM Orders O
JOIN Book B ON O.bookid = B.bookid
WHERE orderdate = '2024-07-04';

CREATE VIEW Vorders
AS SELECT orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate
FROM Customer C, Orders O, Book B
WHERE C.custid = O.custid && B.bookid = O.bookid;

CREATE VIEW vw_Customer
AS SELECT C.name,C.address
FROM Customer C
WHERE  address like '대한민국%';


-- Orders테이블에서 고객명과 도서명을 확인할 수 있는 뷰를 생성한 후 김연아 고객이 구입한
-- 도서의 주문번호,도서명,주문액을 출력하세여

CREATE VIEW new_VIEW
AS SELECT C.name,B.bookname,O.saleprice,O.orderid
FROM Customer C, Orders O, Book B
WHERE C.custid = O.custid and B.bookid = O.bookid;

SELECT  orderid,bookname,saleprice
FROM new_VIEW
WHERE name='김연아';

create table Mybook(
bookid integer not NULL PRIMARY KEY,
price integer
);

insert into Mybook values(1,10000);
insert into Mybook values(2,12000);
insert into Mybook (bookid) values(3);
DELETE FROM Customer
WHERE custid = 5;
insert into Customer values(5,'박세리','대한민국 대전',NULL);

select * from Mybook;

SELECT sum(price),avg(price),count(*),count(price)
FROM Mybook
WHERE bookid>=4;

SELECT COUNT(*) FROM Mybook
WHERE price is null;

SELECT * FROM Mybook
WHERE price=0;

SELECT name '이름',IFNULL(phone, '연락처없음') '전화번호'
FROM Customer;

-- 1) 사원의 이름과 직위를 출력하세요. 단 사원의 이름은 '사원이름', 직위는 '사원직위' 머리글이 나오도록 출력하세요.
SELECT E.ENAME'사원이름',E.JOB'사원직위'
FROM EMP E;
-- 2) 30번 부서에 근무하는 모든 사원의 이름과 급여를 출력하세요.
SELECT E.ENAME,E.SAL
FROM EMP E
WHERE E.DEPTNO = 30;
-- 3) 사원번호와 이름, 현재 급여, 증가한 급여분(열 이름은 '증가액'),10% 인상된 급여(열 이름은 '인상된 급여')를 사원번호순으로 출력하세요.
SELECT E.EMPNO,E.ENAME,E.SAL, E.COMM as '증가액', (E.SAL*1.1) as '인상된급여'
FROM EMP E
ORDER BY EMPNO;
-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요.
SELECT E.DEPTNO,E.ENAME
FROM EMP E;
-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여를 출력하세요.-- 열 이름은 각각 MAX, MIN, SUM, AVG로 합니다. 단, 소수점 이하는 반올림하여 정수로 출력하세요.
SELECT MAX(E.SAL) as 'MAX',MIN(E.SAL) as 'MIN',SUM(E.SAL) as 'SUM',ROUND(AVG(E.SAL)) as 'AVG'
FROM EMP E;
-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요. 열 이름은 각각 '업무'와 '업무별 사원수'로 합니다.
SELECT D.DNAME, COUNT(*)as '업무별 사원수'
FROM EMP E
JOIN DEPT D ON E.DEPTNO = D.DEPTNO
GROUP BY E.DEPTNO;
-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요.
SELECT MAX(E.SAL)-MIN(E.SAL)
FROM EMP E;
-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계와 평균을 출력하세요.
SELECT COUNT(*)as '업무별 사원수', SUM(E.SAL), AVG(E.SAL)
FROM EMP E
JOIN DEPT D ON E.DEPTNO = D.DEPTNO
WHERE E.DEPTNO=30
GROUP BY E.DEPTNO;

SELECT *
FROM EMP E
JOIN DEPT D ON E.DEPTNO = D.DEPTNO
WHERE E.DEPTNO=30

