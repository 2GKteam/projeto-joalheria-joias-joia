INSERT IGNORE INTO tb_tipo_usuario (id_tipo_usuario, nome_tipo_usuario) VALUES 
(1,'Admin'),
(2,'Cliente'),
(3,'Vendedor'),
(4,'Gerente');
-- Categorias de produtos
INSERT IGNORE INTO tb_categoria_produto (id_categoria, nome_categoria, descricao_categoria)
VALUES
(1, 'Anéis', 'Acessório para os dedos'),
(2, 'Colares', 'Acessório para o pescoço'),
(3, 'Brincos', 'Acessório para as orelhas'),
(4, 'Pulseiras', 'Acessório para os braços'),
(5, 'Relógios', 'Acessório para não atrasar no SENAI');
-- Inserindo Tipos (se não existirem)
INSERT IGNORE INTO tb_tipo_produto (id_tipo_produto, nome_tipo_produto, descricao_produto) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');

insert ignore into tb_ornamento (id_ornamento, nome) values
(1, 'Rubi'),
(2, 'Diamante'),
(3, 'Esmeralda'),
(4, 'Perola'),
(5, 'Nenhum');

INSERT INTO tb_produtos (id_produto, descricao_produto, img_url, nome_produto, preco_produto, categoria_produto, ornamento_id, tipo_produto_id) VALUES 
(1, 'Anel de ouro com rubi luxuoso e acabamento refinado','https://n9.cl/eyd72', 'Anel Rubi Luxo', 350.00, 1, 1, 1),
(2, 'Colar elegante de prata com pérola natural', 'https://n9.cl/0enwh', 'Colar Pérola Elegante', 250.00, 2, 4, 2),
(3, 'Brinco de bijuteria com esmeralda sintética e design moderno', 'https://n9.cl/wtk519', 'Brinco Esmeralda Chic', 60.00, 3, 3, 3),
(4, 'Pulseira de ouro adornada com diamante clássico', 'https://n9.cl/atwn3', 'Pulseira Diamante Clássica', 480.00, 4, 2, 1),
(5, 'Relógio moderno com detalhe em prata e pulseira sofisticada', 'https://n9.cl/pwumzl', 'Relógio Prata Design', 700.00, 5, 4, 2),
(6, 'Anel refinado de prata com pérola central', 'https://n9.cl/8r51m', 'Anel Pérola Prata', 190.00, 1, 4, 2),
(7, 'Colar de bijuteria com pingente rubi fashion', 'https://n9.cl/oh7sk', 'Colar Rubi Fashion', 45.00, 2, 1, 3),
(8, 'Brinco de ouro com esmeralda verdadeira e acabamento premium', 'https://n9.cl/mg95c', 'Brinco Esmeralda Real', 420.00, 3, 3, 1),
(9, 'Pulseira de prata com acabamento fino e design minimalista', 'https://n9.cl/3sf7z', 'Pulseira Prata Slim', 210.00, 4, 4, 2),
(10, 'Relógio digital minimalista', 'https://n9.cl/bcrdu', 'Relógio digital simples', 99.00, 5, 4, 3),
(11, 'Anel de bijuteria com detalhe em esmeralda', 'https://n9.cl/i8fjn', 'Anel Biju Esmeralda', 39.90, 1, 3, 3),
(12, 'Colar de ouro com pingente de rubi luxuoso', 'https://n9.cl/mzo8c', 'Colar Rubi Luxuoso', 580.00, 2, 1, 1),
(13, 'Brinco de prata com pérola natural e estilo clássico', 'https://n9.cl/jndpk1', 'Brinco Pérola Clássico', 265.00, 3, 4, 2),
(14, 'Pulseira de bijuteria com detalhe brilhante simulando diamante', 'https://n9.cl/pmmth', 'Pulseira Brilho Fashion', 55.00, 4, 2, 3),
(15, 'Relógio clássico de ouro com visor analógico', 'https://n9.cl/78cqbx', 'Relógio Ouro Clássico', 900.00, 5, 1, 1),
(16, 'Anel de prata com entalhes elegantes e acabamento polido', 'https://n9.cl/638svu', 'Anel Entalhado Prata', 180.00, 1, 2, 2),
(17, 'Colar de bijuteria com esferas brilhantes e corrente delicada', 'https://n9.cl/fkj9g', 'Colar Esferas Brilho', 35.00, 2, 4, 3),
(18, 'Brinco de ouro com diamante central de destaque', 'https://n9.cl/fwvq8', 'Brinco Diamante Premium', 620.00, 3, 2, 1),
(19, 'Pulseira de prata com detalhes vazados e estilo moderno', 'https://n9.cl/vi952', 'Pulseira Vazado Prata', 230.00, 4, 4, 2),
(20, 'Relógio mais desejado do momento', 'https://n9.cl/8zpsm', 'Relógio Premium', 999.99, 5, 1, 2);