create table payments(
customerNumber int(11) not null,
checkNumber varchar(50) not null,
paymentDate date not null,
amount decimal(10,2) not null,
primary key(customerNumber,checkNumber)
);
alter table payments
add foreign key(customerNumber) references customers(customerNumber)