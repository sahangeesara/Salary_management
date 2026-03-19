CREATE TABLE employee (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          first_name VARCHAR(100) NOT NULL,
                          last_name VARCHAR(100) NOT NULL,
                          email VARCHAR(255) UNIQUE,
                          phone VARCHAR(30),
                          basic_salary DOUBLE NOT NULL,
                          allowance DOUBLE DEFAULT 0,
                          bonus DOUBLE DEFAULT 0,
                          donation DOUBLE DEFAULT 0,
                          department VARCHAR(100),
                          designation VARCHAR(100),
                          status VARCHAR(20) DEFAULT 'ACTIVE'
);

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
