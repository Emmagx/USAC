CREATE TABLE TablaA (
    idA INT AUTO_INCREMENT,
    columna1 TipoDato,
    PRIMARY KEY (idA)
);

CREATE TABLE TablaB (
    idB INT AUTO_INCREMENT,
    columna2 TipoDato,
    idA INT UNIQUE, -- Clave foránea única hacia TablaA
    PRIMARY KEY (idB),
    FOREIGN KEY (idA) REFERENCES TablaA(idA) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);
CREATE TABLE Usuarios (
    idUsuarios INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY (idUsuarios)
);

CREATE TABLE DetallesUsuarios (
    idDetalles INT AUTO_INCREMENT,
    direccion VARCHAR(255),
    idUsuario INT UNIQUE, -- Relación uno a uno con Usuarios
    PRIMARY KEY (idDetalles),
    FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuarios) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);
