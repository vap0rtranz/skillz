-- report on products in inventory with price threshold that is elligible for discount sales

USE [CraftStoreDB_DEV]
GO

SELECT [InventoryID],[ListPrice],[ProductionCost],[Description] =
	  CASE
		WHEN [ListPrice] >= 50.00 THEN 'Elligible for discount sales'
		ELSE 'Regular list price'
	  END
  FROM [dbo].[Inventory]
  ORDER BY [ListPrice] DESC
GO


