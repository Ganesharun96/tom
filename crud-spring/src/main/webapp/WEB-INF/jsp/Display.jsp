<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<form:form action="s" modelAttribute="show" method="POST">
customerName: <form:input path="customerName" />
		<br>
		<br>
customerAddress:<form:input path="customerAddress" />
		<br>
		<br>
customerPincode: <form:input path="customerPincode" />
		<br>
		<br>
customerEmail:<form:input path="customerEmail" />
		<br>
		<br>
customerNumber:<form:input path="customerNumber" />
		<br>
		<br>
registrationDate:<form:input path="registrationDate" />
		<br>
		<br>
createdBy:<form:input path="createdBy" />
		<br>
		<br>
modifiedBy:<form:input path="modifiedBy" />
		<br>
		<br>
		<input type="submit" value="submit" />
		<br>
	</form:form>



</body>
</html>