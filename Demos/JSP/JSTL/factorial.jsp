<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial Using JSTL</title>
</head>
<body>
	<c:set var="n" value="${param.text1}" />
    <c:set var="fact" value="1" />
    <c:forEach var="i" begin="1" end="${n}" step="1">
    	<c:set var="fact" value="${fact*i}" />
    </c:forEach>
    <c:out value="${fact}" />
</body>
</html>