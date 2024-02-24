package assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IfElseBrowser {

	public static void main(String[] args) throws InterruptedException {
		String browser;
		System.out.println("Enter the name of browser");
		Scanner input=new Scanner(System.in);
		browser=input.nextLine();
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome")) 
		{
			 driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.quit();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
			Thread.sleep(3000);
			driver.quit();

		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			 driver=new EdgeDriver();
			Thread.sleep(3000);
			driver.quit();
		}
		else
		{
			System.out.println("exit");
		}
		
	}

}