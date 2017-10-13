/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2016 (13.0.4001)
    Source Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2016
    Target Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Target Database Engine Type : Standalone SQL Server
*/

USE [CraftStoreDB_QA]
GO

/****** Object:  Table [dbo].[Customer]    Script Date: 10/11/17 20:25:31 ******/

IF EXISTS (SELECT 1 FROM sys.tables WHERE [Name] = 'Customer')
BEGIN
	DROP TABLE [dbo].[Customer]
END

GO

/****** Object:  Table [dbo].[Customer]    Script Date: 10/11/17 20:25:31 ******/
-- ensure we are ISO compliant for the value of NULL
SET ANSI_NULLS ON
GO

-- use quotes 
SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Customer](
	[CustomerID] [int] IDENTITY(1,1) NOT NULL,
	[LastName] [nvarchar](50) NOT NULL,
	[FirstName] [nvarchar](50) NOT NULL,
	[CreatedDate] [smalldatetime] NULL
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[CustomerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


