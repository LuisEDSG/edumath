-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-01-2017 a las 15:58:14
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdmat`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `algebra`
--

CREATE TABLE `algebra` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `ejercicio1` int(11) DEFAULT NULL,
  `ejercicio2` int(11) DEFAULT NULL,
  `ejercicio3` int(11) DEFAULT NULL,
  `ejercicio4` int(11) DEFAULT NULL,
  `ejercicio5` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aritmetica`
--

CREATE TABLE `aritmetica` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `ejercicio1` int(11) DEFAULT NULL,
  `ejercicio2` int(11) DEFAULT NULL,
  `ejercicio3` int(11) DEFAULT NULL,
  `ejercicio4` int(11) DEFAULT NULL,
  `ejercicio5` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `geometria`
--

CREATE TABLE `geometria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `ejercicio1` int(11) DEFAULT NULL,
  `ejercicio2` int(11) DEFAULT NULL,
  `ejercicio3` int(11) DEFAULT NULL,
  `ejercicio4` int(11) DEFAULT NULL,
  `ejercicio5` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usu` varchar(45) DEFAULT NULL,
  `contra` varchar(45) DEFAULT NULL,
  `lvl` int(1) UNSIGNED ZEROFILL DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usu`, `contra`, `lvl`) VALUES
(1, 'Luis', '0117', 1),
(2, 'Eunice', '0468', 1),
(3, 'Eduardo', '12345', 2),
(4, 'Fatima', '34567', 2),
(5, 'Pancho', '34567', 2),
(6, 'Carlos', 'carlo1234', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `algebra`
--
ALTER TABLE `algebra`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `aritmetica`
--
ALTER TABLE `aritmetica`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `geometria`
--
ALTER TABLE `geometria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `algebra`
--
ALTER TABLE `algebra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `aritmetica`
--
ALTER TABLE `aritmetica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `geometria`
--
ALTER TABLE `geometria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
