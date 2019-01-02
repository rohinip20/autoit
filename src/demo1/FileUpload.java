package demo1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\cjc softwares\\Seleniumdata\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/cjc%20softwares/autoit_document/autoitfile.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file']")).click();

		Runtime.getRuntime().exec("E:\\cjc\\autoit_DemoProject\\fileuploadtool.exe");
		
		System.out.println("File upload sucessfully");
	}

}
