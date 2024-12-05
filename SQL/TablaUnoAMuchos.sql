CREATE TABLE TablaUno (
    idUno INT AUTO_INCREMENT,
    columna1 TipoDato,
    PRIMARY KEY (idUno)
);

CREATE TABLE TablaMuchos (
    idMuchos INT AUTO_INCREMENT,
    columna2 TipoDato,
    idUno INT NOT NULL, -- Clave foránea hacia TablaUno
    PRIMARY KEY (idMuchos),
    FOREIGN KEY (idUno) REFERENCES TablaUno(idUno) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);

CREATE TABLE Usuarios (
    idUsuarios INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY (idUsuarios)
);

CREATE TABLE Ordenes (
    idOrdenes INT AUTO_INCREMENT,
    descripcion VARCHAR(255),
    idUsuario INT NOT NULL,
    PRIMARY KEY (idOrdenes),
    FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuarios) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);
