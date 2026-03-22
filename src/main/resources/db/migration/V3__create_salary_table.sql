CREATE TABLE salary_request (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                employee_id INT,
                                basic_salary DOUBLE,
                                donation DOUBLE
);

CREATE TABLE salary_response (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 basic_salary DOUBLE,
                                 epf_employee DOUBLE,
                                 epf_employer DOUBLE,
                                 etf_employer DOUBLE,
                                 donation DOUBLE,
                                 total_deduction DOUBLE,
                                 net_salary DOUBLE,
                                 employer_cost DOUBLE
);
