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

IF EXISTS (SELECT 1 FROM sys.tables WHERE [Name] = 'Inventory')
BEGIN
	ALTER TABLE [dbo].[Inventory] DROP CONSTRAINT [FK_Inventory_Product]
	/****** Object:  Table [dbo].[CustomerContact]    Script Date: 10/11/17 20:26:06 ******/
	DROP TABLE [dbo].[Inventory]
END

GO

/****** Object:  Table [dbo].[Inventory]    Script Date: 10/12/17 20:09:52 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Inventory](
	[InventoryID] [int] IDENTITY(1,1) NOT NULL,
	[ProductTypeID] [int] NOT NULL,
	[Description] [nvarchar](50) NULL,
	[Material] [nvarchar](50) NULL,
	[Size] [nvarchar](50) NULL,
	[Color] [nvarchar](50) NULL,
	[ListPrice] [money] NOT NULL,
	[ProductionCost] [money] NULL,
	[MadeOn] [date] NULL,
	[PictureURL] [nvarchar](50) NULL,
 CONSTRAINT [PK_Inventory] PRIMARY KEY CLUSTERED 
(
	[InventoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Inventory]  WITH CHECK ADD  CONSTRAINT [FK_Inventory_Product] FOREIGN KEY([ProductTypeID])
REFERENCES [dbo].[ProductType] ([ProductTypeID])
GO

ALTER TABLE [dbo].[Inventory] CHECK CONSTRAINT [FK_Inventory_Product]
GO


