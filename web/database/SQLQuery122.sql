create database newprj001;
go
use newprj001;
go

create table Account(
accountID int ,
fullName char(30) ,--display name
username char(50) primary key,
[password] char(50),
email char(30),
phone char(10),
roleID int --1 for user 0 for admin?
)

create table Category(
productCategory char(30) primary key,
categoryName char(20)
)

create table feedBack(
feedBackID int primary key,
username char(50) foreign key references Account(username),
Comment char(100),
starVote int --1 to 5
)

create table product(
productID char(30) primary key,
productName char(30),
productDes char(80),
prices int,
productImage char(50),
productCategory char(30) foreign key references Category(
productCategory),
isOnSale int ,--1 if onSale 0 if not
feedBackID int foreign key references feedBack(feedBackID)
)
create table invoiceDetail(
detailID char(10),
productID char(30) foreign key references product(productID),
quantity int,
totalPrice int
)

create table invoice(
invoiceID char(30) primary key,
username char(50) foreign key references Account(username),
ShippingAddress char(50),
shippingMethod int --support only shipCOD
)

