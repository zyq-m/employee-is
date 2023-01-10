-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2023 at 04:37 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_is`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `DepartCode` int(4) NOT NULL,
  `DepartName` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DepartCode`, `DepartName`) VALUES
(1000, 'Marketing'),
(1001, 'Makanan'),
(1002, 'Musik'),
(1003, 'Testttt'),
(1004, 'TUka'),
(1005, 'Berita'),
(1006, 'BBQ'),
(1007, 'Sweet baby rays'),
(1008, 'Kewangan'),
(1009, 'Sweet Baby Rays'),
(1010, 'Sweet Baby Rays'),
(1011, 'BBC'),
(1012, 'Marketing'),
(1013, 'Marketing'),
(1014, 'BBC NEWS'),
(1015, 'Security'),
(1016, 'Pelajaran'),
(1017, 'Investment');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmployeeID` int(4) NOT NULL,
  `EmployeeName` varchar(25) NOT NULL,
  `EmployeeDepartCode` int(4) NOT NULL,
  `EmployeeLocation` varchar(5) NOT NULL,
  `EmployeeTelNum` int(7) DEFAULT NULL,
  `EmployeeDesignation` varchar(1) NOT NULL DEFAULT 'E'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmployeeID`, `EmployeeName`, `EmployeeDepartCode`, `EmployeeLocation`, `EmployeeTelNum`, `EmployeeDesignation`) VALUES
(1111, 'Amin', 1008, 'SEL', 1234002, 'E'),
(1112, 'Amad', 1000, 'TGG', NULL, 'E'),
(1113, 'Hartihhhh', 1009, 'MEL', NULL, 'O'),
(1114, 'Pojan', 1004, 'SWRK', NULL, 'C'),
(1115, 'Aiman', 1006, 'SBH', NULL, 'C');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DepartCode`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmployeeID`),
  ADD KEY `EmployeeDepartCode` (`EmployeeDepartCode`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `DepartCode` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1018;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `EmployeeID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1116;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`EmployeeDepartCode`) REFERENCES `department` (`DepartCode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
