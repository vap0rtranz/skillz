/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2016 (13.0.4001)
    Source Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2016
    Target Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Target Database Engine Type : Standalone SQL Server
*/

USE [master]
GO

/****** Object:  Database [CraftStoreDB_DEV]    Script Date: 10/12/17 21:12:14 ******/
CREATE DATABASE [CraftStoreDB_DEV]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CraftStoreDB_DEV', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.HELIXDB\MSSQL\DATA\CraftStoreDB_DEV.mdf' , SIZE = 10240KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CraftStoreDB_DEV_Log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.HELIXDB\MSSQL\DATA\CraftStoreDB_DEV_Log.ldf' , SIZE = 10240KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO

ALTER DATABASE [CraftStoreDB_DEV] SET COMPATIBILITY_LEVEL = 130
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CraftStoreDB_DEV].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [CraftStoreDB_DEV] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET ARITHABORT OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET  DISABLE_BROKER 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET RECOVERY FULL 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET  MULTI_USER 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [CraftStoreDB_DEV] SET DB_CHAINING OFF 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [CraftStoreDB_DEV] SET QUERY_STORE = OFF
GO

USE [CraftStoreDB_DEV]
GO

ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO

ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO

ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO

ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO

ALTER DATABASE [CraftStoreDB_DEV] SET  READ_WRITE 
GO


