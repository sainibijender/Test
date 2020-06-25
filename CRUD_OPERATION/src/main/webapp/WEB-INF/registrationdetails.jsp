<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red;" align="center">Durga software solution</h2>
<h3 style="color:blue;" align="center">Student Registration form</h3>
<center>
<table border="1">
<tr>

  <td>user Name</td>
  <td>${user.uname}</td>
  </tr>
  <tr>
  <td>user password</td>
  <td>${user.password}</td>
  </tr>
  <tr>
  <td>user age</td>
  <td>${user.age}</td>
  </tr>
 <tr>
 <td>user Date of birth</td>
  <td>${user.udob}</td>
  </tr> 
  
 <tr>
 <td>user Email</td>
  <td>${user.uemail}</td>
  </tr> 
  
  <tr>
 <td>user mobile</td>
  <td>${user.umobile}</td>
  </tr>
</body>
</html>