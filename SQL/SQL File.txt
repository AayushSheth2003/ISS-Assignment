use bus;
CREATE TABLE SampleTable (
    ID INT PRIMARY KEY,
    Column1 VARCHAR(50),
    Column2 INT,
    Column3 DECIMAL(10,2),
    Column4 DATE,
    Column5 BOOLEAN,
    Column6 VARCHAR(100),
    Column7 INT,
    Column8 DECIMAL(8,3),
    Column9 DATE,
    Column10 BOOLEAN
);


-- Insert more rows into the table
INSERT INTO SampleTable VALUES
(3, 'Value3', 30, 45.25, '2022-01-05', TRUE, 'Text3', 300, 9.789, '2022-01-06', FALSE),
(4, 'Value4', 40, 55.75, '2022-01-07', FALSE, 'Text4', 400, 10.012, '2022-01-08', TRUE),
(5, 'Value5', 50, 65.50, '2022-01-09', TRUE, 'Text5', 500, 11.345, '2022-01-10', FALSE),
(6, 'Value6', 60, 75.25, '2022-01-11', FALSE, 'Text6', 600, 12.678, '2022-01-12', TRUE),
(7, 'Value7', 70, 85.75, '2022-01-13', TRUE, 'Text7', 700, 13.901, '2022-01-14', FALSE),
(8, 'Value8', 80, 95.50, '2022-01-15', FALSE, 'Text8', 800, 14.234, '2022-01-16', TRUE),
(9, 'Value9', 90, 105.25, '2022-01-17', TRUE, 'Text9', 900, 15.567, '2022-01-18', FALSE),
(10, 'Value10', 100, 115.75, '2022-01-19', FALSE, 'Text10', 1000, 16.890, '2022-01-20', TRUE);

-- Add more rows as needed...

-- SELECT all rows from the table
SELECT * FROM SampleTable;

-- SELECT distinct values from Column1
SELECT DISTINCT Column1 FROM SampleTable;

-- SELECT rows where Column2 is greater than 15
SELECT * FROM SampleTable WHERE Column2 > 15;

-- Select rows where Column6 starts with 'Text'
SELECT * FROM SampleTable WHERE Column6 LIKE 'Text%';

-- Select rows where Column1 contains 'Value'
SELECT * FROM SampleTable WHERE Column1 LIKE '%Value%';

-- Select rows where Column7 ends with '00'
SELECT * FROM SampleTable WHERE Column7 LIKE '%00';

-- Select rows where Column6 contains 'ext' in any position
SELECT * FROM SampleTable WHERE Column6 LIKE '%ext%';


-- SELECT rows where Column1 is 'Value1' or Column1 is 'Value2'
SELECT * FROM SampleTable WHERE Column1 IN ('Value1', 'Value2');

-- SELECT all rows where Column3 is greater than ALL values in Column8
SELECT * FROM SampleTable WHERE Column3 > ALL (SELECT Column8 FROM SampleTable);

-- INNER JOIN example
SELECT * FROM SampleTable A INNER JOIN SampleTable B ON A.ID = B.ID;

-- LEFT JOIN example
SELECT * FROM SampleTable A LEFT JOIN SampleTable B ON A.ID = B.ID;

-- RIGHT JOIN example
SELECT * FROM SampleTable A RIGHT JOIN SampleTable B ON A.ID = B.ID;

-- DROP the table
DROP TABLE SampleTable;

-- Group by Column1 and calculate the average of Column2 for each group
SELECT Column1, AVG(Column2) AS AvgColumn2
FROM SampleTable
GROUP BY Column1;

-- Group by Column5 (boolean values) and count the number of rows for each group
SELECT Column5, COUNT(*) AS RowCount
FROM SampleTable
GROUP BY Column5;

-- Group by Column8 (decimal values) and filter groups with an average greater than 10
SELECT Column8, AVG(Column2) AS AvgColumn2
FROM SampleTable
GROUP BY Column8
HAVING AVG(Column2) > 10;

-- Group by Column9 (date values) and filter groups with more than 2 rows
SELECT Column9, COUNT(*) AS RowCount
FROM SampleTable
GROUP BY Column9
HAVING COUNT(*) > 2;

-- Group by Column1 and Column5, calculate the average of Column2 for each group, and filter groups with an average great


-- Recreate the table with a new column
CREATE TABLE SampleTable (
    ID INT PRIMARY KEY,
    NewColumn VARCHAR(50)
);

-- ALTER TABLE to add a new column
ALTER TABLE SampleTable ADD COLUMN AnotherNewColumn INT;

-- Example of a stored procedure
DELIMITER //
CREATE PROCEDURE YourStoredProcedure(IN param1 INT, IN param2 INT, OUT result INT)
BEGIN
    -- Your logic here
    SET result = param1 + param2;
END //
DELIMITER ;

-- Use CallableStatement to call the stored procedure
CALL YourStoredProcedure(5, 10, @result);
SELECT @result AS Result;

-- Example of a stored SQL query
DELIMITER //
CREATE PROCEDURE GetSampleData()
BEGIN
    -- Your query logic here
    SELECT * FROM SampleTable;
END //
DELIMITER ;

-- Call the stored SQL query
CALL GetSampleData();

