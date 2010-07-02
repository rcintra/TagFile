package br.rcintra.scwcd.tag.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler3 extends TagSupport {

	private static final long serialVersionUID = 3594418201071629787L;
	JspWriter out;

	@Override
	public int doStartTag() throws JspException {
		out = pageContext.getOut();
		try{
			out.println("before body | ");
		}catch (IOException ioe) {
			throw new JspException("IOException " + ioe.toString());
		}
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		try{
			out.println("After body | ");
		}catch(IOException ioe){
			throw new JspException("IOException " + ioe.toString());
		}
		return EVAL_PAGE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		try{
			out.println("body | ");
		}catch(IOException ioe){
			throw new JspException("IOException " + ioe.toString());
		}
		return SKIP_BODY;
	}
}
