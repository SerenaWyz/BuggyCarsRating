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


## 🖥️Performance Testing
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
If you have any question about these issues, please contact with me.😜Thank you.

<table class="MsoTableGrid" border="1" cellspacing="0" cellpadding="0" width="821" style="margin-left:-15.9pt;border-collapse:collapse;mso-table-layout-alt:fixed;
 border:none;mso-border-alt:solid windowtext .5pt;mso-yfti-tbllook:1184;
 mso-padding-alt:0cm 5.4pt 0cm 5.4pt">
 <tbody><tr style="mso-yfti-irow:0;mso-yfti-firstrow:yes;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" style="tab-stops:21.0pt 42.0pt center 226.4pt"><a name="OLE_LINK2"></a><a name="OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 1<span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp; </span><span style="mso-tab-count:
  1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><o:p></o:p></span></b></span></a></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:1;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Incorrect password length prompt message</span></span></span></p>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US"><span style="mso-spacerun:yes">&nbsp;</span></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:2;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Registrtion Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:3;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:4;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">First input of 2 characters prompted minimum length of 6
  characters. After modifying to 6 characters, it is still prompting that the
  length is not enough.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:5;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK4"></a><a name="OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website:
  https://buggy.justtestit.org</span></span></a></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in all fields and the
  fill in 2 characters in password field</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the prompt message</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><a name="OLE_LINK10"></a><a name="OLE_LINK9"><span style="mso-bookmark:OLE_LINK10"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">6.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Motify </span></span></a><span lang="EN-US">the password to 6characters</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">7.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l1 level1 lfo1"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK3"><span style="mso-bookmark:OLE_LINK4"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">8.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the prompt message</span></span></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:6;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The prompt message should
  display the correct message</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:7;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;mso-fareast-font-family:宋体;mso-bidi-font-family:
  &quot;Times New Roman&quot;;color:#A94442;background:#F2DEDE;mso-font-kerning:0pt;
  mso-ansi-language:EN-AU">InvalidPasswordException: Password did not conform
  with policy: Password not long enough</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-size:10.0pt;font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:8;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 2<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:9;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The error message did not list all existing problems at once.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:10;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Registrtion Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:11;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:12;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The error message for the field only shows one issue at a time.
  After fixing the first issue, another issue is prompted, requiring repetitive
  modifications.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:13;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website:
  https://buggy.justtestit.org</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in all fields and the fill
  in 2 characters in password field</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the prompt message:</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK6"></a><a name="OLE_LINK5"><span style="mso-bookmark:OLE_LINK6"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">6.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Motify the password to
  6characters</span></span></a></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">7.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button:</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK8"></a><a name="OLE_LINK7"><span style="mso-bookmark:OLE_LINK8"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">8.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the prompt message: 1)</span></span></a></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">9.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Motify the password to 8
  characters</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l0 level1 lfo4"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">10.<span style="font:7.0pt &quot;Times New Roman&quot;"> </span></span></span><!--[endif]--><span lang="EN-US">Check the prompt message: 2)</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:14;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">When performing basic format validation on the fields, provide
  accurate message for all issues at once. Please adjust the validation logic
  or otify the prompt message: display all the rules</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-size:10.0pt;font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:15;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;
  mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;color:#A94442;
  background:#F2DEDE;mso-font-kerning:0pt;mso-ansi-language:EN-AU">1) InvalidPasswordException:
  Password did not conform with policy: Password not long enough<o:p></o:p></span></span></span></p>
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;mso-fareast-font-family:宋体;mso-bidi-font-family:
  &quot;Times New Roman&quot;;color:#A94442;background:#F2DEDE;mso-font-kerning:0pt;
  mso-ansi-language:EN-AU">2) InvalidPasswordException: Password did not
  conform with policy: Password must have lowercase characters</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-size:10.0pt;font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:16;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 3<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;
  mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;color:#A94442;
  background:#F2DEDE;mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p>&nbsp;</o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:17;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:18;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Registrtion Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:19;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Medium</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:20;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">When entering a login name with spaces, the error message
  displayed is inaccurate. And it <span class="GramE">expose</span> the sql
  field.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:21;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo2"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK12"></a><a name="OLE_LINK11"><span style="mso-bookmark:OLE_LINK12"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website:
  https://buggy.justtestit.org</span></span></a></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo2"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK11"><span style="mso-bookmark:OLE_LINK12"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo2"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in “w k” in Login field
  and fill in another field</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo2"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Register” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo2"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the prompt message</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:22;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">During the filling process, perform basic validation on the fields
  using regular expressions and provide accurate error messages. When clicking
  on the registration button, perform logical validation such as checking if
  the username already exists.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:23;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;mso-fareast-font-family:宋体;mso-bidi-font-family:
  &quot;Times New Roman&quot;;color:#A94442;background:#F2DEDE;mso-font-kerning:0pt;
  mso-ansi-language:EN-AU">InvalidParameterException: 1 validation error
  detected: Value at 'username' failed to satisfy constraint: Member must
  satisfy regular expression pattern: [\<span class="GramE">p{</span>L}\p{M}\p{S}\p{N}\p{P}]+</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-size:10.0pt;font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:24;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 4<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:25;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The login and password fields allow submission with spaces.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:26;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Login &amp; Logout</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:27;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:28;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The login and password fields allow submission with spaces, but
  when submitted, the error message displays 'incorrect username or password'.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:29;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo6"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: https://buggy.justtestit.org</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo6"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in login and password’s
  field with a space</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l19 level1 lfo6"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Login” button</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:30;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Filter or prompt for special characters and disable login
  submission.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:31;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b><span style="font-size:9.0pt;font-family:&quot;Helvetica Neue&quot;;mso-fareast-font-family:
  宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;color:white;background:#F0AD4E;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU">Invalid username/password</span></b></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-size:10.0pt;font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:32;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 5<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:33;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Encountered error when trying to modify profile after logging out.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:34;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Login&amp;Logout</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:35;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">High</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:36;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Encountered error 401 when trying to modify profile after logging
  out.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:37;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l12 level1 lfo7"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l12 level1 lfo7"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in login and password
  field</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l12 level1 lfo7"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Login” button </span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l12 level1 lfo7"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Profile” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l12 level1 lfo7"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Logout” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l12 level1 lfo7"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">6.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in the address in the
  Profile page</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l12 level1 lfo7"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">7.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “save” button</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:38;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:Helvetica;mso-fareast-font-family:宋体;mso-bidi-font-family:
  &quot;Times New Roman&quot;;color:#374151;background:#F7F7F8;mso-font-kerning:0pt;
  mso-ansi-language:EN-AU">Redirect to home page after logging out.</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-size:10.0pt;font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:39;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;mso-fareast-font-family:宋体;mso-bidi-font-family:
  &quot;Times New Roman&quot;;color:#A94442;background:#F2DEDE;mso-font-kerning:0pt;
  mso-ansi-language:EN-AU">Unknown error</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-size:10.0pt;font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  mso-font-kerning:0pt;mso-ansi-language:EN-AU"><o:p></o:p></span></span></span></p>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;
  mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;color:#A94442;
  background:#F2DEDE;mso-font-kerning:0pt;mso-ansi-language:EN-AU">Failed to
  load resource: the server responded with a status of 400 ()<o:p></o:p></span></span></span></p>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;
  mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;color:#A94442;
  background:#F2DEDE;mso-font-kerning:0pt;mso-ansi-language:EN-AU">2k51qryqov3.execute-api.ap-southeast-2.amazonaws.com/prod/oauth/token<span class="GramE">:1</span> Failed to load resource: the server responded with a
  status of 401 ()<o:p></o:p></span></span></span></p>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span class="GramE"><span style="font-family:
  &quot;Helvetica Neue&quot;;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;Times New Roman&quot;;
  color:#A94442;background:#F2DEDE;mso-font-kerning:0pt;mso-ansi-language:EN-AU">k51qryqov3.execute</span></span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="font-family:&quot;Helvetica Neue&quot;;mso-fareast-font-family:宋体;mso-bidi-font-family:
  &quot;Times New Roman&quot;;color:#A94442;background:#F2DEDE;mso-font-kerning:0pt;
  mso-ansi-language:EN-AU">-api.ap-southeast-2.amazonaws.com/prod/users/profile:1
  Failed to load resource: the server responded with a status of 401 ()<span style="mso-spacerun:yes">&nbsp; </span>zone.js:101<o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:40;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 6<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:41;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Modify the firstname and
  lastname with space</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:42;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Registrtion Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:43;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:44;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Successfully modify the fist name andlast name with space in the
  profile</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:45;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l2 level1 lfo9"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US" style="color:windowtext;
  text-decoration:none;text-underline:none">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l2 level1 lfo9"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in username and password
  to login </span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l2 level1 lfo9"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Profile” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l2 level1 lfo9"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Modify the firstname and
  lastname to setting “”(space)</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l2 level1 lfo9"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “save” button</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:46;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The input should validate for spaces or empty.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:47;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Successfully modify the fist name andlast name with space in the
  profile</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;border-bottom:solid windowtext 1.0pt" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:48">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 7<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US"><o:p>&nbsp;</o:p></span></span></span></p>
  </td>
  
 </tr>
 <tr style="mso-yfti-irow:49;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Didn’t filtering out special characters </span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:50;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Profile &amp; URL Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:51;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">High</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:52;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Didn’t filtering out special characters </span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:53;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:21.0pt;text-indent:-21.0pt;
  mso-char-indent-count:0;mso-list:l11 level1 lfo8"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in the special characters
  in all field</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="ZH-CN" style="font-family:宋体;
  mso-ascii-font-family:Cambria;mso-ascii-theme-font:minor-latin;mso-fareast-font-family:
  宋体;mso-fareast-theme-font:minor-fareast;mso-hansi-font-family:Cambria;
  mso-hansi-theme-font:minor-latin">，</span><span lang="EN-US">like: enters
  special characters like "&lt;" or "&gt;" in a text input
  field</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:21.0pt;text-indent:-21.0pt;
  mso-char-indent-count:0;mso-list:l11 level1 lfo8"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the page </span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:54;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Filtering out special characters</span></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US"><o:p>&nbsp;</o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:55;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Didn’t filter out</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:56;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 8<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:57;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Sorting by rank is broken</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:58;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:59;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:60;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">When sorting the list based on "rank", the order is
  displayed in a random manner.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:61;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l18 level1 lfo22"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK27"></a><a name="OLE_LINK14"></a><a name="OLE_LINK13"><span style="mso-bookmark:OLE_LINK14"><span style="mso-bookmark:OLE_LINK27"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:minor-latin;
  mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span></a></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK13"><span style="mso-bookmark:OLE_LINK14"><span style="mso-bookmark:OLE_LINK27"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK13"><span style="mso-bookmark:OLE_LINK14"><span style="mso-bookmark:OLE_LINK27"></span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l18 level1 lfo22"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK13"><span style="mso-bookmark:OLE_LINK14"><span style="mso-bookmark:
  OLE_LINK27"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:
  Cambria;mso-fareast-theme-font:minor-latin;mso-bidi-font-family:Cambria;
  mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp; </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l18 level1 lfo22"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the filter “Rank”</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l18 level1 lfo22"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the sort by ”Rank”</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:62;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Display in ascending or descending order according to
  "rank"</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:63;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">"Rank" displayed in random order.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:64;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 9<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:65;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The sorting for voting is only available in descending order.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:66;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:67;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:68;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">When sorting the list based on "voke", the order is only
  displayed in descending order.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:69;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l21 level1 lfo12"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK29"></a><a name="OLE_LINK28"><span style="mso-bookmark:OLE_LINK29"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></a></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK28"><span style="mso-bookmark:OLE_LINK29"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK28"><span style="mso-bookmark:OLE_LINK29"></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l21 level1 lfo12"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK28"><span style="mso-bookmark:OLE_LINK29"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l21 level1 lfo12"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the filter “Vote”</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l21 level1 lfo12"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the sort by ”Vote”</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:70;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The votes should be sorted by both ascending and descending order</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:71;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The sorting for voting is only available in descending order.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:72;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 10<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:73;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Users can access non-existent pages.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:74;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:75;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:76;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Users can access non-existent pages and keep press the forward
  page button</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:77;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l17 level1 lfo10"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK20"></a><a name="OLE_LINK19"><span style="mso-bookmark:OLE_LINK20"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></a></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK19"><span style="mso-bookmark:OLE_LINK20"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK19"><span style="mso-bookmark:OLE_LINK20"></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l17 level1 lfo10"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK19"><span style="mso-bookmark:OLE_LINK20"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l17 level1 lfo10"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK19"><span style="mso-bookmark:OLE_LINK20"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in a non-exist page
  number</span></span></span><span lang="EN-US">, like “8” page</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l17 level1 lfo10"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Navigate to the P8</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l17 level1 lfo10"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “&gt;&gt;” forward
  page button </span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:78;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">When the user enters a page number that does not exist, display
  the maximum page number instead. When trying to navigate to a page beyond the
  maximum, stay on the maximum page.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:79;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Users can access non-existent pages. The Maximum is Page5</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:80;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 11<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:81;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">One car’s image don’t display</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:82;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:83;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:84;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK24"></a><a name="OLE_LINK23"><span style="mso-bookmark:OLE_LINK24"><span lang="EN-US">The car that model of
  Ypsilon car’s image didn’t display</span></span></a></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:85;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l8 level1 lfo11"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US" style="color:windowtext;
  text-decoration:none;text-underline:none">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l8 level1 lfo11"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l8 level1 lfo11"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Forward to page No4</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l8 level1 lfo11"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Identity the car’s model is ‘</span></span></span><a href="https://buggy.justtestit.org/model/c4u1mqnarscc72is013g%7Cc4u1mqnarscc72is0150?username=Serena06%27%20and%20%271%27=%271"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US" style="color:windowtext;text-decoration:none;text-underline:none">Ypsilon</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">’</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l8 level1 lfo11"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the Cover picture</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:86;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">All the picture of the cars
  should be displayed</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:87;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The car that model of Ypsilon
  car’s image didn’t display</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:88;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK26"></a><a name="OLE_LINK25"><span style="mso-bookmark:OLE_LINK26"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug12<o:p></o:p></span></b></span></a></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:89;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">One car’s image don’t display</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:90;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:91;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:92;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The car that model of Ypsilon
  car’s image didn’t display</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:93;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l9 level1 lfo13"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l9 level1 lfo13"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l9 level1 lfo13"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Forward to page No4</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l9 level1 lfo13"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Identity the car’s model is ‘</span></span></span><a href="https://buggy.justtestit.org/model/c4u1mqnarscc72is013g%7Cc4u1mqnarscc72is0150?username=Serena06%27%20and%20%271%27=%271"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US" style="color:windowtext;text-decoration:none;text-underline:none">Ypsilon</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">’</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l9 level1 lfo13"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the Cover picture</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:94;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">All the picture of the cars
  should be displayed</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:95;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The car that model of Ypsilon
  car’s image didn’t display</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:96;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 13<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:97;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The author’s value didn’t
  display in the comment page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:98;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:99;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">High</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:100;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Login-user vote with comment,
  the comment list didn’t display the author </span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:101;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l16 level1 lfo14"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK32"></a><a name="OLE_LINK31"><span style="mso-bookmark:OLE_LINK32"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></a></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK31"><span style="mso-bookmark:OLE_LINK32"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK31"><span style="mso-bookmark:OLE_LINK32"></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l16 level1 lfo14"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK31"><span style="mso-bookmark:OLE_LINK32"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l16 level1 lfo14"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK31"><span style="mso-bookmark:OLE_LINK32"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in the login and
  password<span class="GramE">,and</span> click “login” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l16 level1 lfo14"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK31"><span style="mso-bookmark:OLE_LINK32"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Select a car and click the “View
  More” link</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l16 level1 lfo14"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the comment list</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:102;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The author’s value should be
  displayed in the comment page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:103;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The author’s value didn’t
  display in the comment page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:104;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 14<o:p></o:p></span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:105;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The comment list didn’t
  display the vote without comment</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:106;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:107;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">High</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:108;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The login user vote without
  the comment</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="ZH-CN" style="font-family:宋体;
  mso-ascii-font-family:Cambria;mso-ascii-theme-font:minor-latin;mso-fareast-font-family:
  宋体;mso-fareast-theme-font:minor-fareast;mso-hansi-font-family:Cambria;
  mso-hansi-theme-font:minor-latin">，</span><a name="OLE_LINK34"></a><a name="OLE_LINK33"><span style="mso-bookmark:OLE_LINK34"><span lang="EN-US">the
  comment list didn’t display this record (data and author)</span></span></a></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:109;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l10 level1 lfo15"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK40"></a><a name="OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></a></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l10 level1 lfo15"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"><a name="OLE_LINK38"></a><a name="OLE_LINK37"><span style="mso-bookmark:OLE_LINK38"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Fill in the login and
  password</span></span></a><span class="GramE"><span style="mso-bookmark:OLE_LINK37"><span style="mso-bookmark:OLE_LINK38"><span lang="EN-US">,and</span></span></span></span><span style="mso-bookmark:OLE_LINK37"><span style="mso-bookmark:OLE_LINK38"><span lang="EN-US"> click “login” button</span></span></span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l10 level1 lfo15"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l10 level1 lfo15"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Select a car and click the “View
  More” link</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l10 level1 lfo15"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Vote” button</span></span></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l10 level1 lfo15"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span style="mso-bookmark:
  OLE_LINK39"><span style="mso-bookmark:OLE_LINK40"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">6.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the comment list</span></span></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:110;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The comment list should
  display the record that including data and author</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:111;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">If user vote without comment,
  the comment list didn’t have this record</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:112;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 15</span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:113;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The comment list didn’t
  display the vote without comment</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:114;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Overall Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:115;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">High</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:116;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The un-login user <span class="GramE">vote check</span> the comment list. It can view and didn’t
  display the author’s value.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:117;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l15 level1 lfo16"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l15 level1 lfo16"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l15 level1 lfo16"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Select a car and click the “View
  More” link</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l15 level1 lfo16"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the comment list</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:118;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK42"></a><a name="OLE_LINK41"><span style="mso-bookmark:OLE_LINK42"><span lang="EN-US">The un-login user whether
  can view the data of the comment, if they can, it should display the author’s
  value.</span></span></a></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:119;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The un-login usercheck the
  comment page and it didn’t display the author’s value.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:120;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug 16</span></b></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:121;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Safari Browser cannot open the webpage.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:122;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK54"></a><a name="OLE_LINK53"><span style="mso-bookmark:OLE_LINK54"><span lang="EN-US">Overall--ViewMore Page/Homeo--Popular
  model Page</span></span></a></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:123;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">High</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:124;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK56"></a><a name="OLE_LINK55"><span style="mso-bookmark:OLE_LINK56"><span lang="EN-US">Safari can’t load</span></span></a><span lang="EN-US"> Overall--ViewMore Page/Homeo--Popular model Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:125;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l4 level1 lfo18"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US"> in Safari Browser</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l4 level1 lfo18"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Overall” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l4 level1 lfo18"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Select a car and click the “View
  More” link</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l4 level1 lfo18"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Popular model Page”</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:126;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="mso-margin-top-alt:auto;margin-bottom:
  4.5pt;margin-left:0cm;text-align:left;text-indent:-18.0pt;line-height:15.0pt;
  mso-pagination:widow-orphan;mso-list:l6 level1 lfo25;tab-stops:list 36.0pt"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="font-size:10.0pt;mso-bidi-font-size:12.0pt;font-family:
  Symbol;mso-fareast-font-family:Symbol;mso-bidi-font-family:Symbol"><span style="mso-list:Ignore">·<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span class="GramE"><span lang="EN-US">compatibility</span></span><span lang="EN-US"> some main Browser</span></span></span></p>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US"><o:p>&nbsp;</o:p></span></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal" align="left" style="mso-margin-top-alt:auto;margin-bottom:
  4.5pt;margin-left:0cm;text-align:left;text-indent:-18.0pt;line-height:15.0pt;
  mso-pagination:widow-orphan;mso-list:l6 level1 lfo25;tab-stops:list 36.0pt"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="font-size:10.0pt;mso-bidi-font-size:12.0pt;font-family:
  Symbol;mso-fareast-font-family:Symbol;mso-bidi-font-family:Symbol"><span style="mso-list:Ignore">·<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US"><o:p>&nbsp;</o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:127;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Safari can’t load some page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:128;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Bug 17</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:129;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">First Name display issue and don’t limit the length of firstname</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:130;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Profile Page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:131;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Medium</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:132;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:36.0pt;text-indent:-36.0pt;
  mso-char-indent-count:0;mso-list:l13 level1 lfo19"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1）<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Didn’t <a name="OLE_LINK46"></a><a name="OLE_LINK45"><span style="mso-bookmark:OLE_LINK46">limit the length of
  all the field in the Profile</span></a></span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:36.0pt;text-indent:-36.0pt;
  mso-char-indent-count:0;mso-list:l13 level1 lfo19"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2）<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Didn’t display the whole
  first name</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:133;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l20 level1 lfo20"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l20 level1 lfo20"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Profile” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l20 level1 lfo20"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Modify the first name to “<a name="OLE_LINK44"></a><a name="OLE_LINK43"><span style="mso-bookmark:OLE_LINK44">Serena1111111111111122222222223333333</span></a>”</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l20 level1 lfo20"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “save” button</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l20 level1 lfo20"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">5.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Back to the Home page </span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l20 level1 lfo20"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">6.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the top of the
  navigate:<span style="mso-spacerun:yes">&nbsp; </span>Hi,
  Serena1111111111111122222222223333333</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:134;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l5 level1 lfo21"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1)<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Limit the length of all the
  field in the Profile</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l5 level1 lfo21"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2)<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Display partial fields and
  use "..." to indicate the truncated parts for long fields.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:135;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">First Name display issue and
  don’t limit the length of firstname</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:136;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug18</span></b></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US" style="font-family:&quot;Times Roman&quot;;
  mso-bidi-font-family:&quot;Times Roman&quot;;color:black;mso-font-kerning:0pt"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:137;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK50"></a><a name="OLE_LINK49"><span style="mso-bookmark:OLE_LINK50"><span lang="EN-US">When sorting the list based on "vote", the order is
  displayed in a random manner.</span></span></a></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:138;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><a name="OLE_LINK48"></a><a name="OLE_LINK47"><span style="mso-bookmark:OLE_LINK48"><span lang="EN-US">Popular make</span></span></a><span lang="EN-US"> page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:139;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Low</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:140;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">When sorting the list based on "vote", the order is
  displayed in a random manner.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:141;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l3 level1 lfo24"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l3 level1 lfo24"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the “Popular make” link</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l3 level1 lfo24"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">3.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the filter “Vote”</span></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l3 level1 lfo24"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">4.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Check the sort by ”Vote”</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:142;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Display in ascending or descending order according to "vote"</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:143;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Sorting by "vote" displayed in random order.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:144;mso-row-margin-right:357.25pt">
  <td width="464" colspan="2" valign="top" style="width:463.6pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Bug19</span></b></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US" style="font-family:&quot;Times Roman&quot;;
  mso-bidi-font-family:&quot;Times Roman&quot;;color:black;mso-font-kerning:0pt"><o:p></o:p></span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:145;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Summary of Bug<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Loading page is very slowly.</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:146;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Fuctional area<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Website page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:147;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Severity<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">High</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:148;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Description<o:p></o:p></span></b></span></span></p>
  <span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span>
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US"><o:p>&nbsp;</o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">The login user vote without
  the comment</span></span></span><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="ZH-CN" style="font-family:宋体;
  mso-ascii-font-family:Cambria;mso-ascii-theme-font:minor-latin;mso-fareast-font-family:
  宋体;mso-fareast-theme-font:minor-fareast;mso-hansi-font-family:Cambria;
  mso-hansi-theme-font:minor-latin">，</span><span lang="EN-US">the comment list
  didn’t display this record (data and author)</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:149;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal" align="left" style="text-align:left;mso-pagination:widow-orphan"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Steps to Reproduce<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l14 level1 lfo17"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">1.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Open the website: </span></span></span><a href="https://buggy.justtestit.org"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">https://buggy.justtestit.org</span></span></span></a><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"></span></span></p>
  <p class="MsoListParagraph" style="margin-left:18.0pt;text-indent:-18.0pt;
  mso-char-indent-count:0;mso-list:l14 level1 lfo17"><span style="mso-bookmark:
  OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><!--[if !supportLists]--><span lang="EN-US" style="mso-fareast-font-family:Cambria;mso-fareast-theme-font:
  minor-latin;mso-bidi-font-family:Cambria;mso-bidi-theme-font:minor-latin"><span style="mso-list:Ignore">2.<span style="font:7.0pt &quot;Times New Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span></span><!--[endif]--><span lang="EN-US">Click the button nativage to
  another page</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:150;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Expected Result:</span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Loading the page in 3-5s</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
 <tr style="mso-yfti-irow:151;mso-yfti-lastrow:yes;mso-row-margin-right:357.25pt">
  <td width="106" valign="top" style="width:106.35pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><b style="mso-bidi-font-weight:normal"><span lang="EN-US">Actual Result:<o:p></o:p></span></b></span></span></p>
  </td>
  
  <td width="357" valign="top" style="width:357.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span style="mso-bookmark:OLE_LINK1"><span style="mso-bookmark:OLE_LINK2"><span lang="EN-US">Loadng the page in 8-20s</span></span></span></p>
  </td>
  <td style="mso-cell-special:placeholder;border:none;padding:0cm 0cm 0cm 0cm" width="357"><p class="MsoNormal">&nbsp;</p></td>
  
 </tr>
</tbody></table>
