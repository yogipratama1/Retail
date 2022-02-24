-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 24, 2022 at 02:50 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kasir`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang_masuk`
--

CREATE TABLE `barang_masuk` (
  `id_brgMasuk` int(5) NOT NULL,
  `id_barang` int(5) NOT NULL,
  `dus` int(10) NOT NULL,
  `tgl` date NOT NULL,
  `total_beli` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang_masuk`
--

INSERT INTO `barang_masuk` (`id_brgMasuk`, `id_barang`, `dus`, `tgl`, `total_beli`) VALUES
(1, 3, 2, '2022-01-26', 0),
(2, 5, 1, '2022-01-26', 0),
(3, 3, 4, '2012-12-12', 0),
(4, 3, 1, '2022-02-06', 0),
(5, 3, 1, '2022-02-06', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_barang`
--

CREATE TABLE `tbl_barang` (
  `id_barang` int(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `stok` int(10) NOT NULL,
  `harga_belidus` int(10) NOT NULL,
  `harga_jualdus` int(10) NOT NULL,
  `harga_pcs` int(10) NOT NULL,
  `isi` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_barang`
--

INSERT INTO `tbl_barang` (`id_barang`, `nama`, `stok`, `harga_belidus`, `harga_jualdus`, `harga_pcs`, `isi`) VALUES
(3, 'mie', -382, 20000, 21000, 2000, 25),
(4, 'ayan', 71, 50000, 55000, 5000, 10),
(5, 'jsafj', 26, 80000, 81000, 10000, 25);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_toko`
--

CREATE TABLE `tbl_toko` (
  `id_toko` int(5) NOT NULL,
  `nama_toko` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_toko`
--

INSERT INTO `tbl_toko` (`id_toko`, `nama_toko`) VALUES
(1, 'nakama');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `id_transaksi` int(5) NOT NULL,
  `tgl` date NOT NULL,
  `grand_total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`id_transaksi`, `tgl`, `grand_total`) VALUES
(6, '2022-01-22', 0),
(7, '2021-01-22', 0),
(8, '2022-01-24', 0),
(9, '2022-01-24', 0),
(10, '2022-01-24', 0),
(11, '2022-01-24', 0),
(12, '2022-01-24', 0),
(13, '2022-01-24', 0),
(14, '2022-01-24', 0),
(15, '2022-01-24', 0),
(16, '2022-01-24', 0),
(17, '2022-01-25', 0),
(18, '2022-01-26', 0),
(19, '2022-01-26', 0),
(20, '2022-01-26', 5000),
(21, '2022-01-26', 0),
(22, '2022-01-26', 2000),
(23, '2022-01-26', 0),
(24, '2022-01-26', 2000),
(25, '2022-02-04', 2000),
(26, '2022-02-04', 9000),
(27, '2022-02-06', 12000),
(28, '2022-02-06', 2000),
(29, '2022-02-06', 26000),
(30, '2022-02-07', 2000),
(31, '2022-02-07', 5000),
(32, '2022-02-07', 5000),
(33, '2022-02-07', 5000),
(34, '2022-02-07', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id_user` int(5) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `telp` varchar(50) NOT NULL,
  `level` enum('admin','petugas') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id_user`, `username`, `password`, `telp`, `level`) VALUES
(1, 'admin', 'user', '0909', 'petugas');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_detail`
--

CREATE TABLE `transaksi_detail` (
  `id` int(5) NOT NULL,
  `id_transaksi` int(5) NOT NULL,
  `id_barang` int(5) NOT NULL,
  `qty` int(10) NOT NULL,
  `satuan` varchar(50) NOT NULL DEFAULT '',
  `sub_total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi_detail`
--

INSERT INTO `transaksi_detail` (`id`, `id_transaksi`, `id_barang`, `qty`, `satuan`, `sub_total`) VALUES
(11, 7, 3, 1, '', 2000),
(12, 7, 4, 3, '', 15000),
(13, 9, 3, 1, '', 2000),
(14, 11, 3, 1, '', 2000),
(15, 11, 4, 2, '', 10000),
(16, 13, 3, 1, '', 2000),
(17, 13, 4, 2, '', 10000),
(18, 14, 3, 4, '', 8000),
(19, 15, 3, 1, '', 2000),
(20, 16, 3, 1, '', 2000),
(21, 16, 4, 2, '', 10000),
(22, 17, 3, 1, '', 2000),
(23, 18, 3, 2, '', 4000),
(24, 19, 4, 1, '', 5000),
(25, 20, 4, 1, '', 5000),
(26, 21, 4, 1, '', 5000),
(27, 22, 3, 1, '', 2000),
(28, 24, 3, 1, '', 2000),
(31, 26, 4, 1, '', 5000),
(32, 27, 3, 1, 'Dus', 2000),
(33, 27, 4, 2, 'Pcs', 10000),
(35, 28, 3, 1, 'Pcs', 2000),
(36, 29, 3, 1, 'Dus', 21000),
(37, 29, 4, 1, 'Pcs', 5000),
(38, 30, 3, 1, 'Pcs', 2000),
(39, 31, 4, 1, 'Pcs', 5000),
(40, 32, 4, 1, 'Pcs', 5000),
(41, 33, 4, 1, 'Pcs', 5000),
(42, 34, 4, 1, 'Pcs', 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD PRIMARY KEY (`id_brgMasuk`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `tbl_toko`
--
ALTER TABLE `tbl_toko`
  ADD PRIMARY KEY (`id_toko`);

--
-- Indexes for table `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_transaksi` (`id_transaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  MODIFY `id_brgMasuk` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  MODIFY `id_barang` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_toko`
--
ALTER TABLE `tbl_toko`
  MODIFY `id_toko` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  MODIFY `id_transaksi` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id_user` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD CONSTRAINT `barang_masuk_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tbl_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD CONSTRAINT `transaksi_detail_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tbl_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_detail_ibfk_2` FOREIGN KEY (`id_transaksi`) REFERENCES `tbl_transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
