create database db_generation_game_online;

use db_generation_game_online;

-- DATA BASE LEAGUE OF LEGENDS --

create table tb_classes(
	id bigint auto_increment,
    nameClass varchar(40),
    skills varchar(20),
    life int,
    primary key (id) 
);
-- Inserir/popular dados na tabela classe
insert into tb_classes(nameClass, skills, life) values 
	("lutador", "chute", 80),
	("atirador", "chuva de flechas", 60),
	("mago", "furacão", 65),
	("suporte", "Escudo protetor", 102),
	("assassino", "ataque voador", 70);
select * from tb_classes;

create table tb_personagens(
id bigint auto_increment,
namePerson varchar (40),
genre varchar (20),
breed varchar (20),
atack int,
defence int,
primary key (id),

-- Relacionamento -- 
fk_id_classe bigint, 
foreign key (fk_id_classe) references tb_classes(id)
);


-- Populando/inserindo dados na tabela personagens ---
insert into tb_personagens(namePerson, genre, breed, atack, defence) values
	("Morgana","Feminino","Humano",50,25),
	("Xinzao","masculino","Humano",60,50),
	("Leblanc","Feminino","Humano",40,30),
	("Kayle","Feminino","Anjo",55,70),
	("Vayne","Feminino","Humano",60,50),
	("Varus","Masculino","Humano",50,60),
	("Zed", "Masculino", "Humano", 50, 20),
	("Warwick", "masculino", "Cachorro", 30, 20);

select * from tb_personagens;

-- === Aplicando filtros === --

-- 1-Faça um select que retorne os personagens 
-- com o poder de ataque maior do que 50.
select * from tb_personagens where atack > 50;

-- 2-Faça um select trazendo  os personagens com 
-- poder de defesa entre 1000 e 2000.
select * from tb_personagens where defence between 20 and 30;

-- 3-Faça um select  utilizando LIKE buscando 
-- os personagens com a letra C.
select * from tb_personagens where namePerson like "%c%";

-- 4-Faça um um select com Inner join entre  
-- tabela classe e personagem.
select * from tb_personagens inner join tb_classes 
on tb_classes.nameClass = tb_personagens.namePerson;

-- 5-Faça um select onde traga todos os personagem de 
-- uma classe específica (exemplo todos os personagens 
-- que são arqueiros).
select * from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.fk_id_classe
where fk_id_classe = 2



