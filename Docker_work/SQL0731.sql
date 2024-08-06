Select Customer.name
From Book,Customer,Orders
Where Book.bookid = Orders.bookid && Customer.custid = Orders.custid && publisher = '대한미디어';

 -- 대한미디어에서 출판한 도서를 구매한 고객의 이름
select Customer.name
from Customer
where custid in (select distinct custid from orders 
      where bookid in (select bookid from book where publisher = '대한미디어'));
      
select Customer.name
from Customer
 where custid in(
select custid
from Orders 
where bookid in(
select bookid
from Book 
where publisher = '대한미디어'));

      -- 내가
      
      Select Customer.name,Book.bookname
From Customer,Orders,Book
Where Customer.custid = Orders.custid  && Book.bookid = Orders.bookid;

      -- 어제 배운거
select C.name, B.bookname
from Customer C, Book B, Orders O
where C.custid=O.custid and B.bookid=O.bookid;

-- new
select C.name, B.bookname
from Book B, Customer C
where (C.custid ,B.bookid) in (select custid, bookid from orders);

-- 달라유
select C.name,B.bookname
from Customer C, Book B
where C.custid in (select custid from orders) and B.bookid in (select bookid from orders);

SELECT YEAR(orderdate), COUNT(*) as Amount
FROM Orders
GROUP BY YEAR(orderdate) 
HAVING Amount>1;

SELECT YEAR(orderdate), COUNT(*) as Amount
FROM Orders
GROUP BY YEAR(orderdate) ;

 -- 대한민국에 거주하시는 고객리스트 출력
 -- 도서를 주문한 고객리스트 출력(서브쿼리)
 -- 김연아 김연경 박세리 // 박지성 김연아 김연경 추신수 = 박지성 추신수 박세리 
Select Customer.name
From Customer
Where address like '대한민국%'
Union all
Select Customer.name
From Customer
Where custid in(
Select custid 
From Orders);

 -- 주문이 있는 고객의 이름과 주소를 나타내시오
 
 Select Customer.name,Customer.address
 From Customer,Orders
 Where Customer.custid = Orders.custid
 group by name,address;
 
 
 Create Table NewBook(
	bookid INTEGER PRIMARY KEY,
    bookname VARCHAR(20),
    publisher VARCHAR(20),
    price INTEGER
	); 

Create Table NewCustomer(
	custid INTEGER  PRIMARY KEY,
    name VARCHAR(20),
    address VARCHAR(20),
    phone VARCHAR(20)
	); 

Create Table NewOrders(
	orderid INTEGER,
    custid INTEGER Not NULL,
    bookid INTEGER Not NULL,
    saleprice INTEGER,
    orderdate DATE,
	PRIMARY KEY(orderid),
	FOREIGN KEY(custid) REFERENCES NewCustomer(custid) ON DELETE CASCADE
    );
    
DESCRIBE Book;    
    
ALTER TABLE NewBook drop isbn;

ALTER TABLE NewBook modify bookname VARCHAR(20) NOT NULL;

ALTER TABLE NewBook modify bookname VARCHAR(20) NOT NULL;

ALTER TABLE NewOrders add FOREIGN KEY(bookid) REFERENCES NewBook(bookid) ON DELETE CASCADE;

Drop table NewOrders;
Drop table NewBook;
Drop table NewCustomer;

INSERT INTO Book(bookid,bookname,publisher,price)
	VALUES(11,'스포츠 의학', '한솔의학서적',90000);

UPDATE Book
SET bookname = '스포츠 의학'
Where bookid = 11;

-- 1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- 굿스포츠 대한미디어 나무수
SELECT Customer.name
FROM Customer,Book
WHERE Book.publisher
 in(
SELECT Book.publisher
FROM Customer,Orders,Book
WHERE Customer.custid = Orders.custid && Book.bookid = Orders.bookid && Customer.name ='박지성')
GROUP BY name;

-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

SELECT C.name
FROM Customer C
WHERE 

SELECT count(B.publisher),C.name
FROM Customer C,Book B,Orders O
WHERE C.custid = O.custid && B.bookid = O.bookid
Group by B.publisher,C.name
HAVING count(B.publisher) >= 2;
-- 3) 전체 고객의 30%이상이 구매한 도서
-- >> 전체 고객이 구매한 도서
-- 30% =  구매한도서수/전체 고객의수 


SELECT B.bookname , count(B.bookname)/(
SELECT count(C.custid)
FROM Customer C)
FROM Orders O ,Customer C,Book B
WHERE C.custid = O.custid && B.bookid = O.bookid
Group by bookname
