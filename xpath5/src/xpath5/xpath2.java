package xpath5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.jdbc.PreparedStatement;
//comment3
public class xpath2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//String baseUrl = "https://www.guru99.com/";	
	
	String baseUrl = "http://demo.guru99.com/V4/";	
    System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
   // WebDriver driver = new ChromeDriver();	
    WebDriver driver = new FirefoxDriver();	
    driver.manage().window().maximize();
    driver.get(baseUrl);
    //elements=driver.findElements("//div[@class='container-fluid']//following::input");
    List<WebElement> elements = driver.findElements(By.tagName("input"));
   /* for (WebElement element : elements) {
        if (element.getAttribute("type").equals("text") || element.getAttribute("type").equals("password")) {
            System.out.println(element.getAttribute("name"));
        }
    }*/
    
    
    
    List<WebElement> elementsl = driver.findElements(By.tagName("a"));
    for (WebElement element : elementsl) {
    	
    	//System.out.println(element.getText());
    	String link=element.getText();
    	if(!(link.equalsIgnoreCase("Telecom Project") || link.equalsIgnoreCase("Selenium")|| link.equalsIgnoreCase("Demo Site")))
    	{
    		System.out.println(element.getText());
    	}
    } 
    }


}
   // connection1( driver);
    
   /* String Str="shashi's brother";
    
    String str1=null;
    
    if (Str.contains("'"))
    {
    	System.out.println(1);
    	//Str.
    }*/
  //  connection1(WebDriver driver);
    //List<WebElement> lis = driver.findElements(By.xpath("//.//*[@id='java_technologies']//li[1]"));
 //   .//*[@id='java_technologies']/li[18]	
 //   List<WebElement> lis = driver.findElements(By.xpath("//*[@id='name-and-slogan']//preceding::div"));
    //List<WebElement> lis = driver.findElements(By.xpath("//*[@id='name-and-slogan']//preceding::div/a"));
 
  //  List<WebElement> lis = driver.findElements(By.xpath("//*[@id='name-and-slogan']//preceding::div/a"));
   
   
    ////*[@id='name-and-slogan']//preceding::div//a[text()='Demo Site']
	
/*    
    for(WebElement liss:lis)
	{
		System.out.println(liss.getAttribute("name"));
		//System.out.println(liss.getText());
	}*/
	
    
    
	

