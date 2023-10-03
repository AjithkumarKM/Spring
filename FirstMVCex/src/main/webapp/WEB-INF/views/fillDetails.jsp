<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h4>Student details</h4>
	Id : ${student.id} <br>
	Name : ${student.name} <br>
	Age : ${student.age} <br> <br>
	
	<form:form action="save" method="post" modelAttribute="newstudent">
		Enter id : <form:input path="id"/>
		Enter name : <form:input path="name"/>
		Enter age : <form:input path="age"/>
		<input type="submit" value="Submit changes">
	</form:form>
</body>
</html>