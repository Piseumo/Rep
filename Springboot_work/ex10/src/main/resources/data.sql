INSERT INTO users (idx, username, age, email, password, wdate)
VALUES (1, 'Red', 25, 'red@example.com', 'password123', '2024-09-24 10:00:00');
INSERT INTO users (idx, username, age, email, password, wdate)
VALUES (2, 'Blue', 30, 'blue@example.com', 'password123', '2024-09-24 10:00:00');
INSERT INTO users (idx, username, age, email, password, wdate)
VALUES (3, 'Green', 22, 'green@example.com', 'password123', '2024-09-24 10:00:00');
INSERT INTO users (idx, username, age, email, password, wdate)
VALUES (4, 'Yellow', 28, 'yellow@example.com', 'password123', '2024-09-24 10:00:00');
INSERT INTO users (idx, username, age, email, password, wdate)
VALUES (5, 'Purple', 35, 'purple@example.com', 'password123', '2024-09-24 10:00:00');

INSERT INTO free_board (idx, title, content, user_idx, cre_author, mod_author, reg_date, mod_date, view_count)
VALUES (1, 'pmhFirst Title', 'This is the first content.', 1, 'Author1', 'Modifier1', '2024-09-24 10:00:00', '2024-09-24 10:00:00', 0);
INSERT INTO free_board (idx, title, content, user_idx, cre_author, mod_author, reg_date, mod_date, view_count)
VALUES (2, 'pmhSecond Title', 'This is the second content.', 2, 'Author2', 'Modifier2', '2024-09-23 09:00:00', '2024-09-23 09:00:00', 5);
INSERT INTO free_board (idx, title, content, user_idx, cre_author, mod_author, reg_date, mod_date, view_count)
VALUES (3, 'pmhThird Title', 'This is the third content.', 3, 'Author3', 'Modifier3', '2024-09-22 08:30:00', '2024-09-23 08:45:00', 10);
INSERT INTO free_board (idx, title, content, user_idx, cre_author, mod_author, reg_date, mod_date, view_count)
VALUES (4, 'pmhFourth Title', 'This is the fourth content.', 4, 'Author4', 'Modifier4', '2024-09-21 07:45:00', '2024-09-21 08:15:00', 20);
INSERT INTO free_board (idx, title, content, user_idx, cre_author, mod_author, reg_date, mod_date, view_count)
VALUES (5, 'pmhFifth Title', 'This is the fifth content.', 5, 'Author5', 'Modifier5', '2024-09-20 07:00:00', '2024-09-20 07:30:00', 50);

INSERT INTO free_board_files (`free_board_idx`, `idx`, `file_desc`, `name` , `path`) VALUES (5, 1, '이미지파일입니다.', 'img.png', 'D:\MainRep\Springboot_work\ex10\images\file');