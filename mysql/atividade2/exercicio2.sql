create database db_pizzaria_legal;
use db_pizzaria_legal;

-- tabela categoria
create table tb_categoria(
id_categoria bigint auto_increment,
nome varchar(20),
tamanho varchar(20),
promocional varchar(20),
primary key (id_categoria)
);

-- Populando categoria
insert into tb_categoria(nome,tamanho,promocional,id_categoria) values 
("Pizza","Grande","30%",1),
("Pizza","Média","20%",2),
("Esfirra","pequena","10%",3),
("Esfirra","pequena","10%",4),
("Pizza Doce","Grande","40%",5);

select * from tb_categoria;

-- tabela pizzaria 

create table tb_pizza(
id bigint auto_increment,
namePizza varchar(20),
pricePizza decimal(10,2),
flavor varchar(20),
id_categoria bigint,
foreign key (id_categoria) references tb_categoria ( id_categoria),
primary key (id)) engine = InnoDB;

insert into tb_pizza(namePizza, pricePizza, flavor) values
("Pizza 4 queijos", 54.99,"Salgada"),
("Pizza de morango", 29.00,"Doce"),
("Pizza de mussarela", 54.99,"Salgada"),
("Pizza de chocolate", 40.99,"Doce"),
("Pizza Calabresa", 50.99,"Salgada"),
("Pizza Toscana", 54.99,"Salgada"),
("Pizza Vegana", 54.99,"Salgada"),
("Pizza de brócolis", 50.99,"Salgada");

select * from tb_pizza;


-- 1- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
select * from tb_pizza where pricePizza >45;
-- 2- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.
select * from tb_pizza where pricePrizza between 29 and 60; 
-- 3- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_pizza where namePrizza like "%c%";
-- 4- Faça um um select com Inner join entre  tabela categoria e pizza.
select * from tb_pizza inner join tb_categoria on tb_pizza.fk_id_categoria = tb_categoria.id;
-- 5- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select * from tb_pizza left join tb_categoria on tb_pizza.fk_id_categoria = tb_categoria.id where tipo = "doce";

drop table tb_pizza;