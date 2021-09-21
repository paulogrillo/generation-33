create database db_RH;
use db_RH;

CREATE TABLE tb_funcionarios (
	ID_Funcionario integer PRIMARY KEY AUTO_INCREMENT,
    Nome varchar(255),
    Funcao varchar (255),
	Salario double,
	DataDePagamento int
    );
    
insert into tb_funcionarios (Nome, Funcao, Salario, DataDePagamento) values
("Godoy", "Gerente", 9999, 5),
("Rodrigo", "Auxiliar Adm", 1500, 5),
("Juliana", "Trainee", 3500, 5),
("Mari", "Estagiária", 800, 5),
("Jaque", "Auxiliar Adm", 1500, 5);

select * from tb_funcionarios;
select * from tb_funcionarios where Salario > 2000;
select * from tb_funcionarios where Salario < 2000;

update tb_funcionarios set Salario = '15000' where ID_Funcionario =1;

select * from tb_funcionarios;