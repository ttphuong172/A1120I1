create table offices(
officeCode varchar(10) not null primary key,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) default null,
state varchar(50) default null,
country varchar(50) not null,
postalCode varchar(15) not null,
territory varchar(10) not null
);