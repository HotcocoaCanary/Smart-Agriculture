create schema smart_agriculture;

use smart_agriculture;

create table smart_user
(
    Id       int auto_increment primary key,
    Username varchar(30) null,
    Password varchar(30) null,
    Nickname varchar(30) null,
    Email    varchar(30) null,
    Phone    varchar(30) null
);

create table smart_device
(
    Id          int auto_increment,
    Device_name varchar(30) null,
    create_at   time        null,
    UserId      int         null,
    constraint smart_device_pk
        primary key (Id),
    constraint smart_device_smart_user_Id_fk
        foreign key (UserId) references smart_user (Id)
);