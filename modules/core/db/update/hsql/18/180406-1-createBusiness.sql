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
);
