from functools import reduce

students = [("Asha", 78), ("Bilal", 45), ("Chitra", 98),
            ("Dev", 50), ("Esha", 49), ("Farhan", 100)]

passed = list(filter(lambda s: s[1] >= 50, students))

with_grace = list(map(lambda s: (s[0], min(s[1] + 5, 100)), students))


total = reduce(lambda acc, s: acc + s[1], with_grace, 0)

print("Passed:", passed)
print("After grace:", with_grace)
print("Total:", total)
