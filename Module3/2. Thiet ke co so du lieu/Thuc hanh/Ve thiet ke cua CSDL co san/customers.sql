create table customers(
customerNumber int(11) not null primary key,
customerName varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) default null,
city varchar(50) not null,
state varchar(50)  default null,
postalCode varchar(15) default null,
country varchar(50) not null,
salesRepEmployeeNumber int(11) default null,
creditLimit int(11) default null
);

alter table customers
add foreign key (salesRepEmployeeNumber) references employees(employeeNumber);
