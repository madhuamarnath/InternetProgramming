<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock Price</title>
</head>
<body>
<c:set var="symbol" value="${param.sym}" />
<sql:setDataSource 
     var="db"   
     driver="com.mysql.cj.jdbc.Driver"
     url="jdbc:mysql://localhost:3400/rmkcet" 
     user="root"  password="Madhu@1981"   />

<sql:query dataSource="${db}" var="result">
   select * from StockTable where stocksymbol=?
   <sql:param value="${symbol}" />
</sql:query>

<c:forEach var="row" items="${result.rows}">
<p>Stock Symbol:<c:out value="${row.stocksymbol}"/></p>
<p>Stock Name:<c:out value="${row.stockname}"/></p>
<p>Stock Price:<c:out value="${row.stockprice}"/></p>
</c:forEach>
</body>
</html>
