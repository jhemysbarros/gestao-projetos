INSERT INTO cargo(id, nome)	VALUES (1, 'Gerente');

INSERT INTO endereco(id, bairro, cep, cidade, complemento, logradouro, numero, uf)
	VALUES (1, 'Plano Diretor Sul', '77020154', 'Palmas', 'Residência', 'Quadra 110 Sul Alameda 19', '440', 'TO');

INSERT INTO funcionario(id, cpf, data_nascimento, email, nome, telefone, data_admissao, data_demissao, senha, endereco_id_fk, cargo_id_fk)
	VALUES (1, '87771889182', '1993-02-13', 'osvaldo@gmail.com', 'Osvaldo Ricardo Martins', '63984829060', '2021-01-01', null,'$2y$12$O1qTNOo2u8F1EiFA7dL8Tuq.wYjoDAELYT2vCLZ.z/XWSwTSjfqii', 1, 1);