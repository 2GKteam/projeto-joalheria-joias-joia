-- Inserindo Tipos de Usuário (se não existirem)
INSERT IGNORE INTO tb_tipoUsuario (idTipoUsuario, nome) VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

-- Inserindo Categorias de Produto (se não existirem)
INSERT IGNORE INTO tb_categoria_produto (id_categoria_produto, nome_categoria_produto, descricao_categoria_produto) VALUES
(1, 'Anéis', 'Acessório para os dedos'),
(2, 'Colares', 'Acessório para o pescoço'),
(3, 'Brincos', 'Acessório para as orelhas'),
(4, 'Pulseiras', 'Acessório para os braços'),
(5, 'Relógios', 'Acessório para não se atrasar no SENAI');

-- Inserindo Tipos de Produto (se não existirem)
INSERT IGNORE INTO tb_tipoProduto (id_tipo_produto, nome_tipo_produto, descricao_tipo_produto) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju, mas é de rico');
