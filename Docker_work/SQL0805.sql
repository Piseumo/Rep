/* --- 그린중/고등학교 수행평가 일정 및 점수 관리시스템 
1)사용자 : 학생, 선생님
2)회원가입 : 학생, 선생님
3)로그인 : 학생, 선생님
4)나이스 : 미리제공정보 끌어다 사용 
(학생 학교, 학년, 학반, 학번, 학생이름 ) 
(선생님 소속된 학교, 과목명, 담당학년, 수업명, 해당학년, 해당학기, 담당반)
--- 기능
1) 선생님 기능 : 학생정보, 학사일정, 수행평가일정등록, 수행평가제출, 수행평가점수등록, 수행평가점수확인, 선생님정보관리(과목, 수업)

2) 학생 기능 : 점수조회, 이의신청, 수행평가일정조회

--- 요구사항분석
1) 나이스 : 
선생님 : 회원가입(O-정교사, 기간제교사, 산학교사 등등), 아이디, 비번, 담당과목, 담당수업
학생 : 소속학교, 올해의 학년, 학반, 학번, 회원가입(X), 바로로그인한 직후 비번변경, 로그인

2) 선생님 기능
- 수행평가일정등록 : 수행평가날짜(시작일시, 종료일시), 수행평가과목/수업, 과제/평가, 평가기준, 수행평가내용
- 내가 등록한 수행평가 리스트보기, 수정, 삭제
- 점수입력 / 점수확정 / 점수수정
- 선생님 정보 관리

3) 학생 기능
- 일정보기, 상세조회, 내점수조회, 이의신청, 점수확정

4) 필요하다고 생각되는 테이블
학생정보
선생님
과목
수행평가
수업
수강생정보
점수

5) 학생테이블 : 나이스에서 받아오는 정보
P.K : 연도+학년+학반+학번
학생이름 : VARCHAR,NN
연도 : INT, CHAR, VARCHAR, DATE, NN , DEFAULT VALUE(올해로)
학년 : INT, CHAR, VARCHAR, NN
학반 : INT, CHAR, VARCHAR, NN
학번 : INT, CHAR, VARCHAR, NN
패스워드 : VARCHAR, NN , DEFAULT VALUE(P.K 등등)

--- 6) 선생님테이블 : 
ID : P.K. VARCHAR , NN
패스워드 : VARCHAR , NN
이름 : VARCHAR , NN
과목 : VARCHAR, NN
교사상태 : CHAR(1) / 0 : 정교사 / 1 : 기간제교사 / 2 : 방과후교사 / 3 : 산학교사 / 4 : 기타 , N ,DEFAULT VALUE(기타)

 7)수업테이블  // 체육 등 한선생님이 모든 반 수업이있는 경우 / 수학과목처럼 모든 요일에 수업이 있는 경우
 ID :
 수업명 :
 개설된 연도 :
 개설학기 :
 개설학년 : 
 개설학반 : 
 수업요일 :
 수업시간 :
 교실 :
 F.K: 교사ID-교사명 / 해당과목
 (8) 수강테이블
 F.K : 수업테이블ID
 F.K: 생 ID - 학생이름(수강생이름)

 9)수행평가 테이블
 ID : 
 수행평가 수업 : 
 수행평가 제목 : 
 수행평가 시작일시 : 
 수행평가 종료일시 : 
 수행평가 타입: 과제형,시험형 등
 수행평가 내용 : 
 수행평가 담당선생님 :
 수행평가 체점기준 : 
 F.K : 수업ID->수행평가수업,수행평가 담당선생님
 F.K : 수팽형가에 대항되는 학생 정보
 
 10) 점수 : 점수이의신청,점수확정 -> 변동이력 남길 건지
 F.K 수행평가 ID:
 F.K 학생 ID: 
 점수 : 
 확정여부 : 
 확정일시 : 
 */
 
 CREATE TABLE student (
    name VARCHAR(30) NOT NULL,
    year YEAR NOT NULL,
    grade CHAR(10) NOT NULL,
    class VARCHAR(30) NOT NULL,
    num CHAR(3) NOT NULL,
    password VARCHAR(30) NOT NULL DEFAULT '1234',
    PRIMARY KEY (year,grade,class,num)
);

CREATE TABLE teacher(
	id VARCHAR(30) NOT NULL,
    password VARCHAR(30) NOT NULL  DEFAULT '1234',
    name VARCHAR(30) NOT NULL,
    subject VARCHAR(30) NOT NULL,
    type INT(1) NOT NULL DEFAULT '9'
);

CREATE TABLE sub( 
id INTEGER(10),
name VARCHAR(30) NOT NULL,
semester CHAR(4)  NOT NULL,
grade CHAR(3) NOT NULL,
class VARCHAR(30) NOT NULL,
day VARCHAR(10) NOT NULL,
time VARCHAR(20) NOT NULL,
room INT(5)  NOT NULL,
FOREIGN KEY (id) REFERENCES teacher(id)
);

CREATE TABLE chulsuk(
	sub_id integer not null,
    student_id integer not null,	
    primary key(sub_id,student_id)
    
);