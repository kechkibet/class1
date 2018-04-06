create table CLASS1_CITIZEN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    GENDER varchar(50) not null,
    LAST_NAME varchar(255) not null,
    ID_NUMBER varchar(255) not null,
    EMAIL varchar(255),
    PHONE_NUMBER varchar(255) not null,
    --
    primary key (ID)
);
