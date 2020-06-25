<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<font color="red" size="5" >  
Hello World
</font>
<br><br><br>
${std}
</center>
Hello ${std}
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br><br><br>

<form action="/update1" method="post">
<table>
 <tr>
   <td>Student ID:${std}</td>
 </tr>
   
 <tr>
  <td>Student Name :</td>
  <td><input type="text" name="sname"/></td> 
<!--   <td><input type="text" name="sname" value='${std}'></td>-->
</tr>

<tr>
  <td>Student Address :</td>
 <!--  <input type="text" name="saddr" value='${std}'>-->
  <td><input type="text" name="saddr"/></td> 
</tr>

<tr>
   <td><input type="submit" name="update"/></td>
</tr>

</table>
 <input type="hidden" name="sid" value='${std}'> 
</form>


</body>
</html>