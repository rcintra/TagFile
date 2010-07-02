package br.rcintra.scwcd.tag.simple;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest1 extends SimpleTagSupport {
	
	private String[] movies = {"movie1","movie2","movie3","movie4"};

	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		//getJspContext().getOut().print("This is the lamest use of a custom tag");
		//getJspContext().setAttribute("message", "Wear sunscreen");
		//getJspBody().invoke(null);
		for (int i = 0; i < movies.length; i++) {
			getJspContext().setAttribute("movie", movies[i]);
			getJspBody().invoke(null);
		}
	}
}
