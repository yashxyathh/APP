# Java OOP Tutorials

A collection of Java exercises and small applications created while learning object-oriented programming. The tutorials progress from basic classes and methods to inheritance, abstraction, interfaces, packages, and multi-class applications.

## Contents

| Tutorial | Topics and examples |
| --- | --- |
| `tutorial1` | Basic Java programs for student information, arithmetic operations, area calculation, swapping values, highest score, even or odd, pass or fail, and salary calculation |
| `tutorial2` | Classes, objects, constructors, fields, methods, and simple calculations |
| `tutorial3` | Basic programs for areas, attendance, employees, showrooms, and supermarkets |
| `tutorial4` | Object-oriented applications for amusement parks, employee management, hospital billing, and student performance |
| `tutorial5` | Encapsulation, inheritance, abstraction, interfaces, payment systems, shopping, banking, and ranking |
| `tutorial6` | Packages, account types, course and student management, banking, document management, rentals, and payments |
| `tutorial7` | Package-based college, course, doctor, patient, and student examples |
| `tutorial8` | Concurrent tasks, login, food delivery, hospital, text processing, and student registration examples |
| `tutorial9` | Search, registration, employee portal, library management, product store, and service-cost examples |
| `tutorial10` | Python functional-programming exercises using `filter`, `map`, `reduce`, lambda functions, and dictionary-based data |

## Project Structure

```text
class/
├── tutorial1/   Basic Java programming exercises
├── tutorial2/   Basic OOP exercises
├── tutorial3/   Small Java applications
├── tutorial4/   Class-based domain applications
├── tutorial5/   Inheritance, abstraction, and interfaces
├── tutorial6/   Packages and larger examples
├── tutorial7/   Multi-package examples
├── tutorial8/   Concurrent and task-based examples
├── tutorial9/   Java application examples
└── tutorial10/  Python functional-programming exercises
```

## Requirements

- Java Development Kit (JDK) 8 or newer
- Python 3.8 or newer for the `tutorial10` exercises
- A Java editor or IDE such as VS Code, IntelliJ IDEA, or Eclipse

Check that Java is installed:

```bash
java -version
javac -version
```

## Compile and Run

Most files are standalone examples. From the directory containing a file, compile it and run its class:

```bash
javac tutorial2/Q1.java
java -cp tutorial2 Q1
```

Some source files contain supporting classes or use packages. Compile the complete example together and use the fully qualified class name when running it. For example:

```bash
javac -d out tutorial6/*.java tutorial6/banking/*.java tutorial6/course/*.java tutorial6/payment/*.java tutorial6/student/*.java
java -cp out Banking
```

The public class name, package declaration, and available `main` method determine the exact command for each example.

### Run the Python exercises

The `tutorial10` directory contains one standalone Python file for each exercise:

| File | Description |
| --- | --- |
| [`student.py`](tutorial10/student.py) | Selects students who passed both required subjects |
| [`product_discount.py`](tutorial10/product_discount.py) | Filters eligible products and calculates discounted prices |
| [`parking.py`](tutorial10/parking.py) | Finds available parking slots by vehicle type |
| [`employee_promo.py`](tutorial10/employee_promo.py) | Selects employees eligible for promotion |
| [`employee.py`](tutorial10/employee.py) | Filters employees, revises salaries, and calculates the salary total |
| [`electricity.py`](tutorial10/electricity.py) | Calculates electricity costs and total consumption |
| [`clg.py`](tutorial10/clg.py) | Filters passed students, applies grace marks, and totals the marks |

Run any exercise from the repository root with:

```bash
python tutorial10/student.py
```

Replace `student.py` with any other filename in the table to run a different exercise.

## Learning Goals

- Create and use classes and objects
- Apply encapsulation and constructors
- Use inheritance and method overriding
- Design abstract classes and interfaces
- Organize related classes into packages
- Build small applications from multiple collaborating classes
- Use Python functional programming with lambda expressions and higher-order functions