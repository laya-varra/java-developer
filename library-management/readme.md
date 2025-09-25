# 📚 Library Management System (Java OOP Project)

## 🔹 Project Overview

This project is a **console-based Library Management System** developed in **Java** using **Object-Oriented Programming (OOP) principles**.
The system manages **books and users**, and provides functionality to **add books, add users, issue books, return books, and display records**.

---

## 🔹 What I Did in This Project

1. **Designed Classes with OOP Concepts**

    * Created `Book`, `User`, and `Library` classes to represent real-world entities.
    * Applied **encapsulation** by keeping fields private and exposing getters/setters.
    * Used **composition** (`User` contains books, `Library` manages users and books).

2. **Implemented Book Management**

    * Added functionality to create and store books in an `ArrayList`.
    * Provided a way to view all available and issued books.

3. **Implemented User Management**

    * Created users with unique IDs and names.
    * Maintained a list of books issued to each user.

4. **Added Library Operations**

    * Enabled issuing of a book to a user (with availability check).
    * Allowed returning of issued books.
    * Ensured proper validation (e.g., book not found, already issued, user not found).

5. **Built a CLI (Command Line Interface)**

    * Developed a text-based menu system with options:

      ```
      1. Add Book
      2. View Books
      3. Add User
      4. View Users
      5. Issue Book
      6. Return Book
      7. Exit
      ```
    * Handled user input using **Scanner**.
    * Displayed real-time updates on book and user records.

---

## 🔹 Sample Workflow I Achieved

1. Added books like *Java Basics* and *OOP in Practice*.
2. Added users such as *Alice*.
3. Issued *Java Basics* to *Alice* (book marked as issued).
4. Viewed users → showed Alice with issued book count.
5. Returned the book → book became available again.

---

## 🔹 Outcome / Learning

By completing this project, I:

* Strengthened my understanding of **Java OOP concepts**.
* Learned how to design and structure a **multi-class project**.
* Practiced using **ArrayList** for managing dynamic collections of objects.
* Built a **real-world inspired mini-application** that simulates a library system.
* Enhanced skills in **problem-solving and code organization**.

---

## 🔹 How to Run

1. Save all files (`Book.java`, `User.java`, `Library.java`, `Main.java`) in one folder.
2. Compile:

   ```bash
   javac *.java
   ```
3. Run:

   ```bash
   java Main
   ```