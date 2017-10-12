USE [CraftStoreDB_DEV]
GO

INSERT INTO [dbo].[Inventory]
           ([ProductTypeID]
           ,[Description]
           ,[Material]
           ,[Size]
           ,[Color]
           ,[Quantity]
           ,[Price]
           ,[Cost]
           ,[MadeOn])
     VALUES
           (1
           ,'warm your noggin with this handmade knit beannie'
           ,'acrylic yarn'
           ,'large'
           ,'blue, yellow'
           ,1
           ,10.00
           ,5.00
           ,'1984-12-31'),
		    (2
           ,'warm handmade throw for your couch or bed'
           ,'wool blend'
           ,'8 x 5'
           ,'blue, grey'
           ,1
           ,250.00
           ,25.00
           ,'1984-12-31'),
		    (4
           ,'elegant, handmade cardigan made of alpaca.'
           ,'alpaca'
           ,'small'
           ,'burnt orange'
           ,1
           ,150.00
           ,15.00
           ,'1984-12-31'),
		    (8
           ,'forest lake with mountain background'
           ,'oil on canvas'
           ,'18" x 20"'
           ,'white background'
           ,1
           ,50.00
           ,10.00
           ,'1980-07-12')
GO


