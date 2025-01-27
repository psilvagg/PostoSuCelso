create database PostoSuCelso;
use PostoSuCelso;

create table Veiculos (
	IDVeic bigint auto_increment primary key,
    Placa varchar (8) not null,
    Modelo varchar (200) not null,
    TipoComb enum("Gasolina", "Etanol", "Diesel"),
    LitroAbastecimento float default (0)
);

insert into Veiculos (Placa, Modelo, TipoComb, LitroAbastecimento)
values
('BRA2A34', 'Toyota Corolla', 'Gasolina', 40.0),
('SPB5B67', 'Honda Civic', 'Etanol', 11.0),
('RJX8C90', 'Ford Ranger', 'Diesel', 20.0);

create table Produtos (
	IDProduto bigint auto_increment primary key,
	NomeProduto varchar (40) not null,
    Preco float default (0),
    QtdEstoque bigint not null
);

insert into Produtos (NomeProduto, Preco, QtdEstoque)
values
('Refrigerante Coca-Cola 2L', 7.50, 200),
('Pacote de Batata Chips', 4.00, 150),
('Chocolate Barra', 3.50, 300);

create table Funcionarios (
	IDFunc bigint auto_increment primary key,
	NomeFunc varchar (100) not null,
    Cargo varchar (60),
    cpf varchar(11) unique
);

insert into Funcionarios (NomeFunc, Cargo, cpf)
values
('Carlos Silva', 'Gerente', '12345678901'),
('Ana Souza', 'Atendente', '23456789012'),
('Marcos Pereira', 'Atendente', '34567890123');

create table Venda (
	IDVenda bigint auto_increment primary key,
    DataVenda date,
    HoraVenda time,
	IDFunc_Fk bigint,
	IDProduto_Fk bigint,
	QtdVendida bigint not null,
    foreign key (IDFunc_Fk) references Funcionarios (IDFunc),
    foreign key (IDProduto_Fk) references Produtos (IDProduto)
);

DELIMITER //
CREATE TRIGGER verifica_estoque_before_insert
BEFORE INSERT ON Venda
FOR EACH ROW
BEGIN
    DECLARE qtd_disponivel bigint;

    SELECT QtdEstoque INTO qtd_disponivel
    FROM Produtos
    WHERE IDProduto = NEW.IDProduto_Fk;

    IF qtd_disponivel >= NEW.QtdVendida THEN
        UPDATE Produtos
        SET QtdEstoque = QtdEstoque - NEW.QtdVendida
        WHERE IDProduto = NEW.IDProduto_Fk;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Quantidade em estoque insuficiente para realizar a venda';
    END IF;
END //
DELIMITER ;

insert into Venda (DataVenda, HoraVenda, IDFunc_Fk, IDProduto_Fk, QtdVendida)
values
('2024-05-25', '08:30:00', 1, 1, 50), 
('2024-05-25', '09:15:00', 2, 2, 40), 
('2024-05-25', '10:00:00', 3, 1, 30);