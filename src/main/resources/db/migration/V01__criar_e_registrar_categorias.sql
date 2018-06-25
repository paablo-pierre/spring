CREATE TABLE categoria (
    codigo bigserial primary key,
    nome varchar(50) NOT NULL
);

INSERT INTO categoria (nome) VALUES ('Lazer');
INSERT INTO categoria (nome) VALUES ('Alimentação');
INSERT INTO categoria (nome) VALUES ('Supermercado');
INSERT INTO categoria (nome) VALUES ('Outros');
INSERT INTO categoria (nome) VALUES ('Farmácia');