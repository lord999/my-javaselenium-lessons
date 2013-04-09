package ru.st.selenium;

import org.testng.annotations.*;

import static org.junit.Assert.*;

import ru.st.selenium.model.Film;

public class AddFilmNeg extends ru.st.selenium.pages.TestBase {

	  
	  @Test
	  public void AddFilm() throws Exception {
		    Film film = new Film().setTitle("").setYear("");
		    app.getFilmHelper().create(film);
		    assertTrue(app.getFilmHelper().isDescIncomplete());
		  }
	  
	}