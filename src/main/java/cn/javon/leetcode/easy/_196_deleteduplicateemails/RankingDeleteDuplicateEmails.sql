delete from Person where Person.Id in (
    select temp.ids from (select p2.Id ids
    from Person p1, Person p2
    where p1.Id < P2.Id and p1.Email = p2.Email) temp
)