create	table Employees(
employeeNumber int(11) not null primary key,
lastName varchar(50) not null,
firstName varchar(50) not null,
extension varchar(10) not null,
email varchar(100) not null,
officeCode varchar(10) not null,
reportsTo int(11) default null,
jobTitle varchar(50) not null
);

alter table employees
add foreign key (reportsTo) references employees(employeeNumber),
add foreign key (officeCode) references offices(officeCode);

