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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,1,'Meow'),(2,2,'Yay'),(3,3,'gwenchana'),(4,1,'Loh'),(5,4,'hai'),(6,4,'s');
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
  `id_jadwal_konseling` int NOT NULL AUTO_INCREMENT,
  `id_jadwal_konselor` int NOT NULL,
  `id_user` int NOT NULL,
  PRIMARY KEY (`id_jadwal_konseling`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jadwal_konseling`
--

LOCK TABLES `jadwal_konseling` WRITE;
/*!40000 ALTER TABLE `jadwal_konseling` DISABLE KEYS */;
INSERT INTO `jadwal_konseling` VALUES (1,1,2),(3,2,3),(4,5,1),(6,28,1),(7,12,1),(8,14,2),(9,8,2),(10,32,2),(11,30,2),(12,6,3),(13,11,3),(14,31,3),(15,29,3),(18,7,3),(19,20,2),(25,27,1),(26,24,1);
/*!40000 ALTER TABLE `jadwal_konseling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jadwal_konselor`
--

DROP TABLE IF EXISTS `jadwal_konselor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jadwal_konselor` (
  `id_jadwal_konselor` int NOT NULL AUTO_INCREMENT,
  `id_konselor` int NOT NULL,
  `id_hari` int NOT NULL,
  `id_waktu` int NOT NULL,
  PRIMARY KEY (`id_jadwal_konselor`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jadwal_konselor`
--

LOCK TABLES `jadwal_konselor` WRITE;
/*!40000 ALTER TABLE `jadwal_konselor` DISABLE KEYS */;
INSERT INTO `jadwal_konselor` VALUES (1,1,1,1),(2,1,1,6),(3,1,4,3),(4,1,4,9),(5,2,1,9),(6,2,1,10),(7,2,2,7),(8,2,2,10),(9,2,3,1),(10,2,3,2),(11,2,4,4),(12,2,4,7),(13,2,5,3),(14,2,5,6),(15,3,6,8),(16,3,6,9),(17,3,7,4),(18,3,7,5),(19,4,2,8),(20,4,2,9),(21,4,3,4),(22,4,3,6),(23,5,1,1),(24,5,1,2),(25,5,7,1),(26,5,7,2),(27,6,3,1),(28,6,3,2),(29,6,4,3),(30,6,4,4),(31,6,5,5),(32,6,5,6);
/*!40000 ALTER TABLE `jadwal_konselor` ENABLE KEYS */;
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
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `konselor`
--

LOCK TABLES `konselor` WRITE;
/*!40000 ALTER TABLE `konselor` DISABLE KEYS */;
INSERT INTO `konselor` VALUES (1,'Dr. Amanda Johnson, MA, LPC   ','Manda@gmail.com','082123842187','Sebagai seorang psikolog klinis dengan spesialisasi dalam trauma dan gangguan kecemasan, saya telah membimbing banyak klien menuju pemulihan. Pengalaman kerjanya yang luas melibatkan pemahaman mendalam tentang dampak trauma terhadap kesehatan mental.','https://meet.google.com/yza-bcde-fgh','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgK1.jpg','Manda123'),(2,'Dr. William Afton, DE, PhD, LMFT','WilliamST@gmail.com','089459036437','Spesialisasi dalam kesehatan mental dan terapi trauma. Dengan lebih dari sepuluh tahun pengalaman, saya memiliki pendekatan yang terarah dan terfokus pada pemulihan klien.','https://meet.google.com/abc-defg-hij','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgK2.jpg','William123'),(3,'Jane Smith, MSW, LCSW             ','Smith@gmail.com','083994067281','Pengalaman luas dalam terapi kognitif perilaku dan interpersonal untuk membantu klien mengelola depresi dan gangguan bipolar.','https://meet.google.com/gys-oebf-oqv','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgK3.jpg','Smith123'),(4,'Dr. Ken Adams, PsyD                  ','Europe@gmail.com','08565736714','Keahlian dalam terapi keluarga sistemik dan berbasis hubungan untuk membantu individu dan keluarga memecahkan konflik dan memperkuat hubungan.','https://meet.google.com/bse-qpvd-rny','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgK4.jpg','Adams123'),(5,'Sarah Lee, MA, NCC                     ','Lee@gmail.com','08788561443','Pengetahuan mendalam tentang gangguan makan dengan pendekatan terapi kognitif perilaku dan terapi penerimaan dan komitmen.','https://meet.google.com/muv-rtqc-xye','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgK5.jpg','Sarah123'),(6,'Prof. Gregory Wilson, EdD, LPCC','WillHelp@gmail.com','08837963565','Fokus pada kesehatan mental anak dan remaja dengan terapi bermain dan berbasis keluarga untuk mengatasi kecemasan, depresi, dan masalah perilaku.','https://meet.google.com/rwq-bvji-ien','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgK6.jpg','Wilson123');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Dhafa Nur Fadhilah','dhafa162@gmail.com','NC162','11111111','08211142','bandung','-','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgU1.jpg'),(2,'Ratin Kani','Dkani069@gmail.com','Meowni','22222222','0819732','-','-','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgU2.jpg'),(3,'Ella','Umberella@gmail.com','umberElla','33333333','-','-','-','C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgU3.jpg'),(4,'Arrizal','arizal@gmail.com','a25','44444444','-','-','-','C:/Users/dhafa/Documents/air tanah.jpg');
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
-- Dumping events for database 'konseling_online'
--

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

-- Dump completed on 2023-11-28 22:36:06
