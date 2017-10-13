USE CraftStoreDB_QA;

-- setup variable to capture OUTPUT
DECLARE @StockOrderIDOut INT;

EXEC dbo.PlaceStockOrder 
-- capture output parameter labelled CustomerID
@CustomerID = '1',
@InventoryID = 1,
@Quantity = 1,
@Paid = 1,
@SellPrice = '1.00';


INSERT INTO [dbo].[StockOrder]
           ([CustomerID]
           ,[InventoryID]
           ,[Quantity]
           ,[Paid]
           ,[SellPrice])
     VALUES
           (<CustomerID, int,>
           ,<InventoryID, int,>
           ,<Quantity, smallint,>
           ,<Paid, bit,>
           ,<SellPrice, money,>)
GO
