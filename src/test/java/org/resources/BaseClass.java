package org.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\JpetApplication\\driver\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public static void LaunchApp(String Url) {
		driver.get(Url);

	}

	public static void type(WebElement w, String s) {
		w.sendKeys(s);
	}

	public static void click(WebElement w) {
		w.click();
	}

	public static String TakeUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;

	}

	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public static void moveTo(WebElement e) {
		a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void dragDrop(WebElement src, WebElement des) {
		a.dragAndDrop(src, des).perform();
	}

	public static void doubleClick(WebElement e) {
		a.doubleClick().perform();
	}

	public static void contextClick(WebElement e) {
		a.contextClick().perform();
	}

	public static void SBI(WebElement w, int Index) {
		s = new Select(w);
		s.selectByIndex(Index);
	}

	public static void SBV(WebElement w, String value) {
		s = new Select(w);
		s.selectByValue(value);
	}

	public static void SBVText(WebElement w, String Text) {
		s = new Select(w);
		s.deselectByVisibleText(Text);
	}

	public static void TakeScreenShot() throws IOException {
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		String image = "C:\\Users\\Admin\\eclipse-workspace\\JpetApplication\\ScreenShots\\ss" + sdf.format(d) + ".png";
		File saveFile = new File(image);
		FileUtils.copyFile(screenshotAs, saveFile);

	}

	public static void robotttt() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void quit() {
		driver.quit();
	}


}
