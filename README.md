# CodeAlpha_Java_Programming_StudentManager
# 🎓 Student Grade Management System

A Java-based console application developed using Object-Oriented Programming (OOP) concepts to manage student academic records efficiently.<br>

The system allows users to:<br>

✔ Add student details<br>
✔ Store marks for multiple subjects<br>
✔ View student records<br>
✔ Calculate average marks<br>
✔ Find maximum marks<br>
✔ Find minimum marks<br>
✔ Generate complete student reports<br>

---

## 📌 Overview

The **Student Grade Management System** is designed to simplify the process of managing student performance records.<br>

This project uses Java collections (`ArrayList`) and follows OOP principles such as:<br>

- Encapsulation<br>
- Classes and Objects<br>
- Constructors<br>
- Method Implementation<br>
- Modular Programming<br>

The application provides a menu-driven interface where users can select different operations through numbered choices.<br>

---

## ✨ Features

- Add student details<br>
- Store marks for multiple subjects<br>
- View all student records<br>
- Calculate average marks<br>
- Find maximum marks<br>
- Find minimum marks<br>
- Generate complete reports<br>
- Menu-based selection system<br>
- Dynamic storage using ArrayList<br>
- Multiple classes following OOP principles<br>

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Programming Language |
| ArrayList | Dynamic Data Storage |
| Scanner | User Input Handling |
| OOP Concepts | Program Design |
| VS Code / IntelliJ / Eclipse | Development Environment |

---

## 📂 Project Structure

```text
StudentGradeManagement/
│
├── Student.java
├── GradeManager.java
├── Main.java
└── README.md
```

---

## 📄 File Description

### 1. Student.java

Responsible for:<br>

- Storing student details<br>
- Storing marks<br>
- Calculating average marks<br>
- Finding maximum marks<br>
- Finding minimum marks<br>
- Generating reports<br>

Methods included:

```java
addMarks()
calculateAverage()
getMaximumMarks()
getMinimumMarks()
generateReport()
displayStudent()
```

---

### 2. GradeManager.java

Responsible for:<br>

- Managing all student operations<br>
- Adding students<br>
- Viewing students<br>
- Generating reports<br>
- Calculating averages<br>
- Displaying highest and lowest marks<br>

Uses:

```java
ArrayList<Student>
```

---

### 3. Main.java

Responsible for:<br>

- Displaying menu options<br>
- Accepting user input<br>
- Calling GradeManager methods<br>
- Running the application<br>

---

## ▶ How to Run the Project

### Step 1: Install Java

Download and install Java JDK.<br>

### Step 2: Clone Repository

```bash
git clone https://github.com/your-username/StudentGradeManagement.git
```

### Step 3: Open Project Folder

```bash
cd StudentGradeManagement
```

### Step 4: Compile Java Files

```bash
javac *.java
```

### Step 5: Run Program

```bash
java Main
```

---

## 🖥 Sample Output

```text
====== Student Grade Management System ======

1. Add Student
2. View Students
3. Calculate Average
4. Maximum Marks
5. Minimum Marks
6. Generate Report
7. Exit

=============================================

Enter Your Choice : 1

Enter Student Name : Sahithi

Enter Number of Subjects : 4

Enter Mark 1 : 85
Enter Mark 2 : 90
Enter Mark 3 : 78
Enter Mark 4 : 95

Student Added Successfully!
```

Report:

```text
========== STUDENT REPORT ==========

Student Name : Sahithi

Marks : [85,90,78,95]

Average Marks : 87.0

Maximum Marks : 95

Minimum Marks : 78

====================================
```

---

## 📚 Concepts Learned

### Core Java Concepts

- Classes and Objects<br>
- Constructors<br>
- Methods<br>
- Loops<br>
- Conditional Statements<br>
- Scanner Class<br>
- ArrayList<br>

### OOP Concepts

- Encapsulation<br>
- Object-Oriented Programming<br>
- Modular Programming<br>
- Code Reusability<br>

### Programming Concepts

- Menu-driven applications<br>
- Dynamic data handling<br>
- Report generation<br>
- User interaction systems<br>

---

## 🚀 Future Improvements

Future enhancements for this project may include:<br>

- GUI implementation using Java Swing<br>
- Database integration using MySQL<br>
- Login authentication system<br>
- Student search functionality<br>
- Update/Delete student records<br>
- Percentage and grade calculation<br>
- Attendance management<br>
- File handling for permanent storage<br>
- PDF/Excel report generation<br>

---

## 👩‍💻 Author

**Name:** C Sahithi<br>

**Project Type:** Mini Project<br>

**Technology:** Java<br>

---

## ⭐ Repository Support

If you found this project useful:<br>

Give this repository a ⭐ on GitHub
