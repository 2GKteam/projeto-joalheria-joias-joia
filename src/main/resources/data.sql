<<<<<<< HEAD
<<<<<<< HEAD
insert ignore into tb_tipoUsuario(idTipoUsuario,nome_tipo_usuario) values
=======

INSERT IGNORE INTO tb_tipoUsuario (id_TipoUsuario, nome_tipo_usuario) VALUES 
>>>>>>> 2a74676 (criação do banco de dados no mysql)
(1,'Admin'),
(2,'Cliente'),
(3,'Vendedor'),
(4,'Gerente');
=======
INSERT INTO tb_tipoUsuario (id_tipo_usuario, nome_tipo_usuario) VALUES 
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

-- Categorias de produtos
INSERT INTO tb_categoria_Produto (id_categoria, nome_categoria, descricao_categoria) VALUES
(1, 'Anéis', 'Acessório para os dedos'),
(2, 'Colares', 'Acessório para o pescoço'),
(3, 'Brincos', 'Acessório para as orelhas'),
(4, 'Pulseiras', 'Acessório para os braços'),
(5, 'Relógios', 'Acessório para não atrasar no SENAI');
>>>>>>> b80b64d5fcecd0af077945128f53a6981aff3bd9

-- Tipos de produtos
INSERT INTO tb_tipo_Produto (id_tipoProduto, nome_tipo_produto, descricao_produto) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');
<<<<<<< HEAD
=======


>>>>>>> 2a74676 (criação do banco de dados no mysql)
