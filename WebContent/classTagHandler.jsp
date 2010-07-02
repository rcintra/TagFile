<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="myTags" uri="classicTags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Classic Tag Handler One: <myTags:classicOne/>

<br></br>

Classic Tag Handler Two: <myTags:classicTwo/>


<br></br>

Classic Tag Handler Three: 
<myTags:classicThree>
Body Classic Tag Handler Three 
</myTags:classicThree>


<br></br>

Classic Tag Handler Four: 
<br></br>
<table border="1">
	<myTags:classicFour>
		<tr>
			<td>${movie}</td>
		</tr>
	</myTags:classicFour>
</table>



</body>
</html>