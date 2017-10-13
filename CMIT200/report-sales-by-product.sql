USE CraftStoreDB_DEV
GO

 SELECT [dbo].[StockOrder].[InventoryID], sum([dbo].[StockOrder].[SellPrice]*[dbo].[StockOrder].[Quantity]) 
 FROM [StockOrder] 
 INNER JOIN [dbo].[Inventory]
 ON [dbo].[StockOrder].[InventoryID] = [dbo].[Inventory].[InventoryID]
 GROUP BY [dbo].[StockOrder].[InventoryID];