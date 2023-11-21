-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.27-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table car.car_detail
CREATE TABLE IF NOT EXISTS `car_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `car_type_id` bigint(20) DEFAULT NULL,
  `model` varchar(200) NOT NULL,
  `manufacturer` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `color` varchar(50) NOT NULL,
  `created_at` bigint(20) NOT NULL DEFAULT 0,
  `updated_at` bigint(20) NOT NULL DEFAULT 0,
  `created` bigint(20) DEFAULT NULL,
  `updated` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Car_type.id` (`car_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table car.car_detail: ~3 rows (approximately)
DELETE FROM `car_detail`;
INSERT INTO `car_detail` (`id`, `car_type_id`, `model`, `manufacturer`, `year`, `color`, `created_at`, `updated_at`, `created`, `updated`) VALUES
	(1, 1, 'Tesla', 'Tesla', 2015, 'Red', 1700582862, 1700582862, NULL, NULL),
	(2, 2, 'Toyota Suprax', 'Toyota', 2018, 'Black', 1700582862, 1700582862, NULL, NULL),
	(3, 3, 'Suzuki Ertiga', 'Suzuki', 2020, 'Silver', 1700582862, 1700582862, NULL, NULL);

-- Dumping structure for table car.car_parts
CREATE TABLE IF NOT EXISTS `car_parts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `car_type_id` bigint(20) DEFAULT NULL,
  `part_name` varchar(50) NOT NULL,
  `created_at` bigint(20) NOT NULL,
  `updated_at` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `CarTypes.id` (`car_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table car.car_parts: ~9 rows (approximately)
DELETE FROM `car_parts`;
INSERT INTO `car_parts` (`id`, `car_type_id`, `part_name`, `created_at`, `updated_at`) VALUES
	(1, 1, 'Battery', 1700582862, 1700582862),
	(2, 1, 'Wheel', 1700582862, 1700582862),
	(3, 1, 'Engine', 1700582862, 1700582862),
	(4, 2, 'Wheel', 1700582862, 1700582862),
	(5, 2, 'Engine', 1700582862, 1700582862),
	(6, 2, 'Velg', 1700582862, 1700582862),
	(7, 3, 'Wheel', 1700582862, 1700582862),
	(8, 3, 'Engine', 1700582862, 1700582862),
	(9, 3, 'Brakes', 1700582862, 1700582862);

-- Dumping structure for table car.car_type
CREATE TABLE IF NOT EXISTS `car_type` (
  `id` bigint(20) NOT NULL,
  `type` varchar(50) NOT NULL DEFAULT '',
  `created_at` bigint(20) NOT NULL DEFAULT 0,
  `updated_at` bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table car.car_type: ~3 rows (approximately)
DELETE FROM `car_type`;
INSERT INTO `car_type` (`id`, `type`, `created_at`, `updated_at`) VALUES
	(1, 'Electric', 1700582862, 1700582862),
	(2, 'Manual', 1700582862, 1700582862),
	(3, 'Hybrid', 1700582862, 1700582862);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
