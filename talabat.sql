-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 22, 2021 at 04:26 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `talabat`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer_history`
--

CREATE TABLE `customer_history` (
  `customer_name` varchar(255) NOT NULL,
  `restaurant_name` varchar(255) NOT NULL,
  `meal_name` varchar(255) NOT NULL,
  `meal_price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_history`
--

INSERT INTO `customer_history` (`customer_name`, `restaurant_name`, `meal_name`, `meal_price`) VALUES
('marwan', 'Bazooka', 'Big Sandwich', 50),
('marwan', 'KFC', 'Fried Chicken', 75),
('marwan', 'KFC', 'Fried Chicken', 75);

-- --------------------------------------------------------

--
-- Table structure for table `meals`
--

CREATE TABLE `meals` (
  `restaurant_id` int(11) NOT NULL,
  `meal_name` varchar(255) NOT NULL,
  `meal_price` double NOT NULL,
  `details` text DEFAULT NULL,
  `meal_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `meals`
--

INSERT INTO `meals` (`restaurant_id`, `meal_name`, `meal_price`, `details`, `meal_id`, `quantity`) VALUES
(2, 'Fried Chicken', 75, '12 pices, fries, pepsi', 1, 47);

-- --------------------------------------------------------

--
-- Table structure for table `restaurant`
--

CREATE TABLE `restaurant` (
  `restaurant_id` int(11) NOT NULL,
  `restaurant_name` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `phone` char(11) NOT NULL,
  `restaurant_owner` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `restaurant`
--

INSERT INTO `restaurant` (`restaurant_id`, `restaurant_name`, `location`, `phone`, `restaurant_owner`) VALUES
(1, 'Bazooka', 'abdeen', '01002010539', 'Khaled'),
(2, 'KFC', 'roxy', '01002010539', 'mahmoud'),
(3, 'Mac', 'hadayek', '01002010539', 'ahmed'),
(4, 'Mac', 'zaton', '01002010539', 'waleed');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `phone` char(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `type`, `phone`, `address`) VALUES
('ahmed', 'Mm123456#', 'owner', '1127774248', 'tahrir'),
('mahmoud', 'Mm123456#', 'owner', '1127774248', 'Tahrir'),
('marwan', 'Mm123456#', 'customer', '1127774248', 'Abdeen'),
('waleed', 'Mm123456#', 'owner', '1127774248', '01127774248');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`restaurant_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD UNIQUE KEY `username` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
