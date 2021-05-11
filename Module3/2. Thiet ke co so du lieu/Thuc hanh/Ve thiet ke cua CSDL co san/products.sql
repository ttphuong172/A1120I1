create table products(
productCode varchar(15) not null primary key,
productName varchar(70) not null,
productLine varchar(50) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription text not null,
quantityInStock smallint(6) not null,
buyPrice decimal(10,2) not null,
MSRP decimal(10,2) not null
);

alter table products
add foreign key (productLine) references productlines(productLine);
