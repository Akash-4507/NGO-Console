# Non-Profit Organisation Management System

A Java-based **Console Application** that simulates the management operations of a Non-Profit Organisation (NGO), built using the **MVC (Model-View-Controller)** architecture.

---

## 📌 Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Project Structure (MVC)](#project-structure-mvc)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Future Enhancements](#future-enhancements)
- [Contributors](#contributors)

---

## 🧾 About the Project

The **Non-Profit Organisation Management System** is a console-based Java application designed to handle core operations of an NGO. It provides different roles (Public User, Volunteer, and Admin) with tailored functionalities.

This project aims to demonstrate clean code structure, separation of concerns, and good software practices using Java fundamentals.

---

## ✨ Features

### 👥 User Roles
- **Public User** – View services, events, and donation information
- **Volunteer** – Register and contribute to events/services
- **Admin** – Manage services, events, donations, volunteers, and blogs

### 🔑 Core Modules
- User Authentication (Registration/Login)
- Service and Event Management
- Volunteer Registration
- Donation Tracking
- Blog and Awareness Content
- Role-Based Menus and Access Control

---

## 🧱 Project Structure (MVC)

```bash
NonProfitOrganisation/
├── model/
│   └── User.java, Service.java, Event.java ...
├── view/
│   └── MenuView.java, DisplayView.java ...
├── controller/
│   └── MainController.java, AuthController.java ...
├── database/
│   └── DBConnection.java, UserDAO.java, EventDAO.java ...
├── Main.java


Model – Contains entity classes and DAO logic

View – Manages all console display and user input

Controller – Contains the application logic and flow control

🛠 Technologies Used
Java – Core Java (OOP, Collections, Exception Handling)

JDBC – For database connectivity

PostgreSQL – As the backend database

MVC Architecture – For separation of concerns

IDE – Visual Studio Code / IntelliJ IDEA

🚀 How to Run
Clone the repository
cd (project folder)

Setup the PostgreSQL Database

Create a database and configure your credentials in DBConnection.java

Open the project in your IDE

Run the project(main file)

🧩 Future Enhancements
Add password encryption and session management

Include search and filter options

Migrate to a GUI-based interface (JavaFX/Swing)

Integrate REST APIs for web-based interaction

Add donation payment gateway simulation


👨‍💻 Contributors
Akash A – Java Developer




