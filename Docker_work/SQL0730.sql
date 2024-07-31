SELECT * FROM madangdb.Book;
SELECT * FROM madangdb.Customer;

SELECT name,phone,address From Customer WHERE phone ='NULL';

SELECT name,phone
FROM Customer
Where phone = 'NULL';

Select publisher,price
From Book
Where price Between 10000 and 19999 && publisher = '나무수';

Select *
From Book
-- Where (publisher = '굿스포츠') or (publisher = '대한미디어')
Where publisher in ('굿스포츠' ,'대한미디어');

Select *
From Book
Where bookname like '_구%';
-- 책이름의 첫번쨰글자 상관하지않고 구번째 글자가 구인 모든책

Update Book
Set Bookname = '그 여자의 축구'
Where bookid=2;

Delete 
From Book
Where bookid=2; -- 하위 디렉토리의 정보를 먼저 삭제해야 master 정보 delete가능

Select *
From Book
order by price desc,bookname,bookid;
-- order by price asc; 오름차순 // 미기재시 자동 오름차순
-- order by price desc; 내림차순

Select avg(price)
From Book;

Select price as'판매가격' From Book;

SELECT * FROM madangdb.Orders;

Select sum(saleprice)AS Total, 
       avg(saleprice)AS Average, 
       Min(saleprice)AS Minimum, 
       Max(saleprice)AS Maximum
From Orders;
            
Select custid,
	   count(*) '총수량', 
       sum(saleprice) '총판매량'
From Orders
group by custid;

Select name,count(*) '총수량'
From Orders,Customer
Where saleprice >= 8000 && Customer.custid = Orders.custid
group by name
having count(*) >= 2;

Select custid,count(*) '총수량'
From Orders
Where saleprice >= 8000 
group by custid 
having count(*) >= 2;


Select *
From Customer, Orders
Where Customer.custid=Orders.custid;
-- order by Orders.orderid;

Select name,Sum(saleprice)
From Orders,Customer
Where Orders.custid = Customer.custid
Group by Customer.name
Order by Customer.name;

Select Customer.name, Book.bookname
From Book,Customer,Orders
Where Orders.bookid = Book.bookid && Orders.custid = Customer.custid
Order by book.bookname;

-- 1번  도서번호가 1인 도서의 이름
Select bookname
From Book
Where bookid = 1;

-- 2번 가격이 2만원 이상인 도서의 이름
Select bookname
From Book
Where price >= 20000;

-- 3번 박지성의 총구매금액
Select sum(price) as '총구매금액'
From Book,Customer,Orders
Where Customer.custid = Orders.custid && Book.bookid = Orders.bookid && Orders.custid = '1';

-- 4번 박지성 구매한 도서의 수
select * from Customer;
select * from Orders;
Select count(Orders.custid) as '도서의수'
From Customer,Orders
Where Customer.custid = Orders.custid && Orders.custid = '1';

-- 5번 박지성이 구매한 도서의 출판사 수
Select count(Book.publisher) as '출판사 수'
From Book,Customer,Orders
Where Customer.custid = Orders.custid && Book.bookid = Orders.bookid && Orders.custid = '1';

-- 6번 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
Select Book.bookname,Book.price,(Book.price-Orders.saleprice) as '가격차이'
From Book,Customer,Orders
Where Customer.custid = Orders.custid && Book.bookid = Orders.bookid && Orders.custid = '1';

-- 7번 박지성이 구매하지 않은 도서의 이름
Select Book.bookname
From Book,Customer,Orders
Where Customer.custid = Orders.custid && Book.bookid = Orders.bookid && Customer.name != '박지성';

-- 8번 마당서점 도서의 총개수
Select count(Book.bookid) as '도서 총개수'
From Book;

-- 9번 마당서점에 도서를 납품하는 출판사의 총개수
Select count(Distinct Book.publisher) as '출판사의 총개수'
From Book;

-- 10번  모든 고객의 이름, 주소
Select name,address
From Customer;

-- 11번  2024년 7월 4일부터 2024년 7월 7일 사이에 주문된 도서의 목록
Select Book.bookname, orderdate
From Book,Orders
WHERE (orderdate BETWEEN '2024-07-04' and '2024-07-07')
&& Book.bookid = Orders.bookid;

-- 12번 성이 김씨인 고객의 이름과 주소
Select name,address 
From Customer
Where name like '김%';

-- 13번 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소
Select name,address 
From Customer
Where name like '김%' && name like '%아';


-- 14번 주문 금액의 총액과  평균금액
Select sum(Orders.saleprice),avg(Orders.saleprice)
from Orders;

-- 15) 고객의 이름과 고객별 구매액
Select Customer.name,sum(Orders.saleprice)as'고객 총 구매금액'
From Customer,Orders
Where Customer.custid = Orders.custid 
group by Customer.name
Order by Customer.name;

-- 16) 고객의 이름과 고객이 구매한 도서
Select Customer.name,Book.bookname
From Customer,Orders,Book
Where Customer.custid = Orders.custid  && Book.bookid = Orders.bookid;

Select bookname
From Book
Where price = (Select max(price) from Book);

Select name
From Customer
Where custid in (Select distinct custid From Orders);

Select distinct name
From Customer,Orders
Where Customer.custid = Orders.custid;



