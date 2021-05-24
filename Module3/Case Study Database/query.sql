/*2*/
select * from Employees where length(Name)<=15;
/*3*/
 select *  from Customers where address like '%Quang Tri%' and TIMESTAMPDIFF(YEAR,Birthday,curdate()) between 18 and 50;
 /*4*/
 select  Customers.CustomerName,count(Customers.CustomerName) as solandat from contracts inner join Customers on contracts.CustomerID=customers.customerId where Customers.CustomerTypeId='DI' group by Customers.CustomerName order by solandat;
 /*5*/
 select Customers.CustomerID,Customers.CustomerName, CustomerType.CustomerTypeName,Contracts.ContractID,Services.ServiceName,Contracts.BeginDate, Services.RentalPrice +(DetailContract.Quantity*AttachServices.Price) as TongTien from Customers left join
Contracts 
on Customers.CustomerId=Contracts.CustomerId
left join Services on Contracts.ServiceId=Services.ServiceId
left join DetailContract on Contracts.ContractID=DetailContract.ContractID
left join AttachServices on DetailContract.AttachServiceId=AttachServices.AttachServiceID
left join CustomerType on Customers.CustomerTypeID=CustomerType.CustomerTypeID;
/*6*/

/*7*/
select * from Services left join Contracts on Services.ServiceID=Contracts.ServiceId
where year(BeginDate)='2018'and ServiceName not in(select ServiceName from Services left join Contracts on Services.ServiceID=Contracts.ServiceId
where year(BeginDate)='2019');
/*8*/
/*C1*/
select CustomerName from Customers
group by CustomerName;
/*C2*/
select distinct CustomerName from Customers;
 /*9*/
select month(begindate)  as month ,count(customerID) as soluong,sum(TotalPayment)  from Contracts
where  year(begindate)='2019'
group by month(begindate) ;
/*10*/
select Contracts.ContractId, Contracts.BeginDate, Contracts.FinishDate, Contracts.FirstPayment,DetailContract.AttachServiceId,count(DetailContract.AttachServiceId) as soluong from Contracts inner join DetailContract on Contracts.ContractId=DetailContract.ContractId
group by DetailContract.AttachServiceId;
/*11*/
select attachservices.attachservicename,detailcontract.quantity, attachservices.price  from customers inner join contracts on customers.customerid=contracts.customerid
inner join detailcontract on Contracts.contractid=detailcontract.contractid
inner join attachservices on detailcontract.attachserviceid = attachservices.attachserviceid
where customers.address like '%Vinh%' or customers.address like '%Quang Ngai%' and CustomerTypeID='DI'
/*12*/
select contracts.ContractId,employees.Name,customers.CustomerName,customers.PhoneNumber,services.ServiceName,services.ServiceId,detailcontract.Quantity,contracts.FirstPayment
from contracts
inner join employees
on contracts.EmployeeId=employees.EmployeeId
inner join customers
on contracts.CustomerId=customers.CustomerId
inner join services
on contracts.ServiceId=services.ServiceId
left join detailcontract
on contracts.ContractId=detailcontract.ContractId 
where BeginDate between '2019-6-01' and '2019-12-31'
and contracts.ServiceId  not in
(select contracts.ServiceId  from services
inner join contracts
on services.ServiceId=contracts.ServiceId
where BeginDate between '2019-01-01' and '2019-6-30')

/*13*/
select attachservices.*,detailcontract.Quantity from attachservices
inner join detailcontract
on attachservices.AttachServiceId=detailcontract.AttachServiceId
where detailcontract.Quantity= (select max(Quantity) from detailcontract);

/*14*/
select contracts.ContractId,services.ServiceName,attachservices.AttachServiceName
from contracts
inner join detailcontract
on contracts.ContractId=detailcontract.ContractId
inner join services
on contracts.ServiceId = services.ServiceId 
inner join attachservices
on detailcontract.AttachServiceId=attachservices.AttachServiceId
where detailcontract.AttachServiceId in
(select  AttachServiceId
from detailContract
group by AttachServiceId
having count(AttachServiceId)=1)

/*15*/
select employees.EmployeeId,employees.name,diploma.DiplomaName,department.DepartmentName,level.LevelName,employees.PhoneNumber,IFNULL(a.soluong,0) as soluong from employees
inner join level
on employees.LevelId=level.LevelId
inner join department 
on employees.DepartmentId=department.DepartmentId
inner join diploma
on employees.DiplomaId=diploma.DiplomaId
left join
(select EmployeeId,count(EmployeeId) as soluong from contracts
group by EmployeeId having soluong <=3) as a
on employees.EmployeeId=a.EmployeeId
/*16*/
delete from employees
where EmployeeId in
(select EmployeeId from employees
where EmployeeId not in
(select EmployeeId from contracts
where BeginDate between '2017-01-01' and '2019-12-31'))
/*17*/
update customers
set CustomerTypeID='DI'
where  CustomerId in
(select CustomerId from contracts where year(BeginDate)='2019'
group by CustomerId having sum(TotalPayment)>500)
/*18*/


/*19*/
update attachservices
set Price=Price*1.1
where AttachServiceId in
(select AttachServiceId from contracts
inner join detailcontract
on contracts.ContractId=detailcontract.ContractId
where year(contracts.BeginDate)='2019' 
group by AttachServiceId
having count(AttachServiceId)>4);

/*20*/
select EmployeeId,Name,Email,PhoneNumber,Birthday,Address from employees
union all
select CustomerId,CustomerName,Email,PhoneNumber,Birthday,Address from customers;

/*21*/
create view V_NHANVIEN as
select employees.* from employees
inner join contracts
on employees.EmployeeId=contracts.EmployeeId
where contracts.begindate='2019-12-12' and employees.Address='Hai Chau';

/*22*/
update V_NHANVIEN
set Address='Lien Chieu'
where Address='Hai Chau';

