-- 코드를 입력하세요
SELECT YEAR(O.sales_date), MONTH(O.sales_date), U.gender, COUNT(DISTINCT U.user_id) as users
  FROM user_info U, online_sale O
 WHERE U.user_id = O.user_id AND U.gender IS NOT NULL
 GROUP BY YEAR(O.sales_date), MONTH(O.sales_date), U.gender
 ORDER BY YEAR(O.sales_date), MONTH(O.sales_date), U.gender;