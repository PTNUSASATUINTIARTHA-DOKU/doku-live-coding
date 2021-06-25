insert into user (id, EMAIL_ADDRESS, FIRST_NAME, LAST_NAME, ROLE, SSN, USER_NAME)
values (101, 'kaskus@mail.com', 'Test', 'Data', 'admin', 'ssn101', 'testadmin');
insert into user
values (102, 'kaskus@mail.com', 'Test', 'Data', 'admin', 'ssn102', 'testadmin2');
insert into user
values (103, 'kaskus@mail.com', 'Test', 'Data', 'admin', 'ssn103', 'testadmin3');

insert into bank (id, name)
values (1, 'BCA');
insert into bank (id, name)
values (2, 'BNI');
insert into bank (id, name)
values (3, 'MANDIRI');

insert into product (id, name)
values (1, 'DOKU_WALLET');
insert into product (id, name)
values (2, 'BILLER');
insert into product (id, name)
values (3, 'CREDIT_CARD');

insert into transaction (id, amount, status, product_id, bank_id, user_id)
values (1, 500.0, 'Test', 1, 1, 101);

