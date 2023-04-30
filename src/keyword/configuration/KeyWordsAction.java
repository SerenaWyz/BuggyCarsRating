package keyword.configuration;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import keyword.testScript.TestSuiteByExcel;
import keyword.util.Log;
import keyword.util.ObjectMap;
import keyword.util.WaitUtil;

public class KeyWordsAction {
	public static WebDriver driver;
	private static ObjectMap objectMap = new ObjectMap(Constants.PATH_CONFIGURATIONFILE);
	static {
		DOMConfigurator.configure("src/keyword/log4j.xml");
	}

	// open browser
	public static void open_browser(String string, String browserName) {
		if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			Log.info("Safari browser instance has already been declared");
		} else {
			driver = new ChromeDriver();
			Log.info("Chrome browser instance has already been declared");
		}
	}

	// homepage
	public static void homePage(String locatorExpression, String url) {
		driver.get(url);
		Log.info("Browser open the url:" + url);
	}

	// input
	public static void input(String locatorExpression, String inputString) {
		try {
			driver.findElement(objectMap.getLocator(locatorExpression)).clear();
			Log.info("clear" + locatorExpression + "all contents of the input box");
			driver.findElement(objectMap.getLocator(locatorExpression)).sendKeys(inputString);
			Log.info("In" + locatorExpression + "Enter in the input box" + inputString);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("In" + locatorExpression + "Enter in the input box" + inputString
					+ "Exception, specific exception message:" + e.getMessage());
			e.printStackTrace();
		}
	}

	// select_select hobby
	public static void select_hobby(String locatorExpression, String i) {
		try {
			Select hobbyList = new Select(driver.findElement(By.id("hobby")));
			Assert.assertFalse(hobbyList.isMultiple());
			hobbyList.selectByIndex(Integer.parseInt(i));
			Log.info("[Profile]select success");
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("[Profile]select false,exception information:" + e.getMessage());
			e.printStackTrace();
		}
	}

	// get keyword
	public static void get(String locatorExpression, String string) {
		try {
			driver.findElement(objectMap.getLocator(locatorExpression)).getText();
			Log.info("getText " + locatorExpression + "webElement success");
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("getText " + locatorExpression + "webElement false,exception information:" + e.getMessage());
			e.printStackTrace();
		}

	}

	// click
	public static void click(String locatorExpression, String string) {
		try {
			driver.findElement(objectMap.getLocator(locatorExpression)).click();
			Log.info("click" + locatorExpression + "webElement success");
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("click" + locatorExpression + "webElement false,exception information:" + e.getMessage());
			e.printStackTrace();
		}

	}

	// click_car
	public static void click_car(String locatorExpression, String string) {
		try {
			// select a car

			String path = "//table/tbody/tr[" + string + "]/td[7]/a";
			WebElement carView = driver.findElement(By.xpath(path));
			WaitUtil.sleep(3000);
			carView.click();
			Log.info("click" + locatorExpression + "webElement success");
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("click" + locatorExpression + "webElement false,exception information:" + e.getMessage());
			e.printStackTrace();
		}

	}

	static Boolean whethervode;

	public static void vote(String locatorExpression, String string) {
		// the vote whether already voted
		whethervode = driver.getPageSource().contains("Thank you for your vote!");

		try {
			// votes
			if (whethervode == false) {
				// Pre-votes number
				WebElement votesNum = driver.findElement(By.xpath("//h4[contains(text(),'Votes: ')]/strong"));
				String preVote = votesNum.getText();
				System.out.println("preVote is:" + preVote);

				// submit vote
				WebElement commentArea = driver.findElement(By.id("comment"));
				commentArea.sendKeys(string);
				WebElement voteButton = driver.findElement(By.xpath("//button[contains(text(),'Vote!')]"));
				voteButton.click();
				WaitUtil.sleep(25000);
				// After-votes number
				String afterVote = votesNum.getText();
				System.out.println("afterVote is:" + afterVote);

				Log.info("voteAfter is " + afterVote);
				// assert: check the vote number
				Integer cVote = Integer.parseInt(preVote) + 1;
				Assert.assertTrue(driver.getPageSource().contains("Thank you for your vote!"));
				Assert.assertEquals(afterVote, cVote);
				// assert: successed to vote
				Log.info("clicked the vote!");

			} else {
				// already voted
				System.out.println("You already voted!");
				Log.info("You already voted");

			}

		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Clicked the vote is false,exception information:" + e.getMessage());
			e.printStackTrace();
		}
	}

	// waitFor_Element
	public static void waitFor_Element(String xpathExpression, String string) {
		try {
			WaitUtil.waitWebElement(driver, objectMap.getLocator(xpathExpression));
			Log.info("Success to wait element, it is" + xpathExpression);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Fail to wait element, exception information:" + e.getMessage());
			e.printStackTrace();
		}
	}

	// sleep
	public static void sleep(String locatorExpression, String sleepTime) {
		try {
			WaitUtil.sleep(Integer.parseInt(sleepTime));
			Log.info("Sleep:" + Integer.parseInt(sleepTime) / 15000 + "ms success");
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Error with sleep thread, exception information:" + e.getMessage());
			e.printStackTrace();
		}
	}

	// assert_String
	public static void assert_String(String locatorExpression, String assertString) {
		try {
			Assert.assertTrue(driver.getPageSource().contains(assertString));
			Log.info("Assertion keyword success:" + assertString);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Assertion keyword faile, exception information:" + e.getMessage());
			System.out.println("Assertion keyword faile");
		}
	}

	// assert_equal
	public static void assert_EqualCurrent(String locatorExpression, String assertString) {
		try {
			String currentUrl = driver.getCurrentUrl();
			Assert.assertEquals(assertString, currentUrl);
			Log.info("Assertion keyword success:" + assertString);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Assertion keyword faile, exception information:" + e.getMessage());
			System.out.println("Assertion keyword faile");
		}
	}

	// assert_false
	public static void assert_False(String locatorExpression, String assertString) {
		try {
			Assert.assertFalse(driver.getPageSource().contains(assertString));
			Log.info("Assertion assert_False is success:" + assertString);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Assertion assert_False is false, exception information:" + e.getMessage());
			System.out.println("Assertion False false");
		}
	}

	// assert_Commentlist_comment

	public static void assert_Comment(String firstname, String comment) {
		try {
			WebElement voteDate = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[1]"));
			WebElement voteAuthor = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[2]"));
			WebElement voteComment = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[3]"));
			String listDate = voteDate.getText();
			String listAuthor = voteAuthor.getText();
			String listComment = voteComment.getText();
			System.out.println(listDate);
			System.out.println(listAuthor);
			System.out.println(listComment);
			// assert
			Assert.assertFalse(listDate.isEmpty());
			Assert.assertEquals(listAuthor, firstname);
			Assert.assertEquals(listComment, comment);
			Log.info("Comment List:" + listDate + listAuthor + listComment);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Assertion assert_CommentisEmpty is false, exception information:" + e.getMessage());
			System.out.println("Assertion assert_CommentisEmpty false");
		}
	}

	// assert_Commentlist_unComment
	public static void assert_noComment(String firstname, String comment) {
		try {
			WebElement voteDate = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[1]"));
			WebElement voteAuthor = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[2]"));
			WebElement voteComment = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[3]"));
			String listDate = voteDate.getText();
			String listAuthor = voteAuthor.getText();
			String listComment = voteComment.getText();
			System.out.println(listDate);
			System.out.println(listAuthor);
			System.out.println(listComment);
			Assert.assertFalse(listDate.isEmpty());
			Assert.assertEquals(listAuthor, firstname);
			Assert.assertTrue(listComment.isEmpty());
			Log.info("Comment List:" + listDate + listAuthor + listComment);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Assertion assert_CommentisEmpty is false, exception information:" + e.getMessage());
			System.out.println("Assertion assert_CommentisEmpty false");
		}
	}

	// assert_Commentlist_unVote
	public static void assert_Commentlist_unVote(String firstname, String comment) {
		try {
			WebElement voteDate = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[1]"));
			WebElement voteAuthor = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[2]"));
			WebElement voteComment = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[3]"));
			String listDate = voteDate.getText();
			String listAuthor = voteAuthor.getText();
			String listComment = voteComment.getText();
			System.out.println(listDate);
			System.out.println(listAuthor);
			System.out.println(listComment);
			Assert.assertFalse(listDate.isEmpty());
			Assert.assertFalse(listAuthor.isEmpty());
			Assert.assertFalse(listComment.isEmpty());
			Log.info("Comment List:" + listDate + listAuthor + listComment);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Assertion assert_CommentisEmpty is false, exception information:" + e.getMessage());
			System.out.println("Assertion assert_CommentisEmpty false");
		}
	}

	// close_browser
	public static void close_browser(String string1, String string2) {
		try {
			System.out.println("close the browser");
			Log.info("close the browser");
			driver.quit();
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("Error closing browser, exception information:" + e.getMessage());
			e.printStackTrace();
		}
	}
}
