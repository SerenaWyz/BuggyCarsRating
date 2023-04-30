package keyword.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import keyword.configuration.Constants;
import keyword.testScript.TestSuiteByExcel;

public class ExcelUtil {
	private static XSSFSheet excelWSheet;
	private static XSSFWorkbook excelWBook;
	private static XSSFCell cell;
	private static XSSFRow row;
	public static void setExcelFile(String path) throws Exception {
		FileInputStream excelFile;
		try {
			excelFile=new FileInputStream(path);
			excelWBook=new XSSFWorkbook(excelFile);
		} catch (Exception e) {
			TestSuiteByExcel.testResult=false;
			System.out.println("Failed to set the path for the Excel file");
			e.printStackTrace();
		}
	}
		public static void setExcelFile(String path,String sheetName) throws Exception {
			FileInputStream excelFile;
			try {
				excelFile=new FileInputStream(path);
				excelWBook=new XSSFWorkbook(excelFile);
				excelWSheet=excelWBook.getSheet(sheetName);
			} catch (Exception e) {
				TestSuiteByExcel.testResult=false;
				System.out.println("Failed to set the path for the Excel file");
				e.printStackTrace();
			}
		}
	public static String getCellData(String sheetName,int rowNum,int colNum) {
		excelWSheet=excelWBook.getSheet(sheetName);
			try {
			cell=excelWSheet.getRow(rowNum).getCell(colNum);
			String cellData=null;
			switch (cell.getCellType()) {
			case STRING:
				cellData=cell.getStringCellValue()+"";
				break;

			case NUMERIC :
				cellData=String.valueOf(Math.round(cell.getNumericCellValue()));
				break;
			}
			return cellData;
		} catch (Exception e) {
			return "";
		}
	}
		public static int getLastRowNum() {
			return excelWSheet.getLastRowNum();
		}
	public static int getRowCount(String sheetName) {
		excelWSheet=excelWBook.getSheet(sheetName);
		int number=excelWSheet.getLastRowNum();
		return number;
	}
	public static int getFirstRowContainsTestCaseID(String sheetName,String testCaseName,int colNum) {
		int i;
		try {
		excelWSheet=excelWBook.getSheet(sheetName);
		int rowCount=ExcelUtil.getRowCount(sheetName);
		for (i = 0; i <rowCount; i++) {
			if (ExcelUtil.getCellData(sheetName, i,colNum).equalsIgnoreCase(testCaseName)) {
				break;
			}
		}
		return i;
		}catch(Exception e) {
		TestSuiteByExcel.testResult=false;
		return 0;
		}
	}

	public static int getTestCaseLastStepRow(String sheetName,String testCaseID,int testCaseStartRowNumber) {
		try {
		excelWSheet=excelWBook.getSheet(sheetName);
		for (int i = testCaseStartRowNumber; i < ExcelUtil.getRowCount(sheetName); i++) {
			if (!testCaseID.equals(ExcelUtil.getCellData(sheetName, i, Constants.Col_TestCaseId))) {
				int number=i;
				return number;
			}
		}
		int number=excelWSheet.getLastRowNum()+1;
		return number;
	}catch(Exception e){
		TestSuiteByExcel.testResult=false;
		return 0;
		}
	}
	public static void setCellData(String sheetName,int rowNum,int colNum,String result) {
		excelWSheet=excelWBook.getSheet(sheetName);
		try {
			row =excelWSheet.getRow(rowNum);
			cell=row.getCell(colNum,MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if (cell==null) {
				cell=row.createCell(colNum);
				cell.setCellValue(result);
			}else {
				cell.setCellValue(result);
			}
			FileOutputStream fileOutputStream=new FileOutputStream(Constants.PATH_EXCELFILE);
			excelWBook.write(fileOutputStream);
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (Exception e) {
			TestSuiteByExcel.testResult=false;
			e.printStackTrace();
		}
	}
}
