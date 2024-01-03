<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form {
	margin-left: 350px;
	margin-top: 100px;
	background-color: lightyellow;
	padding: 20px;
	border: solid;
	width: 30%;
}

label {
	width: 110pt;
	float: left;
	margin-top: 5px;
}

input {
	margin-top: 5px;
	width: 110pt;
}
span{
	color:red;
}
button {
	margin-top: 2px;
	width: 110pt;
}

</style>
</head>
<body>
	<form>
	<h1>Customer Form</h1>
		<div>
			<label>Enter Id</label> <input name="id">
		</div>
		<div>
			<label>Enter Name</label> <input name="name">
		</div>
		<div>
			<label>Enter Salary</label> <input name="salary">
		</div>
		<div>
		<button type="submit">Login</button>
		<button type="reset">Cancel</button>
		</div>

	</form>
</body>
</html>