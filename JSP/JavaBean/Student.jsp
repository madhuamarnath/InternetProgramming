<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<jsp:useBean id= "studentBean" class="com.rmkcet.StudentBean"> 
<jsp:setProperty name="studentBean" property="registerNumber" value="${param.regno}" /> 
<jsp:setProperty name="studentBean" property="name" value="${param.name}" />
<jsp:setProperty name="studentBean" property="cgpa" value="${param.cgpa}" />
<jsp:setProperty name="studentBean" property="departmentId" value="${param.deptID}" />
</jsp:useBean>
<p>RegisterNumber:<jsp:getProperty name="studentBean" property="registerNumber" /></p>
<p>Name:<jsp:getProperty name="studentBean" property="name" /></p>
<p>CGPA:<jsp:getProperty name="studentBean" property="cgpa" /></p>
<p>DepartmentID:<jsp:getProperty name="studentBean" property="departmentId" /></p>
</body>
</html>