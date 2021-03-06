USE [master]
GO
/****** Object:  Database [CraftStoreDB_Stage]    Script Date: 10/13/17 21:18:20 ******/
CREATE DATABASE [CraftStoreDB_Stage]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CraftStoreDB_Stage', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.HELIXDB\MSSQL\DATA\CraftStoreDB_Stage.mdf' , SIZE = 10240KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CraftStoreDB_Stage_Log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.HELIXDB\MSSQL\DATA\CraftStoreDB_Stage_Log.ldf' , SIZE = 10240KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [CraftStoreDB_Stage] SET COMPATIBILITY_LEVEL = 130
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CraftStoreDB_Stage].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CraftStoreDB_Stage] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET ARITHABORT OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET RECOVERY FULL 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET  MULTI_USER 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CraftStoreDB_Stage] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CraftStoreDB_Stage] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'CraftStoreDB_Stage', N'ON'
GO
ALTER DATABASE [CraftStoreDB_Stage] SET QUERY_STORE = OFF
GO
USE [CraftStoreDB_Stage]
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [CraftStoreDB_Stage]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 10/13/17 21:18:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[CustomerID] [int] IDENTITY(1,1) NOT NULL,
	[LastName] [nvarchar](50) NOT NULL,
	[FirstName] [nvarchar](50) NOT NULL,
	[CreatedDate] [smalldatetime] NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[CustomerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CustomerContact]    Script Date: 10/13/17 21:18:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CustomerContact](
	[CustomerID] [int] NOT NULL,
	[MailingAddressStreet] [nvarchar](50) NULL,
	[MailingAddressCity] [nvarchar](50) NULL,
	[MailingAddressState] [nvarchar](50) NULL,
	[MailingAddressZip] [int] NULL,
	[BillingAddressStreet] [nvarchar](50) NULL,
	[BillingAddressCity] [nvarchar](50) NULL,
	[BillingAddressState] [nvarchar](50) NULL,
	[BillingAddressZip] [int] NULL,
	[EmailAddress] [nvarchar](50) NULL,
	[PhoneNumber] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CustomOrder]    Script Date: 10/13/17 21:18:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CustomOrder](
	[CustomOrderID] [int] NOT NULL,
	[CustomerID] [int] NOT NULL,
	[ProductTypeID] [int] NOT NULL,
	[Description] [nvarchar](50) NOT NULL,
	[Material] [nvarchar](50) NULL,
	[Size] [nvarchar](50) NULL,
	[Quantity] [smallint] NOT NULL,
	[Offer] [smallmoney] NULL,
	[Date] [date] NOT NULL,
 CONSTRAINT [PK_CustomOrder] PRIMARY KEY CLUSTERED 
(
	[CustomOrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Inventory]    Script Date: 10/13/17 21:18:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Inventory](
	[InventoryID] [int] IDENTITY(1,1) NOT NULL,
	[ProductTypeID] [int] NOT NULL,
	[Description] [nvarchar](50) NULL,
	[Material] [nvarchar](50) NULL,
	[Size] [nvarchar](50) NULL,
	[Color] [nvarchar](50) NULL,
	[ListPrice] [money] NOT NULL,
	[ProductionCost] [money] NULL,
	[MadeOn] [date] NULL,
	[PictureURL] [nvarchar](50) NULL,
 CONSTRAINT [PK_Inventory] PRIMARY KEY CLUSTERED 
(
	[InventoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ProductType]    Script Date: 10/13/17 21:18:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ProductType](
	[ProductTypeID] [int] IDENTITY(1,1) NOT NULL,
	[ProductTypeName] [nvarchar](50) NOT NULL,
	[ProductTypeDescription] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[ProductTypeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[StockOrder]    Script Date: 10/13/17 21:18:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[StockOrder](
	[StockOrderID] [int] IDENTITY(1,1) NOT NULL,
	[CustomerID] [int] NOT NULL,
	[InventoryID] [int] NOT NULL,
	[Quantity] [smallint] NOT NULL,
	[Time] [smalldatetime] NOT NULL,
	[Paid] [bit] NOT NULL,
	[SellPrice] [money] NOT NULL,
 CONSTRAINT [PK_StockOrder] PRIMARY KEY CLUSTERED 
(
	[StockOrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[StockOrder] ADD  CONSTRAINT [DF_StockOrder_Paid]  DEFAULT ((0)) FOR [Paid]
GO
ALTER TABLE [dbo].[CustomerContact]  WITH CHECK ADD  CONSTRAINT [FK_CustomerContact_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([CustomerID])
GO
ALTER TABLE [dbo].[CustomerContact] CHECK CONSTRAINT [FK_CustomerContact_Customer]
GO
ALTER TABLE [dbo].[CustomOrder]  WITH CHECK ADD  CONSTRAINT [FK_CustomOrder_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([CustomerID])
GO
ALTER TABLE [dbo].[CustomOrder] CHECK CONSTRAINT [FK_CustomOrder_Customer]
GO
ALTER TABLE [dbo].[CustomOrder]  WITH CHECK ADD  CONSTRAINT [FK_CustomOrder_Product] FOREIGN KEY([ProductTypeID])
REFERENCES [dbo].[ProductType] ([ProductTypeID])
GO
ALTER TABLE [dbo].[CustomOrder] CHECK CONSTRAINT [FK_CustomOrder_Product]
GO
ALTER TABLE [dbo].[Inventory]  WITH CHECK ADD  CONSTRAINT [FK_Inventory_Product] FOREIGN KEY([ProductTypeID])
REFERENCES [dbo].[ProductType] ([ProductTypeID])
GO
ALTER TABLE [dbo].[Inventory] CHECK CONSTRAINT [FK_Inventory_Product]
GO
ALTER TABLE [dbo].[StockOrder]  WITH CHECK ADD  CONSTRAINT [FK_StockOrder_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([CustomerID])
GO
ALTER TABLE [dbo].[StockOrder] CHECK CONSTRAINT [FK_StockOrder_Customer]
GO
ALTER TABLE [dbo].[StockOrder]  WITH CHECK ADD  CONSTRAINT [FK_StockOrder_Inventory] FOREIGN KEY([InventoryID])
REFERENCES [dbo].[Inventory] ([InventoryID])
GO
ALTER TABLE [dbo].[StockOrder] CHECK CONSTRAINT [FK_StockOrder_Inventory]
GO
/****** Object:  StoredProcedure [dbo].[DeleteInventory]    Script Date: 10/13/17 21:18:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[DeleteInventory] 
	-- Add the parameters for the stored procedure here
	(@RemoveInventoryID INT = 1)
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;
	-- Best practice to wrap an insert into a transaction block
	BEGIN TRANSACTION

	DELETE FROM [dbo].[Inventory]
      WHERE InventoryID = @RemoveInventoryID;

	COMMIT TRANSACTION;
END;

GO
/****** Object:  StoredProcedure [dbo].[InsertCustomer]    Script Date: 10/13/17 21:18:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[InsertCustomer] 
	-- Add the parameters for the stored procedure here
	(
	@CustomerID INT = 0 OUTPUT,
	@FirstName nvarchar(50) = 'Jane',
	@LastName nvarchar(50) = 'Doe',
	@CreatedDate smalldatetime = '2007-05-08 12:35:00'
	)

AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;
	-- Best practice to wrap an insert into a transaction block
	BEGIN TRANSACTION;
		INSERT INTO dbo.Customer(FirstName, LastName, CreatedDate) VALUES(@FirstName, @LastName, @CreatedDate); 
		-- capture autogenerated identity PK as CustomerID
		SELECT @CustomerID = SCOPE_IDENTITY();
	COMMIT TRANSACTION;
	-- return the CustomerID that was autogenerated
	SELECT @CustomerID AS CustomerID;
END;

GO
/****** Object:  StoredProcedure [dbo].[InsertInventory]    Script Date: 10/13/17 21:18:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[InsertInventory] 
	-- Add the parameters for the stored procedure here
	(
	@InventoryID INT = 0 OUTPUT,
	@ProductTypeID int = 1,
	@Description nvarchar(50)= 'inventory description',
	@Material nvarchar(50) = 'inventory material',
	@Size nvarchar(50) = 1,
	@Color nvarchar(5) = 'inventory color',
	@ListPrice money = 1.00,
	@ProductionCost money = 1.00,
	@MadeOn date = '1900-01-01',
	@PictureURL nvarchar(50) = 'inventory url'
	)
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;
	-- Best practice to wrap an insert into a transaction block
	BEGIN TRANSACTION;
		INSERT INTO [dbo].[Inventory]([ProductTypeID],[Description],[Material],[Size],[Color],[ListPrice],[ProductionCost],[MadeOn],[PictureURL])
		VALUES (@ProductTypeID,@Description,@Material,@Size,@Color,@ListPrice,@ProductionCost,@MadeOn,@PictureURL);
			-- capture autogenerated identity PK as StockORder ID
		SELECT @InventoryID = SCOPE_IDENTITY();
	COMMIT TRANSACTION;
	SELECT @InventoryID AS InventoryID;
END;
GO
/****** Object:  StoredProcedure [dbo].[ReportSalesbyProduct]    Script Date: 10/13/17 21:18:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[ReportSalesbyProduct]
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;

	SELECT [dbo].[StockOrder].[InventoryID], sum([dbo].[StockOrder].[SellPrice]*[dbo].[StockOrder].[Quantity]) 
	FROM [StockOrder] 
	INNER JOIN [dbo].[Inventory]
	ON [dbo].[StockOrder].[InventoryID] = [dbo].[Inventory].[InventoryID]
	GROUP BY [dbo].[StockOrder].[InventoryID];

END;
GO
/****** Object:  StoredProcedure [dbo].[ReportSalesPriceElligible]    Script Date: 10/13/17 21:18:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[ReportSalesPriceElligible]
	(@SalePriceMin int = 50.00)
AS
BEGIN
	-- count rows affected
	SET NOCOUNT OFF;

	SELECT [InventoryID],[ListPrice],[ProductionCost],[Description] =
	  CASE
		WHEN [ListPrice] >= @SalePriceMin THEN 'Elligible for discount sales'
		ELSE 'Regular list price'
	  END
	FROM [dbo].[Inventory]
	ORDER BY [ListPrice] DESC
END;
GO
USE [master]
GO
ALTER DATABASE [CraftStoreDB_Stage] SET  READ_WRITE 
GO
