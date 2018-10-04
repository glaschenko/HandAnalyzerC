create table HANDANALYZERC_PLAYER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NICKNAME varchar(255),
    STAKE decimal(19, 2),
    POSITION_ integer,
    GAME_ID uuid,
    --
    primary key (ID)
);
