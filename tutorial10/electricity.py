from functools import reduce

consumption = [8, 12, 15, 7, 11]

def bill(units):
    return units * 6

exceeded = list(filter(lambda x: x > 10, consumption))
cost = list(map(bill, consumption))
total = reduce(lambda a, b: a + b, consumption, 0)

print("Consumption Above 10 Units:", exceeded)
print("Daily Electricity Cost:", cost)
print("Total Consumption:", total)
print("Total Bill:", sum(cost))