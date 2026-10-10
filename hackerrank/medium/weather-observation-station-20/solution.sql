/*
Enter your query here.
*/
SELECT ROUND(
    (
        SELECT AVG(LAT_N)
        FROM (
            SELECT LAT_N,
                   ROW_NUMBER() OVER (ORDER BY LAT_N) AS rn,
                   COUNT(*) OVER () AS total_rows
            FROM STATION
        ) AS ranked
        WHERE rn IN (
            FLOOR((total_rows + 1) / 2),
            FLOOR((total_rows + 2) / 2)
        )
    ), 4
);
