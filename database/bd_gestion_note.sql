-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 02 avr. 2021 à 10:19
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bd_gestion_note`
--

-- --------------------------------------------------------

--
-- Structure de la table `eleve`
--

DROP TABLE IF EXISTS `eleve`;
CREATE TABLE IF NOT EXISTS `eleve` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `moyenne` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `eleve`
--

INSERT INTO `eleve` (`id`, `nom`, `prenom`, `moyenne`) VALUES
(1, 'diaby', 'Mouctar', '12'),
(2, 'aissa', 'camara', '10'),
(3, 'Fanta', 'Kourouma', '8'),
(4, 'ousmane', 'Billa', '6'),
(5, 'Fanta', 'Kourouma', '8'),
(6, 'ousmane', 'Billa', '6'),
(7, 'balde', 'karamba', '14'),
(8, 'sory', 'sow', '6'),
(9, 'Bangoure', 'Aliou', '14'),
(10, 'franck', 'Nikol', '12'),
(11, 'Barry', 'Fode Moussa', '11'),
(12, 'karampo', 'baga', '5'),
(13, 'soul', 'Mayanga', '12'),
(14, 'franc', 'le bois ', '6'),
(15, 'nicol', 'la cueilleire', '4'),
(16, 'jose', 'le coq', '15'),
(17, 'houss', 'zigga', '11'),
(18, 'houss', 'zigga', '11'),
(19, 'lala', 'lole', '12'),
(20, 'qiqo', 'llak', '12'),
(21, 'de', 'htty', '14'),
(22, 'aa', 'kdk', '14'),
(23, 'kkl', '15', '15');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
