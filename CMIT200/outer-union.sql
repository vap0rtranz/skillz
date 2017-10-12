/* an OUTER JOIN results in the union of tables
*/

SELECT * FROM Table_A
FULL OUTER JOIN Table_B
ON Table_A.Name = Table_B.Name