# CISP401F2020-poj2b 
Project 2b for SCC CISP401 project 2b. Re-do of project 1 pay report

Design Narrative
=================

Classes
=======
EmployeeRecord

Employee

Employees

AppDriver

Class Associations
==================

EmployeeRecord(1) ---- includes ---- (1) Employee

Employees(1) ---- contains ---- (m) Employee

AppDriver(1) ---- uses ---- (1) Employees

Class Attributes
EmployeeRecord ,

(+)LastName, FirstName : string //data

(+) hours, payrate, gross, fedtax, statetax, ssitax,net : float

(+) EmployeeRecord ()

(+) EmployeeRecord (string lastname, firstname; float h,pr,defr)
(+) EmployeeRecord (EmployeeRecord e)

(+)String toString()

Employee
(-) EmployeeRecord e //data

(+) Employee ()

(+) Employee (string lastname, firstname; float h,pr,defr)
(+) Employee (EmployeeRecord e)

(+) calcGross ()

(+) calcTaxes ()

(+) calcNet ()

(+) EmployeeRecord get ()

(+)String toString()

Employees
{(-) Employee[] emps //data

(+) Employees(string lastname, firstname;float h,pr,defr)
(+) Employees (EmployeeRecord e)

(+) Employees (Employee e)

(+) add(string lastname, firstname; float h,pr,defr)
(+) add(EmployeeRecord e)

(+) add(Employee e)

(+) delete(string lastname)

(+) delete(int eID)

(+) EmployeeRecord search(int eID)

(+) EmployeeRecord search(string lastname)

(+) sort ()

(+) EmployeeRecord iterate (START)

(+) EmployeeRecord iterate (getNEXT)

(+)String toString()
