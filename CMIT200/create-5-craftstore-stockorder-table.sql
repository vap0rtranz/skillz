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

IF EXISTS (SELECT 1 FROM sys.tables WHERE [Name] = 'StockOrder')
BEGIN
	ALTER TABLE [dbo].[StockOrder] DROP CONSTRAINT [FK_StockOrder_Inventory]
	ALTER TABLE [dbo].[StockOrder] DROP CONSTRAINT [FK_StockOrder_Customer]
	ALTER TABLE [dbo].[StockOrder] DROP CONSTRAINT [DF_StockOrder_Paid]
	/****** Object:  Table [dbo].[StockOrder]    Script Date: 10/12/17 20:05:36 ******/
	DROP TABLE [dbo].[StockOrder]
END

GO

/****** Object:  Table [dbo].[StockOrder]    Script Date: 10/12/17 20:05:36 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[StockOrder](
	[StockOrderID] [int] IDENTITY(1,1) NOT NULL,
	[CustomerID] [int] NOT NULL,
	[InventoryID] [int] NOT NULL,
	[Quantity] [smallint] NOT NULL,
	[Time] [smalldatetime] NOT NULL,
	[Paid] [bit] NOT NULL,
	[SellPrice] [money] NOT NULL,
 CONSTRAINT [PK_StockOrder] PRIMARY KEY CLUSTERED 
(
	[StockOrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[StockOrder] ADD  CONSTRAINT [DF_StockOrder_Paid]  DEFAULT ((0)) FOR [Paid]
GO

ALTER TABLE [dbo].[StockOrder]  WITH CHECK ADD  CONSTRAINT [FK_StockOrder_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([CustomerID])
GO

ALTER TABLE [dbo].[StockOrder] CHECK CONSTRAINT [FK_StockOrder_Customer]
GO

ALTER TABLE [dbo].[StockOrder]  WITH CHECK ADD  CONSTRAINT [FK_StockOrder_Inventory] FOREIGN KEY([InventoryID])
REFERENCES [dbo].[Inventory] ([InventoryID])
GO

ALTER TABLE [dbo].[StockOrder] CHECK CONSTRAINT [FK_StockOrder_Inventory]
GO


