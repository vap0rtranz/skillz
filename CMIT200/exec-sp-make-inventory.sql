-- makes new inventory
-- implemented as stored procedure in a transaction for an INSERT
-- returns the IDENTITY of the new ID of the inventory

USE CraftStoreDB_QA;

-- setup variable to capture OUTPUT
DECLARE @InventoryIDOut int;

EXEC dbo.InsertInventory 
-- capture output parameter labelled CustomerID
	@ProductTypeID = 1,
	@Description = 'inventory description',
	@Material = 'inventory material',
	@Size = 1,
	@Color = 'inventory color',
	@ListPrice = 1.00,
	@ProductionCost = 1.00,
	@MadeOn = '1900-01-01',
	@PictureURL = 'inventory url'