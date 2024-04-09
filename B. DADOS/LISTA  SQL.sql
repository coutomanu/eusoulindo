-- RESPOSTA 01 
CREATE TABLE PRODUTO (
	id serial PRIMARY KEY,
	codigo varchar(3),
	descricao varchar(100),
	unidade char(2),
	valor numeric(12, 2),
	custo numeric(12, 2),
	dataCadastro date, 
	inativo boolean
);


-- RESPOSTA 02

INSERT INTO PRODUTO (codigo, descricao, unidade, valor, custo, dataCadastro, inativo)
VALUES 
    ('P01', 'Refrigerante 2L', 'UN', 5.99, 4.00, '2022-01-10', FALSE),
    ('P02', 'Alface', 'KG', 0.99, 0.70, '2022-01-10', FALSE),
    ('P03', 'Arroz 5KG', 'UN', 19.99, 18.59, '2022-01-10', FALSE),
    ('P04', 'Feijao 1KG', 'UN', 5.99, 4.99, '2022-01-10', FALSE),
    ('P05', 'Cerveja 600ML', 'UN', 2.99, 2.49, '2022-02-12', FALSE),
    ('P06', 'Amendoim 500G', 'UN', 2.50, 2.00, '2022-02-12', FALSE),
    ('P07', 'Pipoca 200G', 'UN', 4.00, 3.00, '2022-02-12', FALSE),
    ('P08', 'Pacote Bala 1KG', 'UN', 7.89, 6.50, '2021-12-24', FALSE),
    ('P09', 'Uva', 'KG', 4.50, 3.00, '2021-12-24', FALSE),
    ('P10', 'Abacaxi', 'KG', 1.99, 1.50, '2021-12-24', FALSE);
	

-- RESPOSTA 03
INSERT INTO PRODUTO (codigo, descricao, unidade, valor, custo, dataCadastro, inativo)
VALUES 
    ('P11', 'Pipoca Doce 200G', 'UN', 1.50, 4.50, CURRENT_DATE, FALSE),
    ('P12', 'Sucrilhos 500G', 'UN', 6.00, 8.99, CURRENT_DATE, FALSE);
	
-- RESPOSTA 04

ALTER TABLE PRODUTO
ADD COLUMN tipo VARCHAR(50);

-- RESPOSTA 05 

UPDATE PRODUTO
SET tipo = 
    CASE 
        WHEN descricao LIKE '%Refrigerante%' OR descricao LIKE '%Cerveja%' THEN 'Bebidas'
        WHEN descricao LIKE '%Arroz%' OR descricao LIKE '%Feijao%' THEN 'Farináceos'
        WHEN descricao LIKE '%Alface%' OR descricao LIKE '%Uva%' OR descricao LIKE '%Abacaxi%' THEN 'Feira'
        WHEN descricao LIKE '%Bala%' THEN 'Doces'
        ELSE 'OUTRO'
    END;

-- RESPOSTA 06

SELECT * FROM PRODUTO;

-- RESPOSTA 07

ALTER TABLE PRODUTO
ADD COLUMN qtdestoque FLOAT;

-- RESPOSTA 08

SELECT id, codigo, descricao, unidade FROM PRODUTO;

-- RESPOSTA 09

UPDATE PRODUTO
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
        ELSE NULL
    END;
	
-- RESPOSTA 10

SELECT descricao, unidade
FROM PRODUTO
WHERE qtdestoque > 200;

-- RESPOSTA 11

SELECT *
FROM PRODUTO
WHERE valor > 4.00;


-- RESPOSTA 12

SELECT descricao, codigo, unidade, valor
FROM PRODUTO
WHERE unidade = 'UN';

-- RESPOSTA 13

SELECT *
FROM PRODUTO
WHERE dataCadastro >= '2022-01-01' AND custo < 4.00;

-- RESPOSTA 14 

SELECT *
FROM PRODUTO
WHERE dataCadastro >= '2022-01-01' AND custo < 4.00 AND valor < 10.00;

-- RESPOSTA 15

CREATE TABLE CLIENTE(
	nome varchar(200),
	codigo varchar(3),
	cpf varchar(11),
	telefone varchar(12),
	dataCadastro date,
	observacoes varchar(30),
	inativo boolean
);


-- RESPOSTA 16

INSERT INTO cliente (NOME, CODIGO, CPF, TELEFONE, DATACADASTRO, OBSERVACOES, INATIVO)
VALUES 
    ('Maria Silva', 'C01', '12345678910', '43 34721122', '2021-12-01', 'Cliente Bom', FALSE),
    ('João Santos', 'C02', '98765432100', '43 34723020', '2021-12-01', 'Cliente Bom', FALSE),
    ('Ana Costa', 'C03', '45678912345', '43 34721152', '2022-01-14', 'Cliente Inadimplente', FALSE),
    ('Pedro Souza', 'C04', '32165498711', '43 34721011', '2022-01-14', 'Cliente Regular', FALSE),
    ('Lucas Ferreira', 'C05', '74185296300', '43 34728085', '2022-01-14', 'Cliente Regular', FALSE),
    ('Julia Oliveira', 'C06', '36925814722', '43 34722310', '2021-06-06', 'Cliente Excelente', FALSE);

-- RESPOSTA 17

ALTER TABLE CLIENTE
ADD COLUMN ID SERIAL PRIMARY KEY;

-- RESPOSTA 18

SELECT * FROM CLIENTE;

-- RESPOSTA 19 

SELECT *
FROM CLIENTE
WHERE OBSERVACOES = 'Cliente Bom';

-- RESPOSTA 20
UPDATE CLIENTE
SET INATIVO = TRUE
WHERE NOME = 'Julia Oliveira';

-- RESPOSTA 21

SELECT *
FROM CLIENTE
WHERE INATIVO = TRUE;

-- RESPOSTA 22

DELETE FROM CLIENTE
WHERE NOME = 'Lucas Ferreira';



















