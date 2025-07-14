# 🛒 ECommerce Web Automation Framework

This is a real-world Selenium automation framework built to test the full purchase flow of an eCommerce web application using Java, TestNG, and the Page Object Model (POM).

## 📍 Project Objective

To automate the end-to-end testing of the [SauceDemo](https://www.saucedemo.com) eCommerce site:
- Login
- Product selection
- Cart operations
- Checkout process
- Order confirmation
- Logout

🧰 Tech Stack

| Tool/Library      | Purpose                                 |
|------------------|------------------------------------------|
| Java              | Programming language                    |
| Selenium WebDriver| Web UI automation                       |
| TestNG            | Test framework and execution            |
| Apache POI        | Data-driven testing using Excel         |
| ExtentReports     | Test reporting                          |
| Maven             | Dependency management                   |
| WebDriverManager  | Browser driver management (ChromeDriver)|

## 📁 Project Structure

ECommerceWebAutomationFramework
│
├── base/
│ └── BaseTest.java
├── pages/
│ ├── LoginPage.java
│ ├── ProductPage.java
│ ├── CartPage.java
│ ├── CheckoutPage.java
│ └── ConfirmationPage.java
├── tests/
│ ├── LoginTest.java
│ ├── AddToCartTest.java
│ └── CheckoutTest.java
├── utils/
│ ├── ConfigReader.java
│ ├── ExcelUtil.java
│ ├── WaitUtil.java
│ └── ExtentManager.java
├── testng.xml
└── pom.xml

## ✅ Key Features

- Follows **Page Object Model (POM)** design
- Data-driven testing using **Excel**
- Centralized **wait utilities** and **config reader**
- Auto-generated **ExtentReports** with screenshots
- Tests grouped by module and easily scalable
- Selenium best practices followed throughout

## ▶️ How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/ECommerceWebAutomationFramework.git

