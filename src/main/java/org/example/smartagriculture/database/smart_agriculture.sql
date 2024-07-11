create schema smart_agriculture;

use smart_agriculture;

create table smart_user
(
    id       int auto_increment primary key,
    username varchar(30) null,
    password varchar(30) null,
    nickname varchar(30) null,
    email    varchar(30) null,
    phone    varchar(30) null
);

create table smart_device
(
    id          int auto_increment primary key,
    device_name varchar(30) null,
    create_at   time        null,
    master      int         null,
    constraint smart_device_smart_user_Id_fk foreign key (master) references smart_user (id)
);