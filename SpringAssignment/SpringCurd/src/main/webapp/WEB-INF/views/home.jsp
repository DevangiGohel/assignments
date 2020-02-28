<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<table border="1" style="border-collapse: collapse; width: 20%;">
<th>ID</th>
<th>Name</th>
<th>City</th>
<th>Edit</th>
<th>Delete</th>
<c:forEach var="employee" items="${listEmployee}">
<tr>
	<td>${employee.id}</td>
	<td>${employee.name}</td>
	<td>${employee.city}</td>
	<td><a href="/SpringCurd/edit?id=${employee.id }">edit</a></td>
	<td><a href="/SpringCurd/delete?id=${employee.id}">delete</a></td>
</tr>
</c:forEach>


</table>
</center>
</body>
</html>