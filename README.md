# BuggyCarsRating🚗
## 🧠Testing Strategies：
+ Automatic Testing+Manual Testing
  - Automatic Testing：Smoking Testing
  - Manual Testing：Exceptional Situation Testing 
+ Interface Testing
+ Compatibility Testing
+ Security Testing
+ Performance Test


## 🖥️Automatic Testing
### Framework
+ Selenium WebDriver(Java):Keywords
+ TestNG
### Setup
+ Install the 11.0.2 version of JDK
+ Install Eclipse IDE
+ Install Selenium WebDriver(v3.141.59) and TestNG plugins for Eclipse
+ Install Google Chrome for Mac(v83.0.4103.116)
+ Install Safari(13.1.2 (13609.3.5.1.5))
+ Install TestNG
+ Download the Chrome WebDriver and the Safari WebDriver, save them in a directory.
### Instructions to Execute the Test:
+  Clone or download the project from the provided GitHub repository.
+  Open the project in Eclipse IDE.
+  Run the "/src/keyword/testScript/TestSuiteByExcel.java" 

### Test approach
Please refer the excel data: /src/keyword/data/BCRtestCase.xlsx
## 🖥️Interface Testing
### Setup
+ Install postman/Using the webiste of postman
### Test approach
+ Function Testing
  - Inputs and outputs
  - Status
+ Exceptional Situation Testing
  - Multiple to commit
  - Shutdown or timeout,check the responsive message 
  - slow internet speed

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
+ Cookie/session
+ XSS Injection:add JavaScript or HTML code in the field
+ CSRF


## 🖥️Performance Test
### Test approach
+ Concurrent Testing
  - JUV Testing:JMeter/Unit Testing:When multi-users（multi-thread） votes, testing the code whether user “synchronized” or ” lock"
  - Responsive Time
  - Troughput
  - Service resource use
+ Pressure Testing
  - Responsive Time
  - Troughput
  - Service resource use




## 📊Report Bugs
Please check the Word file in the email.<br>
If you have any question about these issues, please contact with me.😜Thank you.
