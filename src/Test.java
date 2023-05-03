import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();

		// List <WebElement> myListOfOptions =
		// driver.findElements(By.tagName("option"));
//		for(int i=0;i<myListOfOptions.size();i++) 
//		{
//			System.err.println(myListOfOptions.get(i).getText()); 
//		}

		List<WebElement> list = new ArrayList<WebElement>();
		list = driver.findElements(By.tagName("option"));
		for (int i = 0; i < list.size(); i++) {
			System.err.println(list.get(i).getText());
		}

	}

}
