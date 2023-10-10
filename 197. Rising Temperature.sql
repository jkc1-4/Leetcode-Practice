

# SELECT T1.Id
# FROM Weather T1
# JOIN Weather T2
# ON T1.Id=(T2.Id+1)
# WHERE T1.Temperature > T2.Temperature;



SELECT
    weather.id AS 'Id'
FROM
    weather
        JOIN
    weather w ON DATEDIFF(weather.recordDate, w.recordDate) = 1
        AND weather.Temperature > w.Temperature
;
