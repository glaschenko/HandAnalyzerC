-- begin HANDANALYZERC_GAME
create table HANDANALYZERC_GAME (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GAME_ID decimal(19),
    --
    primary key (ID)
)^
-- end HANDANALYZERC_GAME
-- begin HANDANALYZERC_PLAYER
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
)^
-- end HANDANALYZERC_PLAYER
-- begin HANDANALYZERC_PLAYER_ACTION
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
)^
-- end HANDANALYZERC_PLAYER_ACTION
