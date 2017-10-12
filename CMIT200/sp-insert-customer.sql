-- setup
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Justin Pittman>
-- Create date: <Oct 11, 2017>
-- Description:	<testing SP>
-- =============================================
USE CraftStoreDB_DEV;

IF EXISTS (SELECT 1 FROM sys.procedures	WHERE [name] = 'InsertCustomer')
	BEGIN
		DROP PROCEDURE dbo.InsertCustomer;
	END;
GO

CREATE PROCEDURE dbo.InsertCustomer 
	-- Add the parameters for the stored procedure here
	(@FirstName nvarchar(50) = 'Jane',
	@LastName nvarchar(50) = 'Doe')
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;
	-- setup for primary key
	DECLARE @CustomerID INT;
	-- Best practice to wrap an insert into a transaction block
	BEGIN TRANSACTION;
		INSERT INTO dbo.Customer(FirstName,LastName) VALUES (@FirstName, @LastName); 
		SELECT @CustomerID = SCOPE_IDENTITY();
	COMMIT TRANSACTION;
	SELECT @CustomerID AS CustomerID;
END;

GO
