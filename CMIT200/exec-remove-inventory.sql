-- makes new inventory
-- implemented as stored procedure in a transaction for an INSERT
-- returns the IDENTITY of the new ID of the inventory

USE CraftStoreDB_QA;

-- setup variable to capture OUTPUT
DECLARE @RemoveInventoryID int;

EXEC dbo.DeleteInventory 
-- capture output parameter labelled CustomerID
	@RemoveInventoryID = 7