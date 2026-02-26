WITH RECURSIVE hours AS (
    SELECT 0 AS hour
    UNION ALL
    SELECT hour + 1
    FROM hours
    WHERE hour < 23
)

SELECT H.hour as hour, COUNT(A.datetime)
  FROM animal_outs A RIGHT JOIN hours H
    ON HOUR(A.datetime) = H.hour
 GROUP BY H.hour
 ORDER BY H.hour;
 