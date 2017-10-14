-- creates a new customer
-- executed as stored procedure in a transaction for an INSERT
-- returns the IDENTITY of the new row to verify creation

USE CraftStoreDB_QA;

-- setup variable to capture OUTPUT
DECLARE @CustomerIDOut int;

EXEC dbo.InsertCustomer 
-- capture output parameter labelled CustomerID
@CustomerID = @CustomerIDOut OUTPUT,
@FirstName = 'TestFirstName', 
@LastName = 'TestLastName',
@CreatedDate = '2007-05-08 12:35:00';