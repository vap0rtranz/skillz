-- import mock-up data for pre-prod CraftStoreDB database recreation
-- IDENTITY columns (ID) should be auto re-created during import (so ignored in data file)
-- note CSV files must have either each field quoted (") or no field quoted

USE CraftStoreDB_Stage;

BULK INSERT [dbo].[Customer] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - Customer.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS, TABLOCK);
GO

BULK INSERT [dbo].[CustomerContact] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - CustomerContact.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS, TABLOCK);
GO

BULK INSERT [dbo].[ProductType] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - ProductType.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS, TABLOCK);
GO

BULK INSERT [dbo].[Inventory] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - Inventory.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS, TABLOCK);
GO

BULK INSERT [dbo].[StockOrder] 
FROM 'c:\temp\CraftStoreDB-Dev-Data - StockOrder.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, CHECK_CONSTRAINTS, TABLOCK);
GO