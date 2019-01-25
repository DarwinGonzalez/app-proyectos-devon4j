INSERT INTO Users(id, username, role, password, modificationCounter) VALUES (0, 'sito@mail.com', 'boss', 'pass1', 1);
INSERT INTO Users(id, username, role, password, modificationCounter) VALUES (1, 'darwin@mail.com', 'programmer', 'pass2', 1);
INSERT INTO Users(id, username, role, password, modificationCounter) VALUES (2, 'pincho@mail.com', 'programmer', 'pass3', 1);
INSERT INTO Users(id, username, role, password, modificationCounter) VALUES (3, 'baladon@mail.com', 'progammer', 'pass4', 1);

INSERT INTO Proyectos(id, nombre, modificationCounter) VALUES (0, 'proyecto1', 1);
INSERT INTO Proyectos(id, nombre, modificationCounter) VALUES (1, 'proyecto2', 1);
INSERT INTO Proyectos(id, nombre, modificationCounter) VALUES (2, 'proyecto3', 1);


INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (0, 'tarea1', 0, '2019-02-10', 1, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (1, 'tarea2', 1, '2019-02-12', 2, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (2, 'tarea3', 2, '2019-02-14', 3, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (3, 'tarea4', 0, '2019-02-15', 1, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (4, 'tarea5', 1, '2019-02-15', 2, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (5, 'tarea6', 2, '2019-02-16', 3, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (6, 'tarea7', 0, '2019-02-19', 1, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (7, 'tarea8', 1, '2019-02-20', 1, null, 1);
INSERT INTO Tareas(id, nombre, pr_id, fechalimite, username, fechafinalizacion, modificationCounter) VALUES (8, 'tarea9', 2, '2019-02-17', 3, null, 1);
