-- =============================================
-- Author:		<Justin Pittman>
-- Create date: <Oct 13, 2017>
-- Description:	-- report on sales by product inventory
-- =============================================

-- setup
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON

USE [CraftStoreDB_Stage]
GO

IF EXISTS (SELECT 1 FROM sys.procedures	WHERE [name] = 'ReportSalesbyProduct')
	BEGIN
		DROP PROCEDURE dbo.ReportSalesbyProduct;
	END;
GO

CREATE PROCEDURE dbo.ReportSalesbyProduct
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;

	SELECT [dbo].[StockOrder].[InventoryID], sum([dbo].[StockOrder].[SellPrice]*[dbo].[StockOrder].[Quantity]) 
	FROM [StockOrder] 
	INNER JOIN [dbo].[Inventory]
	ON [dbo].[StockOrder].[InventoryID] = [dbo].[Inventory].[InventoryID]
	GROUP BY [dbo].[StockOrder].[InventoryID];

END;
GO