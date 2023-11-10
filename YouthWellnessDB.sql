CREATE DATABASE  IF NOT EXISTS `konseling_online` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `konseling_online`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: konseling_online
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `id_feedback` int NOT NULL AUTO_INCREMENT,
  `id_user` int NOT NULL,
  `isi_feedback` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_feedback`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hari_konseling`
--

DROP TABLE IF EXISTS `hari_konseling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hari_konseling` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Hari` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Hari` (`Hari`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hari_konseling`
--

LOCK TABLES `hari_konseling` WRITE;
/*!40000 ALTER TABLE `hari_konseling` DISABLE KEYS */;
INSERT INTO `hari_konseling` VALUES (5,'Jumat'),(4,'Kamis'),(7,'Minggu'),(3,'Rabu'),(6,'Sabtu'),(2,'Selasa'),(1,'Senin');
/*!40000 ALTER TABLE `hari_konseling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jadwal_konseling`
--

DROP TABLE IF EXISTS `jadwal_konseling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jadwal_konseling` (
  `id_jadwal` int NOT NULL AUTO_INCREMENT,
  `id_konselor` int NOT NULL,
  `id_user` int NOT NULL,
  `id_hari_konseling` int NOT NULL,
  `id_waktu_konseling` int NOT NULL,
  `tanggal` varchar(100) NOT NULL,
  PRIMARY KEY (`id_jadwal`,`id_konselor`,`id_user`,`id_hari_konseling`,`id_waktu_konseling`),
  UNIQUE KEY `tanggal` (`tanggal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jadwal_konseling`
--

LOCK TABLES `jadwal_konseling` WRITE;
/*!40000 ALTER TABLE `jadwal_konseling` DISABLE KEYS */;
/*!40000 ALTER TABLE `jadwal_konseling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `konselor`
--

DROP TABLE IF EXISTS `konselor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `konselor` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nama_Lengkap` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `No_Telp` varchar(15) DEFAULT NULL,
  `Pengalaman` varchar(400) DEFAULT NULL,
  `link_Meet` varchar(40) DEFAULT NULL,
  `Profile_Pic_Path` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `konselor`
--

LOCK TABLES `konselor` WRITE;
/*!40000 ALTER TABLE `konselor` DISABLE KEYS */;
INSERT INTO `konselor` VALUES (1,'Dr. Amanda Johnson, MA, LPC','Manda@gmail.com','082123842187','Konseling Kesehatan Mental: membantu klien dalam mengelola gangguan kecemasan, stres, depresi, dan mengembangkan strategi koping yang efektif. Terapi Trauma:Membantu kliennya mengatasi pengalaman traumatis, seperti kecelakaan, pelecehan, atau kehilangan yang mempengaruhi kesehatan mental mereka.','https://meet.google.com/yza-bcde-fgh','C:\\\\Users\\\\dhafa\\\\Downloads\\\\Java Codes\\\\YouthWellness\\\\src\\\\Background\\\\imgK1.jpg'),(2,'Dr. William Afton, DE, PhD, LMFT','WilliamST@gmail.com','082123842187','Spesialisasi dalam kesehatan mental dan terapi trauma. Dengan lebih dari sepuluh tahun pengalaman, saya memiliki pendekatan yang terarah dan terfokus pada pemulihan klien.',NULL,NULL);
/*!40000 ALTER TABLE `konselor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nama_Lengkap` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `No_Telp` varchar(15) DEFAULT NULL,
  `Alamat` varchar(150) DEFAULT NULL,
  `Bio` varchar(150) DEFAULT NULL,
  `Profile_Pic_Path` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `waktu_konseling`
--

DROP TABLE IF EXISTS `waktu_konseling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `waktu_konseling` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Waktu` varchar(5) NOT NULL,
  PRIMARY KEY (`id`,`Waktu`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `waktu_konseling`
--

LOCK TABLES `waktu_konseling` WRITE;
/*!40000 ALTER TABLE `waktu_konseling` DISABLE KEYS */;
INSERT INTO `waktu_konseling` VALUES (1,'08.00'),(2,'09.00'),(3,'10.00'),(4,'11.00'),(5,'13.00'),(6,'14.00'),(7,'15.00'),(8,'16.00'),(9,'19.00'),(10,'20.00');
/*!40000 ALTER TABLE `waktu_konseling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'konseling_online'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-10 17:07:16
