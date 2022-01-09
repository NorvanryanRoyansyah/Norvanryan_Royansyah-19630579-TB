-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.1.41 - Source distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table aplikasi_kepegawaian.lp_pegawaiin
CREATE TABLE IF NOT EXISTS `lp_pegawaiin` (
  `nik` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL DEFAULT '',
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `agama` varchar(100) NOT NULL DEFAULT '',
  `no.hp` varchar(100) NOT NULL DEFAULT '',
  `alamat` text NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table aplikasi_kepegawaian.lp_pegawaiin: 0 rows
/*!40000 ALTER TABLE `lp_pegawaiin` DISABLE KEYS */;
/*!40000 ALTER TABLE `lp_pegawaiin` ENABLE KEYS */;

-- Dumping structure for table aplikasi_kepegawaian.lp_pegawaiout
CREATE TABLE IF NOT EXISTS `lp_pegawaiout` (
  `nik` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL DEFAULT '',
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `agama` varchar(100) NOT NULL DEFAULT '',
  `no.hp` varchar(100) NOT NULL DEFAULT '',
  `alamat` text NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table aplikasi_kepegawaian.lp_pegawaiout: 0 rows
/*!40000 ALTER TABLE `lp_pegawaiout` DISABLE KEYS */;
/*!40000 ALTER TABLE `lp_pegawaiout` ENABLE KEYS */;

-- Dumping structure for table aplikasi_kepegawaian.tb_keluarga
CREATE TABLE IF NOT EXISTS `tb_keluarga` (
  `nip_pegawai` int(11) NOT NULL,
  `nama_ayah` varchar(50) NOT NULL DEFAULT '',
  `pekerjaan_ayah` varchar(50) NOT NULL DEFAULT '',
  `nama_ibu` varchar(50) NOT NULL DEFAULT '',
  `pekerjaan_ibu` varchar(50) NOT NULL DEFAULT '',
  `alamat` text NOT NULL,
  PRIMARY KEY (`nip_pegawai`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table aplikasi_kepegawaian.tb_keluarga: 1 rows
/*!40000 ALTER TABLE `tb_keluarga` DISABLE KEYS */;
INSERT INTO `tb_keluarga` (`nip_pegawai`, `nama_ayah`, `pekerjaan_ayah`, `nama_ibu`, `pekerjaan_ibu`, `alamat`) VALUES
	(2034, 'karim', 'Wiraswasta', 'Fatma', 'Irt', 'Jln.Balikan'),
	(2394, 'Henry', 'Pengusaha', 'Sulis', 'Penyanyi', 'Jln.Kusuma');
/*!40000 ALTER TABLE `tb_keluarga` ENABLE KEYS */;

-- Dumping structure for table aplikasi_kepegawaian.tb_login
CREATE TABLE IF NOT EXISTS `tb_login` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `Index 2` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table aplikasi_kepegawaian.tb_login: 1 rows
/*!40000 ALTER TABLE `tb_login` DISABLE KEYS */;
INSERT INTO `tb_login` (`id_user`, `nama`, `username`, `password`) VALUES
	(1, 'admin', 'admin', 'admin');
/*!40000 ALTER TABLE `tb_login` ENABLE KEYS */;

-- Dumping structure for table aplikasi_kepegawaian.tb_pegawai
CREATE TABLE IF NOT EXISTS `tb_pegawai` (
  `nip` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL DEFAULT '',
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `agama` varchar(50) NOT NULL DEFAULT '',
  `no_hp` varchar(100) NOT NULL DEFAULT '',
  `alamat` varchar(50) NOT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table aplikasi_kepegawaian.tb_pegawai: 1 rows
/*!40000 ALTER TABLE `tb_pegawai` DISABLE KEYS */;
INSERT INTO `tb_pegawai` (`nip`, `nama`, `jenis_kelamin`, `tanggal_lahir`, `agama`, `no_hp`, `alamat`) VALUES
	(2034, 'Zain', 'Laki-Laki', '2001-10-20', 'Islam', '08528427384', 'Jln.Ayani'),
	(2394, 'Nisai', 'Perempuan', '2000-08-08', 'Islam', '03743862442', 'Jln.Kusuma');
/*!40000 ALTER TABLE `tb_pegawai` ENABLE KEYS */;

-- Dumping structure for table aplikasi_kepegawaian.tb_pegawaiin
CREATE TABLE IF NOT EXISTS `tb_pegawaiin` (
  `nik` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL DEFAULT '',
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `agama` varchar(100) NOT NULL DEFAULT '',
  `no_hp` varchar(100) NOT NULL DEFAULT '',
  `alamat` text NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table aplikasi_kepegawaian.tb_pegawaiin: 2 rows
/*!40000 ALTER TABLE `tb_pegawaiin` DISABLE KEYS */;
INSERT INTO `tb_pegawaiin` (`nik`, `nama`, `jenis_kelamin`, `tanggal_lahir`, `agama`, `no_hp`, `alamat`) VALUES
	(9088213, 'Amrul', 'Laki-Laki', '2000-04-01', 'Islam', '09837422', 'Jln.Butar'),
	(384782, 'Kiya', 'Perempuan', '1999-10-01', 'Islam', '085373784432', 'Jln.BungaKembang');
/*!40000 ALTER TABLE `tb_pegawaiin` ENABLE KEYS */;

-- Dumping structure for table aplikasi_kepegawaian.tb_pegawaiout
CREATE TABLE IF NOT EXISTS `tb_pegawaiout` (
  `nik` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `agama` varchar(100) NOT NULL,
  `no_hp` varchar(100) NOT NULL,
  `alamat` text NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table aplikasi_kepegawaian.tb_pegawaiout: 2 rows
/*!40000 ALTER TABLE `tb_pegawaiout` DISABLE KEYS */;
INSERT INTO `tb_pegawaiout` (`nik`, `nama`, `jenis_kelamin`, `tanggal_lahir`, `agama`, `no_hp`, `alamat`) VALUES
	(9021, 'Ryan', 'Laki-Laki', '2001-10-20', 'Islam', '08524930903', 'Jln.Mahakam'),
	(328, 'Nahda', 'Perempuan', '2001-09-17', 'Islam', '085293753092', 'Jln.Sulawesi');
/*!40000 ALTER TABLE `tb_pegawaiout` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
