SET SQL_SAFE_UPDATES=0;
SET FOREIGN_KEY_CHECKS=0;


DELETE FROM department;
DELETE FROM project;
DELETE FROM employee;
DELETE FROM projectsofemployees;

INSERT INTO department  VALUE ('IT');
INSERT INTO department  VALUE ('Marketing'); 
INSERT INTO department  VALUE ('Financial');
INSERT INTO department  VALUE ('Purchase'); 
INSERT INTO department  VALUE ('HR'); 
INSERT INTO department  VALUE ('Managment'); 

INSERT INTO project VALUES ('Wroclaw regional hospital', 'internal');
INSERT INTO project VALUES ('ETH Zurych', 'external'); 
INSERT INTO project VALUES ('Millenium bridge in Wroclaw', 'internal');
INSERT INTO project VALUES ('Wroclaw cdepartmentity library', 'internal'); 
INSERT INTO project VALUES ('Eiffelt tower', 'external');
INSERT INTO project VALUES ('Strzegomska Street in wroclaw', 'internal');
INSERT INTO project VALUES ('Lind chocolate factoy in warsaw', 'internal');
INSERT INTO project VALUES ('Zurcher kantonal bank', 'external');

INSERT INTO employee VALUES (3, '1977-06-01', 'Jacenty' , 'Honczar' ,'77060106421','Financial');
INSERT INTO employee VALUES (4, '1980-02-20' , 'Anzelm' , 'Skrętek' , '80022001102' ,'Financial');
INSERT INTO employee VALUES (5, '1966-05-28' , 'Józef' , 'Sieja' , '66052816585' ,'Managment' );
INSERT INTO employee VALUES (6, '1961-02-28' , 'Małgorzata' , 'Przygoda' ,'61022806959' , 'Marketing' );
INSERT INTO employee VALUES (7, '1961-02-28', 'Charyzjusz' , 'Mikuch' ,'78030123923' , 'Financial' );
INSERT INTO employee VALUES (8, '1992-03-01' , 'Zbysław' , 'Hrzelak' , '64062621807' ,'Purchase' );
INSERT INTO employee VALUES (9, '1992-09-01' , 'Zbysława' , 'Hrzelak' , '64062621507' ,'Purchase' );
INSERT INTO employee VALUES (10, '1989-06-20' , 'Damazy' , 'Pierzchalski' ,'68071306911' , 'Managment' );
INSERT INTO employee VALUES (11, '1989-06-29' , 'Sabina' , 'Hockowska' , '89062911389' ,null );


INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary) VALUES (1, 3, 'Millenium bridge in Wroclaw' , '2008-02-15' , '2009-06-30', 'PL', 800);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (2, 7, 'ETH Zurych' , '2016-01-11' , null,  'DEV', 900);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (3, 6, 'Millenium bridge in Wroclaw' , '2008-07-15' , '2009-06-30', 'TCD', 500);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (4, 3, 'Millenium bridge in Wroclaw' , '2011-02-15' , null, 'FCD', 500);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (5, 8, 'Millenium bridge in Wroclaw' , '2008-02-15' , null, 'TCD', 500);
INSERT INTO projectsofemployees(id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary) VALUES (6, 3, 'Millenium bridge in Wroclaw' , '2000-02-15' , '2001-06-30', 'PL', 800);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (7, 9, 'Eiffelt tower' , '2010-02-15' ,  null, 'PL', 700);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (8, 9, 'ETH Zurych' , '2015-11-15' , '2015-12-30',  'PL', 800);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (9, 9, 'Wroclaw cdepartmentity library' , '2008-02-15' , '2016-01-30',  'PL', 800);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (10, 9, 'Zurcher kantonal bank' , '2002-01-11' , null,  'FCD', 500);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (11, 7, 'ETH Zurych' , '2000-11-15' , '2002-12-30',  'PL', 800);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (12, 7, 'ETH Zurych' , '2008-02-15' , '2014-01-30',  'TCD', 500);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (13, 10, 'Wroclaw cdepartmentity library' , '2000-11-15' , '2002-12-30',  'DEV', 900);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (14, 10, 'Wroclaw cdepartmentity library' , '2013-02-15' , '2014-01-30',  'TCD', 700);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (15, 10, 'ETH Zurych' , '2008-02-15' , null, 'PL', 3000);
INSERT INTO projectsofemployees (id_projects_of_employees,id_employee,project_name, date_start, date_stop, role, daily_salary)VALUES (16, 3, 'ETH Zurych' , '2013-02-15' , null, 'TCD', 900);




























