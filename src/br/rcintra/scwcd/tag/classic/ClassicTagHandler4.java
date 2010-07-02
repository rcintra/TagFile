package br.rcintra.scwcd.tag.classic;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler4 extends TagSupport {
	
	private static final long serialVersionUID = -5343594525740430299L;
	JspWriter out;
	String[] movies = {"SpiderMan","Saved!","Amelie"};
	int movieCounter;

	@Override
	public int doStartTag() throws JspException {
		movieCounter = 0;
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		if(movieCounter < movies.length){
			pageContext.setAttribute("movie", movies[movieCounter]);
			movieCounter++;
			return EVAL_BODY_AGAIN;
		}else{
			return SKIP_BODY;
		}
	}
}
