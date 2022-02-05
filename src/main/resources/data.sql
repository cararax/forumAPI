INSERT INTO USUARIO(nome, email, senha)
VALUES ('Aluno', 'aluno@email.com', '$2a$10$xvKDjWSfjmpAbM7Z7xK0k.lPhBGioWoOdMf25nvbdd/sg5QuHsJ9K');
INSERT INTO USUARIO(nome, email, senha)
VALUES ('user', 'user@user.com', '$2a$10$Ic5hLF5.raOItYXBNj520ei2u6ZXTPWU4t.14Jn.KVYyRopfgI8ry');

INSERT INTO CURSO(nome, categoria)
VALUES ('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria)
VALUES ('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)
VALUES ('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)
VALUES ('Dúvida 2', 'Projeto não compila', '2019-05-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)
VALUES ('Dúvida 3', 'Tag HTML', '2019-05-05 20:00:00', 'NAO_RESPONDIDO', 1, 2);