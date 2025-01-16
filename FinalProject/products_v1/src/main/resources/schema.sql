CREATE TABLE IF NOT EXISTS `products` (
                                          `products_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
                                          `product_name` varchar(100) NOT NULL
);

insert into `products` (`products_id`,`product_name`) values ( 1,'Ayakkabı')