INSERT INTO customer (account, balance, city, name, status) VALUES ('savings', 6000, 'chennai', 'bruce wayne', 'pending');
INSERT INTO customer (account, balance, city, name, status) VALUES ('savings', 6000, 'bangalore', 'clarke kent', 'pending');

INSERT INTO transaction (account_id, complete, quantity, status, transaction_date) VALUES (2, 0, 6000, 'credit', '02/01/2014 04:00:56');