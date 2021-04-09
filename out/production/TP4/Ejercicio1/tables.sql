CREATE TABLE Plato (
  id int NOT NULL AUTO_INCREMENT,
  Nombre varchar(255) NOT NULL,
  Precio int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Plato_Ingrediente (
  id int NOT NULL AUTO_INCREMENT,
  Plato_id int NOT NULL,
  Ingrediente_id int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Ingrediente (
  id int NOT NULL AUTO_INCREMENT,
  Nombre varchar(255) NOT NULL,
  Tipo varchar(255),
  PRIMARY KEY (id)
);

CREATE TABLE Bebida (
  id int NOT NULL AUTO_INCREMENT,
  Nombre varchar(255) NOT NULL,
  Tamano float,
  Precio int,
  PRIMARY KEY (id)
);

CREATE TABLE Promocion (
  id int NOT NULL AUTO_INCREMENT,
  Nombre varchar(255) NOT NULL,
  Plato_id int,
  Bebida_id int,
  Precio int,
  PRIMARY KEY (id)
);