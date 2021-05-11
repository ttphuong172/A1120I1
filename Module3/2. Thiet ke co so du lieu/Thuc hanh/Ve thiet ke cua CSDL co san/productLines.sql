create table productLines(
productLine varchar(50) not null primary key,
textDescription varchar(4000) default null,
htmlDescription mediumtext default null,
image mediumblob default null
);