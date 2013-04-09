package ru.st.selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue;

public class SearchResultPage extends InternalPage {

	public SearchResultPage(PageManager pages) {
		super(pages);
	}
	
	  public boolean isSearchResultEmpty() {
		  try{
			   wait.until(presenceOfElementLocated(By.className("content")));
			  
			  return true;
		  }
		  catch (TimeoutException to){	return false;}
		  }
	  
	  public boolean isSearchResultNotEmpty(String text) {
		  try{
			  driver.findElement(By.cssSelector("div.title")).getText().matches("^[\\s\\S]*" + text + "[\\s\\S]*$");
			  return true;
		  }
		  catch (TimeoutException to){	return false;}
		  }
}