# 🍽️ Fab Food - Online Food Delivery Platform

**Fab Food** is a full-stack web application inspired by modern food delivery platforms. Built using Java EE technologies, it allows users to browse restaurants, view menus, place orders, and manage their cart seamlessly — all within a dynamic and interactive interface.

---

## 🚀 Tech Stack

- **Backend:**
  - Java Servlets (JEE)
  - JSP (JavaServer Pages)
  - JDBC (Java Database Connectivity)
  - MySQL
- **Frontend:**
  - HTML
  - CSS
- **Design Patterns & Principles:**
  - DAO (Data Access Object) Design Pattern
  - System Design Principles: Open-Closed Principle, Liskov Substitution Principle
  - OOPS Concepts: Abstraction, Encapsulation, Inheritance, Polymorphism
- **DSA Concepts:**
  - Binary Search Algorithm
  - Java Collections Framework
  - Exception Handling
- **Tools:**
  - MySQL Workbench
  - IntelliJ IDEA / Eclipse
  - Apache Tomcat Server

---

## 🛠️ Features

- 🔍 **Search & Filter:** Browse restaurants and food items using efficient searching (Binary Search).
- 🧾 **Cart & Orders:** Add food to cart, review your order, and place it.
- 📦 **Order History:** Track and view past orders.
- 💾 **Database Integration:** CRUD operations for users, restaurants, food items, and orders.
- ⚙️ **Admin Panel (Optional):** Add/edit/delete restaurants and menus.

---

## 🧠 System Design & Architecture

### ✔️ Design Principles Implemented

- **Open/Closed Principle (OCP):**
  - The core logic is designed to be **extensible without modifying existing code**, especially while adding new food categories or order types.

- **Liskov Substitution Principle (LSP):**
  - Interfaces and abstract classes are leveraged so that child classes (e.g., `VegFood`, `NonVegFood`) can be substituted without altering the parent logic.

- **DAO Pattern:**
  - All database operations are handled using the **DAO design pattern**, ensuring loose coupling between business logic and data access logic.

- **OOPS Concepts:**
  - Structured using interfaces, abstract classes, inheritance, method overloading, and overriding to ensure reusable and clean code.

---

## 🔍 DSA Concepts Used

- **Binary Search:**
  - Used to efficiently search for food items or users based on ID or name within sorted lists.

- **Collections Framework:**
  - Used for managing lists of orders, carts, and menu items dynamically using ArrayList, HashMap, etc.

- **Exception Handling:**
  - Applied across database operations and servlet workflows to ensure robust error handling and user feedback.

---

## 📂 Folder Structure (Example)

FabFood/
│
├── src/
│ ├── dao/
│ │ ├── FoodDAO.java
│ │ ├── UserDAO.java
│ │ └── OrderDAO.java
│ ├── model/
│ │ ├── Food.java
│ │ ├── User.java
│ │ └── Order.java
│ ├── servlet/
│ │ ├── LoginServlet.java
│ │ ├── MenuServlet.java
│ │ └── OrderServlet.java
│
├── WebContent/
│ ├── css/
│ ├── jsp/
│ ├── images/
│ ├── index.jsp
│ └── cart.jsp
│
└── database/
└── fabfood_schema.sql

yaml
Copy
Edit

---

## 🔗 Live Preview (Optional)
*Coming soon on Docker/AWS (based on your deployment status)*

---

## 📜 License

This project is open-source and available under the MIT License.

---

## 🙋‍♂️ Author

- **Dhinesh Kumar M**  
  [LinkedIn](https://www.linkedin.com/in/dhineshkumar-m-b75b1a283/) | [GitHub](https://github.com/Dhinesh-Developer) | [Portfolio](https://dhinesh3369.neocities.org/DhineshKumar/portfolio/dk)

---

## 📌 Additional Notes

- ✅ Optimized SQL queries using `JOIN`, `WHERE`, `ORDER BY`.
- ✅ Designed for educational and demonstrational purposes.
- ✅ Can be extended to include payment gateways, mobile responsiveness, and more.

