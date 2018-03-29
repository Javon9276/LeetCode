SELECT a.Id
FROM Weather a, Weather b
WHERE date_sub(a.Date, INTERVAL 1 DAY) = b.Date
AND a.Temperature > b.Temperature