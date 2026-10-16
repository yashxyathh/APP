from functools import reduce

employees = [("Ravi", 35000), ("Meena", 42000), ("Arun", 39999),
             ("Sita", 40000), ("Kiran", 28000), ("Priya", 55000)]

eligible = list(filter(lambda e: e[1] < 40000, employees))

revised = list(map(lambda e: (e[0], e[1] * 1.10 if e[1] < 40000 else e[1]), employees))

total = reduce(lambda acc, e: acc + e[1], revised, 0)

print("Eligible:", eligible)
print("Revised:", revised)
print("Total:", round(total, 2))