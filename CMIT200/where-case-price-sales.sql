USE [CraftStoreDB_DEV]
GO

SELECT [InventoryID]
      ,[Price]
      ,[Cost]
	  ,[Description] =
	  CASE
		WHEN [Price] >= 50.00 THEN 'On sale!'
		ELSE 'Regular price'
	  END
  FROM [dbo].[Inventory]
  WHERE [Quantity] > 0
  ORDER BY [Price] DESC
GO


