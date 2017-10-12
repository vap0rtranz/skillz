/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2016 (13.0.4001)
    Source Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2016
    Target Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Target Database Engine Type : Standalone SQL Server
*/

USE [AddressBook];

/****** Object:  Table [dbo].[Table_B]    Script Date: 09/08/17 14:49:49 ******/
IF EXISTS (SELECT 1 FROM sys.tables WHERE [Name] ='Table_B')
BEGIN
DROP TABLE [dbo].[Table_B];
END;

/****** Object:  Table [dbo].[Table_B]    Script Date: 09/08/17 14:49:49 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Table_B]
(
	[Id] [int],
	[Name] [varchar](50) NULL,
	CONSTRAINT PK_Table_B_Id PRIMARY KEY CLUSTERED (Id)
) 
GO


