CREATE DATABASE PROJETOS;
USE PROJETOS;

CREATE TABLE TBL_PROJETO (
   id INT NOT NULL identity, 
   nome VARCHAR(200), 
   PRIMARY KEY (id) 
); 
CREATE TABLE TBL_FUNCIONARIO( 
   id INT NOT NULL identity, 
   nome VARCHAR(200), 
   PRIMARY KEY (id) 
); 

CREATE TABLE TBL_Projeto_Funcionario ( 
   projeto_id INT,
   funcionario_id INT,
 ); 
