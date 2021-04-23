-- 1 Favorite color
insert into poll (poll_id, question) values (1, 'What is your favorite color?');

insert into option (option_id, option_value, poll_id) values (1, 'Red', 1);
insert into option (option_id, option_value, poll_id) values (2, 'Blue', 1);
insert into option (option_id, option_value, poll_id) values (3, 'Green', 1);

-- 2 Favorite transportaion
insert into poll (poll_id, question) values (2, 'What is your favorite mode of transportation?');

insert into option (option_value, poll_id) values ('Car', 2);
insert into option (option_value, poll_id) values ('Boat', 2);
insert into option (option_value, poll_id) values ('Plane', 2);

-- 3 Favorite Sport
insert into poll (poll_id, question) values (3, 'What is your favorite sport?');

insert into option (option_value, poll_id) values ('Basketball', 3);
insert into option (option_value, poll_id) values ('Football', 3);
insert into option (option_value, poll_id) values ('Baseball', 3);

-- 4 Favorite Genre of music
insert into poll (poll_id, question) values (4, 'What is your favorite genre of music?');

insert into option (option_value, poll_id) values ('Rap', 4);
insert into option (option_value, poll_id) values ('Alternative/Indie Rock', 4);
insert into option (option_value, poll_id) values ('Pop Country', 4);

-- 5 Favorite food
insert into poll (poll_id, question) values (5, 'What is your favorite food?');

insert into option (option_value, poll_id) values ('Pizza', 5);
insert into option (option_value, poll_id) values ('Fried Chicken', 5);
insert into option (option_value, poll_id) values ('Steak', 5);

-- 6 Favorite Tarantino movie
insert into poll (poll_id, question) values (6, 'What is your favorite Tarantino movie?');

insert into option (option_value, poll_id) values ('Pulp Fiction', 6);
insert into option (option_value, poll_id) values ('Reservoir Dogs', 6);
insert into option (option_value, poll_id) values ('Django Unchained', 6);
insert into option (option_value, poll_id) values ('Ingorious Bastards', 6);
insert into option (option_value, poll_id) values ('Kill Bill', 6);

-- 7 Favorite DC
insert into poll (poll_id, question) values (7, 'Who is your favorite DC hero?');

insert into option (option_value, poll_id) values ('Batman', 7);
insert into option (option_value, poll_id) values ('Wonder Woman', 7);
insert into option (option_value, poll_id) values ('Superman', 7);

-- 8 Favorite DC villain
insert into poll (poll_id, question) values (8, 'Who is your favorite DC villain?');

insert into option (option_value, poll_id) values ('Lex Luthor', 8);
insert into option (option_value, poll_id) values ('Mr. Freeze', 8);
insert into option (option_value, poll_id) values ('Darseid', 8);

-- 9 Favorite Marvel villain
insert into poll (poll_id, question) values (9, 'Who is your favorite Marvel villain?');

insert into option (option_value, poll_id) values ('Red Skull', 9);
insert into option (option_value, poll_id) values ('Ego', 9);
insert into option (option_value, poll_id) values ('Dormamu', 9);

-- 10 Favorite Marvel villain
insert into poll (poll_id, question) values (10, 'Which movie do you want to see?');

insert into option (option_value, poll_id) values ('Mortal Kombat', 10);
insert into option (option_value, poll_id) values ('Black Widow', 10);
insert into option (option_value, poll_id) values ('Dune', 10);

-- 11 Favorite Red Rising
insert into poll (poll_id, question) values (11, 'Which Red Rising book is the best?');

insert into option (option_value, poll_id) values ('Red Rising', 11);
insert into option (option_value, poll_id) values ('Morning Star', 11);
insert into option (option_value, poll_id) values ('Golden Son', 11);

-- 12 Favorite Video Game
insert into poll (poll_id, question) values (12, 'Which video game series do you prefer?');

insert into option (option_value, poll_id) values ('Fallout', 12);
insert into option (option_value, poll_id) values ('Doom', 12);
insert into option (option_value, poll_id) values ('Infamous', 12);

-- 13 Favorite Director
insert into poll (poll_id, question) values (13, 'Who is your favorite director?');

insert into option (option_value, poll_id) values ('Christopher Nolan', 13);
insert into option (option_value, poll_id) values ('Quentin Tarantino', 13);
insert into option (option_value, poll_id) values ('Martin Scorcese', 13);

-- 14 Favorite Film Genre
insert into poll (poll_id, question) values (14, 'What is your favorite film genre?');

insert into option (option_value, poll_id) values ('Horror/Thriller', 14);
insert into option (option_value, poll_id) values ('Comedy', 14);
insert into option (option_value, poll_id) values ('Romance', 14);

-- 15 Favorite Art Style
insert into poll (poll_id, question) values (15, 'What is your favorite art style?');

insert into option (option_value, poll_id) values ('Impressionism', 15);
insert into option (option_value, poll_id) values ('Realism', 15);
insert into option (option_value, poll_id) values ('Abstract', 15);
