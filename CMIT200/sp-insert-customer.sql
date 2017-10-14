-- =============================================
-- Author:		<Justin Pittman>
-- Create date: <Oct 11, 2017>
-- Description:	stored procedure for adding new customer
-- =============================================

-- setup
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

USE CraftStoreDB_QA;

DECLARE @CustomerID int;

IF EXISTS (SELECT 1 FROM sys.procedures	WHERE [name] = 'InsertCustomer')
	BEGIN
		DROP PROCEDURE dbo.InsertCustomer;
	END;
GO

CREATE PROCEDURE dbo.InsertCustomer 
	-- Add the parameters for the stored procedure here
	(
	@CustomerID INT = 0 OUTPUT,
	@FirstName nvarchar(50) = 'Jane',
	@LastName nvarchar(50) = 'Doe',
	@CreatedDate smalldatetime = '2007-05-08 12:35:00'
	)

AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;
	-- Best practice to wrap an insert into a transaction block
	BEGIN TRANSACTION;
		INSERT INTO dbo.Customer(FirstName, LastName, CreatedDate) VALUES(@FirstName, @LastName, @CreatedDate); 
		-- capture autogenerated identity PK as CustomerID
		SELECT @CustomerID = SCOPE_IDENTITY();
	COMMIT TRANSACTION;
	-- return the CustomerID that was autogenerated
	SELECT @CustomerID AS CustomerID;
END;

GO
