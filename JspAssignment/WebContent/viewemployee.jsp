<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.aimdek.jsp.persistent.EmpDAO,com.aimdek.jsp.model.Employee,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<h1>List of all Employees</h1>

<%  
List<Employee> list=EmpDAO.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="20%" style="border-collapse: collapse;">  
<tr>
<th>Id</th>
<th>Name</th>
<th>Age</th>
<th>Edit</th>
<th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.id}</td>
<td>${u.name}</td>
<td>${u.age}</td>  
<td><a href="edit.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/>
<h1><a href="insert.jsp">Add New User</a>    
</h1>

</body>
</html>