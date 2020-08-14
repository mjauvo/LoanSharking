-- Insert preliminary test data into database tables

--------------------------------------------------------------------
-- T A B L E S   W I T H   O N L Y   P R I M A R Y   K E Y S   ( 9 )
--------------------------------------------------------------------

INSERT INTO
    tblGodfather
VALUES
    ('Don', 'Bordello', '', '555-2356', 'South Side'),
    ('Don', 'Tortellini', '', '555-4975', 'North Side'),
    ('Don', 'Spinaccio', '', '555-7468', 'East Side'),
    ('Don', 'Linguini', '', '555-3456', 'West Side'),
    ('Don', 'Caramello', '', '555-5678', 'Downtown'),
    ('Don', 'Mafioso', '', '555-8765', 'Uptown');

--------------------------------------------------------------------
-- T A B L E S   W I T H   F O R E I G N   K E Y S   ( 1 4 )
--------------------------------------------------------------------

INSERT INTO
    tblGoon
VALUES
    ('Sal', 'Salvatore', 'Sticks', '444-1234', 601),
    ('Lou', 'Lavatore', 'The Head', '444-2345', 603),
    ('Mike', 'Moratore', 'Mangler', '444-3456', 602),
    ('Frank', 'Manny', 'The Bat', '444-4567', 604),
    ('Tony', 'Dirt', 'The Shovel', '444-5678', 602),
    ('Al', 'Mooney', 'No Body', '444-6789', 604),
    ('Henry', 'Spade', 'The Suit', '444-7890', 605),
    ('Johnny', 'Eye', 'One Shot', '444-8901', 606),
    ('Enzo', 'Pastello', 'Two Pipes', '444-9012', 601),
    ('Vito', 'Leon', 'The Core', '444-2109', 605),
    ('Moe', 'Mirelli', 'Green', '444-1098', 603),
