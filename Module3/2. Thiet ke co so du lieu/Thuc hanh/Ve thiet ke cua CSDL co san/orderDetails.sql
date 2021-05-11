create table orderDetails(
orderNumber int(11) not null,
productCode varchar(15) not null,
quantityOrdered int(11) not null,
priceEach decimal(10,2) not null,
orderLineNumber smallint(6) not null,
primary key(orderNumber,productCode)
);

alter table orderdetails
add foreign key(productCode) references products(productCode),
add foreign key(orderNumber) references orders(orderNumber)
