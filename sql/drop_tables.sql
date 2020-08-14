-- Drop all the database tables in exactly reverse
-- order as they were created, i.e. first foreign
-- key tables and then primary key tables.

--------------------------------------------------------------------
-- T A B L E S   W I T H   F O R E I G N   K E Y S   ( 3 )
--------------------------------------------------------------------

DROP TABLE IF EXISTS tblGoonsCustomers;
DROP TABLE IF EXISTS tblDebt;
DROP TABLE IF EXISTS tblGoon;

--------------------------------------------------------------------
-- T A B L E S   W I T H   O N L Y   P R I M A R Y   K E Y S   ( 2 )
--------------------------------------------------------------------

DROP TABLE IF EXISTS tblGodfather;
DROP TABLE IF EXISTS tblCustomer;
