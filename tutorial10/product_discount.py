def discount(price):
    return price * 0.8 if price > 1000 else price

prices = [500, 1200, 2000, 800, 1500]

eligible = list(filter(lambda p: p > 1000, prices))
discounted = list(map(discount, prices))

print("Eligible Products:", eligible)
print("Discounted Prices:", discounted)