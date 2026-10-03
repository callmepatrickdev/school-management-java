🏫 School Management System

A Java-based School Management System designed to manage students, teachers, and courses through a simple console-based application.

This project was built to strengthen my Java programming, Object-Oriented Programming (OOP), collections, user input handling, and software project structure skills.

---

🚀 Features

👨‍🎓 Student Management

- ➕ Add students
- 📋 View all students
- 🔎 View student details
- 🗑️ Remove students
- 📚 Enroll students in courses

👨‍🏫 Teacher Management

- ➕ Add teachers
- 📋 View all teachers
- 🔎 View teacher details
- 🗑️ Remove teachers
- 📖 Assign teachers to courses

📚 Course Management

- ➕ Add courses
- 📋 View all courses
- 🔎 View course details
- 🗑️ Remove courses
- 👨‍🏫 Assign teachers
- 👨‍🎓 Enroll students

---

🛠️ Technologies Used

- ☕ Java
- 🧱 Object-Oriented Programming (OOP)
- 📦 Java Collections — ArrayList
- ⌨️ Scanner / User Input
- 🛡️ Input Validation & Error Handling
- 💻 Eclipse IDE
- 🐙 Git & GitHub

🧠 Java Concepts Demonstrated

This project demonstrates several important Java concepts:

- 🔹 Classes & Objects
- 🔹 Encapsulation
- 🔹 Constructors
- 🔹 Methods
- 🔹 Access Modifiers
- 🔹 "ArrayList"
- 🔹 Loops
- 🔹 Conditional Statements
- 🔹 "switch" statements
- 🔹 Exception Handling
- 🔹 User Input
- 🔹 Object Relationships
- 🔹 Package Organization
- 🔹 Separation of Responsibilities

---

🔗 Object Relationships

The application connects the main objects together:

🏫 SchoolService
      │
      ├── 👨‍🎓 Students
      │       └── 📚 Courses
      │
      ├── 👨‍🏫 Teachers
      │       └── 📚 Courses
      │
      └── 📚 Courses
              ├── 👨‍🏫 Teacher
              └── 👨‍🎓 Students

For example, a student can enroll in a course, while a teacher can be assigned to that course.

---

▶️ How to Run

1️⃣ Clone the repository

git clone https://github.com/yourusername/SchoolManagementSystem.git

2️⃣ Open the project

Open the project in Eclipse IDE or another Java IDE.

3️⃣ Run the application

Navigate to:

src/school/Main.java

Run "Main.java".

4️⃣ Use the menu

The application provides a console menu for managing students, teachers, and courses.

---

📸 Example Menu

====================================
     SCHOOL MANAGEMENT SYSTEM
====================================

========== MENU ==========
1.  Add Student
2.  Add Teacher
3.  Add Course
4.  Assign Teacher to Course
5.  Enroll Student in Course
6.  Display Students
7.  Display Teachers
8.  Display Courses
9.  View Student Details
10. View Teacher Details
11. View Course Details
12. Remove Student
13. Remove Teacher
14. Remove Course
0.  Exit
==========================

---

🎯 Project Goals

The main goals of this project are to:

- 💻 Improve practical Java development skills
- 🧠 Strengthen understanding of OOP
- 🏗️ Learn how to structure a multi-class Java application
- 🔗 Practice relationships between Java objects
- 📦 Work with Java Collections
- 🛠️ Build practical projects for a software development portfolio

---

🔮 Future Improvements

Planned improvements include:

- 🔐 User authentication and login
- 💾 Database integration using MySQL
- 🔌 JDBC integration
- 🌐 REST API using Spring Boot
- 🖥️ Graphical User Interface
- 📊 Student performance and grade management
- 💰 School fee management
- 📅 Attendance management
- 🔍 Advanced search and filtering

---

👨‍💻 Author

Patrick Yankey

💻 Java Developer | Software Development & AI Enthusiast

This project is part of my journey toward becoming a professional software developer.

---

⭐ Support

If you find this project useful or interesting, feel free to ⭐ star the repository and check out my other Java projects!

---

📌 Project Status

🟢 Active Development

More features and improvements will be added as I continue developing my Java and backend development skills.# school-management-java
