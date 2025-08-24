🚗 Car Rental System – OOP Based Project

A Java Object-Oriented Programming (OOP) based Car Rental System that demonstrates the power of classes, objects, inheritance, polymorphism, encapsulation, and abstraction while solving a real-world problem.

This project is designed to simulate a real car rental service with advanced and extraordinary functionalities for both customers and administrators.

✨ Features
👤 Customer Features

🔍 Search Cars by model, brand, type, and availability.

🏷️ Book a Car with flexible rental plans.

🏷️ Book luxury cars also.

⏳ Track Rental Duration with automated cost calculation.

📜 Rental History to check all past bookings.

🛠️ Admin Features

➕ Add / Remove Cars to the fleet.

📊 View All Bookings and customer history.



🔐 Secure Login System with role-based access.

🧩 OOP Concepts Used

Encapsulation – All car and customer details are private with proper getters/setters.

Inheritance – Different car types (Sedan, SUV, Hatchback) inherit from a parent Car class.

Polymorphism – Same booking method behaves differently for different car types.

Abstraction – Abstract classes & interfaces for Payment, Reporting, and Notifications.

Composition – Car has a RentalRecord object for tracking rental details.

🚀 Extraordinary Functions

✔️ Smart Recommendation System → Suggests cars based on customer preferences & history.
✔️ Dynamic Pricing → Rent cost varies by demand, type, and duration.
✔️ Loyalty Rewards → Customers earn points on each booking.
✔️ Penalty System → Late return automatically adds extra charges.
✔️ Notification System → Alerts for booking confirmations, due dates, and payments.

🛠️ Tech Stack

Language: Java (OOP Concepts)

Database (Optional): MySQL / JSON File Handling

IDE: IntelliJ IDEA / Eclipse / VS Code

Version Control: Git & GitHub

📂 Folder Structure
CarRentalSystem/
│── src/
│   ├── models/
│   │   ├── Car.java
│   │   ├── Sedan.java
│   │   ├── SUV.java
│   │   └── Hatchback.java
│   ├── users/
│   │   ├── Customer.java
│   │   └── Admin.java
│   ├── services/
│   │   ├── BookingService.java
│   │   ├── PaymentService.java
│   │   └── NotificationService.java
│   ├── utils/
│   │   └── ReportGenerator.java
│   └── Main.java
│── README.md
│── LICENSE

🖥️ How to Run

Clone the repository

git clone https://github.com/your-username/car-rental-system.git
cd car-rental-system


Open the project in IntelliJ IDEA / Eclipse / VS Code.

Run the Main.java file.

Use the Admin/Customer Menu to interact with the system.

📸 Screenshots (Optional)

(Add console output screenshots or GUI screenshots if you design one).

🤝 Contributing

Contributions are welcome! Feel free to fork this repo, create a new branch, and submit a PR.

📝 License

This project is licensed under the MIT License – feel free to use and modify it.
