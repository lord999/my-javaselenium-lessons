package ru.st;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

  public class SearchPos extends ru.st.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void SearchPos() throws Exception {
	  
	  testSearch("movie", "movie", 1);
	  testSearch("twas brillig", "Jabberwocky Movie", 0);
	  
  }
  
  private boolean testSearch(String strSearch,String strRes,Integer select) throws Exception {
    driver.get(baseUrl + "/php4dvd/");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("results"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys(strSearch);
    driver.findElement(By.id("q")).sendKeys(Keys.RETURN);

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div.title"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
    	if (select==1){
    	
      assertTrue(driver.findElement(By.cssSelector("div.title")).getText().matches("^[\\s\\S]*" + strRes + "[\\s\\S]*$"));
    	}
    	
    	else { 
    	      assertTrue(driver.findElement(By.cssSelector("div.title")).getText().matches(strRes)); 		
    	}
      
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
	return true;
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
