	package com.Generic.global;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class WebDriverUtilfunctions{


		public WebDriver driver;
		public Actions action;
		public WebDriverWait wait;
		public JavascriptExecutor js;
		public Select select;
		public 	Robot robot;

		public WebDriverUtilfunctions(WebDriver driver)
		{
			this.driver=driver;
		}
		/**
		 * This method is used to maximise the window
		 * @param driver
		 */
		public void maximize() throws AWTException
		{
			driver.manage().window().maximize();
		}
		/**
		 * This method is used to move to the particular element by using Actions class
		 * @param element
		 */
		public void moveToElement(WebElement element)
		{
			action=new Actions(driver);
			action.moveToElement(element).build().perform();
		}
		/**
		 * This method is used to double click the particular element by using Actions class
		 * @param element
		 */
		public void doubleClick(WebElement element)
		{
			action=new Actions(driver);
			action.doubleClick().build().perform();
		}
		/**
		 * this method will perform random scroll
		 */
		public void scrollBy()
		{
			js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)", "");
		}
		/**
		 * This method will handle drop down by select class using visibleText
		 * @param element
		 * @param name
		 */
		public void selectByVisibleText(WebElement element,String strName)
		{
			select=new Select(element);
			select.selectByVisibleText(strName);
		}
		/**
		 * This method is used to highlight the particular WebElement by using javaScript executor
		 * @param element
		 */
		public void highlightElement(WebElement element) {

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='4px solid green'", element);
		}
		/**
		 * This method is used to pass the send keys to the text boxes
		 * @param element
		 * @param strUserNumber
		 */
		public void sendKeys(WebElement element,String strUserNumber)
		{
			element.sendKeys(strUserNumber);
		}
		public void clear(WebElement element)
		{
			element.clear();
		}
		/**
		 * This method is used foe clicking  
		 * @param element
		 */
		public void click(WebElement element)
		{
			element.click();
		}
		/**
		 * This method will wait for particular element to be clickable
		 * @param driver
		 * @param element
		 */
		public void waitForElementToLoad( WebElement element)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void elementWait() throws InterruptedException
		{
			Thread.sleep(16000);
		}

		/**
		 * This method is used for keyboard actions by using robot class
		 */

		public void robot1() throws AWTException, InterruptedException
		{

			robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("Robot Method1");
		}

		/**
		 * This method is used to click the element by using java script Executor
		 * @param element
		 */
		public void javascripExecutorClick(WebElement element)
		{
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
		}
		/**
		 * This method is used to double click the element by using java script Executor
		 * @param element
		 */
		public void javascripExecutorDoubleClick(WebElement element)
		{
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", element);
		}
		/**
		 * This method is used to capture the screen shot 
		 * @param image
		 */
		public void CaptureScreenshot(String strimage)
		{
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
			File destFile=new File("./Screenshots/"+strimage+".png");
			try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/**
		 * This method is used to get the title of the respective window
		 */
		public String getTitle()
		{
			return driver.getTitle();
		}
		/**
		 * This method is used to get text of the particular web element
		 * @param element
		 */
		public String getText(WebElement element)
		{
			return element.getText();
		}
		/**
		 * This method is used to get current url of the particular window
		 */
		public String getCurrentUrl()
		{
			return driver.getCurrentUrl();
		}
		/**
		 * This method is used to get current window id
		 */
		public String getWindow()
		{
			return driver.getWindowHandle();
		}
		/**
		 * This method is used to switch to another window
		 * @param targetWindow
		 */
		public void switchToWindow(String strtargetWindow)
		{
			driver.switchTo().window(strtargetWindow);
		}
		/**
		 * This method is used to get all the windows and returns set of strings or id
		 */
		public List<String> getAllWindows()
		{
			Set<String>allWindows=driver.getWindowHandles();
			List<String>list=new ArrayList<>(allWindows);
			return list;
		}

		public void switchToNextWindow()
		{
			List<String>list=getAllWindows();
			switchToWindow(list.get(list.size()-1));
		}
		/**
		 * This method will switch to the window with respect to the window url
		 * @param url
		 */
		public void windowHandle(String strurl)
		{

			for(String eachWindow : getAllWindows() ) {
				switchToWindow(eachWindow);
				System.out.println(getCurrentUrl());
				if(!getCurrentUrl().equals(strurl))
				{
					break;
				}
			}
		}
		public void decreaseQuantity(WebElement element,String value,WebElement target)
		{
			while(!getText(element).equals(value))
			{
				javascripExecutorClick(target);
			}
		}
	}










