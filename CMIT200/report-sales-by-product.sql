USE CraftStoreDB_DEV

SELECT [ProductID], p.name, (sum([StockOrder].[Quantity] * [StockOrder].[SellPrice] AS sales
    FROM [ProductType]  LEFT JOIN sales s USING ([ProductID])
    GROUP BY [ProductID], p.name, [StockOrder].[SellPrice]