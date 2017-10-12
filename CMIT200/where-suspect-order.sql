USE [CraftStoreDB_DEV]
GO

SELECT [Customer].[FirstName],[Customer].[LastName] FROM [dbo].[StockOrder]
INNER JOIN [dbo].[Customer]
ON [dbo].[StockOrder].[CustomerID] = [dbo].[Customer].[CustomerID]
WHERE ([dbo].[StockOrder].[Paid] = 0) AND ([dbo].[StockOrder].[Quantity] > 1)
GO
