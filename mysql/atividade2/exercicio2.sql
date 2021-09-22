create database db_pizzaria_legal;
use db_pizzaria_legal;

-- tabela categoria
create table tb_categoria(
id bigint auto_increment,
nome varchar(20),
tamanho varchar(20),
promocional varchar(20),
primary key (id)
);

-- Populando categoria
insert into tb_categoria(nome,tamanho,promocional) values 
("Pizza","Grande","30%"),
("Pizza","Média","20%"),
("Esfirra","pequena","10%"),
("Esfirra","pequena","10%"),
("Pizza Doce","Grande","40%");

select * from tb_categoria;

-- tabela pizzaria 

create table tb_pizza(
id bigint auto_increment,
namePizza varchar(20),
pricePizza double,
flavor varchar(20),
primary key (id),
fk_id_categoria bigint,
foreign key (fk_id_categoria) references tb_categoria(id)
);

insert into tb_pizza(namePizza, pricePizza, flavor) values
("Pizza 4 queijos", 54.99,"Salgada"),
("Pizza de morango", 54.99,"Doce"),
("Pizza de mussarela", 54.99,"Salgada"),
("Pizza de chocolate", 50.99,"Doce"),
("Pizza Calabresa", 50.99,"Salgada"),
("Pizza Toscana", 54.99,"Salgada"),
("Pizza Vegana", 54.99,"Salgada"),
("Pizza de brócolis", 50.99,"Salgada");

select * from tb_pizza;


-- 1- Faça um select que retorne os Produtos com o valor maior do que 45 reais.

-- 2- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.

-- 3- Faça um select  utilizando LIKE buscando os Produtos com a letra C.

-- 4- Faça um um select com Inner join entre  tabela categoria e pizza.

-- 5- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
