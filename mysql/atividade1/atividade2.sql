create database db_ecommerce;
use db_ecommerce;

CREATE TABLE tb_produtos (
	id_produto integer PRIMARY KEY AUTO_INCREMENT,
    nome_produto varchar(255),
    cor_produto varchar(255),
    preco_produto double,
	quantidade_produto int
	);
    
insert into tb_produtos (nome_produto, cor_produto, preco_produto, quantidade_produto) values
("Bicicleta", "Vermelha", 300, 5),
("Televisão", "Preta", 1500, 3),
("Patinete", "Prata", 200, 1),
("Celular", "Branco", 2000, 5),
("Mochila", "Azul", 150, 10),
("Mochila", "Amarela", 150, 6),
("Notebook", "Preto", 3000, 2),
("Caixa de som", "Verde", 230, 11);

select * from tb_produtos;
select * from tb_produtos where preco_produto > 500;
select * from tb_produtos where preco_produto < 500;

update tb_produtos set preco_produto = '4000' where id_produto = 4;

select * from tb_produtos;