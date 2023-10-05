<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	heloo <br>
	<c:forEach var="stud" items="${students}">
		<c:out value="${stud.name}"></c:out>
		<c:out value="${stud.id}"></c:out>
		<c:out value="${stud.age}"></c:out> <br>
	</c:forEach>
</body>
</html>