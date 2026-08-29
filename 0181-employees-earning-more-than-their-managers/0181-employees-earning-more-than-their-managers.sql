SELECT a.name AS Employee
FROM employee AS a
JOIN employee AS b
ON a.managerId = b.id
WHERE a.salary > b.salary;
