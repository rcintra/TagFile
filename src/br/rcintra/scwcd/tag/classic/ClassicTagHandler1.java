package br.rcintra.scwcd.tag.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler1 extends TagSupport {

	private static final long serialVersionUID = -4215775665807324817L;

	@Override
	public int doStartTag() throws JspException {
		JspWriter write = pageContext.getOut();
		try {
			write.println("classic tag output");
		} catch(IOException ex) {
			throw new JspException("IOException- " + ex.toString());
		}
		return SKIP_BODY;
	}

}
