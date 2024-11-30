-- liquibase formatted sql

--changeset ynohach:1
create table courses (
                         id  bigserial not null,
                         name varchar(255),
                         title varchar(255),
                         primary key (id)
)
--rollback DROP TABLE courses

--changeset ynohach:2
create table student_teachers (
                                  teacher_id int8 not null,
                                  student_id int8 not null
)
--rollback DROP TABLE student_teachers

--changeset ynohach:3
create table students (
                          id  bigserial not null,
                          grade int4,
                          first_name varchar(255),
                          last_name varchar(255),
                          course_id int8,
                          user_id int8,
                          primary key (id)
)
--changeset ynohach:4
create table teachers (
                          id  bigserial not null,
                          grade int4,
                          first_name varchar(255),
                          last_name varchar(255),
                          user_id int8,
                          primary key (id)
)
--changeset ynohach:5
create table user_phone (
                            user_id int8 not null,
                            phone_number varchar(255)
)
--changeset ynohach:6
create table users (
                       id  bigserial not null,
                       type varchar(255),
                       username varchar(256) not null,
                       primary key (id)
)

--changeset ynohach:7
alter table users
    add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)

--changeset ynohach:8
alter table student_teachers
    add constraint FK8whbb5sikkobybrrgtbm8rdf7
        foreign key (student_id)
            references students

--changeset ynohach:9
alter table student_teachers
    add constraint FK6fekyoiyop0ms7sin1sn0qee5
        foreign key (teacher_id)
            references teachers

--changeset ynohach:10
alter table students
    add constraint FK6jiqckumc6tm0h9otqbtqhgnr
        foreign key (course_id)
            references courses

--changeset ynohach:11
alter table students
    add constraint FKdt1cjx5ve5bdabmuuf3ibrwaq
        foreign key (user_id)
            references users

--changeset ynohach:12
alter table teachers
    add constraint FKb8dct7w2j1vl1r2bpstw5isc0
        foreign key (user_id)
            references users

--changeset ynohach:13
alter table user_phone
    add constraint FKj99eeaa9cgbqcuomqbiojvvkn
        foreign key (user_id)
            references teachers