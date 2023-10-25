create database  if not exists minibank;
use minibank;
CREATE TABLE if not exists system_date (
                             id INT AUTO_INCREMENT PRIMARY KEY ,
                             `current_date` DATE NOT NULL,
                             inserted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


