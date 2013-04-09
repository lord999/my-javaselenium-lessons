package ru.st.selenium.applogic2;

import java.util.List;

import ru.st.selenium.applogic.FilmHelper;
import ru.st.selenium.model.Film;
import ru.st.selenium.pages.AddFilmPage;


public class FilmHelper2 extends DriverBasedHelper implements FilmHelper {

  public FilmHelper2(ApplicationManager2 manager) {
    super(manager.getWebDriver());
  }

  @Override
  public void create(Film film) {
    // TODO Auto-generated method stub
	  pages.internalPage.btnAddFilm();
	  pages.addfilmPage.ensurePageLoaded()
	  .setFilmName(film.getTitle())
	  .setFilmYear(film.getYear())
	  .setFilmNotes(film.getNotes())
	  .clickSubmitButton();
  }
  
  
  @Override
  public boolean isFilmCreated() {
  return pages.internalPage.waitPageLoaded();
  }

  @Override
  public boolean isFilmFinded(String title) {
  return pages.searchResultPage.isSearchResultNotEmpty(title);
  }

  @Override
  public boolean isFilmNotFinded() {
  return pages.searchResultPage.isSearchResultEmpty();
  }

  @Override
  public boolean isDescIncomplete() {
	return pages.addfilmPage.isErrorMessagePresent();  
  }
  

  @Override
  public void searchfilm(String title) {
	pages.internalPage.SearchText(title);
    return;
  }

  
}
