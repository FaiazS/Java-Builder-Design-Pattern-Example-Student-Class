# Java-Builder-Design-Pattern-Example-Student-Class

# 👷‍♂️ Java Builder Design Pattern Example — Student Class

This project demonstrates how to implement the **Builder Design Pattern** in Java using a simple example of a `Student` class.

The Builder Pattern is a **creational design pattern** that lets you construct complex objects step-by-step in a clean, readable, and flexible way. It is especially useful when your class has **many optional fields** or requires **validation during object creation**.

---

---

## 🧠 Concepts Used

- ✅ Builder Design Pattern (Creational Pattern)
- ✅ Method Chaining
- ✅ Static Inner Classes
- ✅ Encapsulation and Private Fields
- ✅ Object Validation
- ✅ Static Factory Methods

---

## 📌 Features

- Create `Student` objects using a fluent, readable syntax.
- Set only the fields you care about — skip the rest.
- Built-in validation (e.g., age cannot exceed 100).
- Fully extensible — easy to add more fields or constraints.

---

## 🚀 How to Use

### 🔨 Step-by-Step Student Creation:

```java
public class Main {
    public static void main(String[] args) {
        Student student = Student.studentClassBuilder()
                                 .setName("Faiaz Ahmed")
                                 .setPhoneNumber("1234567890")
                                 .setAge(25)
                                 .setBatch("Scaler March 2025")
                                 .setPsp(93.4)
                                 .build();

        System.out.println("Student object created successfully!");
    }
}

🏗️ Class Overview
Student.java
Student: The final model class with fields like name, phoneNumber, age, etc.

StudentClassBuilder: A static inner builder class used to construct Student objects step-by-step.

studentClassBuilder(): A static factory method to initiate the builder easily.

✅ Advantages of Using Builder Pattern

Feature	Benefit
Method Chaining	Clean and intuitive syntax
Step-by-step construction	Flexible and readable
Validation logic	Prevent invalid object creation
No telescoping constructors	Avoid multiple constructors with many parameters

🧩 When Should You Use This Pattern?

When your class has many optional parameters.

When constructor overloading becomes messy.

When you want to validate or control the object creation process.

When you want to make object creation more readable and maintainable.

