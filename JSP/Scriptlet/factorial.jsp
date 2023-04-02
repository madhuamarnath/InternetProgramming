<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial Using JSP</title>
</head>
<body>
	<%
        int n=Integer.parseInt(request.getParameter("text1"));
        long fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;        
     %>
     
     <%=fact%>
</body>
</html>