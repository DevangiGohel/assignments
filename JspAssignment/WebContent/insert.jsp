<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<form action="addemployee.jsp" method="post">

	Name :<input type="text" name="name"><br/><br/>
	Age :<input type="text" name="age"><br/><br/>
	
	<input type="submit" value="insert"/>
	
</form>
<h1><a href="viewemployee.jsp">View All Records</a></h1>
</center>  
</body>
</html>