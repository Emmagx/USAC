CREATE TABLE Tabla1 (
    idTabla1 INT AUTO_INCREMENT,
    columna1 TipoDato,
    PRIMARY KEY (idTabla1)
);

CREATE TABLE Tabla2 (
    idTabla2 INT AUTO_INCREMENT,
    columna2 TipoDato,
    PRIMARY KEY (idTabla2)
);

CREATE TABLE TablaIntermedia (
    idTabla1 INT NOT NULL, -- Clave foránea hacia Tabla1
    idTabla2 INT NOT NULL, -- Clave foránea hacia Tabla2
    PRIMARY KEY (idTabla1, idTabla2),
    FOREIGN KEY (idTabla1) REFERENCES Tabla1(idTabla1) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE,
    FOREIGN KEY (idTabla2) REFERENCES Tabla2(idTabla2) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);

CREATE TABLE Productos (
    idProductos INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY (idProductos)
);

CREATE TABLE Ordenes (
    idOrdenes INT AUTO_INCREMENT,
    descripcion VARCHAR(255),
    PRIMARY KEY (idOrdenes)
);

CREATE TABLE OrdenDetalles (
    idProducto INT NOT NULL, -- Relación con Productos
    idOrden INT NOT NULL,    -- Relación con Ordenes
    cantidad INT,
    PRIMARY KEY (idProducto, idOrden),
    FOREIGN KEY (idProducto) REFERENCES Productos(idProductos) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE,
    FOREIGN KEY (idOrden) REFERENCES Ordenes(idOrdenes) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);
