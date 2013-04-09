package ru.st.selenium.pages;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.IsElementPresent;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddFilmPage extends InternalPage {

	public AddFilmPage(PageManager pages) {
		super(pages);
	}
	
	
	@FindBy(name = "name")
	private WebElement FilmName;
	
	@FindBy(name = "imdbid")
	private WebElement FilmImdbID;
	
	@FindBy(name = "aka")
	private WebElement FilmAKA;
	
	@FindBy(name = "year")
	private WebElement FilmYear;
	
	@FindBy(name = "duration")
	private WebElement FilmDuration;
	
	@FindBy(name = "rating")
	private WebElement FilmRating;
	
	@FindBy(name = "notes")
	private WebElement FilmNotes;
	
	@FindBy(name = "taglines")
	private WebElement FilmTag;
	
	@FindBy(name = "plotoutline")
	private WebElement FilmPlotoutline;
	
	@FindBy(name = "plots")
	private WebElement FilmPlots;
	
	@FindBy(id = "text_languages_0")
	private WebElement FilmLang;
	
	@FindBy(name = "subtitles")
	private WebElement FilmSubtitles;
	
	@FindBy(name = "audio")
	private WebElement FilmAudio;
	
	@FindBy(name = "cast")
	private WebElement FilmCast;
	
	@FindBy(id = "submit")
	private WebElement SubmitButton;
	
	
	  public AddFilmPage setFilmName(String text) {
		  FilmName.sendKeys(text);
	    return this;
	  }
	  
	  public AddFilmPage setFilmImdbID(String text) {
		  FilmImdbID.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmAKA(String text) {
		  FilmAKA.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmYear(String text) {
		  FilmYear.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmDuration(String text) {
		  FilmDuration.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmRating(String text) {
		  FilmRating.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmNotes(String text) {
		  FilmNotes.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmTag(String text) {
		  FilmTag.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmPlotoutline(String text) {
		  FilmPlotoutline.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmPlots(String text) {
		  FilmPlots.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmLang(String text) {
		  FilmLang.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmSubtitles(String text) {
		  FilmSubtitles.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmAudio(String text) {
		  FilmAudio.sendKeys(text);
	    return this;
	  }

	  public AddFilmPage setFilmCast(String text) {
		  FilmCast.sendKeys(text);
	    return this;
	  }

	  public void clickSubmitButton() {
		    SubmitButton.click();
		  }
	  
	  
	  public AddFilmPage ensurePageLoaded() {
		    super.ensurePageLoaded();
		    wait.until(presenceOfElementLocated(By.id("imdbsearchform")));
		    return this;
		  }
	  
	  public boolean isErrorMessagePresent() {
		  try {
			    wait.until(presenceOfElementLocated(By.xpath("//form[@id='updateform']/table/tbody/tr[2]/td[2]/label [contains(@class, \"error\")]")));
			    wait.until(presenceOfElementLocated(By.xpath("//form[@id='updateform']/table/tbody/tr[4]/td[2]/label [contains(@class, \"error\")]")));
			    return true;
		    } catch (TimeoutException to) {
		      return false;
		    }
		  }
	  
}