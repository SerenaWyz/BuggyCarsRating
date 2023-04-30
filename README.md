# BuggyCarsRating🚗
## 🧠Testing Strategies：
+ Automatic Testing+Manual Testing
  - Automatic Testing：Smoking Testing
  - Manual Testing：Special logic Testing 
+ Interface Testing
+ Compatibility Testing
+ Security Testing
+ Performance Test


## 🖥️Automatic Testing
### Framework
+ Selenium WebDriver(Java):Keywords
+ TestNG
### Setup
  - Install the 11.0.2 version of JDK
  - Install Eclipse IDE
  - Install Selenium WebDriver(v3.141.59) and TestNG plugins for Eclipse
  - Install Google Chrome for Mac(v83.0.4103.116)
  - Install Safari(13.1.2 (13609.3.5.1.5))
  - Install TestNG
  - Download the Chrome WebDriver and the Safari WebDriver, save them in a directory.
### Instructions to Execute the Test:
+  Clone or download the project from the provided GitHub repository.
+  Open the project in Eclipse IDE.
+  Run the "/src/keyword/testScript/TestSuiteByExcel.java" 

### Test approach

## 🖥️Compatibility Testing（As my device is limited）
### Device
+ Web
  - Screen Size： 13#
  - Chrome：
    - version：v83.0.4103.116   
  - Safari：
    - version：13.1.2 (13609.3.5.1.5)    
+ Mobile
  - IOS
    - version   
  - Android
### Test approach

## 🖥️Security Testing
### Test approach
+ SQL Injection


## 🖥️Performance Test
### Test approach
+ JUV Testing

## 📊Report Bugs


Bug ID

|:-----:|
da|kggg
|  Contact Us page does not validate input fields
Severity: High
Description: The Contact Us page allows users to submit their queries without validating the input fields. This can cause errors when the user submits incomplete or incorrect information.
Steps to Reproduce:
Go to https://buggy.justtestit.org/
Click on Contact Us page
Leave one or more required fields empty or enter incorrect information
Click on the Submit button
Observe that the form is submitted without any validation
Expected Result: The form should validate all input fields and display error messages for any incomplete or incorrect information entered by the user
