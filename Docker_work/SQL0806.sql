CREATE TABLE Professor(
ssn VARCHAR(30) NOT NULL,
name VARCHAR(30) NOT NULL,
age int(3) NOT NULL,
p_rank VARCHAR(30) ,
speciality VARCHAR(30),
PRIMARY KEY (ssn)
);

CREATE TABLE Department(
dno int NOT NULL PRIMARY KEY,
dname VARCHAR(30) NOT NULL,
office VARCHAR(20) NOT NULL,
ssn VARCHAR(30) NOT NULL,
PRIMARY KEY (don),
FOREIGN KEY (ssn) REFERENCES Professor(ssn)
);

CREATE TABLE Graduate(
ssn VARCHAR(30) NOT NULL,
name VARCHAR(30) NOT NULL,
age int NOT NULL,
deg_prog CHAR(6) NOT NULL,
advisor VARCHAR(30),
PRIMARY KEY (ssn),
FOREIGN KEY (major_dno) REFERENCES Department(dno),
FOREIGN KEY (advisor_ssn) REFERENCES Graduate(ssn)
);

CREATE TABLE Project(
pid VARCHAR(30) NOT NULL,
sponsor VARCHAR(30),
start_date DATE NOT NULL,
end_date  DATE NOT NULL,
budget int NOT NULL,
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


