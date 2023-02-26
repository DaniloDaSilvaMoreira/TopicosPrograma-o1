-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

insert into Produto (id, nomeProduto, valor, cor, garantia, fabricante)
values (nextval('hibernate_sequence'), 'Produto A', '20', 'Azul',
        '7', 'Loja A');

insert into Produto (id, nomeProduto, valor, cor, garantia, fabricante)
values (nextval('hibernate_sequence'), 'Produto B', '30', 'Vermelho',
        '7', 'Loja B');