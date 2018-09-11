import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WinDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WiniumDriver driver=null;
		DesktopOptions option=new DesktopOptions();
		String path="C:\\Program Files (x86)\\SAP\\FrontEnd\\SAPgui\\saplogon.exe";
		option.setApplicationPath(path);
		option.setDebugConnectToRunningApp(false);
		option.setLaunchDelay(2);

		driver=new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(5000);
		if(driver.findElement(By.id("TitleBar")).getSize()!=null)
		{
			WebElement e=driver.findElement(By.name("02.20 VRZ - ERP Pre-prod "));
					//(By.name("VRZ [PUBLIC]"));
			
			Thread.sleep(1000);
			e.click();
			/*driver.findElement(By.name("VRZ [PUBLIC]")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);*/
			
			/*Actions action=new Actions(driver);
			action.moveToElement(e);
			action.doubleClick(e).build().perform();*/
			driver.findElement(By.name("Log On")).click();
			Thread.sleep(6000);
				
			

			
			try {
				Robot robot;
				StringSelection stringSelection = null;
				String user = "nagsab01";
				stringSelection=new StringSelection(user);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, stringSelection);
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			
				
			    robot.keyPress(KeyEvent.VK_TAB);
			    robot.keyRelease(KeyEvent.VK_TAB);
			    
			    Thread.sleep(10000);
			    
		  
		    
				String pwd = "Sabya@jul18";
				stringSelection=new StringSelection(pwd);
				Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard1.setContents(stringSelection, stringSelection);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(15000);
			
				if(driver.findElement(By.className("Edit")).getSize()!=null)
				{
					System.out.println("Got itttt");
					//driver.findElement(By.className("Edit")).click();
					Actions action=new Actions(driver);
					action.moveToElement(driver.findElement(By.className("Edit")));
					
					String tcode = "/nzrmd021";
					
					
					stringSelection=new StringSelection(tcode);
					Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard2.setContents(stringSelection, stringSelection);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					Thread.sleep(6000);
					robot.keyPress(KeyEvent.VK_ENTER);
					
					
					Thread.sleep(6000);
					String excelPath="G:\\Project\\DemoWinTwo\\src\\ECC Upload Template-Full Dat 08.xlsx";
					String purchaseorg="BQ10";
					
					stringSelection=new StringSelection(excelPath);
					Clipboard clipboard3 = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard3.setContents(stringSelection, stringSelection);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_TAB);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_TAB);
					Thread.sleep(2000);
					stringSelection=new StringSelection(purchaseorg);
					Clipboard clipboard4 = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard4.setContents(stringSelection, stringSelection);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_TAB);
					Thread.sleep(2000);
					robot.mouseMove(-100, 100);
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_TAB);
					Thread.sleep(2000);
					stringSelection=new StringSelection(purchaseorg);
					Clipboard clipboard5 = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard5.setContents(stringSelection, stringSelection);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_F8);
					Thread.sleep(20000);
					
					
					
				}
				driver.close();
				
				
				
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//driver.close();
		
			
		
			
		}

	}
}
