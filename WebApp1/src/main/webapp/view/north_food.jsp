<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
@import url("css/style1.css");
</style>
<style>
form {
	background-color: aqua;
}
</style>
</head>
<body>
	<form>
	
		<h1>North Indian Food</h1>
		<div>
		Welcome to <%=request.getAttribute("rest_name") %>
		</div>
		
		<div>
		Location <%=request.getAttribute("rest_location") %>
		</div>
		
		<div>Id is
		<%=request.getParameter("id")%>
		</div>
		<div>
		 Name is
		<%=request.getParameter("name")%>
		</div>
	</form>

</body>
</html>