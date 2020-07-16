<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiply</title>
</head>
<body>
<%
int a1=Integer.parseInt(request.getParameter("a"));
int b1=Integer.parseInt(request.getParameter("b"));
int ans=a1*b1;
out.print(ans);
%>
</body>
</html>