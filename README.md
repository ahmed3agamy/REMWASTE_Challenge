# REMWASTE Challenge – UI & API Automation Project

Hi! I’m Ahmed Abdelwhab Agamy, and this repo contains the work I completed for the REMWASTE Automation Challenge.

I’ve split the testing into two main parts:
- **UI automation** for [SauceDemo](https://www.saucedemo.com), using Selenium, Java, and Cucumber.
- **API testing** for [Restful Booker](https://restful-booker.herokuapp.com) using Postman.

---

## 🚀 What's in This Project

### 🖥️ UI Testing (SauceDemo)
I automated the core user flows:
- Logging in (both success and failure cases)
- Adding and removing items from the cart
- Completing the checkout process
- Verifying the final confirmation screen

These tests are written using:
- **Selenium WebDriver** (for browser automation)
- **Cucumber** (for BDD-style test steps)
- **Java + Maven** (to manage and run the tests)

### 🔌 API Testing (Restful Booker)
This part tests the hotel booking API using a Postman collection. It currently includes:
- `POST /auth`: authenticating with valid credentials
- `POST /booking`: creating a new booking

You can easily extend it with `GET`, `PUT`, and `DELETE` tests too.

---

## 📂 Folder Overview

```
REMWASTE_Challenge/
├── features/                       # Cucumber feature files
├── src/test/java/                 # Step definitions and page objects
├── Postman/restful-booker.postman_collection.json
├── Test_Plan_Ahmed_Agamy.pdf
├── pom.xml                        # Maven config
└── README.md
```

---

## 🛠 Tools I Used

- **Selenium** – for automating the browser
- **Cucumber** – to keep tests readable and maintainable
- **Postman** – for quick API testing
- **Newman** (optional) – to run API tests from the command line
- **Maven** – for running the UI tests

---

## ▶️ How to Run the Tests

### UI Tests
Make sure Java and Maven are installed, then:
```bash
git clone https://github.com/ahmed3agamy/REMWASTE_Challenge.git
cd REMWASTE_Challenge
mvn test
```

### API Tests
You can run the API tests in Postman, or use Newman:
```bash
newman run Postman/restful-booker.postman_collection.json
```

---

## 📄 Documentation

Here’s the test strategy document I wrote, which outlines:
- What’s being tested
- Tool choices
- Test coverage
- Setup and assumptions

📄 [Test_Plan_Ahmed_Agamy.pdf](./Test_Plan_Ahmed_Agamy.pdf)




