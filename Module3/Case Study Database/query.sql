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