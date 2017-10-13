USE CraftStoreDB_QA;

-- setup variable to capture OUTPUT
DECLARE @CustomerIDOut INT;

EXEC dbo.InsertCustomer 
-- capture output parameter labelled CustomerID
@CustomerID = @CustomerIDOut OUTPUT,
@FirstName = 'TestFirstName', 
@LastName = 'TestLastName',
@CreatedDate = '1994-01-21';