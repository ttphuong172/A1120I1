-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: furama
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attachservices`
--

DROP TABLE IF EXISTS `attachservices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attachservices` (
  `AttachServiceId` varchar(2) NOT NULL,
  `AttachServiceName` varchar(50) NOT NULL,
  `Unit` varchar(10) NOT NULL,
  `Price` int NOT NULL,
  PRIMARY KEY (`AttachServiceId`),
  UNIQUE KEY `AttachServiceId` (`AttachServiceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attachservices`
--

LOCK TABLES `attachservices` WRITE;
/*!40000 ALTER TABLE `attachservices` DISABLE KEYS */;
INSERT INTO `attachservices` VALUES ('CA','Xe dien','gio',22),('KA','Karaoke','gio',10),('MA','Massage','gio',10),('MY','My Quang','to',10),('NU','Nuoc Suoi','chai',1);
/*!40000 ALTER TABLE `attachservices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contracts`
--

DROP TABLE IF EXISTS `contracts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contracts` (
  `ContractId` int NOT NULL AUTO_INCREMENT,
  `CustomerId` int NOT NULL,
  `ServiceId` varchar(9) NOT NULL,
  `EmployeeId` int NOT NULL,
  `BeginDate` date NOT NULL,
  `FinishDate` date DEFAULT NULL,
  `FirstPayment` int NOT NULL,
  `TotalPayment` int NOT NULL,
  PRIMARY KEY (`ContractId`),
  UNIQUE KEY `ContractId` (`ContractId`),
  KEY `ServiceId` (`ServiceId`),
  KEY `EmployeeId` (`EmployeeId`),
  KEY `CustomerId` (`CustomerId`),
  CONSTRAINT `contracts_ibfk_2` FOREIGN KEY (`ServiceId`) REFERENCES `services` (`ServiceId`),
  CONSTRAINT `contracts_ibfk_3` FOREIGN KEY (`EmployeeId`) REFERENCES `employees` (`EmployeeId`),
  CONSTRAINT `contracts_ibfk_4` FOREIGN KEY (`CustomerId`) REFERENCES `customers` (`CustomerId`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contracts`
--

LOCK TABLES `contracts` WRITE;
/*!40000 ALTER TABLE `contracts` DISABLE KEYS */;
INSERT INTO `contracts` VALUES (1,1,'SVHO-1946',1,'2018-01-01','2018-01-31',2000,4000),(2,1,'SVHO-1946',1,'2018-02-01','2018-02-28',2000,4000),(3,1,'SVHO-1946',1,'2019-01-01','2019-01-31',2000,4000),(4,1,'SVHO-1946',1,'2019-02-01','2019-02-28',2000,4000),(5,2,'SVRO-1986',1,'2018-02-02','2018-02-02',0,100),(6,2,'SVRO-1949',1,'2018-05-01','2018-05-01',0,90),(7,2,'SVRO-1956',1,'2018-05-02','2018-05-02',0,120),(8,2,'SVRO-1956',1,'2019-06-22','2019-06-22',0,120),(9,8,'SVRO-1996',1,'2019-05-15','2019-05-15',0,70),(10,9,'SVRO-1949',1,'2019-04-19','2019-04-19',0,90),(11,9,'SVRO-1949',1,'2019-11-11','2019-11-11',0,120),(12,9,'SVRO-1986',1,'2019-12-11','2019-12-11',0,10),(13,3,'SVRO-1996',1,'2019-12-20','2019-12-20',0,70),(14,4,'SVRO-1996',2,'2015-01-01','2015-01-01',0,70),(15,18,'SVRO-1986',21,'2019-02-11','2019-02-11',1,90),(16,53,'SVRO-1986',7,'2016-05-09','2016-05-09',5,83),(17,18,'SVRO-1949',8,'2015-08-17','2015-08-17',6,72),(18,32,'SVRO-1956',14,'2018-01-26','2018-01-26',5,84),(19,25,'SVRO-1996',1,'2018-02-02','2018-02-02',8,95),(20,2,'SVRO-1949',21,'2018-03-30','2018-03-30',9,88),(21,39,'SVRO-1996',5,'2019-02-11','2019-02-11',4,74),(22,15,'SVRO-1949',21,'2015-07-23','2015-07-23',6,93),(23,34,'SVRO-1996',23,'2018-08-18','2018-08-18',5,90),(24,37,'SVRO-1956',21,'2016-03-18','2016-03-18',1,99),(25,57,'SVRO-1956',24,'2018-01-20','2018-01-20',6,97),(26,75,'SVRO-1949',21,'2017-11-14','2017-11-14',1,86),(27,56,'SVRO-1956',16,'2018-03-23','2018-03-23',10,74),(28,9,'SVRO-1996',11,'2018-11-19','2018-11-19',2,82),(29,44,'SVRO-1956',8,'2017-04-13','2017-04-13',5,83),(30,41,'SVRO-1996',9,'2015-12-09','2015-12-09',9,84),(31,39,'SVRO-1986',25,'2016-08-08','2016-08-08',9,89),(32,77,'SVRO-1949',17,'2018-11-23','2018-11-23',9,89),(33,45,'SVRO-1986',19,'2016-04-06','2016-04-06',7,71),(34,21,'SVRO-1986',25,'2017-08-23','2017-08-23',4,87),(35,26,'SVRO-1949',5,'2016-01-10','2016-01-10',4,96),(36,26,'SVRO-1996',7,'2017-05-29','2017-05-29',3,76),(37,42,'SVRO-1996',15,'2016-09-01','2016-09-01',7,96),(38,77,'SVRO-1986',25,'2017-08-28','2017-08-28',5,72),(39,10,'SVRO-1986',13,'2019-12-28','2019-12-28',10,73),(40,5,'SVRO-1996',7,'2018-04-27','2018-04-27',10,88),(41,30,'SVRO-1956',9,'2016-11-09','2016-11-09',8,89),(42,5,'SVRO-1986',21,'2015-12-08','2015-12-08',1,90),(43,27,'SVRO-1996',12,'2018-07-18','2018-07-18',1,95),(44,9,'SVRO-1986',3,'2017-05-17','2017-05-17',1,77);
/*!40000 ALTER TABLE `contracts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `CustomerId` int NOT NULL AUTO_INCREMENT,
  `CustomerName` varchar(50) NOT NULL,
  `Birthday` date NOT NULL,
  `IdCard` int NOT NULL,
  `PhoneNumber` int NOT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `CustomerTypeId` varchar(2) NOT NULL,
  `Address` varchar(50) NOT NULL,
  PRIMARY KEY (`CustomerId`),
  UNIQUE KEY `CustomerId` (`CustomerId`),
  KEY `CustomerTypeId` (`CustomerTypeId`),
  CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`CustomerTypeId`) REFERENCES `customertype` (`CustomerTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'Tran Thanh Lam','1984-09-12',201786374,935326684,'lamtt@gmail.com','DI','Quang Tri'),(2,'Tran Thanh Dieu Huong','1982-10-31',145234743,913000030,'huongttd@gmail.com','DI','Ha Noi'),(3,'Nguyen Van Dong','1975-12-12',342657639,925432789,'dongnv@gmail.com','ME','Da Nang'),(4,'Huynh Ngoc Thuong','1965-11-30',201321123,915231231,'hoahn@gmail.com','SI','Dong Nai'),(5,'Nguyen Phu Quoc','1965-10-30',203121456,911234323,'quocnp@gmail.com','DI','Vung Tau'),(6,'Le Tung Duong','1967-05-30',201321276,915231875,'duonglt@gmail.com','ME','Hue'),(7,'Le Tung Duong','1989-12-25',209786521,912356936,'duonglt@yahoo.com','GO','Binh Dinh'),(8,'Nguyen Duc Bon','1995-11-30',205125189,945123723,'bonnd@gmail.com','PL','Vinh'),(9,'Tieu Lam Hung','1997-07-12',209765604,945123723,'hungtl@gmail.com','DI','Quang Ngai'),(10,'Kareem Guthrie','1962-02-22',131396165,92303929,'quis.pede.Praesent@mauriserat.co.uk','ME','Velaine-sur-Sambre'),(11,'Carson Rowland','1984-03-17',127511805,90230912,'congue.In.scelerisque@tempus.edu','PL','Knokke-Heist'),(12,'Yoshi Cobb','1956-11-11',562014592,91480473,'mi.eleifend@nullaInteger.edu','GO','Warszawa'),(13,'Athena Hutchinson','1966-09-29',486958625,93856919,'ligula@Quisque.com','DI','Ligny'),(14,'Phoebe Sellers','1974-06-24',423491185,94817405,'Duis.at.lacus@atfringilla.net','GO','Vannes'),(15,'Kieran Baldwin','1972-05-03',261619390,91891941,'Proin.nisl.sem@interdum.ca','GO','Dallas'),(16,'Sophia Cooley','1968-04-04',400961649,91918532,'fringilla.cursus.purus@sed.ca','ME','Wood Buffalo'),(17,'Luke Aguilar','1959-01-17',146422244,91920855,'quis.turpis@vulputate.ca','ME','Moen'),(18,'Noelani Chandler','1979-09-05',178882226,91900245,'varius@loremvehiculaet.com','SI','Colchane'),(19,'Emma Golden','1955-07-19',778465632,92799529,'lacus@commodo.com','PL','Etroubles'),(20,'Amela Weaver','1956-09-24',405230341,92914695,'varius.Nam@Fusce.com','DI','Binh Dinh'),(21,'Ivor Daniels','1969-05-19',631123326,90815567,'molestie.in.tempus@elementumpurusaccumsan.co.uk','PL','Sai Gon'),(22,'Hanae Mcmillan','1960-01-03',863568887,92074575,'a.enim@dignissim.co.uk','ME','Sai Gon'),(23,'Graham Bird','1970-09-03',121860546,93763881,'viverra@ProinmiAliquam.ca','GO','Quang Ngai'),(24,'Jelani Christensen','1980-12-18',501369833,94662129,'non.justo.Proin@purus.ca','PL','Ha Noi'),(25,'Deacon Clements','1955-11-30',660043270,92787217,'magna@posuerevulputate.co.uk','SI','Quang Ngai'),(26,'Darryl Bright','1951-10-03',361197675,93597965,'dictum.eu.placerat@loremlorem.org','ME','Hai Phong'),(27,'Ignatius Chambers','1951-12-09',996284360,92295676,'justo@Duiscursusdiam.org','SI','Quang Ngai'),(28,'Amal Simon','1962-11-14',417665542,94793163,'eu@massalobortisultrices.co.uk','PL','Ha Noi'),(29,'Marvin Lawson','1966-06-25',321042660,94475694,'Aliquam.ornare.libero@risusNulla.com','GO','Quang Nam'),(30,'Clarke Walls','1970-10-05',510304135,91812674,'sed.hendrerit@a.ca','PL','Quang Ngai'),(31,'Brianna Dalton','1965-12-30',439855305,91558120,'lacus@Inornaresagittis.com','SI','Hai Phong'),(32,'Clio Cooley','1952-08-02',725802038,90575361,'orci.Phasellus.dapibus@nonloremvitae.ca','DI','Binh Dinh'),(33,'Tobias Ferguson','1955-03-12',531286379,93751454,'pharetra.sed.hendrerit@pellentesque.com','PL','Hai Phong'),(34,'Sybil Roth','1979-06-11',560565697,94234380,'et@malesuadavel.org','GO','Quang Nam'),(35,'Wallace Knapp','1962-01-28',464810535,93468572,'amet.orci.Ut@ridiculusmusAenean.co.uk','DI','Quang Nam'),(36,'Zachery Winters','1956-10-10',884099879,91753360,'Ut@cursus.ca','SI','Quang Nam'),(37,'Nolan Blackwell','1984-09-02',916138785,92306997,'parturient@rutrum.com','DI','Sai Gon'),(38,'Oliver Mack','1968-01-16',786887159,90677445,'Suspendisse.ac@tinciduntnuncac.net','ME','Hai Phong'),(39,'Gillian Hendricks','1981-11-18',332574664,90605378,'amet.lorem.semper@interdum.net','DI','Binh Dinh'),(40,'Quemby Moore','1953-04-04',965069188,91157646,'aliquam.eu@egestas.edu','SI','Hai Phong'),(41,'Lester Little','1983-01-23',939074497,92107529,'malesuada.ut.sem@imperdietornareIn.ca','GO','Hai Phong'),(42,'Nevada Acevedo','1958-02-26',762603434,94773991,'id.magna.et@lobortis.co.uk','DI','Vinh'),(43,'Brenda Mack','1951-09-09',449680045,90579813,'dolor.vitae.dolor@ligulaAenean.net','SI','Quang Ngai'),(44,'Jana Mcmillan','1962-01-17',375064991,94261626,'sapien.gravida@Fuscealiquet.edu','GO','Quang Nam'),(45,'Mikayla French','1970-09-09',785235524,91588699,'placerat@DonecnibhQuisque.ca','ME','Quang Ngai'),(46,'Yolanda Lancaster','1978-05-10',845951107,93304031,'posuere.cubilia.Curae@quisurna.co.uk','ME','Sai Gon'),(47,'Quamar Horton','1964-04-22',156343880,93935037,'arcu@lacus.co.uk','DI','Quang Ngai'),(48,'Faith Decker','1961-09-17',997398804,90510797,'facilisis.Suspendisse.commodo@morbitristiquesenectus.com','SI','Ha Noi'),(49,'Dennis Glover','1967-12-19',160692993,91210161,'velit@Donecvitae.ca','PL','Quang Nam'),(50,'Sloane Cameron','1955-04-11',728501813,93654985,'montes.nascetur.ridiculus@mauris.net','GO','Quang Ngai'),(51,'Damian Mays','1968-08-16',233070748,94792120,'ac@lacus.co.uk','GO','Quang Ngai'),(52,'Melodie Logan','1981-06-27',470719739,92129965,'hymenaeos.Mauris@turpisvitaepurus.ca','DI','Quang Ngai'),(53,'Thor Lang','1974-07-03',448396358,90180481,'Cras.vulputate@euismodac.co.uk','DI','Quang Nam'),(54,'Christine Taylor','1958-04-06',666405417,90332319,'pede.Suspendisse@vulputate.co.uk','DI','Quang Ngai'),(55,'Branden Green','1976-08-26',208169687,92272804,'feugiat.nec@ac.com','GO','Quang Ngai'),(56,'Idola Walton','1961-05-04',624281953,93329405,'Nulla.dignissim.Maecenas@felis.net','GO','Quang Ngai'),(57,'Orla Riggs','1953-01-20',693456967,92781034,'eu.accumsan.sed@sitametrisus.edu','DI','Quang Nam'),(58,'Cleo Molina','1964-04-04',798629215,93366140,'Vivamus@dolor.com','GO','Quang Ngai'),(59,'Linda Bryant','1965-02-23',983743801,93712519,'mollis.Phasellus@pellentesqueeget.net','GO','Quang Nam'),(60,'Lara Barr','1977-02-26',379798622,91395031,'Praesent@cursusvestibulum.com','DI','Quang Ngai'),(61,'Whilemina Casey','1982-08-22',171240756,92830255,'egestas.urna@ac.com','DI','Quang Ngai'),(62,'Cody Fulton','1980-08-23',129294551,92608543,'quam@nonbibendumsed.net','DI','Quang Ngai'),(63,'Leroy Wiley','1980-06-06',899605537,93664054,'vitae.aliquet.nec@pedenec.co.uk','DI','Quang Ngai'),(64,'Arden Vang','1983-07-21',309173676,93509774,'dictum.eu.placerat@velpedeblandit.com','DI','Quang Ngai'),(65,'Candace Compton','1981-11-30',317658964,91007675,'arcu.Vestibulum.ut@velarcu.edu','DI','Quang Ngai'),(66,'Catherine Horn','1983-02-17',577826444,90185592,'hymenaeos.Mauris@seddui.edu','DI','Quang Ngai'),(67,'Unity Robbins','1976-01-26',240639716,93646406,'mus.Donec.dignissim@est.edu','DI','Quang Ngai'),(68,'Alexandra Saunders','1984-04-08',260603496,92589082,'quis.tristique.ac@Aliquamvulputateullamcorper.ca','DI','Quang Ngai'),(69,'Samson Pollard','1981-04-19',318387749,91479363,'ut@elitEtiam.org','DI','Quang Ngai'),(70,'Jamal Bernard','1976-05-14',255848351,92208037,'diam@anteVivamus.edu','DI','Quang Ngai'),(71,'Phoebe Pickett','1976-09-13',744620510,92755557,'vel.faucibus@Proinvel.net','DI','Quang Ngai'),(72,'Jolie Palmer','1977-04-03',871946931,91839644,'sem@commodoatlibero.com','DI','Quang Ngai'),(73,'Michael Mccullough','1982-09-28',663701715,94550327,'In@egetdictumplacerat.com','DI','Quang Ngai'),(74,'Rafael Glass','1975-04-09',531636675,93182113,'pharetra.nibh.Aliquam@cursusa.ca','DI','Quang Ngai'),(75,'Blaine Talley','1979-07-02',415734449,91662920,'egestas@eleifendnondapibus.ca','DI','Quang Ngai'),(76,'Brock Hobbs','1979-08-26',645149284,93644323,'nec@urnanec.net','DI','Quang Ngai'),(77,'Raja Holden','1981-12-05',906307862,90359226,'vulputate.posuere@ipsumcursusvestibulum.com','DI','Quang Tri'),(78,'Quamar Wolf','1983-09-02',945095614,91675326,'aliquam.eros@risusQuisquelibero.ca','DI','Quang Tri'),(79,'Kirsten Kirby','1976-07-23',129190218,92037784,'fames.ac.turpis@tellusnon.edu','DI','Quang Ngai');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customertype`
--

DROP TABLE IF EXISTS `customertype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customertype` (
  `CustomerTypeId` varchar(2) NOT NULL,
  `CustomerTypeName` varchar(50) NOT NULL,
  PRIMARY KEY (`CustomerTypeId`),
  UNIQUE KEY `CustomerTypeId` (`CustomerTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customertype`
--

LOCK TABLES `customertype` WRITE;
/*!40000 ALTER TABLE `customertype` DISABLE KEYS */;
INSERT INTO `customertype` VALUES ('DI','Diamond'),('GO','Gold'),('ME','Member'),('PL','Platinium'),('SI','Silver');
/*!40000 ALTER TABLE `customertype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `DepartmentId` varchar(2) NOT NULL,
  `DepartmentName` varchar(50) NOT NULL,
  PRIMARY KEY (`DepartmentId`),
  UNIQUE KEY `DepartmentId` (`DepartmentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('HC','Hanh Chinh'),('PV','Phuc Vu'),('QL','Quan Ly'),('SA','Sale Marketing');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detailcontract`
--

DROP TABLE IF EXISTS `detailcontract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detailcontract` (
  `DetailContractId` int NOT NULL AUTO_INCREMENT,
  `AttachServiceId` varchar(2) DEFAULT NULL,
  `ContractId` int DEFAULT NULL,
  `Quantity` int DEFAULT NULL,
  PRIMARY KEY (`DetailContractId`),
  KEY `AttachServiceId` (`AttachServiceId`),
  KEY `ContractId` (`ContractId`),
  CONSTRAINT `detailcontract_ibfk_1` FOREIGN KEY (`AttachServiceId`) REFERENCES `attachservices` (`AttachServiceId`),
  CONSTRAINT `detailcontract_ibfk_2` FOREIGN KEY (`ContractId`) REFERENCES `contracts` (`ContractId`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detailcontract`
--

LOCK TABLES `detailcontract` WRITE;
/*!40000 ALTER TABLE `detailcontract` DISABLE KEYS */;
INSERT INTO `detailcontract` VALUES (1,'CA',8,5),(2,'CA',9,1),(3,'KA',1,5),(4,'NU',10,2),(5,'MY',41,6),(6,'CA',3,6),(7,'KA',4,8),(8,'KA',22,7),(9,'MY',10,4),(10,'KA',10,10),(11,'NU',42,2),(12,'KA',9,7),(13,'CA',36,1),(14,'CA',28,3),(15,'MY',13,3),(16,'MA',36,6),(17,'NU',33,2),(18,'CA',33,6),(19,'NU',36,7),(20,'NU',5,2),(21,'MY',44,2),(22,'MY',35,3),(23,'NU',40,2),(24,'NU',14,6),(25,'MA',31,1),(26,'MA',40,5),(27,'NU',21,1),(28,'KA',26,8),(29,'NU',4,7),(30,'MY',40,10),(31,'KA',16,1),(32,'MA',25,5),(33,'KA',20,7),(34,'MY',2,1),(35,'KA',39,7),(36,'MA',18,1),(37,'NU',9,6),(38,'CA',8,3),(39,'MA',24,5),(40,'KA',31,5),(41,'KA',37,6),(42,'MA',23,6),(43,'NU',4,1),(44,'NU',43,9),(45,'MA',27,5),(46,'KA',22,8),(47,'MY',1,8),(48,'CA',21,6),(49,'CA',6,2),(50,'MY',5,3),(51,'MA',29,6),(52,'MA',26,2),(53,'MY',25,2),(54,'CA',14,10);
/*!40000 ALTER TABLE `detailcontract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma`
--

DROP TABLE IF EXISTS `diploma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diploma` (
  `DiplomaId` varchar(2) NOT NULL,
  `DiplomaName` varchar(50) NOT NULL,
  PRIMARY KEY (`DiplomaId`),
  UNIQUE KEY `DiplomaId` (`DiplomaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma`
--

LOCK TABLES `diploma` WRITE;
/*!40000 ALTER TABLE `diploma` DISABLE KEYS */;
INSERT INTO `diploma` VALUES ('CD','Cao Dang'),('DH','Dai Hoc'),('SD','Sau Dai Hoc'),('TC','Trung Cap');
/*!40000 ALTER TABLE `diploma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `EmployeeId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Birthday` date NOT NULL,
  `CardId` int NOT NULL,
  `PhoneNumber` int NOT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `LevelId` varchar(2) NOT NULL,
  `DepartmentId` varchar(2) NOT NULL,
  `DiplomaId` varchar(2) NOT NULL,
  `Salary` int NOT NULL,
  PRIMARY KEY (`EmployeeId`),
  UNIQUE KEY `EmployeeId` (`EmployeeId`),
  KEY `LevelId` (`LevelId`),
  KEY `DepartmentId` (`DepartmentId`),
  KEY `DiplomaId` (`DiplomaId`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`LevelId`) REFERENCES `level` (`LevelId`),
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`DepartmentId`) REFERENCES `department` (`DepartmentId`),
  CONSTRAINT `employees_ibfk_3` FOREIGN KEY (`DiplomaId`) REFERENCES `diploma` (`DiplomaId`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Nguyen Van Binh','1984-02-12',2012123432,915010234,'binhnv@gmail.com','LT','SA','CD',1000),(2,'Huynh Tan Bay','1986-03-14',201212987,915010123,'bayht@gmail.com','LT','SA','TC',900),(3,'Kieu Thi Thuy Linh','1993-05-25',104126754,899023567,'linhltt@gmail.com','PV','PV','TC',500),(4,'Ta Thi Huong Ly','1977-07-29',126452765,913763387,'lydth@gmail.com','QL','QL','DH',1500),(5,'Le Van Dat','1975-05-20',345143568,905267843,'datlv@gmail.com','GD','QL','SD',1000),(6,'Amela Wyatt','1996-12-23',720802300,94596104,'ac.risus@gravida.org','LT','SA','CD',741),(7,'Aurora Tyler','1990-11-02',229076004,91764511,'ac.fermentum@etnunc.org','LT','SA','TC',571),(8,'Frances Shaffer','1994-12-14',570092943,90419166,'mauris.eu.elit@velit.ca','LT','SA','TC',964),(9,'Oleg Graham','1991-12-27',595811746,90185274,'fermentum.risus.at@magna.edu','LT','SA','TC',1000),(10,'Ariana Harris','1972-10-10',818590481,91998600,'condimentum.eget.volutpat@non.net','LT','SA','CD',679),(11,'Brady Sears','1999-09-18',524709436,90120302,'magna.tellus.faucibus@Donecatarcu.ca','LT','SA','CD',977),(12,'Fitzgerald Livingston','1992-03-14',456009410,93094949,'elit.erat.vitae@sed.edu','LT','SA','CD',801),(13,'Peter Mclaughlin','1983-12-25',279751376,90219178,'purus.ac@necdiam.ca','LT','SA','CD',679),(14,'Reece Baker','1983-04-03',771963923,90769054,'arcu.Curabitur@turpisnon.com','LT','SA','CD',560),(15,'Veda Hunt','1995-09-14',753740907,93702510,'Pellentesque.habitant@sagittisplaceratCras.net','LT','SA','TC',889),(16,'Madonna Whitfield','1976-09-28',577486646,90320474,'Nulla.tempor.augue@nonummy.org','PV','PV','CD',518),(17,'Jillian Campos','1965-04-30',228688088,94327767,'sit.amet@faucibus.net','PV','PV','TC',732),(18,'Solomon Russo','1980-12-13',561042054,94637755,'In.condimentum.Donec@arcuVestibulum.org','PV','PV','TC',943),(19,'Chase Bolton','1970-06-28',133646963,92479977,'nunc.est@Sed.com','PV','PV','TC',731),(20,'Thaddeus George','1979-09-15',914399068,92030306,'felis@egestasSed.net','PV','PV','TC',874),(21,'Prescott Sims','1992-07-26',778120205,92861583,'dis@malesuadafamesac.edu','PV','PV','CD',698),(22,'Leroy Buckley','1981-06-27',469439966,90364499,'et.magnis@Suspendisse.edu','PV','PV','TC',771),(23,'Jonah Knight','1986-11-04',513472423,92496752,'Sed.et@Aliquam.org','PV','PV','TC',889),(24,'Jolie Salazar','1986-09-20',928219428,93053553,'vitae.dolor@aliquet.org','PV','PV','TC',926),(25,'Laurel Harmon','1981-12-29',138401060,90049257,'orci.Ut.semper@Duisa.edu','PV','PV','CD',557);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level`
--

DROP TABLE IF EXISTS `level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `level` (
  `LevelId` varchar(2) NOT NULL,
  `LevelName` varchar(50) NOT NULL,
  PRIMARY KEY (`LevelId`),
  UNIQUE KEY `LevelId` (`LevelId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level`
--

LOCK TABLES `level` WRITE;
/*!40000 ALTER TABLE `level` DISABLE KEYS */;
INSERT INTO `level` VALUES ('CV','Chuyen Vien'),('GD','Giam Doc'),('GS','Giam Sat'),('LT','Le Tan'),('PV','Phuc Vu'),('QL','Quan Ly');
/*!40000 ALTER TABLE `level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rentalform`
--

DROP TABLE IF EXISTS `rentalform`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rentalform` (
  `RentalFormId` varchar(2) NOT NULL,
  `RentalFormName` varchar(50) NOT NULL,
  PRIMARY KEY (`RentalFormId`),
  UNIQUE KEY `RentalFormId` (`RentalFormId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rentalform`
--

LOCK TABLES `rentalform` WRITE;
/*!40000 ALTER TABLE `rentalform` DISABLE KEYS */;
INSERT INTO `rentalform` VALUES ('GI','Villa'),('NA','nam'),('NG','ngay'),('TH','thang');
/*!40000 ALTER TABLE `rentalform` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `services` (
  `ServiceId` varchar(9) NOT NULL,
  `ServiceTypeId` varchar(2) NOT NULL,
  `ServiceName` varchar(50) NOT NULL,
  `UseArea` smallint NOT NULL,
  `RentalPrice` int NOT NULL,
  `MaxPerson` tinyint NOT NULL,
  `RentalFormId` varchar(2) NOT NULL,
  `VillaHouseStandardID` varchar(2) DEFAULT NULL,
  `OtherConvenientVillaHouse` varchar(50) DEFAULT NULL,
  `PollVillaArea` int DEFAULT NULL,
  `NumberFloorVillaHouse` int DEFAULT NULL,
  `FreeServiceRoom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ServiceId`),
  UNIQUE KEY `ServiceId` (`ServiceId`),
  KEY `ServiceTypeId` (`ServiceTypeId`),
  KEY `VillaHouseStandardID` (`VillaHouseStandardID`),
  KEY `RentalFormId` (`RentalFormId`),
  CONSTRAINT `services_ibfk_1` FOREIGN KEY (`ServiceTypeId`) REFERENCES `servicetype` (`ServiceTypeId`),
  CONSTRAINT `services_ibfk_2` FOREIGN KEY (`VillaHouseStandardID`) REFERENCES `villahousestandard` (`VillaHouseStandardId`),
  CONSTRAINT `services_ibfk_3` FOREIGN KEY (`RentalFormId`) REFERENCES `rentalform` (`RentalFormId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `services`
--

LOCK TABLES `services` WRITE;
/*!40000 ALTER TABLE `services` DISABLE KEYS */;
INSERT INTO `services` VALUES ('SVHO-1946','HO','Chieu Ta',115,4000,4,'TH','BU',NULL,NULL,1,NULL),('SVHO-1966','HO','Ban Trua',80,300,2,'NG','BU',NULL,NULL,1,NULL),('SVHO-1980','HO','Som Mai',90,450,4,'NG','NO',NULL,NULL,1,NULL),('SVHO-1986','HO','Nguoc Nang',100,500,4,'NG','VI',NULL,NULL,1,NULL),('SVRO-1949','RO','Mong Mo',40,90,4,'NG',NULL,NULL,NULL,NULL,'Ghe tinh yeu'),('SVRO-1956','RO','Hoang Hon',50,120,2,'NG',NULL,NULL,NULL,NULL,'Ghe tinh yeu'),('SVRO-1986','RO','Binh Minh',50,100,4,'NG',NULL,NULL,NULL,NULL,'Ghe tinh yeu'),('SVRO-1996','RO','Binh Minh',30,70,2,'NG',NULL,NULL,NULL,NULL,'Ghe tinh yeu'),('SVVL-1921','VL','Hoang Lan',250,10000,6,'TH','VI',NULL,50,1,NULL),('SVVL-1931','VL','Huong Duong',150,7500,2,'TH','NO',NULL,35,1,NULL),('SVVL-1945','VL','Mai Vang',200,9000,8,'TH','BU',NULL,30,2,NULL),('SVVL-1971','VL','Hoa Hong',250,8000,4,'TH','NO',NULL,40,1,NULL),('SVVL-1981','VL','Ly Ly',150,4000,4,'TH','NO',NULL,20,2,NULL);
/*!40000 ALTER TABLE `services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicetype`
--

DROP TABLE IF EXISTS `servicetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicetype` (
  `ServiceTypeId` varchar(2) NOT NULL,
  `ServiceTypeName` varchar(50) NOT NULL,
  PRIMARY KEY (`ServiceTypeId`),
  UNIQUE KEY `ServiceTypeId` (`ServiceTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicetype`
--

LOCK TABLES `servicetype` WRITE;
/*!40000 ALTER TABLE `servicetype` DISABLE KEYS */;
INSERT INTO `servicetype` VALUES ('HO','House'),('RO','Room'),('VL','Villa');
/*!40000 ALTER TABLE `servicetype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `villahousestandard`
--

DROP TABLE IF EXISTS `villahousestandard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `villahousestandard` (
  `VillaHouseStandardId` varchar(2) NOT NULL,
  `VillaHouseStandardName` varchar(50) NOT NULL,
  PRIMARY KEY (`VillaHouseStandardId`),
  UNIQUE KEY `VillaHouseStandardId` (`VillaHouseStandardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `villahousestandard`
--

LOCK TABLES `villahousestandard` WRITE;
/*!40000 ALTER TABLE `villahousestandard` DISABLE KEYS */;
INSERT INTO `villahousestandard` VALUES ('BU','Business'),('NO','Normal'),('VI','Vip');
/*!40000 ALTER TABLE `villahousestandard` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-20  0:43:02
