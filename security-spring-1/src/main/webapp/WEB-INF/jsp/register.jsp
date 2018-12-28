<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" import = "java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h2>successfully register</h2>
<form action="" method="post">

<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

name<input type="text" field="${user.name}"/><br>
email address<input type="text" field="${user.username}"/><br>
password<input type="password" field="${user.password}"/><br>
confirm password<input type="password" /><br>
 <button type="submit" class="btn">create account</button>
 </form>
</body>
</html>