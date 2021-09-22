create database db_farmacia_da_Gen;

use db_farmacia_da_Gen;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(40) not null,
    marca varchar(20) not null,
    
    primary key (id)
    
);

create table tb_produto(
	id bigint auto_increment,
    nome varchar(40) not null,
    preco decimal(10,2) not null,
    estoque bigint not null,
    fk_id_categoria bigint,
    
    primary key (id),
    foreign key (fk_id_categoria) references tb_categoria(id)
);

insert into tb_categoria (nome, marca) values 
("Cremes", "Jhonsons"),
("Desodorantes","Resona"),
("Cremes", "Avon"),
("Pomadas", "Boticario"),
("Alicates de unha", "FarmaBem");

select * from tb_categoria;

insert into tb_produto (nome, preco, estoque) values 
("Pomada de rosto", 10.00, 50),
("Desodorante 80ml", 15.00, 66),
("Sabonete pack 200 und", 55.00, 1000),
("Alicate de unha", 10.00, 556),
("Shampoo", 10.00, 200),
("nebacetin", 18.75, 55),
("shampoo Seda", 22.00, 66),
("esmalte preto", 7.00, 20);

select * from tb_produto;


select * from tb_produto where preco > 50; -- não tem
select * from tb_produto where preco between 50 and 60;
select * from tb_produto where nome like "%b%";
select * from tb_produto inner join tb_categoria on tb_produto.fk_id_categoria = tb_categoria.id;
select * from tb_produto left join tb_categoria on tb_produto.fk_id_categoria = tb_categoria.id where tb_categoria.nome = "cosméticos";