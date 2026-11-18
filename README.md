# Energy Consumption Tracker

## Project Overview
The Energy Consumption Tracker is an Android application developed using Java and XML in Android Studio. The application was designed to help South African households monitor their electricity consumption and calculate their estimated electricity costs.

The system allows users to enter information about household appliances, calculate daily and monthly electricity usage, estimate monthly electricity expenses and receive recommendations on how to reduce electricity consumption.

## Objectives
- Monitor household electricity consumption.
- Calculate daily and monthly electricity usage in kilowatt-hours (kWh).
- Estimate monthly electricity costs using the electricity tariff.
- Categorise energy consumption.
- Provide recommendations to encourage energy efficiency.
- Store and manage electricity consumption records using SQLite.

## Technologies Used
- **Programming Language:** Java
- **User Interface:** XML
- **Development Environment:** Android Studio
- **Database:** SQLite
- **Platform:** Android

## Main Features

### 1. Appliance Management
Users can enter appliance details, including appliance name, power rating and daily operating hours.

### 2. Electricity Consumption Calculator
The application calculates electricity usage based on appliance power ratings and operating hours.

### 3. Cost Calculation
The system estimates daily and monthly electricity costs using the electricity tariff entered by the user.

### 4. Energy Efficiency Recommendations
The application provides recommendations based on electricity consumption to encourage households to use energy more efficiently.

### 5. Input Validation
The system checks that users enter valid information and prevents empty or incorrect numerical inputs.

### 6. SQLite Database
Electricity consumption records can be stored locally using SQLite.

## Calculations

**Daily Electricity Consumption:**

Daily kWh = (Power Rating × Operating Hours) / 1000

**Monthly Electricity Consumption:**

Monthly kWh = Daily kWh × 30

**Estimated Monthly Electricity Cost:**

Monthly Cost = Monthly kWh × Electricity Tariff

## Project Structure

- `MainActivity.java` – Main application screen and navigation.
- `InputActivity.java` – Collects and validates appliance information.
- `Appliance.java` – Stores appliance information using private fields, constructors, getters and setters.
- `ElectricityCalculator.java` – Calculates daily and monthly electricity consumption and costs.
- `Recommendation.java` – Determines energy efficiency categories and provides recommendations.
- `activity_main.xml` – Main screen layout.
- `activity_input.xml` – Input screen layout.
- SQLite – Stores electricity consumption records.

## Learning Outcomes
Through this project, I gained practical experience in:
- Android application development.
- Java programming and object-oriented programming.
- XML interface design.
- SQLite database integration.
- Input validation and error handling.
- Implementing mathematical calculations in an application.
- Developing solutions to real-world problems.

## Future Improvements
- Add graphical electricity consumption reports.
- Allow users to compare monthly electricity usage.
- Include more detailed energy-saving recommendations.
- Add data export functionality.
- Improve the user interface and user experience.

## Author
**Amelia Asisipho**

Information Technology – Software Engineering  
Eduvos

---

*This project was developed as part of my Information Technology studies to demonstrate practical Android development
