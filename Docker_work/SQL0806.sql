CREATE TABLE Professor(
    ssn VARCHAR(30) NOT NULL,
    name VARCHAR(30) NOT NULL,
    age INT NOT NULL,
    p_rank VARCHAR(30),
    speciality VARCHAR(30),
    PRIMARY KEY (ssn)
);

CREATE TABLE Department(
    dno INT NOT NULL PRIMARY KEY,
    dname VARCHAR(30) NOT NULL,
    office VARCHAR(20) NOT NULL,
    ssn VARCHAR(30) NOT NULL,
    FOREIGN KEY (ssn) REFERENCES Professor(ssn)
);

CREATE TABLE Graduate(
    ssn VARCHAR(30) NOT NULL,
    name VARCHAR(30) NOT NULL,
    age INT NOT NULL,
    deg_prog CHAR(6) NOT NULL,
    advisor VARCHAR(30),
    major_dno INT,
    PRIMARY KEY (ssn),
    FOREIGN KEY (major_dno) REFERENCES Department(dno),
    FOREIGN KEY (advisor) REFERENCES Graduate(ssn)
);

CREATE TABLE Project(
    pid VARCHAR(30) NOT NULL,
    sponsor VARCHAR(30),
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    budget INT NOT NULL,
    manager_ssn VARCHAR(30),
    PRIMARY KEY (pid),
    FOREIGN KEY (manager_ssn) REFERENCES Professor(ssn)
);

CREATE TABLE WorkDept (
    ssn VARCHAR(30) NOT NULL,
    dno INT NOT NULL,
    pct_time DECIMAL(5, 2) NOT NULL,  -- 참여 백분율
    PRIMARY KEY (ssn, dno),
    FOREIGN KEY (ssn) REFERENCES Professor(ssn),
    FOREIGN KEY (dno) REFERENCES Department(dno)
);

CREATE TABLE WorkInProject (
    ssn VARCHAR(30) NOT NULL,
    pid VARCHAR(30) NOT NULL,
    PRIMARY KEY (ssn, pid),
    FOREIGN KEY (ssn) REFERENCES Professor(ssn),
    FOREIGN KEY (pid) REFERENCES Project(pid)
);

CREATE TABLE WorkProg (
    ssn VARCHAR(30) NOT NULL,
    pid VARCHAR(30) NOT NULL,
    PRIMARY KEY (ssn, pid),
    FOREIGN KEY (ssn) REFERENCES Graduate(ssn),
    FOREIGN KEY (pid) REFERENCES Project(pid)
);
---------------------------------------------------------------

CREATE TABLE estate_own(
pacel_num int NOT NULL,
regist_num int NOT NULL,
FOREIGN KEY (pacel_num) REFERENCES estate_parcel(parcel_num),
FOREIGN KEY (regist_num) REFERENCES estate_owner(regist_num)
);

CREATE TABLE estate_parcel(
parcel_num int NOT NULL,
land_price int NOT NULL,
PRIMARY KEY (pacel_num)
);

CREATE TABLE estate_owner(
regist_num int NOT NULL,
owner_name VARCHAR(20) NOT NULL,
owner_num int NOT NULL,
PRIMARY KEY (regist_num)
);
use mysql;
desc user;
SELECT * FROM user;

CREATE USER madang@localhost identified by '1234567';
CREATE USER mdguest@localhost identified by '1234567';

DROP USER mdguest@localhost;

grant all privileges on madanguniversity.* to madang@localhost;

flush privileges;

show grants for madang@localhost;

grant select on madangdb.book to madang@localhost;

flush privileges;

select * from user;

