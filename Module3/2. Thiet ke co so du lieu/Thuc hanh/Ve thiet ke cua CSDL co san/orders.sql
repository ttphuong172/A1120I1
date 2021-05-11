create table orders(
orderNumber int(11) not null primary key,
orderDate date not null,
requiredDate date not null,
shippedDate date default null,
status varchar(15) not null,
comments text default null
);

alter table orders
add column customerNumber int(11),
add foreign key(customerNumber) references customers(customerNumber);