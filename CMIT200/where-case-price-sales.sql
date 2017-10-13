USE [CraftStoreDB_DEV]
GO

SELECT [InventoryID],[ListPrice],[ProductionCost],[Description] =
	  CASE
		WHEN [ListPrice] >= 50.00 THEN 'Elligible for sales'
		ELSE 'Regular list price'
	  END
  FROM [dbo].[Inventory]
  ORDER BY [ListPrice] DESC
GO


