students = {
    "Arun": {"Python": "Pass", "DataStructures": "Pass"},
    "Bala": {"Python": "Pass", "DataStructures": "Fail"},
    "Charan": {"Python": "Pass", "DataStructures": "Pass"},
    "Divya": {"Python": "Fail", "DataStructures": "Pass"}
}

def eligible(student):
    return (
        student["Python"] == "Pass"
        and student["DataStructures"] == "Pass"
    )

result = [name for name, marks in students.items() if eligible(marks)]

print("Eligible Students:", result)