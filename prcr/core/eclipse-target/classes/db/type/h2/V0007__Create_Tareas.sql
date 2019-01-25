CREATE TABLE Tareas(
   id BIGINT NOT NULL AUTO_INCREMENT,
   nombre varchar(50) NOT NULL,
   pr_id BIGINT NOT NULL,
   fechalimite DATE NOT NULL,
   username BIGINT NOT NULL,
   fechafinalizacion DATE,
   modificationCounter INTEGER NOT NULL,
   PRIMARY KEY (id),
   FOREIGN KEY (username) REFERENCES users(id),
   FOREIGN KEY (pr_id) REFERENCES proyectos(id)
);