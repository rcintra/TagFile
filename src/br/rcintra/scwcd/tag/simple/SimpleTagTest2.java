package br.rcintra.scwcd.tag.simple;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import br.rcintra.scwcd.domain.Movie;

public class SimpleTagTest2 extends SimpleTagSupport {

	private List<Movie> movieList;
	
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		for(Movie movie : movieList){
			getJspContext().setAttribute("movie", movie);
			getJspBody().invoke(null);
		}
	}

	
}
