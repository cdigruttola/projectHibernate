DROP DATABASE IF EXISTS PracticesManager;

CREATE DATABASE IF NOT EXISTS PracticesManager;

USE PracticesManager;

DROP TABLE IF EXISTS Customers;

CREATE TABLE IF NOT EXISTS Customers (
	pk VARCHAR(32) NOT NULL PRIMARY KEY,
    id INT(4) NOT NULL,
    name VARCHAR(32) NOT NULL,
    surname VARCHAR(32) NOT NULL,
    mail VARCHAR(255) NOT NULL UNIQUE,
    tax_code VARCHAR(16) NOT NULL UNIQUE,
    vat_code VARCHAR(11) UNIQUE
);

DROP TABLE IF EXISTS Employees;

CREATE TABLE IF NOT EXISTS Employees (
	pk VARCHAR(32) NOT NULL PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    surname VARCHAR(32) NOT NULL,
    mail VARCHAR(255) NOT NULL UNIQUE,
    admin BOOLEAN
);

DROP TABLE IF EXISTS Practices;

CREATE TABLE IF NOT EXISTS Practices (
	pk VARCHAR(32) NOT NULL PRIMARY KEY,
    id VARCHAR(32) NOT NULL,
    object VARCHAR(255) NOT NULL,
    due_date DATE NOT NULL,
    open_date DATE NOT NULL,
    closure_date DATE,
    sospension VARCHAR(32),
    customer VARCHAR(32) NOT NULL,
    employee VARCHAR(32) NOT NULL,
    state VARCHAR(32) NOT NULL,
    type VARCHAR(32) NOT NULL,
    CONSTRAINT fk_customer_p FOREIGN KEY (customer)
        REFERENCES Customers(pk),
    CONSTRAINT fk_employee_p FOREIGN KEY (employee)
		REFERENCES Employees(pk)
);

DROP TABLE IF EXISTS Activities;

CREATE TABLE IF NOT EXISTS Activities (
	pk VARCHAR(32) NOT NULL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    practice VARCHAR(32) NOT NULL,
    employee VARCHAR(32) NOT NULL,
    due_date DATE NOT NULL,
    open_date DATE NOT NULL,
    end_date DATE,
    closure_date DATE,
    working_hours INT(11),
    km INT(11),
    CONSTRAINT fk_practice_a FOREIGN KEY (practice)
        REFERENCES Practices(pk),
    CONSTRAINT fk_employee_a FOREIGN KEY (employee)
		REFERENCES Employees(pk)
);

DROP TABLE IF EXISTS Comments;

CREATE TABLE IF NOT EXISTS Comments (
	pk VARCHAR(32) NOT NULL PRIMARY KEY,
    date DATE NOT NULL,
    text VARCHAR(1023) NOT NULL,
    activity VARCHAR(32) NOT NULL,
    employee VARCHAR(32) NOT NULL,
    CONSTRAINT fk_activity_c FOREIGN KEY (activity)
        REFERENCES Activities(pk),
    CONSTRAINT fk_employee_c FOREIGN KEY (employee)
		REFERENCES Employees(pk)
);

DROP TABLE IF EXISTS Files;

CREATE TABLE IF NOT EXISTS Files (
	pk VARCHAR(32) NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    url VARCHAR(255) NOT NULL,
    practice VARCHAR(32) NOT NULL,
    employee VARCHAR(32) NOT NULL,
    CONSTRAINT fk_practice_f FOREIGN KEY (practice)
        REFERENCES Practices(pk),
    CONSTRAINT fk_employee_f FOREIGN KEY (employee)
		REFERENCES Employees(pk)
);

