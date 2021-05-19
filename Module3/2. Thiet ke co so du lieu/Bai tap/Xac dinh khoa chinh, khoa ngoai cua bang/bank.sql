select * from customers;
select * from accounts;
delete from customers;
delete from accounts;
alter table  customers
modify email varchar(255);
insert into customers(customer_Number,fullname,email,address,phone)
VALUES (21,"Tyler Day","ligula.Nullam.feugiat@sollicitudinamalesuada.ca","Cerreto di Spoleto","0900725540"),(22,"Veda Erickson","enim.Suspendisse.aliquet@In.co.uk","Georgia","0962689875"),(23,"Stone Parker","elit.dictum.eu@nibh.com","Morinville","0908176326"),(24,"Ulla Carrillo","id.mollis@dictumPhasellus.org","Tapachula","0984147558"),(25,"Gillian Hodge","imperdiet@purussapien.ca","Alnwick","0988575992"),(26,"Hedda Conrad","Aliquam@Nuncsedorci.co.uk","Neudörfl","0923452179"),(27,"Faith Gross","Quisque@inlobortistellus.net","Halberstadt","0950502938"),(28,"Petra Webb","Fusce.fermentum.fermentum@orcilacusvestibulum.ca","Carcassonne","0942260814"),(29,"Fay Snider","vestibulum@tristiquealiquet.net","San Francisco","0937205912"),(30,"Sopoline Young","gravida@vitae.com","Houtvenne","0996865736");


insert into accounts
VALUES (1,1,"vip","2019-11-10",46374),(2,2,"normal","2019-02-18",76994),(3,3,"vip","2019-01-24",30221),(4,4,"normal","2019-09-03",33811),(5,5,"vip","2019-07-09",94605),(6,6,"normal","2019-07-06",52800),(7,7,"vip","2019-05-20",48619),(8,8,"vip","2019-11-02",95581),(9,9,"business","2019-08-08",43880),(10,10,"vip","2019-08-03",73449);
insert into accounts VALUES (11,11,"normal","2019-05-31",36440),(12,12,"vip","2019-07-21",34592),(13,13,"business","2019-10-04",59288),(14,14,"vip","2019-03-08",64812),(15,15,"business","2019-08-07",12577),(16,16,"vip","2019-08-05",63307),(17,17,"business","2019-11-17",11791),(18,18,"business","2019-08-06",33730),(19,19,"business","2019-04-22",79363),(20,20,"business","2019-06-21",25327);
insert into accounts VALUES (21,21,"vip","2019-05-18",50132),(22,22,"business","2019-09-13",36490),(23,23,"business","2019-08-07",97490),(24,24,"normal","2019-12-02",12711),(25,25,"business","2019-06-08",39301),(26,26,"business","2019-04-18",15102),(27,27,"normal","2019-12-20",80945),(28,28,"normal","2019-03-13",15770),(29,29,"business","2019-03-21",28451),(30,30,"vip","2019-06-16",77531);

insert into transactions
 VALUES (1,21,"2020-04-18",9746),(2,13,"2020-02-03",7447),(3,9,"2020-03-26",4659),(4,19,"2020-02-19",8754),(5,7,"2020-04-13",2679),(6,10,"2020-01-04",4537),(7,3,"2020-02-24",8455),(8,11,"2020-01-30",9682),(9,12,"2020-04-12",4278),(10,27,"2020-01-14",6275);
 
 select * from customers
 inner join accounts
 on customers.customer_number=accounts.customer_number
 inner join transactions
 on accounts.account_number=transactions.account_number;