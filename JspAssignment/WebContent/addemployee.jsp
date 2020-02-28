<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.aimdek.jsp.persistent.EmpDAO"%> 
<jsp:useBean id="employee" class="com.aimdek.jsp.model.Employee"></jsp:useBean>  
<jsp:setProperty property="*" name="employee"/>  
<html>
<head></head>
<body>
<center>

<%  
int i=EmpDAO.insert(employee);  
if(i>0){  
  %><h1>Add Employee Successfully...</h1>
 <%
}
else{  
%><h1>Can't add Employee</h1>  
<%
}  
%>   
</center>
</body>
</html>  
