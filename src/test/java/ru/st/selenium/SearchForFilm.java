package ru.st.selenium;

import org.testng.annotations.*;

import static org.junit.Assert.*;


public class SearchForFilm extends ru.st.selenium.pages.TestBase {

	  @Test
	  public void SearchFilm() throws Exception {
		app.getFilmHelper().searchfilm("Test");
	    assertTrue(app.getFilmHelper().isFilmFinded("Test"));
	  }
	  
	  @Test
	  public void SearchFilmNeg() throws Exception {
		app.getFilmHelper().searchfilm("FJKFHFUHFIUFH");
	    assertTrue(app.getFilmHelper().isFilmNotFinded());
	  }
	   
	  
	}