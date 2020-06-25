<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
Hello ${n}
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br><br><br>

<form method="post" action="update1">
<table align="center">
<tr>
 Hello ${n}
  <td>Student Id</td>

 
</tr>
<tr>
 <td>Student Name</td>

 <td><input type="text" name="sname" value="${std.sname}"></td> -->
<!-- <td><input type="text" name="sname" /></td>  -->
</tr>
<tr>
 <td>Student Address</td>
<td><input type="text" name="saddr" value="${std.saddr}"></td>
 <!--   <td><input type="text" name="saddr" ></td> -->
 
</tr>
<tr>
 <td><input type="submit" value="Update"></td>
</tr>
</table>
 <input type="hidden" name="sid" value="${std}"> 
 
</form> 
</body>
</html>
