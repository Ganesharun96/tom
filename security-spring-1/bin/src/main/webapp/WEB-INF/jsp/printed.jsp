<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>hai</h1>
<form action="/logout" method="post">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
 <button type="submit" class="btn">Log out</button>
 </form>
<!-- <a href="/logout">logout</a> -->
</body>
</html>