<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="myTags" uri="simpleTags" %>
<%@ page import="java.util.*, br.rcintra.scwcd.domain.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Filmes
<myTags:simple1 >
	<br></br>${movie}
</myTags:simple1>
<%
	Movie m1 = new Movie("rafa");
	List<Movie> list = new ArrayList<Movie>();
	list.add(m1);
	request.setAttribute("movieCollection", list);
%>
<table>
	<myTags:simple2 movieList="${movieCollection}" >
		<tr>
			<td>${movie.name}</td>
		</tr>
	</myTags:simple2>
</table>
</body>
</html>