<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiply</title>
</head>
<body>
<c:set var="a1" value="${param.a}" />
<c:set var="b1" value="${param.b}" />
<c:set var="ans" value="${a1*b1}" />
<c:out value="${ans}" />
</body>
</html>
