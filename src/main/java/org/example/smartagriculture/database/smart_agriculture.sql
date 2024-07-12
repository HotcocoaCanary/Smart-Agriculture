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
create table smart_news
(
    id             int auto_increment
        primary key,
    title          varchar(100) null,
    content        text         null,
    file_url       varchar(255) null,
    creat_user_id  int          null,
    update_user_id int          null,
    delete_flag    tinyint      null,
    constraint smart_news_smart_user_id_fk
        foreign key (creat_user_id) references smart_user (id),
    constraint smart_news_smart_user_id_fk_2
        foreign key (update_user_id) references smart_user (id)
);