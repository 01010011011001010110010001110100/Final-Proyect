--  _                          _            _       _            
-- | |                        | |          | |     | |           
-- | |__   __ _ ___  ___    __| | ___    __| | __ _| |_ ___  ___ 
-- | '_ \ / _` / __|/ _ \  / _` |/ _ \  / _` |/ _` | __/ _ \/ __|
-- | |_) | (_| \__ \  __/ | (_| |  __/ | (_| | (_| | || (_) \__ \
-- |_.__/ \__,_|___/\___|  \__,_|\___|  \__,_|\__,_|\__\___/|___/


																		                                  
-- // Crear la base de datos
CREATE DATABASE if NOT EXISTS lib;
USE lib;

--                           _               _        _     _           
--                          (_)             | |      | |   | |          
--   ___ _ __ ___  __ _  ___ _  ___  _ __   | |_ __ _| |__ | | __ _ ___ 
--  / __| '__/ _ \/ _` |/ __| |/ _ \| '_ \  | __/ _` | '_ \| |/ _` / __|
-- | (__| | |  __/ (_| | (__| | (_) | | | | | || (_| | |_) | | (_| \__ \
--  \___|_|  \___|\__,_|\___|_|\___/|_| |_|  \__\__,_|_.__/|_|\__,_|___/

  
  
-- /////////////////////////////////// TABLAS ESTATICAS

-- // Sexos
CREATE TABLE tbl_sex (
	idSex INT(1) NOT NULL PRIMARY KEY,
	descSex VARCHAR(1) NOT NULL
);

-- // Cargo del empleado
CREATE TABLE tbl_workPosition (
	idWorkPosition INT(11) NOT NULL PRIMARY KEY,
	descWorkPosition VARCHAR(35) NOT NULL
);

-- // Estado (ya sea : Activo,inactivo, invisible...)
CREATE TABLE tbl_state (
	idState INT(1) NOT NULL PRIMARY KEY,
	descState VARCHAR(15) NOT NULL
);

-- // Categoria del libro
CREATE TABLE tbl_category (
	idCategory INT(11) NOT NULL PRIMARY KEY,
	descCategory VARCHAR(35) NOT NULL
);

-- // Lenguaje del libro
CREATE TABLE tbl_languaje (
	idLanguaje INT(11) NOT NULL PRIMARY KEY,
	descLanguaje VARCHAR(15) NOT NULL
);

-- // Ediciones de los libros
CREATE TABLE tbl_edition (
	idEdition INT(11) NOT NULL PRIMARY KEY,
	descEdition VARCHAR(15) NOT NULL
);

-- // Niveles de acceso a las info mostradas
CREATE TABLE tbl_access (
	idAccess INT(1) NOT NULL PRIMARY KEY,
	descAccess VARCHAR(15) NOT NULL
);

-- /////////////////////////////////// TABLAS DINAMICAS


-- // Usuarios
CREATE TABLE tbl_user (
	idUser INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	userName VARCHAR(15) NOT NULL UNIQUE KEY,
	userEmail VARCHAR(50) NOT NULL UNIQUE KEY,
	userPassword VARCHAR(15) NOT NULL,
	idAccess INT(1) NOT NULL,
	idState INT(1) NOT NULL,
	FOREIGN KEY (idState) REFERENCES tbl_state(idState),
	FOREIGN KEY (idAccess) REFERENCES tbl_access(idAccess)
);

-- // Empleados
CREATE TABLE tbl_employee (
	idEmp INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	NDIEmp VARCHAR(11) NOT NULL UNIQUE KEY,
	nameEmp VARCHAR(35) NOT NULL,
	addressEmp VARCHAR(20) NOT NULL,
	phoneNumberEmp VARCHAR(10) NOT NULL,
	birthdateEmp DATE NOT NULL,
	idSex INT(1) NOT NULL,
	idWorkPosition INT(11) NOT NULL,
	salaryEmp DOUBLE NOT NULL,
	integrationDate DATE NOT NULL,
	idState INT(1) NOT NULL,
	FOREIGN KEY (idSex) REFERENCES tbl_sex(idSex),
	FOREIGN KEY (idWorkPosition) REFERENCES tbl_workPosition(idWorkPosition),
	FOREIGN KEY (idState) REFERENCES tbl_state(idState)
);

-- // Clientes
CREATE TABLE tbl_client (
	idClt INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	NDIClt VARCHAR(11) NOT NULL UNIQUE KEY,
	nameClt VARCHAR(35) NOT NULL,
	addressClt VARCHAR(20) NOT NULL,
	phoneNumberClt VARCHAR(10) NOT NULL,
	birthdate DATE NOT NULL,
	idSex INT(1) NOT NULL,
	monetaryPenalty DOUBLE NOT NULL,
	idState INT(1) NOT NULL,
	FOREIGN KEY (idSex) REFERENCES tbl_sex(idSex),
	FOREIGN KEY (idState) REFERENCES tbl_state(idState)
);
 
-- // Libros
CREATE TABLE tbl_book (
	idBook INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	ISBNBk VARCHAR(13) NOT NULL UNIQUE KEY,
	titleBk VARCHAR(20) NOT NULL,
	publicationDateBk DATE NOT NULL,
	authorBk VARCHAR(20) NOT NULL,
	idCategory INT(11) NOT NULL,
	idEdition INT(11) NOT NULL,
	idLanguaje INT(11) NOT NULL,
	pagesBk INT(11) NOT NULL,
	descriptionBk VARCHAR(30) NOT NULL,
	numberCopiesBk INT(11) NOT NULL,
	idState INT(1)  NOT NULL,
	FOREIGN KEY (idCategory) REFERENCES tbl_category(idCategory),
	FOREIGN KEY (idEdition) REFERENCES tbl_edition(idEdition),
	FOREIGN KEY (idLanguaje) REFERENCES tbl_languaje(idLanguaje),
	FOREIGN KEY (idState) REFERENCES tbl_state(idState)
);

--  _                     _       
-- (_)                   | |      
--  _ _ __  ___  ___ _ __| |_ ___ 
-- | | '_ \/ __|/ _ \ '__| __/ __|
-- | | | | \__ \  __/ |  | |_\__ \
-- |_|_| |_|___/\___|_|   \__|___/


-- // Sexo
INSERT INTO tbl_sex (idSex,descSex) VALUES
(1,"M"),
(2,"F");

-- // Cargos de los empleados
INSERT INTO tbl_workPosition (idWorkPosition, descWorkPosition) VALUES
(1, "Bibliotecario de referencia"),
(2, "Bibliotecario de circulación"),
(3, "Bibliotecario de colecciones"),
(4, "Catalogador"),
(5, "Supervisión"),
(6, "Publicaciones"),
(7, "Soporte técnico"),
(8, "Archivero"),
(9, "Gerente"),
(10, "Coordinador de eventos"),
(11, "Digitador"),
(12, "Conservación de inventario"),
(13, "Bibliotecario de bases de datos"),
(14, "Servicios generales");


-- //  Estados de elementos o registros
INSERT INTO tbl_state (idState, descState) VALUES
(1,"Activo"),
(2,"Inactivo"),
(3,"Queu");

-- // 
INSERT INTO tbl_category(idCategory, descCategory) values
(1, "Ficción"),
(2, "No Ficción"),
(3, "Ciencia Ficción y Fantasía"),
(4, "Misterio y Suspense"),
(5, "Romance"),
(6, "Biografía y Autobiografía"),
(7, "Historia"),
(8, "Ciencias Sociales"),
(9, "Ciencia y Tecnología"),
(10, "Arte y Música"),
(11, "Infantil"),
(12, "Juvenil"),
(13, "Religión y Espiritualidad"),
(14, "Autoayuda y Desarrollo Personal"),
(15, "Viajes y Aventuras"),
(16, "Poesía"),
(17, "Filosofía"),
(18, "Economía y Finanzas"),
(19, "Psicología"),
(20, "Salud y Bienestar"),
(21, "Cocina y Gastronomía"),
(22, "Deportes y Recreación"),
(23, "Educación"),
(24, "Ciencias Naturales"),
(25, "Medicina"),
(26, "Tecnología de la Información"),
(27, "Arquitectura y Diseño"),
(28, "Política y Gobierno"),
(29, "Ecológico y Sostenibilidad"),
(30, "Aventuras Gráficas"),
(31, "Terror");

-- // Tabka kenguaje
INSERT INTO tbl_languaje (idLanguaje, descLanguaje) VALUES
(1, "Español"),
(2, "Inglés"),
(3, "Francés"),
(4, "Alemán"),
(5, "Italiano"),
(6, "Portugués"),
(7, "Ruso"),
(8, "Chino"),
(9, "Japonés"),
(10, "Árabe");


-- //  Insertar distintas ediciones de libros
INSERT INTO tbl_edition (idEdition, descEdition) VALUES
(1, "1ra. edición"),
(2, "2da. edición"),
(3, "3ra. edición"),
(4, "4ta. edición"),
(5, "5ta. edición"),
(6, "6ta. edición"),
(7, "7ma. edición"),
(8, "8va. edición"),
(9, "9na. edición"),
(10, "10ma. edición");

-- // Insertar los distintos niveles de acceso
INSERT INTO tbl_access (idAccess, descAccess) VALUES
(1,"Admin"),
(2,"User");

-- //Empleados
-- Insertar 10 registros ficticios en tbl_employee
INSERT INTO tbl_employee (NDIEmp, nameEmp, addressEmp, phoneNumberEmp, birthdateEmp, idSex, idWorkPosition, salaryEmp, integrationDate, idState)
VALUES
('12345678901', 'John Doe', '123 Main St', '555-1234', '1990-01-01', 1, 1, 50000.0, '2022-01-01', 1),
('98765432109', 'Jane Doe', '456 Oak St', '555-5678', '1995-02-15', 2, 2, 60000.0, '2022-02-01', 1),
('11122334455', 'Alice Smith', '789 Elm St', '555-9876', '1988-05-20', 1, 1, 55000.0, '2022-03-01', 2),
('99988877766', 'Bob Johnson', '321 Pine St', '555-4321', '1992-11-10', 2, 3, 70000.0, '2022-04-01', 2),
('55566677788', 'Eva Brown', '654 Cedar St', '555-8765', '1985-08-07', 1, 2, 48000.0, '2022-05-01', 1),
('44433322211', 'Mike Wilson', '987 Birch St', '555-1111', '1997-03-25', 2, 1, 52000.0, '2022-06-01', 2),
('66699988877', 'Sara Miller', '234 Oak St', '555-3333', '1980-12-12', 1, 3, 65000.0, '2022-07-01', 1),
('77711122233', 'David Davis', '876 Pine St', '555-6666', '1983-09-30', 2, 2, 59000.0, '2022-08-01', 1),
('88844455566', 'Emily White', '345 Elm St', '555-9999', '1994-06-18', 1, 1, 51000.0, '2022-09-01', 2),
('22200011133', 'Daniel Brown', '567 Cedar St', '555-7777', '1987-04-05', 2, 3, 68000.0, '2022-10-01', 1);

-- // Usuarios
INSERT INTO tbl_user (userName, userEmail, userPassword, idAccess, idState)
VALUES
('johndoe', 'john.doe@gmail.com', 'pass1', 1, 1),
('janesmith', 'jane.smith@gmail.com', 'pass2', 2, 1),
('alicejones', 'alice.jones@gmail.com', 'pass3', 2, 1),
('bobmiller', 'bob.miller@gmail.com', 'pass4', 2, 1),
('evabrown', 'eva.brown@gmail.com', 'pass5', 2, 1),
('mikewilson', 'mike.wilson@gmail.com', 'pass6', 2, 1),
('saramiller', 'sara.miller@gmail.com', 'pass7', 2, 1),
('daviddavis', 'david.davis@gmail.com', 'pass8', 2, 1),
('emilywhite', 'emily.white@gmail.com', 'pass9', 2, 1),
('adminuser', 'admin.user@gmail.com', 'adminpass', 1, 1);

--
--              _           _       
--     /\      | |         (_)      
--    /  \   __| |_ __ ___  _ _ __  
--   / /\ \ / _` | '_ ` _ \| | '_ \ 
--  / ____ \ (_| | | | | | | | | | |
-- /_/    \_\__,_|_| |_| |_|_|_| |_|


-- // Insertar el usuario Admin
INSERT INTO tbl_user(userName, userEmail, userPassword, idAccess, idState) VALUES
("Admin", "admin@gmail.com", "12345", 1, 1),
("user", "user@gmail.com", "12345", 2, 1);
