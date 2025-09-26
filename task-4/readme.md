# 📒 Notes App (Java File I/O)

## 📌 Objective

A simple **text-based Notes Manager** that allows users to **write and view notes** using Java File I/O.
This project demonstrates how to **persist data** with `FileWriter`, `FileReader`, and `BufferedReader`.

---

## 🛠️ Tools & Technologies

* **Java**
* **VS Code** (or any Java IDE)
* **Terminal/Command Prompt**

---

## 📂 Project Structure

```
NotesApp.java   → Main Java program
notes.txt       → Auto-created file to store notes
```

---

## 🚀 Features

1. **Write Notes**

    * Enter any note and save it to `notes.txt`.
    * Uses `FileWriter` in **append mode** to keep previous notes.

2. **View Notes**

    * Reads and displays all saved notes from `notes.txt`.
    * Uses `BufferedReader` + `FileReader`.

3. **Persistent Storage**

    * Notes remain available even after the program is closed.

---

## ▶️ How to Run

1. Open a terminal in the project folder.
2. Compile the program:

   ```bash
   javac NotesApp.java
   ```
3. Run the program:

   ```bash
   java NotesApp
   ```

---

## 📖 Example Run

```
===== Notes App =====
1. Write a Note
2. View Notes
3. Exit
Enter your choice: 1
Enter your note: Finish Java homework
Note saved successfully!

===== Notes App =====
1. Write a Note
2. View Notes
3. Exit
Enter your choice: 2

--- Your Notes ---
1. Finish Java homework
```

---

## 🎯 Learning Outcome

* How to **write data** to a file using `FileWriter`.
* How to **read data** from a file using `FileReader` and `BufferedReader`.
* Understanding of **persistent storage** in Java applications.
