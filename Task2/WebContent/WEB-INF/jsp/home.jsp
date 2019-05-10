<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Task 2</title>
<style>
.form-group{
flex-direction: column;
margin-top:5px;
}

</style>
</head>
<body>
	<form action="/Task2/" method="post" style="position: flex;">
		<div class="form-group">
		<label >Number 1:&nbsp;</label ><input type="text" name="number1" /> 
		</div>
		<div class="form-group">
		<label >Number 2:&nbsp;</label ><input type="text" name="number2" />
		<button type="submit">Submit</button>
		</div>
		
	</form>
</body>
</html>