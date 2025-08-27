# PetStore_RestAssured_Framework
## 📖 Overview  
This is a **data-driven API automation framework** designed for testing RESTful services of the **Swagger PetStore API**.  
It follows **best practices** with a modular design, configuration management, logging, reporting, and CI/CD integration.  

---

## 🚀 Features  
✔️ **Modular architecture** → endpoints, payloads, utilities, and tests separated  
✔️ **Data-driven testing** → Excel + TestNG DataProviders  
✔️ **POJO classes** → clean request/response payload handling  
✔️ **Centralized configuration** → properties file + ResourceBundle support  
✔️ **Logging with Log4j2** → debug/info/error level logs stored in `/logs`  
✔️ **ExtentReports** → rich HTML execution reports stored in `/reports`  
✔️ **TestNG Listeners** → automatic report & log integration on test failures  
✔️ **Maven build support** → `mvn clean test` ready  
✔️ **Jenkins integration** → CI/CD pipeline ready  

---

## 📂 Project Structure  

PetStore_RestAssuredFramework
│── src/test/java
│ ├── api.endpoints # Endpoints classes (Routes, UserEndPoints)
│ ├── api.payload # POJO classes (User.java)
│ ├── api.test # Test classes (DataDrivenTests, UserTests)
│ └── api.utilities # Utilities (ExcelUtility, DataProviders, ExtentReporter)
│
│── src/test/resources
│ ├── log4j2.xml # Log4j2 configuration
│ └── Routes.properties # Endpoints configuration
│
│── TestData/Userdata.xlsx # Excel sheet for data-driven testing
│── reports/ # ExtentReports HTML results
│── logs/ # Execution logs
│── testng.xml # TestNG suite runner
│── pom.xml # Maven build configuration

---

## ⚙️ Tech Stack  
- **Language**: Java (JDK 8+)  
- **Frameworks/Tools**: RestAssured, TestNG, Maven  
- **Logging**: Log4j2  
- **Reporting**: ExtentReports + TestNG Listeners  
- **Build/CI**: Maven + Jenkins  

---
✨ Author

👤 Developed by Harini P

🔗 Project Link: https://github.com/HariniPrabhu2/PetStore_RestAssured_Framework.git
