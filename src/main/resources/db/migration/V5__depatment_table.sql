CREATE TABLE department (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(50)
);
CREATE TABLE designation (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(50)
);

ALTER TABLE employee
    ADD COLUMN department_id INT,
ADD COLUMN designation_id INT;


ALTER TABLE employee
    ADD CONSTRAINT fk_employee_department
        FOREIGN KEY (department_id)
            REFERENCES department(id)
            ON DELETE SET NULL
            ON UPDATE CASCADE;

ALTER TABLE employee
    ADD CONSTRAINT fk_employee_designation
        FOREIGN KEY (designation_id)
            REFERENCES designation(id)
            ON DELETE SET NULL
            ON UPDATE CASCADE;

ALTER TABLE employee ENGINE=InnoDB;
