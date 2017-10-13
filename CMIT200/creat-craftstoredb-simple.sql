USE Master;
IF NOT EXISTS (SELECT 1 FROM sys.databases WHERE [name] = 'CraftStoreDB_DEV')
BEGIN

CREATE DATABASE CraftStoreDB_DEV
ON PRIMARY
(
NAME = 'CraftStoreDB',
FILENAME = 'C:\Users\Justin\Dev\CraftStore\CraftStoreDB.mdf',
SIZE = 10MB,
MAXSIZE = UNLIMITED,
FILEGROWTH = 50%
)
LOG ON
(
NAME = 'CraftStoreDB_Log',
FILENAME = 'C:\Users\Justin\Dev\CraftStore\CraftStoreDB_Log.ldf',
SIZE = 2MB,
MAXSIZE = 100MB,
FILEGROWTH = 2MB
);

END;