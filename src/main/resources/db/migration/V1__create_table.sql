CREATE TABLE IF NOT EXISTS `users` (
                                                   `id`         INT          NOT NULL AUTO_INCREMENT,
                                                   `username`   VARCHAR(255) NOT NULL UNIQUE,
    `email`      VARCHAR(255) NOT NULL UNIQUE,
    `password`   VARCHAR(255) NOT NULL,
    `role`       VARCHAR(100) NULL DEFAULT NULL,
    `enabled`    BOOLEAN      NULL DEFAULT 1,
    `created_at` DATETIME     NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
    ) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;



CREATE TABLE employee (

                        id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        user_id INT NULL UNIQUE,

                        first_name VARCHAR(100) NOT NULL,
                        last_name VARCHAR(100) NOT NULL,
                        email VARCHAR(255) NULL,
                        phone VARCHAR(30) NULL,

                        basic_salary DOUBLE NOT NULL,
                        allowance DOUBLE DEFAULT 0,
                        bonus DOUBLE DEFAULT 0,
                        donation DOUBLE DEFAULT 0,

                        department VARCHAR(100) NULL,
                        designation VARCHAR(100) NULL,
                        status VARCHAR(20) DEFAULT 'ACTIVE',

                        FOREIGN KEY (user_id)
                        REFERENCES users (id)
                        ON DELETE SET NULL
                        ON UPDATE CASCADE

) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE payroll (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         employee_id INT NOT NULL,
                         basic_salary DOUBLE NOT NULL,
                         epf_employee DOUBLE DEFAULT 0,
                         epf_employer DOUBLE DEFAULT 0,
                         etf_employer DOUBLE DEFAULT 0,
                         allowance DOUBLE DEFAULT 0,
                         bonus DOUBLE DEFAULT 0,
                         donation DOUBLE DEFAULT 0,
                         overtime_amount DOUBLE DEFAULT 0,
                         leave_days INT DEFAULT 0,
                         leave_deduction DOUBLE DEFAULT 0,
                         total_deduction DOUBLE DEFAULT 0,
                         net_salary DOUBLE DEFAULT 0,
                         employer_cost DOUBLE DEFAULT 0,
                         payroll_date DATE NOT NULL,
                         FOREIGN KEY (employee_id) REFERENCES employee(id)
);

CREATE TABLE deduction (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           employee_id INT NOT NULL,
                           type VARCHAR(50), -- EPF / TAX / LOAN / DONATION
                           amount DOUBLE DEFAULT 0,
                           FOREIGN KEY (employee_id) REFERENCES employee(id)
);

CREATE TABLE allowance (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           employee_id INT NOT NULL,
                           type VARCHAR(50), -- Transport / Meal / Other
                           amount DOUBLE DEFAULT 0,
                           FOREIGN KEY (employee_id) REFERENCES employee(id)
);

CREATE TABLE employee_leave (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                employee_id INT NOT NULL,
                                leave_type VARCHAR(50), -- ANNUAL / CASUAL / SICK
                                start_date DATE NOT NULL,
                                end_date DATE NOT NULL,
                                total_days INT DEFAULT 0,
                                status VARCHAR(20) DEFAULT 'PENDING', -- PENDING / APPROVED / REJECTED
                                reason TEXT,
                                FOREIGN KEY (employee_id) REFERENCES employee(id)
);

CREATE TABLE overtime (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          employee_id INT NOT NULL,
                          date DATE NOT NULL,
                          hours DOUBLE DEFAULT 0,
                          rate_per_hour DOUBLE DEFAULT 0,
                          total_amount DOUBLE DEFAULT 0,
                          FOREIGN KEY (employee_id) REFERENCES employee(id)
);

CREATE TABLE payroll_config (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                epf_employee_rate DOUBLE DEFAULT 0.08,
                                epf_employer_rate DOUBLE DEFAULT 0.12,
                                etf_rate DOUBLE DEFAULT 0.03
);
