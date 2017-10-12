USE [CraftStoreDB_DEV]
GO

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
           (3
           ,'310 Death Star Lane'
           ,'Jamacia'
           ,'VT'
           ,00010
           ,'310 Death Star Lane'
           ,'Jamacia'
           ,'VT'
           ,00010
           ,'vader@gmail.com'
           ,323456789),
		   (1
           ,'Doe Lane'
           ,'Chicago'
           ,'IL'
           ,60606
           ,'Doe Lane'
           ,'Chicago'
           ,'IL'
           ,60606
           ,'vader@gmail.com'
           ,323456789),
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


