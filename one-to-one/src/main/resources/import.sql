INSERT INTO tb_order(moment) VALUES(TIMESTAMP WITH TIME ZONE '2023-06-10T14:30:00Z');
INSERT INTO tb_order(moment) VALUES(TIMESTAMP WITH TIME ZONE '2023-06-11T14:30:00Z');
INSERT INTO tb_order(moment) VALUES(TIMESTAMP WITH TIME ZONE '2023-02-10T14:30:00Z');
INSERT INTO tb_order(moment) VALUES(TIMESTAMP WITH TIME ZONE '2023-01-10T14:30:00Z');
INSERT INTO tb_order(moment) VALUES(TIMESTAMP WITH TIME ZONE '2023-03-10T14:30:00Z');

INSERT INTO tb_payment(moment, order_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-06-10T14:30:00Z', 1);
INSERT INTO tb_payment(moment, order_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-06-11T14:30:00Z', 2);
INSERT INTO tb_payment(moment, order_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-02-10T14:30:00Z', 5);
INSERT INTO tb_payment(moment, order_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-01-10T14:30:00Z', 3);
INSERT INTO tb_payment(moment, order_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-03-10T14:30:00Z', 4);
