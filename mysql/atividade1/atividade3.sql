create database db_escola;
use db_escola;

CREATE TABLE tb_alunos (
	id_aluno integer PRIMARY KEY AUTO_INCREMENT,
    nome_aluno varchar(255),
    id_classe_aluno int,
	materia varchar (255),
    nota_aluno double
    );
    
insert into tb_alunos (nome_aluno, id_classe_aluno, materia, nota_aluno) values
("Godoy", 1, "Programação", 10),
("Rodrigo", 1, "Programação", 8.5),
("Juliana", 2, "Matemática", 8),
("Mari", 2, "Português", 10),
("Jaque", 1, "Biologia", 10),
("Cyrillo", 2, "Geografia", 6),
("Yvo", 1, "Sociologia", 4.5),
("Vagner", 2, "Física", 5);

select * from tb_alunos;
select * from tb_alunos where nota_aluno > 7;
select * from tb_alunos where nota_aluno < 7;

update tb_alunos set nota_aluno = '8' where id_aluno = 7;

select * from tb_alunos;