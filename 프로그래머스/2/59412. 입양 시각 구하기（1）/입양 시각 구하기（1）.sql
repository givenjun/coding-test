-- 코드를 입력하세요
SELECT DATE_FORMAT(datetime, "%H") AS hour, COUNT(*) AS count
  FROM animal_outs
 WHERE DATE_FORMAT(datetime, "%H") BETWEEN '09' and '19'
 GROUP BY DATE_FORMAT(datetime, "%H")
 ORDER BY hour;