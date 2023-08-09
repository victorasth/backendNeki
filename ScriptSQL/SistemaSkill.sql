  create table skill (
   id int4 not null,
    description varchar(255),
    image_url varchar(255),
    name varchar(255),
    version varchar(255),
    primary key (id)
);
   
create table usuario (
   id int4 not null,
    last_login_date date,
    password varchar(255),
    login varchar(255),
    primary key (id)
);
    
   create table user_skill (
   id int4 not null,
    updated_at date,
    created_at date,
    knowledge_level int4,
    skill_id int4,
    user_id int4,
    primary key (id),
    constraint fk_skill_user_skill foreign key (skill_id) references skill(id),
    constraint fk_user_user_skill foreign key (user_id)  references usuario(id)
);
    
   
   
    
   