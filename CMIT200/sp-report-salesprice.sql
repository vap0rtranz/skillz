-- =============================================
-- Author:		<Justin Pittman>
-- Create date: <Oct 13, 2017>
-- Description:	-- report on products in inventory with price threshold that is elligible for discount sales
-- =============================================

-- setup
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON

USE [CraftStoreDB_QA]
GO

DECLARE @SalePriceMin int;

IF EXISTS (SELECT 1 FROM sys.procedures	WHERE [name] = 'ReportSalesPriceElligible')
	BEGIN
		DROP PROCEDURE dbo.ReportSalesPriceElligible;
	END;
GO

CREATE PROCEDURE dbo.ReportSalesPriceElligible
	(@SalePriceMin int = 50.00)
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;

	SELECT [InventoryID],[ListPrice],[ProductionCost],[Description] =
	  CASE
		WHEN [ListPrice] >= @SalePriceMin THEN 'Elligible for discount sales'
		ELSE 'Regular list price'
	  END
	FROM [dbo].[Inventory]
	ORDER BY [ListPrice] DESC
END;
GO


