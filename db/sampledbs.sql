-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2024 at 06:20 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sampledbs`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_application`
--

CREATE TABLE `tbl_application` (
  `application_id` int(20) NOT NULL,
  `student_id` int(20) NOT NULL,
  `scholarship_id` int(20) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_application`
--

INSERT INTO `tbl_application` (`application_id`, `student_id`, `scholarship_id`, `status`) VALUES
(3015, 2001, 1002, 'Available'),
(3016, 2001, 1012, 'Available'),
(3018, 2006, 1014, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_report`
--

CREATE TABLE `tbl_report` (
  `report_id` int(20) NOT NULL,
  `student_id` int(20) NOT NULL,
  `scholarship_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_scholarship`
--

CREATE TABLE `tbl_scholarship` (
  `scholarship_id` int(20) NOT NULL,
  `scholarship_name` varchar(50) NOT NULL,
  `scholarship_type` varchar(50) NOT NULL,
  `scholarship_description` varchar(200) NOT NULL,
  `scholarship_status` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_scholarship`
--

INSERT INTO `tbl_scholarship` (`scholarship_id`, `scholarship_name`, `scholarship_type`, `scholarship_description`, `scholarship_status`) VALUES
(1002, 'CHED', 'Goverment', 'aray audrey', 'Approved'),
(1010, 'CHED', 'Academic', 'JP', 'Available'),
(1012, 'UNIFAST', 'Academic', 'APPLYKO', 'Approved'),
(1014, 'Athletic', 'Sports', 'apply lang', 'Declined');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_student`
--

CREATE TABLE `tbl_student` (
  `student_id` int(20) NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `student_email` varchar(50) NOT NULL,
  `student_course` varchar(50) NOT NULL,
  `student_contact` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_student`
--

INSERT INTO `tbl_student` (`student_id`, `student_name`, `student_email`, `student_course`, `student_contact`, `gender`, `status`) VALUES
(2001, 'Paul', 'Jp@gmail.com', '912345678', 'BSIT', 'Male', 'Single	'),
(2002, 'test', 'test', 'test', 'test', 'Male', 'Single '),
(2003, 'ANNA', 'Anna@gmail.com', 'BSBA', '0912345678', 'Female', 'Single	'),
(2004, 'KOBE', 'bryant@gmail.com', 'BSCRIM', '09285414494', 'Male', 'Single '),
(2005, 'Rusi', 'rusi@gmail.com', '0912345678', 'BSBA', 'Female', 'Widowed'),
(2006, 'lebron james', 'lebron@gmail.com', 'BSBA', '0912345678', 'Female', 'Single ');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_type`, `u_status`) VALUES
(1001, 'john paul', 'resane', 'resane01@gmail.com', 'johnpaul123', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Active'),
(1003, 'john', 'resane', 'jp@gmail.com', 'jp123', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Pending'),
(1004, 'test', 'test', 'test', 'test', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Active'),
(1005, 'test', 'test', 'teest', 'teest', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Student', 'Active'),
(1006, 'pol', 'pol', 'pol', 'pol', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Active'),
(1007, 'pol', 'pol', 'pol@gmail.com', 'pol3', '12345678', 'Student', 'Active'),
(1008, 'kobe', 'jordan', 'kob@gmail.com', 'kobe123', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD PRIMARY KEY (`application_id`),
  ADD KEY `scholarship_id` (`scholarship_id`),
  ADD KEY `stid` (`student_id`);

--
-- Indexes for table `tbl_report`
--
ALTER TABLE `tbl_report`
  ADD PRIMARY KEY (`report_id`),
  ADD KEY `scholarship_id` (`scholarship_id`),
  ADD KEY `student_id` (`student_id`);

--
-- Indexes for table `tbl_scholarship`
--
ALTER TABLE `tbl_scholarship`
  ADD PRIMARY KEY (`scholarship_id`);

--
-- Indexes for table `tbl_student`
--
ALTER TABLE `tbl_student`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_application`
--
ALTER TABLE `tbl_application`
  MODIFY `application_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3019;

--
-- AUTO_INCREMENT for table `tbl_report`
--
ALTER TABLE `tbl_report`
  MODIFY `report_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_scholarship`
--
ALTER TABLE `tbl_scholarship`
  MODIFY `scholarship_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1015;

--
-- AUTO_INCREMENT for table `tbl_student`
--
ALTER TABLE `tbl_student`
  MODIFY `student_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2007;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1009;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD CONSTRAINT `stid` FOREIGN KEY (`student_id`) REFERENCES `tbl_student` (`student_id`),
  ADD CONSTRAINT `tbl_application_ibfk_1` FOREIGN KEY (`scholarship_id`) REFERENCES `tbl_scholarship` (`scholarship_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
