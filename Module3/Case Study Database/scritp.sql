create database furama;
use furama;
create table CustomerType(
CustomerTypeId varchar(2) not null unique primary key,
CustomerTypeName varchar(50) not null
);

create table Customers(
CustomerId int not null unique auto_increment primary key,
CustomerName varchar(50) not null,
Birthday date not null,
IdCard int not null,
PhoneNumber int not null,
Email varchar(50) not null,
CustomerTypeId varchar(2) not null,
Address varchar(50) not null,
foreign key(CustomerTypeId) references CustomerType(CustomerTypeId)
);

create table Level(
LevelId varchar(2) not null unique primary key,
LevelName varchar(50) not null
);

create table Department(
DepartmentId varchar(2) not null unique primary key,
DepartmentName varchar(50) not null
);

create table Diploma(
DiplomaId varchar(2) not null unique primary key,
DiplomaName varchar(50) not null
);

create table Employees(
EmployeeId int not null unique auto_increment primary key,
Name varchar(50) not null,
Birthday date not null,
CardId int not null,
PhoneNumber int not null,
Email varchar(50) not null,
LevelId varchar(2) not null,
DepartmentId varchar(2) not null,
DiplomaId varchar(2) not null,
Salary int not null,
foreign key(LevelId) references Level(LevelId),
foreign key(DepartmentId) references Department(DepartmentId),
foreign key(DiplomaId) references Diploma(DiplomaId)
);

create table ServiceType(
ServiceTypeId varchar(2) not null unique primary key,
ServiceTypeName varchar(50) not null
);
 create table RentalForm(
 RentalFormId varchar(2) not null unique primary key,
 RentalFormName varchar(50) not null
 );
create table VillaHouseStandard(
VillaHouseStandardId varchar(2) not null unique primary key,
VillaHouseStandardName varchar(50) not null
);

create table Services (
ServiceId varchar(9) not null unique primary key,
ServiceTypeId varchar(2) not null,
ServiceName varchar(50) not null,
UseArea smallint not null,
RentalPrice int not null,
MaxPerson tinyint not null,
RentalFormId varchar(2) not null,
VillaHouseStandardID varchar(2) default null,
OtherConvenientVillaHouse varchar(50) default null,
PollVillaArea int default null,
NumberFloorVillaHouse int default null,
FreeServiceRoom varchar(50) default null,
foreign key(ServiceTypeId) references ServiceType(ServiceTypeId),
foreign key(VillaHouseStandardID) references VillaHouseStandard(VillaHouseStandardID),
foreign key(RentalFormId) references RentalForm(RentalFormId)       
);    
create table Contracts (
ContractId int not null unique primary key,
CustomerId int not null,
ServiceId varchar(9) not null,
EmployeeId int not null,
BenginDate date not null,
FinishDay date not null,
FirstPayment int not null,
TotalPayment int not null,
foreign key(CustomerId) references Customers(CustomerId),
foreign key(ServiceId) references Services(ServiceId),
foreign key(EmployeeId) references Employees(EmployeeId)
);   
create table AttachServices(
AttachServiceId varchar(2) not null unique primary key,
AttachServiceName varchar(50) not null,
Unit varchar(10) not null,
Price int not null
);

create table DetailContract(
AttachServiceId varchar(2) unique not null,
ContractId int not null,
Quantity int not null,
primary key(AttachServiceId, ContractId),
foreign key(AttachServiceId) references AttachServices(AttachServiceId),
foreign key(ContractId) references Contracts(ContractId)
);

insert into CustomerType(CustomerTypeId, CustomerTypeName)
 values 
('DI','Diamond'),
('PL', 'Platinium'),
('GO', 'Gold'),
('SI', 'Silver'),
('ME', 'Member');

insert into Level(LevelID,LevelName) 
values
('LT', 'Le Tan'),
('PV', 'Phuc Vu'),
('CV', 'Chuyen Vien'),
('GS', 'Giam Sat'),
('QL', 'Quan Ly'),
('GD', 'Giam Doc');

 insert into Department (DepartmentId,DepartmentName)
 values
 ('SA','Sale Marketing'),
 ('HC','Hanh Chinh'),
 ('PV','Phuc Vu'),
 ('QL','Quan Ly');

 insert into Diploma(DiplomaId,DiplomaName)
 values
 ('TC','Trung Cap'),
 ('CD','Cao Dang'),
 ('DH','Dai Hoc'),
 ('SD','Sau Dai Hoc');

 
 insert into Employees(Name,Birthday,CardId,PhoneNumber,Email,LevelID,DepartmentID,DiplomaId,Salary)
 values
 ('Nguyen Van Binh','1984-2-12',2012123432,915010234,'binhnv@gmail.com','LT','SA','CD',1000),
 ('Le Thi Thuy Linh','1993-5-25',104126754,899023567,'linhltt@gmail.com','PV','PV','TC',500),
 ('Dinh Thi Huong Ly','1977-7-29',126452765,913763387,'lydth@gmail.com','QL','QL','DH',1500),
 ('Le Van Dat','1975-5-20',345143568,905267843,'datlv@gmail.com','GD','QL','SD',1000);
 
 insert into Customers(CustomerName, Birthday,IdCard,PhoneNumber,Email,CustomerTypeId,Address)
 values
 ('Tran Thanh Lam','1984-09-12',201786374,935326684,'lamtt@gmail.com','DI', 'Quang Tri'),
 ('Tran Thanh Dieu Huong','1982-10-31',145234743,913000030,'huongttd@gmail.com','GO', 'Ha Noi'),
 ('Nguyen Van Dong','1975-12-12',342657639,925432789,'dongnv@gmail.com','ME', 'Da Nang'),
('Huynh Ngoc Thuong','1965-11-30',201321123,915231231,'hoahn@gmail.com','SI', 'Dong Nai'),
('Nguyen Phu Quoc','1965-10-30',203121456,911234323,'quocnp@gmail.com','DI', 'Vung Tau'),
('Le Tung Duong','1967-5-30',201321276,915231875,'duonglt@gmail.com','ME', 'Hue'),
('Nguyen Duc Bon','1995-11-30',205125189,945123723,'bonnd@gmail.com','PL', 'Vinh');

insert into ServiceType(ServiceTypeId,ServiceTypeName)
values
('VL','Villa'),
('HO','House'),
('RO','Room');

insert into RentalForm(RentalFormId,RentalFormName)
values
('NG','ngay'),
('TH','thang'),
('NA','nam'),
('GI','Villa');

insert into VillaHouseStandard(VillaHouseStandardId,VillaHouseStandardName)
values
('VI','Vip'),
('BU','Business'),
('NO','Normal');

insert into AttachServices(AttachServiceId,AttachServiceName, Unit, Price)
values
('MA','Massage','gio',100000),
('KA','Karaoke','gio',100000),
('MY','My Quang','to',50000),
('NU','Nuoc Suoi','chai',10000),
('Ca','Xe dien','gio',200000);
/*Add Villa vao database*/
insert into Services(ServiceId,ServiceTypeId,ServiceName,UseArea,RentalPrice,MaxPerson,RentalFormId, VillaHouseStandardID,PollVillaArea,NumberFloorVillaHouse)
values 
('SVVL-1921','VL','Hoang Lan',250,1000,6,'TH','VI',50,1),
('SVVL-1945','VL','Mai Vang',200,900,8,'TH','BU',30,2),
('SVVL-1971','VL','Hoa Hong',250,800,4,'TH','NO',40,1);
/*Add House vao datbase*/
insert into Services(ServiceId,ServiceTypeId,ServiceName,UseArea,RentalPrice,MaxPerson,RentalFormId, VillaHouseStandardID,NumberFloorVillaHouse)
values 
('SVHO-1986','HO','Nguoc Nang',100,500,4,'NG','VI',1);

/*Add Room vao datbase*/
insert into Services(ServiceId,ServiceTypeId,ServiceName,UseArea,RentalPrice,MaxPerson,RentalFormId,FreeServiceRoom)
values 
('SVRO-1986','RO','Binh Minh',50,100,4,'NG','Ghe tinh yeu');
,
