<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.rmkcet.StudentBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Portal</title>
<link href="<c:url value='/style.css' />" rel="stylesheet">
</head>

<body>
<table>
<caption>Student Information</caption>
<thead>
<tr>
<th>S.No.</th>
<th>Register Number</th>
<th>Name</th>
<th>CGPA</th>
</tr>
</thead>
<tbody>

<c:forEach var="s" items="${outputList }">
	<tr>
	<td></td>
	<td> <c:out value="${s.getRegisterNumber()}" /> </td>
	<td> <c:out value="${s.getName()}" /> </td>
	<td> <c:out value="${s.getCgpa()}" /> </td>
	</tr> 
</c:forEach>

</tbody>
</table>
</body>
</html>