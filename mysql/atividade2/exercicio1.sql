create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
	id bigint auto_increment,
    nome varchar(255),
    poder varchar(255),
    energia int,
    primary key (id) 
);

-- Inserir/popular dados na tabela classe
insert into tb_classes (nome, poder, energia) 
		values ("jogador", "Dibre", 90);
insert into tb_classes (nome, poder, energia) 
		values ("arqueira", "chuva de flechas", 100);
insert into tb_classes (nome, poder, energia) 
		values ("sereia", "agua transbordante", 120);
insert into tb_classes (nome, poder, energia) 
		values ("morte", "sugadora de almas", 150);
insert into tb_classes (nome, poder, energia) 
		values ("Flash", "Correr rápido", 150);

select * from tb_classes;

create table tb_personagens(
id bigint auto_increment,
nome varchar(20),
genero varchar(20),
raça varchar(20),
ataque int,
vida int,
primary key (id),
fk_id_classe bigint,
foreign key (fk_id_classe) references tb_classes(id)
);

-- Inserir/popular dados na tabela personagem
insert into  tb_personagens (nome, genero, raça, ataque, vida, fk_id_classe) 
	values ("Ronaldinho Gaucho","masculino", "homano", 100, 150, 1);
insert into  tb_personagens (nome, genero, raça, ataque, vida, fk_id_classe) 
	values ("Joice","ela", "humana", 20, 150, 3);
insert into  tb_personagens (nome, genero, raça, ataque, vida, fk_id_classe) 
	values ("Juan","elu", "bullywug", 8, 50, 4);
insert into tb_personagens (nome, genero,raça, ataque,vida, fk_id_classe)
	values ("Raniere", "Menine", "Humana", 22, 100, 2);
insert into tb_personagens (nome, genero,raça, ataque,vida, fk_id_classe)
	values ("Raniere", "Menine", "Humana", 22, 100, 2);
insert into tb_personagens (nome, genero,raça, ataque,vida, fk_id_classe)
	values ("Raniere", "Menine", "Humana", 22, 100, 2);
insert into tb_personagens (nome, genero,raça, ataque,vida, fk_id_classe)
	values ("Raniere", "Menine", "Humana", 22, 100, 2);
insert into tb_personagens (nome, genero,raça, ataque,vida, fk_id_classe)
	values ("Raniere", "Menine", "Humana", 22, 100, 2);
select * from tb_personagens;


