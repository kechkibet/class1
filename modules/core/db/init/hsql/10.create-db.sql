-- begin CLASS1_CITIZEN
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
)^
-- end CLASS1_CITIZEN
-- begin CLASS1_BUSINESS
create table CLASS1_BUSINESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONTACT_PERSON_ID varchar(36) not null,
    STATUS integer not null,
    NAME varchar(255) not null,
    BUSINESS_REGISTRATION_NUMBER varchar(255),
    --
    primary key (ID)
)^
-- end CLASS1_BUSINESS
-- begin CLASS1_ACTIVITY_CODES
create table CLASS1_ACTIVITY_CODES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ACTIVITY_CODE integer not null,
    DESCRIPTION varchar(255) not null,
    UNIT_OF_MEASURE varchar(255),
    AMOUNT double precision not null,
    STATUS integer not null,
    --
    primary key (ID)
)^
-- end CLASS1_ACTIVITY_CODES
