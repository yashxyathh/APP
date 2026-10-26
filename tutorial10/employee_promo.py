employees = {
    "Ravi": {"experience": 6, "training": "Completed", "rating": 5},
    "Priya": {"experience": 3, "training": "Completed", "rating": 4},
    "Kumar": {"experience": 8, "training": "Not Completed", "rating": 5},
    "Meena": {"experience": 7, "training": "Completed", "rating": 4}
}

def promotion_eligible(employee):
    return (
        employee["experience"] >= 5
        and employee["training"] == "Completed"
        and employee["rating"] >= 4
    )

result = [
    name for name, details in employees.items()
    if promotion_eligible(details)
]

print("Eligible Employees:", result)