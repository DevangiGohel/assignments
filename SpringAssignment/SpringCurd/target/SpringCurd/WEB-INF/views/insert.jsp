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
Id :
<f:input path="id"/><br><br>
Name :
<f:input path="name"/><br><br>
City :
<f:input path="city"/><br><br>

<input type="submit" value="insert">

</f:form>
<h1><a href="/SpringCurd/view">view</a></h1>
</center>
</body>
</html>