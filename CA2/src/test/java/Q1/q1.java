package Q1;

import org.testng.annotations.Test;

public class q1 {
  @Test
  public void f() throws InterruptedException{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver;
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(co);
	  driver.navigate().to("h");
	  WebElement firstname=driver.findElement(By.id("input-firstname"));
	  
  }
}
