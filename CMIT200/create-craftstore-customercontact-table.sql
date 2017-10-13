/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2016 (13.0.4001)
    Source Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2016
    Target Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Target Database Engine Type : Standalone SQL Server
*/

USE [CraftStoreDB_QA]
GO

IF EXISTS (SELECT 1 FROM sys.tables WHERE [Name] = 'CustomerContact')
BEGIN
	ALTER TABLE [dbo].[CustomerContact] DROP CONSTRAINT [FK_CustomerContact_Customer]
	/****** Object:  Table [dbo].[CustomerContact]    Script Date: 10/11/17 20:26:06 ******/
	DROP TABLE [dbo].[CustomerContact]
END

GO

/****** Object:  Table [dbo].[CustomerContact]    Script Date: 10/11/17 20:26:06 ******/
-- ensure values of NULL is ISO compliant
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
	[BillingAddressStreet] [nvarchar](50) NOT NULL,
	[BillingAddressCity] [nvarchar](50) NOT NULL,
	[BillingAddressState] [nvarchar](50) NOT NULL,
	[BillingAddressZip] [int] NOT NULL,
	[EmailAddress] [nvarchar](50) NULL,
	[PhoneNumber] [int] NULL
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[CustomerContact]  WITH CHECK ADD  CONSTRAINT [FK_CustomerContact_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([CustomerID])
GO

ALTER TABLE [dbo].[CustomerContact] CHECK CONSTRAINT [FK_CustomerContact_Customer]
GO


