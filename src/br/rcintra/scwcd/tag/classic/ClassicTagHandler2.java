package br.rcintra.scwcd.tag.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler2 extends TagSupport {
	JspWriter out;

	private static final long serialVersionUID = 552428634513106650L;

	@Override
	public int doStartTag() throws JspException {
		out = pageContext.getOut();
		try{
			out.println("in doStarTag");
		}catch (IOException e) {
			throw new JspException("IOException" + e.toString());
		}
		return SKIP_BODY; // Não observa o body		
	}
	
	@Override
	public int doEndTag() throws JspException {
		try{
			out.println("doEndTag");
		}catch (IOException e) {
			throw new JspException("IOException" + e.toString());
		}
		return EVAL_PAGE; //Volta para o JSP
	}
	
}
