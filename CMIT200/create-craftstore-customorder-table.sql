/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2016 (13.0.4001)
    Source Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2016
    Target Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Target Database Engine Type : Standalone SQL Server
*/

USE [CraftStoreDB_DEV]
GO

ALTER TABLE [dbo].[CustomOrder] DROP CONSTRAINT [FK_CustomOrder_Product]
GO

ALTER TABLE [dbo].[CustomOrder] DROP CONSTRAINT [FK_CustomOrder_Customer]
GO

/****** Object:  Table [dbo].[CustomOrder]    Script Date: 10/11/17 20:26:27 ******/
DROP TABLE [dbo].[CustomOrder]
GO

/****** Object:  Table [dbo].[CustomOrder]    Script Date: 10/11/17 20:26:27 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CustomOrder](
	[CustomOrderID] [int] NOT NULL,
	[CustomerID] [int] NOT NULL,
	[ProductTypeID] [int] NOT NULL,
	[Description] [nvarchar](50) NOT NULL,
	[Material] [nvarchar](50) NULL,
	[Size] [nvarchar](50) NULL,
	[Quantity] [smallint] NOT NULL,
	[Offer] [smallmoney] NULL,
	[Date] [date] NOT NULL,
 CONSTRAINT [PK_CustomOrder] PRIMARY KEY CLUSTERED 
(
	[CustomOrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[CustomOrder]  WITH CHECK ADD  CONSTRAINT [FK_CustomOrder_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([CustomerID])
GO

ALTER TABLE [dbo].[CustomOrder] CHECK CONSTRAINT [FK_CustomOrder_Customer]
GO

ALTER TABLE [dbo].[CustomOrder]  WITH CHECK ADD  CONSTRAINT [FK_CustomOrder_Product] FOREIGN KEY([ProductTypeID])
REFERENCES [dbo].[ProductType] ([ProductTypeID])
GO

ALTER TABLE [dbo].[CustomOrder] CHECK CONSTRAINT [FK_CustomOrder_Product]
GO


