
insert into tbl_team(name)
values ('FC Brennende Hacken'),
       ('Sportfreunde Seitenstechen'),
       ('Real Litatsverlust'),
       ('SpvggFliegende Fetzen'),
       ('VFL Wadentest');

insert into tbl_result(winner, looser, draw)
values (2, 1, false),
       (null, null, true),
       (null, null, true),
       (3, 4, false),
       (2, 5, false);

insert into tbl_game(home_team_id, guest_team_id, result_id)
values (1, 2, 1),
       (1, 2, 2),
       (5, 4, 3),
       (3, 4, 4),
       (5, 2, 5);






