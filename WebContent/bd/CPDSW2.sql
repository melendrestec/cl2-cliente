-- Creamos BD
create database CPDSW2;
use CPDSW2;

-- Creamos Tabla
create table tb_producto
(
Idprod int(11) NOT NULL AUTO_INCREMENT,
nom_prod varchar(50) DEFAULT NULL,
marca_prod varchar(50) DEFAULT NULL,
pre_prod double DEFAULT NULL,
stk_prod int(11) DEFAULT NULL,
PRIMARY KEY (Idprod)
);

-- Creamos procedure Insertar
DELIMITER $$
create procedure sp_listaProd(pre1 double, pre2 double)
BEGIN
select * from tb_producto where pre_prod>=pre1 && pre_prod<=pre2;
END$$
DELIMITER ;
-- drop procedure sp_listaProd;
-- Creamos procedure Listar
DELIMITER $$
create procedure sp_saveProd (IN nom varchar(50),  IN marca varchar(50), IN pre double, IN stk int(11) )
BEGIN
insert into tb_producto values(null,nom,marca,pre,stk);
END$$
DELIMITER ;

insert into tb_producto values (1,'Laptop','Dell',700,10);
insert into tb_producto values (2,'Monitor','HP',150,100);
insert into tb_producto values (3,'Mouse','Dell',20,30);
insert into tb_producto values (4,'Case blindado','Asus',40,40);

select * from tb_producto;

call sp_listaProd(100,800);
call sp_saveProd('refrigeradora','mabe',700.60,90);
