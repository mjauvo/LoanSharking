-- Create all the database tables by creating first
-- primary key tables and then foreign key tables.

--------------------------------------------------------------------
-- T A B L E S   W I T H   O N L Y   P R I M A R Y   K E Y S   ( 2 )
--------------------------------------------------------------------

CREATE TABLE tblCustomer(
    ID          INTEGER (7)     NOT NULL    AUTO_INCREMENT,
    firstName   VARCHAR (255)   NOT NULL,
    lastName    VARCHAR (255)   NOT NULL,
    street      VARCHAR (255)   NOT NULL,
    zipCode     INTEGER (5)     NOT NULL,
    city        VARCHAR (255)   NOT NULL,
    phone       VARCHAR (255)   NOT NULL,
    email       VARCHAR (255)   NOT NULL,
    PRIMARY KEY (ID)
);

ALTER TABLE tblCustomer AUTO_INCREMENT=2019001;

CREATE TABLE tblGodfather(
    ID          SMALLINT (3)    NOT NULL    AUTO_INCREMENT,
    firstName   VARCHAR (255)   NOT NULL,
    lastName    VARCHAR (255)   NOT NULL,
    nickName    VARCHAR (255)   NOT NULL,
    turf        VARCHAR (255)   NOT NULL,
    phone       VARCHAR (255)   NOT NULL,
    PRIMARY KEY (ID)
);

ALTER TABLE tblCustomer AUTO_INCREMENT=601;

--------------------------------------------------------------------
-- T A B L E S   W I T H   F O R E I G N   K E Y S   ( 3 )
--------------------------------------------------------------------

CREATE TABLE tblGoon(
    ID          SMALLINT (4)    NOT NULL    AUTO_INCREMENT,
    firstName   VARCHAR (255)   NOT NULL,
    lastName    VARCHAR (255)   NOT NULL,
    nickName    VARCHAR (255)   NOT NULL,
    phone       VARCHAR (255)   NOT NULL,
    bossID      SMALLINT (3)    NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (bossID) REFERENCES tblGodfather (ID)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);

ALTER TABLE tblCustomer AUTO_INCREMENT=1001;

CREATE TABLE tblDebts(
    GodfatherID     SMALLINT (3)    NOT NULL,
    CustomerID      INTEGER (7)     NOT NULL,
    amount          INTEGER         NOT NULL,
    interestRate    TINYINT         NOT NULL,
    acquiredDate    DATE            NOT NULL,
    dueDate         DATE            NOT NULL,
    paidDate        DATE,
    PRIMARY KEY (GodfatherID, CustomerID),
    FOREIGN KEY (GodfatherID) REFERENCES tblGodfather (ID)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    FOREIGN KEY (CustomerID) REFERENCES tblCustomer (ID)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);

CREATE TABLE tblGoonsCustomers(
    GoonID          SMALLINT (4)    NOT NULL,
    CustomerID      INTEGER (7)     NOT NULL,
    PRIMARY KEY (GoonID, CustomerID),
    FOREIGN KEY (GoonID) REFERENCES tblGoon (ID)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    FOREIGN KEY (CustomerID) REFERENCES tblCustomer (ID)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);
