<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Information</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<c:import var="bookInfo" url="books.xml" />
	<x:parse xml="${bookInfo}" var="output" />
	<table>
		<caption>List of Books</caption>
		<tr>
			<th>Book Name</th>
			<th>ISBN</th>
			<th>Author Name</th>
			<th>Publisher Name</th>
			<th>Book Price</th>
		</tr>
		<x:forEach select="$output/books/book" var="item">
			<tr>
				<td><x:out select="$item/bookname" /></td>
				<td><x:out select="$item/isbn" /></td>
				<td><x:out select="$item/authorname" /></td>
				<td><x:out select="$item/publishername" /></td>
				<td><x:out select="$item/bookprice" /></td>
			</tr>
		</x:forEach>
	</table>
</body>
</html>
