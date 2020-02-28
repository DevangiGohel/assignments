<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<f:form modelAttribute="emplModel" method="post" action="save">
<f:hidden path="id"/><br><br>
Name :
<f:input path="name"/><br><br>
City :
<f:input path="city"/><br><br>

<input type="submit" value="save">

</f:form>
<h1><a href="/SpringCurd/view">View All Employees</a></h1>
</center>
</body>
</html>