-- Drop all the database tables in exactly reverse
-- order as they were created, i.e. first foreign
-- key tables and then primary key tables.

--------------------------------------------------------------------
-- T A B L E S   W I T H   F O R E I G N   K E Y S   ( 1 4 )
--------------------------------------------------------------------

DROP TABLE IF EXISTS <tableName>;

--------------------------------------------------------------------
-- T A B L E S   W I T H   O N L Y   P R I M A R Y   K E Y S   ( 9 )
--------------------------------------------------------------------

DROP TABLE IF EXISTS <tableName>;
