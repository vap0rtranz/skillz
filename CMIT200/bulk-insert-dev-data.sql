-- import mock-up data for pre-prod CraftStoreDB database recreation

USE CraftStoreDB_QA;

BULK INSERT [dbo].[Customer] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - Customer.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS);
GO

BULK INSERT [dbo].[CustomerContact] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - CustomerContact.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS);
GO

BULK INSERT [dbo].[ProductType] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - ProductType.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS);
GO

BULK INSERT [dbo].[Inventory] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - Inventory.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS);
GO