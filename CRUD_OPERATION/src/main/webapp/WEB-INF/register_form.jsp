<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<style type="text/css">
	
	button {
		padding: 10px;
	}
	.error {
		color: red;
		font-style: italic;
	}
	form {
		display: table;
	}
	form div {
		display: table-row;
	}
	label, input, span, select {
		display: table-cell;
		margin: 5px;
		text-align: left;		
	}
	input[type=text], input[type=password], select, textarea {
		width: 200px;
		margin: 5px;
	}

	form div div {
		display: table-cell;
	}	
</style>
</head>
<body>
	<div align="center">
		<h2>User Registration</h2>
		<form:form action="register" method="post" modelAttribute="user">
			<div>
			<form:label path="name">Center Name:</form:label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error" />
			</div>
			
			
			<div>
			<form:label path="ccode">Center Code:</form:label>
			<form:input path="ccode" />
			<form:errors path="ccode" cssClass="error" />
			</div>
				<div>
			<form:label path="phone">phone no:</form:label>
			<form:input path="phone" />
			<form:errors path="phone" cssClass="error" />
			</div>
			
			
				<div>
			<form:label path="daddr">DetailAddress:</form:label>
			<form:input path="daddr" />
			<form:errors path="daddr" cssClass="error" />
			</div>
			
			
				<div>
			<form:label path="city">E-mail:</form:label>
			<form:input path="city" />
			<form:errors path="city" cssClass="error" />
			</div>
			
				<div>
			<form:label path="state">E-mail:</form:label>
			<form:input path="state" />
			<form:errors path="state" cssClass="error" />
			</div>
			
				<div>
			<form:label path="pincode">E-mail:</form:label>
			<form:input path="pincode" />
			<form:errors path="pincode" cssClass="error" />
			</div>
			
			
			<div>
			<form:label path="email">E-mail:</form:label>
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
			</div>


				
			<div>
				<div></div>
				<div>
				<form:button>Register</form:button>
				</div>
				<div></div>
			</div>
		</form:form>
	</div>
</body>
</html>