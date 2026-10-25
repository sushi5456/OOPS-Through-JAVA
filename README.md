# Java Object-Oriented Programming (OOP)

A comprehensive collection of Java programs demonstrating the fundamental concepts of **Object-Oriented Programming (OOP)**. This repository is created for learning, practicing, and understanding OOP principles through simple, practical, and well-organized Java examples.

Whether you're a beginner learning Java or a student revising OOP concepts, this repository will help you understand how object-oriented programming works in Java.

## 📌 Table of Contents

- [About the Repository](#about-the-repository)
- [What is OOP?](#what-is-oop)
- [OOP Concepts Covered](#oop-concepts-covered)
- [Repository Structure](#repository-structure)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [How to Run the Programs](#how-to-run-the-programs)
- [Learning Objectives](#learning-objectives)
- [Key Features](#key-features)
- [Who Is This Repository For?](#who-is-this-repository-for)
- [Contributing](#contributing)
- [Future Improvements](#future-improvements)
- [Author](#author)
- [License](#license)

## 📖 About the Repository

This repository contains Java programs that explain and demonstrate various Object-Oriented Programming concepts with practical examples.

The main goal is to strengthen the understanding of OOP by implementing its concepts in Java rather than learning only through theory.

Each program focuses on a specific concept and can be compiled and executed independently, depending on its implementation.

### Why This Repository?

- To understand OOP concepts through practical Java programs.
- To improve Java programming and problem-solving skills.
- To practice writing reusable, modular, and maintainable code.
- To build a strong foundation for advanced Java development.
- To prepare for technical interviews, coding assessments, and academic examinations.

## 🧠 What Is Object-Oriented Programming (OOP)?

Object-Oriented Programming is a programming paradigm that organizes software around **objects**, which combine data (fields) and behavior (methods).

Java is primarily an object-oriented programming language. It supports classes, objects, inheritance, polymorphism, abstraction, and encapsulation.

OOP helps developers create applications that are modular, reusable, maintainable, and easier to extend.

## 📚 OOP Concepts Covered

### 1. Classes and Objects

- Understanding classes and objects.
- Creating objects using the `new` keyword.
- Defining fields and methods.
- Accessing object members.
- Understanding instance variables and methods.

### 2. Constructors

- Default constructors.
- No-argument constructors.
- Parameterized constructors.
- Constructor overloading.
- Constructor chaining using `this()` and `super()`.

### 3. Encapsulation

- Binding data and methods into a single unit.
- Using private data members.
- Implementing getters and setters.
- Controlling access to class members.
- Protecting data through controlled access.

### 4. Inheritance

- Understanding parent and child classes.
- Single inheritance.
- Multilevel inheritance.
- Hierarchical inheritance.
- Using the `extends` keyword.
- Using `super` to access parent-class members.
- Understanding method overriding.

*Note: Java does not support multiple inheritance of classes, but it supports implementing multiple interfaces.*

### 5. Polymorphism

- Compile-time polymorphism.
- Method overloading.
- Runtime polymorphism.
- Method overriding.
- Dynamic method dispatch.
- Using parent-class references to refer to child-class objects.

### 6. Abstraction

- Understanding abstraction.
- Abstract classes and abstract methods.
- Implementing interfaces.
- Hiding implementation details.
- Using abstraction to design flexible programs.

### 7. Interfaces

- Declaring and implementing interfaces.
- Implementing multiple interfaces.
- Understanding interface references.
- Default and static interface methods.
- Using interfaces to define contracts.

### 8. Access Modifiers

- `public`
- `private`
- `protected`
- Default (package-private) access.

Understanding access modifiers helps control the visibility and accessibility of classes, variables, constructors, and methods.

### 9. The `this` and `super` Keywords

- Referring to the current object using `this`.
- Resolving naming conflicts between fields and parameters.
- Calling constructors within the same class.
- Accessing parent-class members using `super`.
- Calling parent-class constructors.

### 10. Static and Final Keywords

- Static variables.
- Static methods.
- Static initialization blocks.
- Final variables.
- Final methods.
- Final classes.
- Understanding the differences between static and instance members.

### 11. Association, Aggregation, and Composition

- Understanding relationships between classes.
- Association between independent objects.
- Aggregation as a weak ownership relationship.
- Composition as a stronger ownership relationship.
- Modeling real-world relationships using Java classes.

### 12. Object Class Methods

- `toString()`
- `equals()`
- `hashCode()`
- Understanding object comparison.
- Overriding inherited methods.

### 13. Exception Handling in OOP

- Using `try`, `catch`, and `finally`.
- Throwing exceptions using `throw`.
- Declaring exceptions using `throws`.
- Checked and unchecked exceptions.
- Creating custom exception classes.

### 14. Additional Java Concepts

Depending on the programs included in the repository, this section may cover:

- Packages and imports.
- Upcasting and downcasting.
- The `instanceof` operator.
- Inner classes.
- Anonymous classes.
- Enums.
- Basic SOLID principles.
- Real-world applications of OOP.

## 📂 Repository Structure

The repository can be organized by topic to make programs easier to find and understand.

```text
Java-OOP/
│
├── README.md
│
├── 01-Classes-and-Objects/
│   ├── Student.java
│   └── Employee.java
│
├── 02-Constructors/
│   ├── DefaultConstructor.java
│   └── ParameterizedConstructor.java
│
├── 03-Encapsulation/
│   └── BankAccount.java
│
├── 04-Inheritance/
│   ├── SingleInheritance.java
│   ├── MultilevelInheritance.java
│   └── HierarchicalInheritance.java
│
├── 05-Polymorphism/
│   ├── MethodOverloading.java
│   └── MethodOverriding.java
│
├── 06-Abstraction/
│   └── AbstractClassExample.java
│
├── 07-Interfaces/
│   └── InterfaceExample.java
│
├── 08-Access-Modifiers/
│   └── AccessModifiersExample.java
│
├── 09-This-and-Super/
│   └── ThisSuperExample.java
│
├── 10-Static-and-Final/
│   └── StaticFinalExample.java
│
├── 11-Relationships/
│   ├── AssociationExample.java
│   ├── AggregationExample.java
│   └── CompositionExample.java
│
└── 12-Exception-Handling/
    └── CustomExceptionExample.java
```

*Note: This is a suggested folder structure. Replace the example filenames and folders with the actual files present in your repository.*

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Java Development Kit (JDK):** JDK 8 or later, depending on the features used by individual programs.
- **Editor/IDE:** Visual Studio Code, IntelliJ IDEA, Eclipse, or any text editor.
- **Version Control:** Git
- **Repository Hosting:** GitHub

## ⚙️ Prerequisites

Before running the programs, ensure you have:

1. Java Development Kit (JDK) installed.
2. A terminal or command prompt.
3. A code editor or IDE of your choice.
4. Basic knowledge of Java syntax and programming fundamentals.

Verify your Java installation:

```bash
java -version
javac -version
```

If both commands display version information, Java is available from your terminal.

## ▶️ How to Run the Programs

### Step 1: Clone the Repository

Replace `YOUR_USERNAME` with your GitHub username.

```bash
git clone https://github.com/YOUR_USERNAME/Java-OOP.git
```

### Step 2: Navigate to the Repository

```bash
cd Java-OOP
```

### Step 3: Navigate to a Program Folder

For example:

```bash
cd 01-Classes-and-Objects
```

### Step 4: Compile the Java Program

For a file named `Student.java`:

```bash
javac Student.java
```

### Step 5: Execute the Program

If the class contains a `main()` method and is named `Student`:

```bash
java Student
```

### Important Notes

- The Java filename and public class name must match.
- Run the commands from the appropriate directory.
- If a program uses multiple source files, compile the required files together or use the Java compiler's source discovery where applicable.
- If packages are declared, compile and run the program from the correct package root.
- Some examples may require command-line input.

## 🎯 Learning Objectives

By exploring this repository, you will learn how to:

- Understand the core principles of Object-Oriented Programming.
- Design classes and create objects in Java.
- Implement inheritance and reuse existing code.
- Apply polymorphism to write flexible programs.
- Use encapsulation to protect data.
- Implement abstraction using abstract classes and interfaces.
- Understand relationships between objects.
- Handle exceptions appropriately.
- Write modular, reusable, and maintainable Java code.
- Apply OOP principles to simple real-world scenarios.

## ✨ Key Features

- **Beginner-friendly examples:** Programs designed to help explain individual concepts.
- **Concept-wise organization:** Files can be grouped into folders based on OOP topics.
- **Hands-on learning:** Focuses on practical implementation.
- **Easy execution:** Most standalone programs can be compiled and run from the terminal.
- **Interview preparation:** Useful for revising common Java OOP topics.
- **Expandable structure:** New programs and advanced topics can be added over time.

## 👨‍💻 Who Is This Repository For?

This repository is useful for:

- Students learning Java and OOP.
- Beginners practicing object-oriented programming.
- Developers revising Java fundamentals.
- Candidates preparing for Java technical interviews.
- Anyone who wants to understand OOP through code examples.

## 🤝 Contributing

Contributions and suggestions are welcome!

If you want to improve this repository:

1. Fork the repository.
2. Create a new branch for your changes.
3. Add a new Java example or improve an existing program.
4. Test your code before submitting it.
5. Open a pull request with a clear description of your changes.

Please keep examples readable, focused, and consistent with Java naming conventions.

## 🚀 Future Improvements

Possible future additions include:

- More real-world OOP examples.
- Mini-projects demonstrating multiple OOP principles together.
- Sample outputs for each program.
- UML class diagrams.
- Java interview questions and answers.
- Advanced Java topics and design patterns.
- Unit tests for selected examples.

## 👤 Author

**Your Name**

- GitHub: [YOUR_USERNAME](https://github.com/sushi5456)
- Repository: [Java-OOP](https://github.com/YOUR_USERNAME/Java-OOP)

Feel free to explore the programs, practice the examples, and use this repository as a reference while learning Java Object-Oriented Programming.



⭐ If you find this repository helpful, consider giving it a star on GitHub!

**Happy Coding! ☕**
