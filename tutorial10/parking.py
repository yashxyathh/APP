parking = {
    "S1": {"type": "Car", "availability": "Available"},
    "S2": {"type": "Bike", "availability": "Occupied"},
    "S3": {"type": "Car", "availability": "Available"},
    "S4": {"type": "Bike", "availability": "Available"},
    "S5": {"type": "Car", "availability": "Occupied"}
}

def available_slots(vehicle_type):
    return [
        slot for slot, details in parking.items()
        if details["type"] == vehicle_type
        and details["availability"] == "Available"
    ]

print("Available Car Slots:", available_slots("Car"))