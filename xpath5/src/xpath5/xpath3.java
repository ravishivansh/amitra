package xpath5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.jdbc.PreparedStatement;
//comment3
public class xpath3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
	
	//String baseUrl = "https://www.guru99.com/";	
	
	String baseUrl = "https://support.mozilla.org/en-US/products/firefox/basic-browsing-firefox";	
    System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
   // WebDriver driver = new ChromeDriver();	
    WebDriver driver = new FirefoxDriver();	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get(baseUrl);
    
   //  List<WebElement> tagn = driver.findElements(By.tagName("a"));
   //System.out.println(tagn.size());
   
   List<WebElement> xp = driver.findElements(By.xpath("//a"));
		   System.out.println(xp.size());
   
  /* if(driver.findElement(By.xpath("//button[text()='×']")).isDisplayed());
   {
	//closex.isDisplayed();
	   driver.findElement(By.xpath("//button[text()='×']")).click();
   }*/
   // driver.findElement(by.xpath("//html/body/div[5]/main/aside/ul/li[1]/a/text()"));
    
  //  List<WebElement> mainsl = driver.findElements(By.xpath("html/body/div[5]/main//a")); 
    
   // List<WebElement> mainsl = driver.findElements(By.xpath("html/body/div[5]/main//div[2]")); 
   // List<WebElement> mainsl = driver.findElements(By.xpath("html/body/div[5]/main/aside/ul/li/a"));
 List<WebElement> mainsl = driver.findElements(By.xpath("//aside[@class='grid_3']/ul/li"));

	/*int size=driver.findElements(By.xpath("//aside[@class='grid_3']/ul/li/ul//a")).size();
	System.out.println("size "+size);
*/
		   
  // System.out.println(mainsl.size());
    
    System.out.println("value is "+mainsl.size());
    for(int i=0;i<mainsl.size();i++)
	{
    	driver.findElements(By.xpath("//aside[@class='grid_3']/ul/li/a")).get(i).click();
    	System.out.println(1);
    	Thread.sleep(2000);
    	
    	int size=driver.findElements(By.xpath("//aside[@class='grid_3']/ul/li/ul//a")).size();
    	System.out.println("size "+size);

    	if(true)
    	{
    		WebDriverWait wait=new WebDriverWait(driver, 5);
    		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//aside[@class='grid_3']/ul/li/ul//a")));
    		
    	}else
    	{
    		
            	int size1=driver.findElements(By.xpath("//aside[@class='grid_3']/ul/li/ul//a")).size();
            	System.out.println("sizess "+size1);

        		System.out.println(2);
        		for(int j=0;j<size1;j++)
        				{
            		System.out.println(3);

        		driver.findElements(By.xpath("//aside[@class='grid_3']/ul/li/ul//a")).get(j).click();
        		System.out.println(4);
        		Thread.sleep(2000);

        				}
        	
        	
    	}
    	
    	if(false)
    	{
    		System.out.println("false");
    	}
    	
    	
    	
   // 	List<WebElement> tagn = driver.findElements(By.xpath("html/body/div[5]/main/aside/ul/li/ul/li/a"));
    	
    	//driver.findElements(By.xpath("html/body/div[5]/main/aside/ul/li/ul/li/a"))!=null)
    	
    	
    	 //List<WebElement> tagn = driver.findElements(By.tagName("a"));
    	//List<WebElement> tagn = driver.findElements(By.tagName("a"));
    	 /*  System.out.println("no of links" +tagn.size());
    	   for(int j=0;j<tagn.size();j++)
    	   {
    		   Thread.sleep(2000);
    		  // tagn = driver.findElements(By.tagName("a"));
    	   System.out.println(driver.findElements(By.xpath("html/body/div[5]/main/aside/ul/li/ul/li/a")).get(j).getText());
    	  // tagn.get(i).getAttribute("")
    	   
    	   for(int j=0;j<tagn.size();j++)
    	   {
    		   Thread.sleep(2000);
    		   tagn = driver.findElements(By.tagName("a"));
    	   System.out.println(tagn.get(j).getText());
    	  // tagn.get(i).getAttribute("")
    	   
    	   }
    	   
    	   
    	   
    	   }
    	
	}
    */
   /* WebElement element12 = driver.findElement(By.xpath("html/body/div[5]/main/aside/ul/li[1]/a"));
  
    System.out.println(element12.getText());
    */
    // List<WebElement> elementl = driver.findElements(By.xpath("html/body/div[5]/main/aside/ul/li/a"));

   /* for(WebElement wb1:elementl )
    {
    	//int i=0;
    	System.out.println(wb1.getText());
    	Thread.sleep(2000);
    	wb1.click();
    	List<WebElement> aelem = driver.findElements(By.tagName("a"));
    	
    	for(WebElement aele:aelem)
    	{
    		System.out.println(aele.getText());
    		i++;
    	}
    	System.out.println("value " +i);
    	
    	
    	
    }*/
    
   /* //elements=driver.findElements("//div[@class='container-fluid']//following::input");
    List<WebElement> elements = driver.findElements(By.tagName("input"));
    for (WebElement element : elements) {
        if (element.getAttribute("type").equals("text") || element.getAttribute("type").equals("password")) {
            System.out.println(element.getAttribute("name"));
        }
    }
    
    
    
    List<WebElement> elementsl = driver.findElements(By.tagName("a"));
    for (WebElement element : elementsl) {
    	
    	//System.out.println(element.getText());
    	String link=element.getText();
    	System.out.println(element.getText());
    	
    	WebElement closex = driver.findElement(By.xpath("//button[@class='sg-b-p-c' and text()='×']"));
    	
    	closex.isDisplayed();
    	closex.click();
    	if(!(link.equalsIgnoreCase("Telecom Project") || link.equalsIgnoreCase("Selenium")|| link.equalsIgnoreCase("Demo Site")))
    	{
    		System.out.println(element.getText());
    	}*/
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
	
    
    
	

