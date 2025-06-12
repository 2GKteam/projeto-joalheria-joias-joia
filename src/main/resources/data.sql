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

<<<<<<< HEAD
INSERT IGNORE INTO tb_produto (id_produto, descricao_produto, img_url, nome_produto, preco_produto, categoria_produto, ornamento_id, tipo_produto_id) VALUES 
(1, 'Anel de ouro com rubi luxuoso e acabamento refinado', 'https://www.google.com/imgres?q=anel%20de%20ouro%20com%20rubi&imgurl=https%3A%2F%2Flojavivara.vtexassets.com%2Farquivos%2Fids%2F853564%2FAnel-Cores-em-Ouro-Amarelo-18k-com-Rubi-e-Diamantes-14013_1_set.jpg%3Fv%3D638490522488130000&imgrefurl=https%3A%2F%2Fwww.vivara.com.br%2Fanel-cores-em-ouro-amarelo-18k-com-rubi-e-diamantes-an00052568%2Fp&docid=TcNclTGvzCft3M&tbnid=3zT5cGW9FyNV2M&vet=12ahUKEwi3vrPrleeNAxW8ppUCHcr3IDYQM3oECGYQAA..i&w=1000&h=1000&hcb=2&ved=2ahUKEwi3vrPrleeNAxW8ppUCHcr3IDYQM3oECGYQAA', 'Anel Rubi Luxo', 350.00, 1, 1, 1),
(2, 'Colar elegante de prata com pérola natural', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.shopdaspedras.com.br%2Fjoias%2Fcolares-e-correntes%2Fcolares-perolas-naturais-cultivadas%2Fcolar-perola-natural-cultivada-arroz-branca-extra-6x8mm-04023&psig=AOvVaw2akExw4ER0tbkx1AwafKF9&ust=1749656219847000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJDI2tyW540DFQAAAAAdAAAAABAd', 'Colar Pérola Elegante', 250.00, 2, 4, 2),
(3, 'Brinco de bijuteria com esmeralda sintética e design moderno', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.azuljoias.com.br%2Fbrinco-gota-esmeralda%2F&psig=AOvVaw3V5b0MbTsY8egpTjjRfbn4&ust=1749656292956000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJCloI-X540DFQAAAAAdAAAAABAe', 'Brinco Esmeralda Chic', 60.00, 3, 3, 3),
(4, 'Pulseira de ouro adornada com diamante clássico', 'https://d13p5wuxy0ioj8.cloudfront.net/Custom/Content/Products/12/78/1278557_pulseira-ouro-18k-articulada-com-diamantes-e-esmeralda-colecao-colosseoip370702-154828_m6_638753841470993881.webp', 'Pulseira Diamante Clássica', 480.00, 4, 2, 1),
(5, 'Relógio moderno com detalhe em prata e pulseira sofisticada', 'https://lojavivara.vtexassets.com/unsafe/720x720/center/middle/https%3A%2F%2Flojavivara.vtexassets.com%2Farquivos%2Fids%2F2478158%2FRelogio-Akium-Masculino-Aco-Prateado-110511_2_set.jpg%3Fv%3D638847504093670000', 'Relógio Prata Design', 700.00, 5, 4, 2),
(6, 'Anel refinado de prata com pérola central', 'https://cdn.sistemawbuy.com.br/arquivos/eef3f7accea4e89023c708c2df7346a7/produtos/67acfe28dcd9f/009-67ae52ca96d5d.jpg', 'Anel Pérola Prata', 190.00, 1, 4, 2),
(7, 'Colar de bijuteria com pingente rubi fashion', 'https://d2d7stu5fcdz3l.cloudfront.net/Custom/Content/Products/11/19/1119518_colar-de-ouro-com-pingente-rubi-redondo-com-3-mm-joias-vip_z3_637112214023564894.webp', 'Colar Rubi Fashion', 45.00, 2, 1, 3),
(8, 'Brinco de ouro com esmeralda verdadeira e acabamento premium', 'https://acdn-us.mitiendanube.com/stores/001/137/152/products/br1119_es_principal1-d1bc24933e26215db615877115706828-640-0.jpg', 'Brinco Esmeralda Real', 420.00, 3, 3, 1),
(9, 'Pulseira de prata com acabamento fino e design minimalista', 'https://minimuns.com.br/cdn/shop/files/Pulseira_Masculina_em_Prata_925_com_Pedras_Pretas_Estilo_Fino_e_Sofisticado_com_Ajuste_Personalizado.webp?v=1744766569&width=2160', 'Pulseira Prata Slim', 210.00, 4, 4, 2),
(10, 'Relógio digital minimalista', 'https://25753.cdn.simplo7.net/static/25753/sku/relogios-digitais-relogio-digital-de-led-1617029341220.png', 'Relógio digital simples', 99.00, 5, 4, 3),
(11, 'Anel de bijuteria com detalhe em esmeralda', 'https://omegadornier.vtexassets.com/arquivos/ids/169624/AN09059.jpg?v=637025249304400000', 'Anel Biju Esmeralda', 39.90, 1, 3, 3),
(12, 'Colar de ouro com pingente de rubi luxuoso', 'https://images.tcdn.com.br/img/img_prod/698628/colar_em_ouro_18k_com_rubi_2596_1_20210412172416.jpg', 'Colar Rubi Luxuoso', 580.00, 2, 1, 1),
(13, 'Brinco de prata com pérola natural e estilo clássico', 'https://montecarlo.vtexassets.com/arquivos/ids/336609/NIM029902_1.jpg?v=638255544332830000', 'Brinco Pérola Clássico', 265.00, 3, 4, 2),
(14, 'Pulseira de bijuteria com detalhe brilhante simulando diamante', 'https://tiffany.vtexassets.com/arquivos/ids/173628/pulseira-tiffany-victoria-line-em-platina-com-diamantes-13674108_3.jpg?v=638285965043600000', 'Pulseira Brilho Fashion', 55.00, 4, 2, 3),
(15, 'Relógio clássico de ouro com visor analógico', 'https://lojavivara.vtexassets.com/arquivos/ids/935225-1600-1600/Relogio-Tommy-Hilfiger-Masculino-Aco-Dourado-1710679-105539_1_set.jpg?v=638763426181730000', 'Relógio Ouro Clássico', 900.00, 5, 1, 1),
(16, 'Anel de prata com entalhes elegantes e acabamento polido', 'https://images.tcdn.com.br/img/img_prod/1195965/anel_de_prata_solitario_detalhado_detalhes_que_fazem_a_diferenca_38977_1_2d05fe7ab7668108684ff7c7165d3570.jpg', 'Anel Entalhado Prata', 180.00, 1, 2, 2),
(17, 'Colar de bijuteria com esferas brilhantes e corrente delicada', 'https://www.pratafina.com.br/upload/produto/imagem/b_colar-de-prata-com-esferas-espelhadas.webp', 'Colar Esferas Brilho', 35.00, 2, 4, 3),
(18, 'Brinco de ouro com diamante central de destaque', 'https://lojavivara.vtexassets.com/arquivos/ids/895906/Brinco-em-Ouro-Branco-18k-com-Diamante-de-Laboratorio-2-ct-103291_2_set.jpg?v=638690189569400000', 'Brinco Diamante Premium', 620.00, 3, 2, 1),
(19, 'Pulseira de prata com detalhes vazados e estilo moderno', 'https://images.tcdn.com.br/img/img_prod/463054/pulseira_de_berloques_prata_925_coracao_vazada_5965_1_76b4d4f810a09b551e3a706231b6d52b_20240621144805.jpg', 'Pulseira Vazado Prata', 230.00, 4, 4, 2),
(20, 'Relógio mais desejado do momento', 'https://www.infomoney.com.br/wp-content/uploads/2025/01/Captura-de-tela-2025-01-02-132150.png?quality=70', 'Relógio Premium', 999.99, 5, 1, 2);


=======
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
>>>>>>> f7b01cfcf28c0174c1dddbaf849d68dc9f8c3aae
