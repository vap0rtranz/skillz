USE [CraftStoreDB_QA]

DECLARE @CustomerID INT;

DECLARE @FirstName nvarchar(50) = 'Jane';
DECLARE	@LastName nvarchar(50) = 'Doe';
DECLARE @CreatedDate date = '1994-01-21';

BEGIN TRANSACTION;

INSERT INTO dbo.[Customer](FirstName, LastName, CreatedDate) VALUES(@FirstName, @LastName, @CreatedDate);

SELECT @CustomerID = SCOPE_IDENTITY();

PRINT 'Inserted contact ID: ' + CAST(@CustomerId AS VARCHAR(10));

INSERT INTO [dbo].[CustomerContact]
           ([CustomerID]
           ,[MailingAddressStreet]
           ,[MailingAddressCity]
           ,[MailingAddressState]
           ,[MailingAddressZip]
           ,[BillingAddressStreet]
           ,[BillingAddressCity]
           ,[BillingAddressState]
           ,[BillingAddressZip]
           ,[EmailAddress]
           ,[PhoneNumber])
     VALUES
		    (2
           ,'310 Death Star Lane'
           ,'Jamacia'
           ,'VT'
           ,00010
           ,'310 Death Star Lane'
           ,'Jamacia'
           ,'VT'
           ,00010
           ,'vader@gmail.com'
           ,323456789)
GO


