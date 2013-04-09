package ru.st.selenium.applogic;

import java.util.List;

import ru.st.selenium.model.Film;

public interface FilmHelper {

	void create(Film film);
	void searchfilm(String title);
	boolean isFilmCreated();
	boolean isDescIncomplete();
	boolean isFilmFinded(String title);
	boolean isFilmNotFinded();

}
