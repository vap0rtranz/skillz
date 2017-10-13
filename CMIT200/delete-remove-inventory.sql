USE [CraftStoreDB_QA]
GO

DECLARE @RemoveInventoryID int = 5;

BEGIN TRANSACTION

	DELETE FROM [dbo].[Inventory]
      WHERE InventoryID = @RemoveInventoryID;

COMMIT TRANSACTION;

GO


