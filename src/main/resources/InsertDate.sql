INSERT INTO system_date (id, `current_date`) VALUES (1, CURDATE()) ON DUPLICATE KEY UPDATE `current_date`=CURDATE();