create database rh_gen;

use rh_gen;

create table tb_funcionaries(
	id bigint not null auto_increment,
	nome varchar(205) not null,
    ative boolean,
    nascimento date not null, 
    hora_nasc time,
    email varchar(205) not null,
    data_criacao timestamp not null,
    data_atualizacao timestamp not null,
    primary key (`id`)
);

insert into tb_funcionaries(nome, ative, nascimento, hora_nasc, email, data_criacao, data_atualizacao) 
values ("Argel", true, "1999-08-16", "07:30:00", "argel@generation.org", 
current_timestamp(), current_timestamp()
);

select * from tb_funcionaries;

select id, nome, email,
date_format(nascimento, "%d%m%y") as Data_de_Nascimento, 
date_format(hora_nasc, "%h:%m:%s") as Hora_de_Nascimento
from tb_funcionaries;