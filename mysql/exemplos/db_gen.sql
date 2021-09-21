create database db_jogo_gen33;

use db_jogo_gen33;

create table tb_classes(
	id bigint auto_increment,
    nome varchar(255),
    poder varchar(255),
    energia int,
    primary key (id)
);

insert into tb_classes(nome, poder, energia)
	value("maga", "bola de fogo", 90);
insert into tb_classes(nome, poder, energia)
	value("Arqueira", "chuva de flechas", 80);
    
select * from tb_classes;