drop table if exists tbl_game;
drop table if exists tbl_result;
drop table if exists tbl_team;


create table tbl_team
(
    id   bigserial primary key,
    name varchar(100) not null
);

create table tbl_result
(
    id     bigserial primary key,
    winner bigint null,
    looser bigint null,
    draw   boolean default true,
    foreign key (winner) references tbl_team (id) on delete cascade,
    foreign key (looser) references tbl_team (id) on delete cascade
);


create table tbl_game
(
    id            bigserial primary key,
    home_team_id  bigint not null,
    guest_team_id bigint not null,
    result_id     bigint not null,
    foreign key (home_team_id) references tbl_team (id) on delete cascade,
    foreign key (guest_team_id) references tbl_team (id) on delete cascade,
    foreign key (result_id) references tbl_result (id) on delete cascade
);


