USE CraftStoreDB_DEV;

-- setup variable to capture OUTPUT
DECLARE @CustomerIDOut INT;

EXEC dbo.InsertCustomer 
@FirstName = 'First', 
@LastName = 'Last',
-- capture output parameter labelled CustomerID
@CustomerID = @CustomerIDOut OUTPUT;