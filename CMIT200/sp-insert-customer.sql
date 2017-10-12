-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
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

GO

CREATE PROCEDURE dbo.InsertCustomer 
	-- Add the parameters for the stored procedure here
	@FirstName nvarchar(50) = 'Jane',
	@LastName nvarchar(50) = 'Doe'
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;
	-- Best practice to wrap an insert into a transaction block
	BEGIN TRANSACTION;

	INSERT INTO dbo.Customer(FirstName,LastName) VALUES (@FirstName, @LastName); 

	COMMIT TRANSACTION;
END;

GO
