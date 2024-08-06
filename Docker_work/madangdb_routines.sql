-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: madangdb
-- ------------------------------------------------------
-- Server version	9.0.1

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
-- Temporary view structure for view `new_VIEW`
--

DROP TABLE IF EXISTS `new_VIEW`;
/*!50001 DROP VIEW IF EXISTS `new_VIEW`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `new_VIEW` AS SELECT 
 1 AS `name`,
 1 AS `bookname`,
 1 AS `saleprice`,
 1 AS `orderid`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `Vorders`
--

DROP TABLE IF EXISTS `Vorders`;
/*!50001 DROP VIEW IF EXISTS `Vorders`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `Vorders` AS SELECT 
 1 AS `orderid`,
 1 AS `custid`,
 1 AS `name`,
 1 AS `bookid`,
 1 AS `bookname`,
 1 AS `saleprice`,
 1 AS `orderdate`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `new_VIEW`
--

/*!50001 DROP VIEW IF EXISTS `new_VIEW`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `new_VIEW` AS select `C`.`name` AS `name`,`B`.`bookname` AS `bookname`,`O`.`saleprice` AS `saleprice`,`O`.`orderid` AS `orderid` from ((`Customer` `C` join `Orders` `O`) join `Book` `B`) where ((`C`.`custid` = `O`.`custid`) and (`B`.`bookid` = `O`.`bookid`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `Vorders`
--

/*!50001 DROP VIEW IF EXISTS `Vorders`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `Vorders` AS select `O`.`orderid` AS `orderid`,`O`.`custid` AS `custid`,`C`.`name` AS `name`,`O`.`bookid` AS `bookid`,`B`.`bookname` AS `bookname`,`O`.`saleprice` AS `saleprice`,`O`.`orderdate` AS `orderdate` from ((`Customer` `C` join `Orders` `O`) join `Book` `B`) where ((`C`.`custid` = `O`.`custid`) and (`B`.`bookid` = `O`.`bookid`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-06 18:03:34
