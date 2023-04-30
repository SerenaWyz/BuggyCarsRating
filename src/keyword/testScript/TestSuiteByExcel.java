package keyword.testScript;

import java.lang.reflect.Method;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import keyword.configuration.Constants;
import keyword.configuration.KeyWordsAction;
import keyword.util.ExcelUtil;
import keyword.util.Log;

public class TestSuiteByExcel {
	public static String testCaseID;
	public static String testCaseRunFlag;
	public static int testStep;
	public static int testLastStep;
	public static String value;
	public static String keyword;
	public static Method method[];
	public static KeyWordsAction keyWordsAction;
	public static boolean testResult;
	public static String locatorExpression;

  @Test
  public void testTestSuite() throws Exception {
	   keyWordsAction=new KeyWordsAction();
	   method=keyWordsAction.getClass().getMethods();
	  String excelFilePath=Constants.PATH_EXCELFILE;
	  ExcelUtil.setExcelFile(excelFilePath);
	  int testCasesCount=ExcelUtil.getRowCount(Constants.SHEET_TESTSUITE);
	  for (int testCaseNo = 1; testCaseNo <= testCasesCount; testCaseNo++) {
		testCaseID=ExcelUtil.getCellData(Constants.SHEET_TESTSUITE, testCaseNo, Constants.Col_TestCaseId);
		testCaseRunFlag=ExcelUtil.getCellData(Constants.SHEET_TESTSUITE, testCaseNo, Constants.Col_RunFlag);
		if (testCaseRunFlag.equalsIgnoreCase("y")) {
			Log.startTestCase(testCaseID);
			testResult=true;
			testStep=ExcelUtil.getFirstRowContainsTestCaseID(Constants.SHEET_TESTSTEPS, testCaseID, Constants.Col_TestCaseId);
			testLastStep=ExcelUtil.getTestCaseLastStepRow(Constants.SHEET_TESTSTEPS, testCaseID, testStep);
			for (; testStep < testLastStep; testStep++) {
				keyword=ExcelUtil.getCellData(Constants.SHEET_TESTSTEPS, testStep, Constants.Col_KeyWordAction);
				Log.info("Get the keywords from an Excel file:"+keyword);
				locatorExpression=ExcelUtil.getCellData(Constants.SHEET_TESTSTEPS, testStep, Constants.Col_LocatorExpression);
				value=ExcelUtil.getCellData(Constants.SHEET_TESTSTEPS, testStep, Constants.Col_ActionValue);
				Log.info("get the operater value from an Excel file:"+value);
				execute_Actions();
				if (testResult==false) {
					ExcelUtil.setCellData(Constants.SHEET_TESTSUITE, testCaseNo, Constants.Col_TestSuiteTestResult, "False");
					Log.endTestCase(testCaseID);
					break;
				}
				if (testResult==true) {
					ExcelUtil.setCellData(Constants.SHEET_TESTSUITE, testCaseNo, Constants.Col_TestSuiteTestResult, "Pass");
				}
			}
			Log.endTestCase(testCaseID);
		}
	}
  }
  private static void execute_Actions() {
	  try {
		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().equalsIgnoreCase(keyword)) {
				method[i].invoke(keyWordsAction,locatorExpression,value);
				if (testResult==true) {
					ExcelUtil.setCellData(Constants.SHEET_TESTSTEPS, testStep, Constants.Col_TestStepTestResult, "Pass");
				break;
			}else {
				ExcelUtil.setCellData(Constants.SHEET_TESTSTEPS, testStep, Constants.Col_TestStepTestResult, "False");
				keyWordsAction.close_browser("","");
				break;
				}
			}
		}
	} catch (Exception e) {
		Assert.fail("Execution is error, The test execution is false");
	}
  }
  @BeforeClass
  public void BeforeClass() {
	  DOMConfigurator.configure("src/keyword/log4j.xml");
  }
}





