


INSERT INTO regiones (id, nombre) VALUES (1,'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2,'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3,'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4,'Europa');
INSERT INTO regiones (id, nombre) VALUES (5,'Asia');
INSERT INTO regiones (id, nombre) VALUES (6,'Africa');
INSERT INTO regiones (id, nombre) VALUES (7,'Ocean�a');
INSERT INTO regiones (id, nombre) VALUES (8,'Ant�rtida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1,'Andrés','Guzmán','profesor@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2,'Mr. John','Doe','john.doe@gmail.com','2017-11-12');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4,'linus','Torvalds','linus.torvalds@gmail.com','2017-12-14');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4,'Rasmus','Ledorf','rasmus.lerdor@gmail.com','2017-12-16');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4,'Erich','Gamma','erich.gamma@gmail.com','2017-12-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3,'Richard','Helm','richard.helm@gmail.com','2017-12-20');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3,'Ralf','Jhonson','ralf.johnson@gmail.com','2017-12-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3,'Bombasto','Vlissides','bombasto.vlissides@gmail.com','2017-12-22');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3,'Dr James','Gosling','james.goslig@gmail.com','2017-12-23');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6,'Magma','Lee','magma.lee@gmail.com','2017-12-24');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6,'Tornado','Roe','tornado.roe@gmail.com','2017-12-25');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1,'José','Arocha','arochaj2@gmail.com','2017-12-26');


INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$fUJIcrDP2m2fAVgmWwXq1uB7tMtaYiatcyzreyVyFO1lWrrPEjzLq',1,'Andres','Guzmán','profesor@bolsadeideas.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$UC/FVJcLZYikUo3kzDVKWOoIKScH9GvKRgpQLdKPxAh9oJ7cvcrFy',1,'Jhon','Doe','jhon.doe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);

INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic pantalla LCD',259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Camara digital DSC-W320B',123490,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple iPod shuffle',37990,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Notebook Z110',69990,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Hewlett Packard Multifuncional F2280',69990,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Bianchi Bicicleta Aro 26',69990,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Mica Comoda 5 Cajones',299990,NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2,1,4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura Bicicleta', 'Alguna nota importante', 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3,2,6);


