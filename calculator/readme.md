Got it ✅ I’ll prepare a **README.md** file that clearly explains your Smart Calculator project.

Here’s a clean and professional version:

---

# 🧮 Smart Calculator (Java - Console Based)

A **console-based calculator in Java** that works like a real calculator.
It supports **multiple operators, parentheses, decimals, and modulo (%)**, with **error handling** and **continuous calculations** (you can keep using the previous result in new expressions).

---

## 🚀 Features

* ➕➖✖️➗ Basic arithmetic: `+  -  *  /`
* ➗ Modulo operation: `%`
* 🧩 Parentheses support: `(2+3)*5`
* 🔄 Auto-balances parentheses: `(5+2` → auto-corrects to `(5+2)`
* 🔢 Handles integers and decimals: `10.5+2.3*3`
* ⚠️ Error handling:

    * Division/modulo by zero
    * Invalid characters
    * Malformed expressions
* 🔁 Continuous calculations (like a real calculator):

    * Example: enter `2+3*4` → result `14`
    * Next input: `*2` → result `28`

---

## 📂 Project Structure

```
SmartCalculator.java
README.md
```

---

## 🛠️ How to Run

1. Clone or download this repository.
2. Open a terminal and navigate to the project folder.
3. Compile the program:

   ```sh
   javac calculator.java
   ```
4. Run the program:

   ```sh
   java calculator
   ```

---

## 📝 Example Usage

```
=== Smart Calculator ===
Type 'exit' to quit.
Supports +, -, *, /, %, parentheses, and decimals.
If you start with an operator, it will use the last result.

Enter expression: 2+3*5-4
Result: 13.0

Enter expression: (10+20)/5
Result: 6.0

Enter expression: (5+2
Result: 7.0   (auto-balanced)

Enter expression: 2+3%5*6
Result: 20.0

Enter expression: *2
Result: 40.0   (continues from previous result)

Enter expression: 10/0
Error: Division by zero!

Enter expression: exit
Calculator closed.
```

---

## 📖 Supported Operators

| Operator | Meaning                    | Example   | Result |
| -------- | -------------------------- | --------- | ------ |
| `+`      | Addition                   | `2+3`     | `5`    |
| `-`      | Subtraction                | `10-4`    | `6`    |
| `*`      | Multiplication             | `3*4`     | `12`   |
| `/`      | Division                   | `20/5`    | `4`    |
| `%`      | Modulo (Remainder)         | `10%3`    | `1`    |
| `()`     | Parentheses for precedence | `(2+3)*4` | `20`   |

---

## 🏗️ Future Enhancements

* Add **exponentiation (`^`)** support → `2^3 = 8`
* Add **scientific functions** (√, sin, cos, log, etc.)
* Support **memory functions** (M+, M-, MR)


