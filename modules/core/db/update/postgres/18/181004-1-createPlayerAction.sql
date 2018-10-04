create table HANDANALYZERC_PLAYER_ACTION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INDEX_ varchar(255),
    ACTION_TYPE integer,
    SIZE_ decimal(19, 2),
    PLAYER_ID uuid,
    GAME_ID uuid,
    --
    primary key (ID)
);
