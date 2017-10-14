-- =============================================
-- Author:		<Justin Pittman>
-- Create date: <Oct 13, 2017>
-- Description:	-- stored procedure for transaction to remove inventory 
-- =============================================

-- setup
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON

USE [CraftStoreDB_QA]
GO

DECLARE @RemoveInventoryID int;

IF EXISTS (SELECT 1 FROM sys.procedures	WHERE [name] = 'DeleteInventory')
	BEGIN
		DROP PROCEDURE dbo.DeleteInventory;
	END;
GO

CREATE PROCEDURE dbo.DeleteInventory 
	-- Add the parameters for the stored procedure here
	(@RemoveInventoryID INT = 1)
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;
	-- Best practice to wrap an insert into a transaction block
	BEGIN TRANSACTION

	DELETE FROM [dbo].[Inventory]
      WHERE InventoryID = @RemoveInventoryID;

	COMMIT TRANSACTION;
END;

GO


