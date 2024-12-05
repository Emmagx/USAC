CREATE TABLE NombreTabla (
    columna1 TipoDato [Restricciones],
    columna2 TipoDato [Restricciones],
    columna3 TipoDato [Restricciones],
    -- Agrega tantas columnas como necesites

    PRIMARY KEY (columnaPrimaria),
    FOREIGN KEY (columnaForanea) REFERENCES TablaRelacionada(ColumnaRelacionada)
        [ON DELETE Acción] [ON UPDATE Acción]
);

CREATE TABLE Usuarios (
    idUsuarios INT AUTO_INCREMENT, -- Identificador único
    nombre VARCHAR(100) NOT NULL, -- Nombre del usuario
    correo VARCHAR(100) UNIQUE, -- Correo electrónico único
    rol_idrol INT NOT NULL, -- Llave foránea hacia la tabla Rol
    estados_idestados INT NOT NULL, -- Llave foránea hacia la tabla Estados

    PRIMARY KEY (idUsuarios), -- Definimos la clave primaria
    FOREIGN KEY (rol_idrol) REFERENCES Rol(idRol) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE, -- Restricciones para mantener integridad referencial
    FOREIGN KEY (estados_idestados) REFERENCES Estados(idEstados) 
        ON DELETE SET NULL 
        ON UPDATE CASCADE
);

CREATE TABLE Usuario_Productos (
    idUsuario INT NOT NULL, -- Llave foránea hacia Usuarios
    idProducto INT NOT NULL, -- Llave foránea hacia Productos

    PRIMARY KEY (idUsuario, idProducto), -- Llave compuesta
    FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuarios) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE,
    FOREIGN KEY (idProducto) REFERENCES Productos(idProductos) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);
-- Insertar Datos

INSERT INTO NombreTabla (columna1, columna2, columna3) 
VALUES (valor1, valor2, valor3);

-- consultar datos
SELECT columna1, columna2 
FROM NombreTabla
WHERE columna3 = valor
ORDER BY columna1 ASC;

-- Actualizar Datos
UPDATE NombreTabla
SET columna1 = nuevoValor1, columna2 = nuevoValor2
WHERE condicion;

-- Eliminar datos
DELETE FROM NombreTabla
WHERE condicion;

Resumen de restricciones SQL
Restricción	Descripción
PRIMARY KEY	Define una columna o conjunto de columnas como clave primaria (única y no nula).
FOREIGN KEY	Define una relación con otra tabla (integridad referencial).
NOT NULL	No permite valores nulos en la columna.
UNIQUE	Garantiza que los valores en la columna sean únicos.
AUTO_INCREMENT	Incrementa automáticamente el valor en columnas numéricas (MySQL).
DEFAULT	Asigna un valor por defecto a la columna si no se proporciona uno.
ON DELETE	Define la acción a realizar al eliminar un registro en la tabla relacionada.
ON UPDATE	Define la acción a realizar al actualizar un registro en la tabla relacionada.

Acciones comunes para ON DELETE y ON UPDATE

Acción	Descripción
CASCADE	Elimina/actualiza automáticamente los registros relacionados.
SET NULL	Establece la columna a NULL si el registro relacionado es eliminado/actualizado.
NO ACTION	Previene la eliminación/actualización si hay registros relacionados (comportamiento por defecto).
SET DEFAULT	Establece la columna a su valor por defecto si el registro relacionado es eliminado/actualizado.