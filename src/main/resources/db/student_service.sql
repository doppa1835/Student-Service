-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2020 at 05:22 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_service`
--

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `id` bigint(20) NOT NULL,
  `student` bigint(20) DEFAULT NULL,
  `paid_on` bigint(30) NOT NULL,
  `transaction_type` varchar(50) NOT NULL,
  `transaction_id` varchar(70) NOT NULL,
  `amount` int(10) NOT NULL,
  `receipt_path` varchar(100) DEFAULT NULL,
  `accepted_by` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` bigint(20) NOT NULL,
  `student` bigint(20) DEFAULT NULL,
  `subject` bigint(20) DEFAULT NULL,
  `internal` int(10) DEFAULT 0,
  `external` int(10) DEFAULT 0,
  `is_passed` bit(1) DEFAULT b'0',
  `is_attended` bit(1) DEFAULT b'0',
  `updated_on` bigint(30) NOT NULL,
  `is_mid_exam` bit(1) DEFAULT b'0',
  `mid_number` int(5) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student_course`
--

CREATE TABLE `student_course` (
  `id` bigint(20) NOT NULL,
  `student` bigint(20) DEFAULT NULL,
  `course` bigint(20) DEFAULT NULL,
  `admission_date` bigint(30) NOT NULL,
  `roll_number` varchar(50) NOT NULL,
  `entrance_exam` varchar(50) NOT NULL,
  `rank` int(10) NOT NULL,
  `university_id` varchar(60) NOT NULL,
  `pass_out` bigint(30) NOT NULL,
  `is_placed` bit(1) NOT NULL DEFAULT b'0',
  `current_year` int(10) NOT NULL,
  `updated_on` bigint(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fee`
--
ALTER TABLE `fee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_course`
--
ALTER TABLE `student_course`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
