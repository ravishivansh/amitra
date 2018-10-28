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
public class xpath1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//String baseUrl = "https://www.guru99.com/";	
	
	String baseUrl = "http://demo.guru99.com/V4/";	
    System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
   // WebDriver driver = new ChromeDriver();	
   // WebDriver driver = new FirefoxDriver();	
   // driver.manage().window().maximize();
   // driver.get(baseUrl);
   // connection1( driver);
    
    String Str="shashi's brother";
    
    String str1=null;
    
    if (Str.contains("'"))
    {
    	System.out.println(1);
    	//Str.
    }
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
	
    
    
	
}	


public static void connection1(WebDriver driver) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//Statement st=con.createStatement();
Statement st = con.createStatement(
	    ResultSet.TYPE_SCROLL_INSENSITIVE,
	    ResultSet.CONCUR_UPDATABLE);
/*Statement st1 = con.createStatement(
	    ResultSet.TYPE_SCROLL_INSENSITIVE,
	    ResultSet.CONCUR_UPDATABLE);*/
ResultSet rs = st.executeQuery("Select * from products");
List<WebElement> lis = driver.findElements(By.xpath("//input[@name='uid']//following::input[contains(@name,'btn')]"));

String Curl=driver.getCurrentUrl();

String url[]=Curl.split("/");
/*for(String urlpart:url)
{
	System.out.println(urlpart);
}*/
for(int i=0;i<url.length;i++)
{
	if (i==(url.length)-1)
	{
		System.out.println(url[(url.length)-1]);
		String sid=(url[(url.length)-1]);
	
	System.out.println(url[i]);
	}
}
System.out.println("Curl " +Curl);
	
	for(int i=0;i<lis.size();i++)
	{
		String act=lis.get(i).getAttribute("name");
		
		System.out.println(act);
		//rs.moveToCurrentRow();
		rs.beforeFirst();
		while(rs.next()) {
			String EmpId= rs.getString("name");
			int PCD= rs.getInt("productID");
			String PCode= rs.getString("productCode");
			
			//System.out.println(PCD);	
			
	if(act.equalsIgnoreCase(EmpId))
	{
		//System.out.println(12);
		System.out.println(act);
		System.out.println(EmpId);	
		System.out.println(PCD);
		//String sql3="select CustID from customer where ProductID=?";
	//	java.sql.PreparedStatement preparedStmt1 =con.prepareStatement(sql3);
		//preparedStmt1.setInt(1, PCD);
		//preparedStmt1.execute();
		//ResultSet rs1 = st1.executeQuery(sql3);
		//int CustID= rs1.getInt("CustID");
	String sql2="update customer set Name='ttt' where ProductID=?";
	java.sql.PreparedStatement preparedStmt =con.prepareStatement(sql2);
	preparedStmt.setInt(1, PCD);
	//preparedStmt.setString(2,PCode);
	//preparedStmt.setInt(2,CustID);
	preparedStmt.execute();
	//	st.executeUpdate(sql2);
		//System.out.println(13);
		
	}
		}
	//SELECT * FROM products p;
	//String EmpName= rs.getString("EmpName");
	//String EmpAddress=rs.getString(3);
  }
	con.close();
  }
    }


