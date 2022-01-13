package org.base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Select s;
	public static Actions a;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	
	public static void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
	}
	
	public static void passUrl(String url) {
		driver.get(url);
	}
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void toInput(WebElement element, String input) {
		element.sendKeys(input);
		
	}
	public static void btnClick(WebElement element) {
		element.click();		
	}
	
	public static void radioBtnClick(WebElement element) {
		element.click();		
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void printText(WebElement element) {
		System.out.println(element.getText());
	}
	
	public static void getValue(WebElement element) {
		System.out.println(element.getAttribute("value"));
	}
	
	public static void printUrl() {
		System.out.println(driver.getCurrentUrl());
		
	}
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}
	public static void toPerformMouseHoverAction(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void toPerformEnter() throws AWTException{
		
		Robot r= new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	public static void toPerformTab() throws AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public static void toPerformDown() throws AWTException {
	Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
	}  
	public static void toPerformDragandDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest);
	}
	
	// TASK STATRS HERE
	public static void totakeScreeshot(String name) throws IOException {
		ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\"+name+"facebook.png");
		FileUtils.copyFile(src, dest);
	}
	public static void toWait() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		public static String excelRead(int row, int cell) throws IOException {
			
			File file = new File("C:\\Users\\91984\\eclipse-workspace\\FrameWork\\data\\datas.xlsx");
					
			FileInputStream f= new FileInputStream(file);
			
			Workbook w = new XSSFWorkbook(f);
			
			Sheet s = w.getSheet("Sheet1");
			
			Row r= s.getRow(row);
			
			Cell c = r.getCell(cell);
			
			int cellType=c.getCellType();
			
			String value;
			
					if (cellType==1) {
						
						value = c.getStringCellValue();
						
					} else if (DateUtil.isCellDateFormatted(c)) {
						Date d=c.getDateCellValue();
						
				SimpleDateFormat s1 = new SimpleDateFormat("dd-mmm-yyyy");
						
						value =s1.format(d);
					} else {
						double dd = c.getNumericCellValue();
						
						long l=(long)dd;
						
						value = String.valueOf(l);
					}
					return value;
				}
		

		public static void rightClk() {
			a.contextClick().perform();
}
		public static void doubleClk(WebElement target) {
			a.doubleClick(target).perform();
	}
		
		public static void toGetSingleWindowId() {
			driver.getWindowHandle();
		}
		public static void toGetMultipleWindowId() {
			driver.getWindowHandles();
		}
		public static void toSwitchOverBtwWindows(String name) {
			driver.switchTo().window(name);
		}
		
		public static void simpleAlert() {
			driver.switchTo().alert().accept();
			
		}
		
		public static void dropDown() {
		s.selectByVisibleText("");	
		
		}
		
		public static void javaScriptSetAttribute(WebElement element,String name) {
			 js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','name')",element); 
		}
		public static void quickInteractionPrintText(WebElement element) {
			 js.executeScript("arguments[0].getAttribute('value')", element);
		}
		public static void quickInteractionClick(WebElement btnClk) {
			js.executeScript("arguments[0].click()", btnClk);
		}
		
//		public static void printListOfProduct(WebElement element) {
//		
//			for (WebElement price : element) {
//				
//				System.out.println(price.getText().toString());
//				
//			}
//			System.out.println(element.getAttribute("value"));
//			
//			
//		}
		
		
//		
}
		
	
