-- import mock-up data for pre-prod CraftStoreDB database recreation

USE CraftStoreDB_DEV;

BULK INSERT [dbo].[Customer] 
FROM 'c:\temp\customer.csv' 
WITH (ROWTERMINATOR = '\n', FIELDTERMINATOR = ',', FIRSTROW = 1, ERRORFILE = 'c:\temp\bulk-import.log', CHECK_CONSTRAINTS);
GO