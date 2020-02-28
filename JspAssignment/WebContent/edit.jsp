<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.aimdek.jsp.persistent.EmpDAO,com.aimdek.jsp.model.Employee"%>  
<%  
String id=request.getParameter("id");  
Employee employee=EmpDAO.getRecordById(Integer.parseInt(id));  
%>  

<center>
<h1>Edit Form</h1>  
<form action="editemployee.jsp" method="post">  
<input type="hidden" name="id" value="<%=employee.getId() %>"/>  
Name:  
<input type="text" name="name" value="<%= employee.getName()%>"/><br/><br/>
Age:</td><td>  
<input type="text" name="age" value="<%= employee.getAge()%>"/><br/><br/>
 
<input type="submit" value="Edit"/> 
</table>  
</form>  
</center>
</body>
</html>