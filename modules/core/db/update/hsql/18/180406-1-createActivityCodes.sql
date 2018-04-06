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
);
