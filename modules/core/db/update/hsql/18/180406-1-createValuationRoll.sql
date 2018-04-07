create table CLASS1_VALUATION_ROLL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ROLL_TYPE varchar(50),
    SITE_VALUE double precision,
    ANNUAL_RATE double precision,
    EXEMPT double precision,
    RATABLE_VALUE double precision,
    SIZE_IN_HA double precision,
    --
    primary key (ID)
);
