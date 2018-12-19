<%@page import="javax.validation.constraints.Pattern"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
 
</head>
<body>

<form:form action="add" modelAttribute="show" method="POST">


customerName: <form:input path="customerName" />
 <td><form:errors path="customerName" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerAddress:<form:input path="customerAddress" />
 <td><form:errors path="customerAddress" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerPincode: <form:input path="customerPincode" />
 <td><form:errors path="customerPincode" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerEmail:<form:input path="customerEmail" />
 <td><form:errors path="customerEmail" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerNumber:<form:input path="customerNumber" />
 <td><form:errors path="customerNumber" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
registrationDate:<form:input path="registrationDate" value="<%= new java.util.Date() %>" />
 <td><form:errors path="registrationDate" cssStyle="color: #ff0000;" /></td>

		<br>
		<br>
createdBy:<form:input path="createdBy"/>
 <td><form:errors path="createdBy" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
modifiedDate:<form:input path="modifiedDate" />
 <td><form:errors path="modifiedDate" cssStyle="color: #ff0000;"/></td>

		<%-- <br>
		<br><%= new java.util.Date() %> --%>
		
		<input type="submit" value="submit" />
		<br>
	</form:form>



</body>
</html>