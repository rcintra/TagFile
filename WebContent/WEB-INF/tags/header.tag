<%@ attribute name="subTitle" required="false" rtexprvalue="true" %>
<%@ tag body-content="tagdependent" %>
<h2>Header Tag</h2>
<em>${subTitle}</em>
<jsp:doBody />