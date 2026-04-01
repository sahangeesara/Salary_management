CREATE TABLE bonus (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       employee_id INT NOT NULL,
                       amount DOUBLE DEFAULT 0,
                       created_at DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
                       FOREIGN KEY (employee_id) REFERENCES employee(id)
);
