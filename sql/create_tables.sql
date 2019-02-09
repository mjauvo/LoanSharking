-- Create all the database tables by creating first
-- primary key tables and then foreign key tables.

--------------------------------------------------------------------
-- T A B L E S   W I T H   O N L Y   P R I M A R Y   K E Y S   ( 3 )
--------------------------------------------------------------------

CREATE TABLE tblCustomer(
    ID          INTEGER       NOT NULL, 
    Fname       VARCHAR (255) NOT NULL,
    Lname       VARCHAR (255) NOT NULL,
    street      VARCHAR (255) NOT NULL,
    zipcode     INTEGER(5)    NOT NULL,
    city        VARCHAR (255) NOT NULL,
    phone       VARCHAR (255) NOT NULL,
    email       VARCHAR (255) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE tblGodfather(
    ID          INTEGER       NOT NULL, 
    FName       VARCHAR (255) NOT NULL,
    LName       VARCHAR (255) NOT NULL,
    NickName    VARCHAR (255) NOT NULL,
    Street      VARCHAR (255) NOT NULL,
    ZipCode     INTEGER (5)   NOT NULL,
    City        VARCHAR (255) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE tblGoon(
    ID          INTEGER       NOT NULL, 
    FName       VARCHAR (255) NOT NULL,
    LName       VARCHAR (255) NOT NULL,
    NickName    VARCHAR (255) NOT NULL,
    Street      VARCHAR (255) NOT NULL,
    ZipCode     INTEGER (5)   NOT NULL,
    City        VARCHAR (255) NOT NULL,
    PRIMARY KEY (ID)
);

--------------------------------------------------------------------
-- T A B L E S   W I T H   F O R E I G N   K E Y S   ( 1 )
--------------------------------------------------------------------

CREATE TABLE tblDebt(
);

