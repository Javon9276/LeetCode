select distinct w2.Id as Id
from Weather w1, Weather w2
where datediff(w2.Date, w1.Date) = 1 and w2.Temperature > w1.Temperature;