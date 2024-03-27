-- 01
CREATE TABLE produto (
	id serial PRIMARY KEY,
	codigo varchar(3),
	descricao varchar(100),
	unidadeDeMedida char(2),
	valor numeric(12,2),
	custo numeric(12,2),
	dataCadastro date,
	inativo boolean
);

-- 02

INSERT INTO produto (codigo, descricao, unidadeDeMedida, valor, custo, dataCadastro, inativo) 
VALUES 
('P01', 'Refrigerante 2L', 'UN', 5.99, 4.00, '2022-01-10', false),
('P02', 'Alface', 'KG', 0.99, 0.70, '2022-01-10', false),
('P03', 'Arroz 5KG', 'UN', 19.99, 18.59, '2022-01-10', false),
('P04', 'Feijao 1KG', 'UN', 5.99, 4.99, '2022-01-10', false),
('P05', 'Cerveja 600ML', 'UN', 2.99, 2.49, '2022-02-12', false),
('P06', 'Amendoim 500G', 'UN', 2.50, 2.00, '2022-02-12', false),
('P07', 'Pipoca 200G', 'UN', 4.00, 3.00, '2022-02-12', false),
('P08', 'Pacote Bala 1KG', 'UN', 7.89, 6.50, '2021-12-24', false),
('P09', 'Uva', 'KG', 4.50, 3.00, '2021-12-24', false),
('P10', 'Abacaxi', 'KG', 1.99, 1.50, '2021-12-24', false);

-- 003

INSERT INTO produto (codigo, descricao, unidadeDeMedida, valor, custo, dataCadastro, inativo) 
VALUES 
('P11', 'Pipoca Doce 200G', 'UN', 1.50, 4.50, CURRENT_DATE, false),
('P12', 'Sucrilhos 500G', 'UN', 6.00, 8.99, CURRENT_DATE, false);

-- 004

ALTER TABLE produto
ADD COLUMN tipo VARCHAR(50);

-- 005

UPDATE PRODUTO
SET tipo =
    CASE
        WHEN descricao LIKE '%Refrigerante%' OR descricao LIKE '%Cerveja%' THEN 'Bebidas'
        WHEN descricao LIKE '%Arroz%' OR descricao LIKE '%Feijao%' THEN 'Farinaceos'
        WHEN descricao LIKE '%Alface%' OR descricao LIKE '%Uva%' OR descricao LIKE '%Abacaxi%' THEN 'Feira'
        WHEN descricao LIKE '%Bala%' THEN 'Doces'
        ELSE NULL
    END;

-- 006

SELECT * FROM produto;

-- 007

ALTER TABLE produto
ADD COLUMN qtdestoque FLOAT;

-- 008

SELECT id, codigo, descricao, unidadedemedida
FROM produto;

-- 009

UPDATE produto
SET qtdestoque = 
    CASE 
        WHEN codigo = 'P01' THEN 400
        WHEN codigo = 'P02' THEN 80500
        WHEN codigo = 'P03' THEN 875
        WHEN codigo = 'P04' THEN 380
        WHEN codigo = 'P05' THEN 4555
        WHEN codigo = 'P06' THEN 100
        WHEN codigo = 'P07' THEN 199
        WHEN codigo = 'P08' THEN 75
        WHEN codigo = 'P09' THEN 20100
        WHEN codigo = 'P10' THEN 35900
        WHEN codigo = 'P11' THEN 150
        WHEN codigo = 'P12' THEN 80
        ELSE 0
    END;
 
-- 010

SELECT descricao, unidadedemedida
FROM produto
WHERE qtdestoque > 200;


-- 011

SELECT *
FROM produto
WHERE valor > 4.00;

-- 012

SELECT descricao, codigo, unidadedemedida, valor
FROM produto
WHERE unidadeDeMedida = 'UN';

-- 013

SELECT *
FROM produto
WHERE dataCadastro >= '2022-01-01' AND custo < 4.00;


-- 014

SELECT *
FROM produto
WHERE dataCadastro >= '2022-01-01' AND custo < 4.00 AND valor < 10.00;

-- 015

CREATE TABLE cliente (
	nome varchar(200),
	codigo varchar(3),
	CPF varchar(11),
	telefone varchar(11),
    dataCadastro date,
	observacao varchar(30),
	inativo boolean
);

-- 016

INSERT INTO cliente (nome, codigo, cpf, telefone, dataCadastro, observacoes, inativo) 
VALUES 
('Maria Silva', 'C01', '12345678910', '4334721122', '2021-12-01', 'Cliente Bom', FALSE),
('João Santos', 'C02', '98765432100', '4334723020', '2021-12-01', 'Cliente Bom', FALSE),
('Ana Costa', 'C03', '45678912345', '4334721152', '2022-01-14', 'Cliente Inadimplente', FALSE),
('Pedro Souza', 'C04', '32165498711', '4334721011', '2022-01-14', 'Cliente Regular', FALSE),
('Lucas Ferreira', 'C05', '74185296300', '4334728085', '2022-01-14', 'Cliente Regular', FALSE),
('Julia Oliveira', 'C06', '36925814722', '4334722310', '2021-06-06', 'Cliente Excelente', FALSE);

-- 017




