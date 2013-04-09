package ru.st.selenium;

import org.testng.annotations.*;

import static org.junit.Assert.*;

import ru.st.selenium.model.Film;

public class AddFilmPos extends ru.st.selenium.pages.TestBase {

	  @Test
	  public void AddNewFilm() throws Exception {
	    Film film = new Film().setTitle("Test").setYear("100000000").setNotes("Test");
	    app.getFilmHelper().create(film);
	    assertTrue(app.getFilmHelper().isFilmCreated());	    
	  }
	 
	}