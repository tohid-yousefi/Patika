-- 1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
	id INTEGER NOT NULL,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(50)
);



-- 2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Lorens Gregr', '7/15/1982', 'lgregr0@bloomberg.com');
insert into employee (id, name, birthday, email) values (2, 'Alie Diggles', '10/18/1988', 'adiggles1@reference.com');
insert into employee (id, name, birthday, email) values (3, 'Cob Spraberry', '7/10/1970', 'cspraberry2@instagram.com');
insert into employee (id, name, birthday, email) values (4, 'Leontine Buncher', '3/12/1956', 'lbuncher3@sogou.com');
insert into employee (id, name, birthday, email) values (5, 'Althea Batterton', '6/5/2016', 'abatterton4@chron.com');
insert into employee (id, name, birthday, email) values (6, 'Nicolas Pampling', '8/14/1958', 'npampling5@google.com');
insert into employee (id, name, birthday, email) values (7, 'Jennine Battelle', null, null);
insert into employee (id, name, birthday, email) values (8, 'Jocelyn Clyma', null, null);
insert into employee (id, name, birthday, email) values (9, 'Emmery Broomfield', '8/28/1963', 'ebroomfield8@bbc.co.uk');
insert into employee (id, name, birthday, email) values (10, 'Heinrik Johnsey', '2/13/1968', 'hjohnsey9@netlog.com');
insert into employee (id, name, birthday, email) values (11, 'Betti Joselin', '4/28/2017', 'bjoselina@va.gov');
insert into employee (id, name, birthday, email) values (12, 'Sibyl Balle', '11/10/1953', 'sballeb@fastcompany.com');
insert into employee (id, name, birthday, email) values (13, 'Collin Schuh', '5/16/1985', 'cschuhc@google.co.uk');
insert into employee (id, name, birthday, email) values (14, 'Mamie Privost', '5/10/2008', 'mprivostd@freewebs.com');
insert into employee (id, name, birthday, email) values (15, 'Myer Glencrosche', '2/8/1980', 'mglencroschee@vimeo.com');
insert into employee (id, name, birthday, email) values (16, 'Vida Treves', '2/20/1951', 'vtrevesf@umich.edu');
insert into employee (id, name, birthday, email) values (17, 'Benton Ottawell', '12/19/1970', 'bottawellg@nifty.com');
insert into employee (id, name, birthday, email) values (18, 'Beulah Malpas', '10/7/1991', 'bmalpash@eepurl.com');
insert into employee (id, name, birthday, email) values (19, 'Nomi Kinmond', '10/14/2012', 'nkinmondi@nba.com');
insert into employee (id, name, birthday, email) values (20, 'Thoma Kilvington', '8/23/1980', 'tkilvingtonj@mapquest.com');
insert into employee (id, name, birthday, email) values (21, 'Shoshanna Stollman', '11/7/1975', 'sstollmank@yale.edu');
insert into employee (id, name, birthday, email) values (22, 'Hetty Nashe', '5/15/1988', 'hnashel@biblegateway.com');
insert into employee (id, name, birthday, email) values (23, 'Beatrisa Arson', '6/24/1992', 'barsonm@wordpress.com');
insert into employee (id, name, birthday, email) values (24, 'Donnajean Falla', '10/23/1961', 'dfallan@thetimes.co.uk');
insert into employee (id, name, birthday, email) values (25, 'Libbie Blackledge', '4/9/1997', 'lblackledgeo@amazon.de');
insert into employee (id, name, birthday, email) values (26, 'Teodoro Buzin', null, null);
insert into employee (id, name, birthday, email) values (27, 'Georgina Keems', '1/31/1977', 'gkeemsq@hp.com');
insert into employee (id, name, birthday, email) values (28, 'Nikolas McGilvra', null, null);
insert into employee (id, name, birthday, email) values (29, 'Bondie Wanklin', '6/2/1958', 'bwanklins@patch.com');
insert into employee (id, name, birthday, email) values (30, 'Berrie Abramino', null, null);
insert into employee (id, name, birthday, email) values (31, 'Ferrel Meake', '5/4/2012', 'fmeakeu@mtv.com');
insert into employee (id, name, birthday, email) values (32, 'Demott Gambell', '3/10/1951', 'dgambellv@columbia.edu');
insert into employee (id, name, birthday, email) values (33, 'Shawna O''Curneen', '12/19/1992', 'socurneenw@hatena.ne.jp');
insert into employee (id, name, birthday, email) values (34, 'Candace Devorill', '1/29/2016', 'cdevorillx@goodreads.com');
insert into employee (id, name, birthday, email) values (35, 'Aubree Curran', '8/1/1953', 'acurrany@newsvine.com');
insert into employee (id, name, birthday, email) values (36, 'Kerrin Blatchford', '11/15/1984', 'kblatchfordz@plala.or.jp');
insert into employee (id, name, birthday, email) values (37, 'Melvin Defty', null, null);
insert into employee (id, name, birthday, email) values (38, 'Geraldine Cullabine', null, null);
insert into employee (id, name, birthday, email) values (39, 'Oneida Rontsch', null, null);
insert into employee (id, name, birthday, email) values (40, 'Cinnamon Duddin', '11/16/1960', 'cduddin13@toplist.cz');
insert into employee (id, name, birthday, email) values (41, 'Conrade Barrows', '7/21/2014', 'cbarrows14@geocities.jp');
insert into employee (id, name, birthday, email) values (42, 'Donni Crossgrove', '1/4/1961', 'dcrossgrove15@npr.org');
insert into employee (id, name, birthday, email) values (43, 'Gleda Rheaume', '7/18/1967', 'grheaume16@bloglovin.com');
insert into employee (id, name, birthday, email) values (44, 'Corrinne Chamley', '8/29/1995', 'cchamley17@ihg.com');
insert into employee (id, name, birthday, email) values (45, 'Tessie Gutowska', '7/3/1967', 'tgutowska18@ehow.com');
insert into employee (id, name, birthday, email) values (46, 'Arlinda Bonner', '1/27/2000', 'abonner19@sfgate.com');
insert into employee (id, name, birthday, email) values (47, 'Helenka Brockwell', '3/19/1971', 'hbrockwell1a@washington.edu');
insert into employee (id, name, birthday, email) values (48, 'Lida Fulham', '3/29/2006', 'lfulham1b@examiner.com');
insert into employee (id, name, birthday, email) values (49, 'Mathe Josofovitz', '5/23/1976', 'mjosofovitz1c@naver.com');
insert into employee (id, name, birthday, email) values (50, 'Leola Feavyour', '6/26/1990', 'lfeavyour1d@flickr.com');

-- 3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET id=51
WHERE id=1;

UPDATE employee
SET name='XXXX'
WHERE name LIKE 'A%';

UPDATE employee
SET birthday='1990-01-01'
WHERE birthday>'2000-01-01'
RETURNING *;

UPDATE employee
SET email='test@test.com'
WHERE email ILIKE 'T%'
RETURNING *;

UPDATE employee
SET id = '100',
	name = 'test',
	birthday = '2022-10-16',
	email = 'test@test.com'
WHERE id = '2';

-- 4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id = 1;

DELETE FROM employee
WHERE name ILIKE 'T%';

DELETE FROM employee
WHERE birthday > '1990-01-01';

DELETE FROM employee
WHERE email ILIKE 'A%';

DELETE FROM employee
WHERE id='5' OR name ILIKE 'B%'
RETURNING *;