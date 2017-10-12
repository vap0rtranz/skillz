/* 
a LEFT/RIGHT OUTER JOIN results in the set of ((A + B) - (B - A))  or just  A (or B), aka. the entire members of A and duplicate members of B
a LEFT OUTER JOIN with WHERE results in the set of A - B, aka. the unique members of A (or A, and/or unique members of both A & B)
*/

SELECT * FROM Table_A
FULL OUTER JOIN Table_B
ON Table_A.Name = Table_B.Name
WHERE 
(Table_B.Id IS NULL
OR Table_A.Id IS NULL
)