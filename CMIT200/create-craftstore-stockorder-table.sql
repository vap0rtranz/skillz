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

ALTER TABLE [dbo].[StockOrder] DROP CONSTRAINT [FK_StockOrder_Inventory]
GO

ALTER TABLE [dbo].[StockOrder] DROP CONSTRAINT [FK_StockOrder_Customer]
GO

/****** Object:  Table [dbo].[StockOrder]    Script Date: 10/11/17 20:24:22 ******/
DROP TABLE [dbo].[StockOrder]
GO

/****** Object:  Table [dbo].[StockOrder]    Script Date: 10/11/17 20:24:22 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[StockOrder](
	[StockOrderID] [int] IDENTITY(1,1) NOT NULL,
	[CustomerID] [int] NOT NULL,
	[InventoryID] [int] NOT NULL,
	[Quantity] [smallint] NOT NULL,
	[Date] [date] NOT NULL,
	[Paid] [bit] NOT NULL,
 CONSTRAINT [PK_StockOrder] PRIMARY KEY CLUSTERED 
(
	[StockOrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
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


