<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.aimdek.jsp.persistent.EmpDAO"%>  
<jsp:useBean id="e" class="com.aimdek.jsp.model.Employee"></jsp:useBean>  
<jsp:setProperty property="*" name="e"/>  
<%  
EmpDAO.delete(e);  
response.sendRedirect("viewemployee.jsp");  
%>  
</body>
</html>