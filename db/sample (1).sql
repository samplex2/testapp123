-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2024 at 12:27 PM
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
-- Database: `sample`
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
  `scholarship_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_scholarship`
--

INSERT INTO `tbl_scholarship` (`scholarship_id`, `scholarship_name`, `scholarship_type`, `scholarship_description`, `scholarship_status`) VALUES
(1001, 'Unifast', 'Academic', '0', ''),
(1002, 'CHED', 'Academic', 'awts', 'Pending'),
(1003, 'CHED', 'Goverment', 'aray audrey', 'Pending'),
(1004, 'UNIFAST', 'Academic', 'WTF', 'Pending'),
(1005, 'CHED', 'Academic', 'WTF ', 'Pending'),
(1006, 'UNIFAST', 'Goverment', 'Applylang', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_student`
--

CREATE TABLE `tbl_student` (
  `student_id` int(20) NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `student_email` varchar(50) NOT NULL,
  `student_gender` varchar(50) NOT NULL,
  `student_course` varchar(50) NOT NULL,
  `student_contact` int(20) NOT NULL,
  `image` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_student`
--

INSERT INTO `tbl_student` (`student_id`, `student_name`, `student_email`, `student_gender`, `student_course`, `student_contact`, `image`) VALUES
(1001, 'Paul', 'Jp@gmail.com', 'Male', 'BSIT', 912345678, '0');

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
  `u_status` varchar(50) NOT NULL,
  `u_image` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_type`, `u_status`, `u_image`) VALUES
(1001, 'john paul', 'resane', 'resane01@gmail.com', 'johnpaul123', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Active', 'src/userimages/Screenshot 2024-05-07 101221.png'),
(1003, 'john', 'resane', 'jp@gmail.com', 'jp123', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Pending', ''),
(1004, 'test', 'test', 'test', 'test', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Active', ''),
(1005, 'test', 'test', 'teest', 'teest', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Student', 'Active', ''),
(1006, 'pol', 'pol', 'pol', 'pol', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', 'Admin', 'Active', 'src/userimages/Screenshot 2024-05-06 174227.png'),
(1007, 'pol', 'pol', 'pol@gmail.com', 'pol3', '12345678', 'Student', 'Active', 'src/userimages/Screenshot 2024-05-06 174432.png');

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
  MODIFY `application_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_report`
--
ALTER TABLE `tbl_report`
  MODIFY `report_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_scholarship`
--
ALTER TABLE `tbl_scholarship`
  MODIFY `scholarship_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1007;

--
-- AUTO_INCREMENT for table `tbl_student`
--
ALTER TABLE `tbl_student`
  MODIFY `student_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1002;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1008;

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
