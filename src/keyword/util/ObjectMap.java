package keyword.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	  Properties properties;
	  public ObjectMap(String propFile) {
		  properties=new Properties();
		  try {
			FileInputStream in=new FileInputStream(propFile);
			properties.load(in);
			in.close();
		} catch (Exception e) {
			System.out.println("Reading the propFile is error");
			e.printStackTrace();
		}
	  }
		public By getLocator(String ElementNameInproFile) throws Exception {
			String locator=properties.getProperty(ElementNameInproFile);
			String locatorType=locator.split(">")[0];
			String locatorValue=locator.split(">")[1];
			System.out.println("get locatorType:"+locatorType+"\t get locatorValue:"+locatorValue);
			if (locatorType.toLowerCase().equals("name")) {
				return By.name(locatorValue);
			}else if (locatorType.toLowerCase().equals("id")) {
				return By.id(locatorValue);
			}else if ((locatorType.toLowerCase().equals("classname"))||(locatorType.toLowerCase().equals("class"))) {
				return By.className(locatorValue);
			}else if ((locatorType.toLowerCase().equals("tagname"))||(locatorType.toLowerCase().equals("tag"))) {
				return By.className(locatorValue);
			}else if ((locatorType.toLowerCase().equals("linktext"))||(locatorType.toLowerCase().equals("link"))) {
				return By.linkText(locatorValue);
			}else if (locatorType.toLowerCase().equals("partiallinktext")) {
				return By.partialLinkText(locatorValue);
			}else if ((locatorType.toLowerCase().equals("cssselector"))||(locatorType.toLowerCase().equals("css"))) {
				return By.cssSelector(locatorValue);
			}else if (locatorType.toLowerCase().equals("xpath")) {
				return By.xpath(locatorValue);
			}else {
				throw new Exception("typing locator type is not defined:"+locatorType);
			}
		}
}
