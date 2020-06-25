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
<font color="red" size="6">
 <b> Welcome to Login Page</b><br><br><br>
</font>
 
<form method ="post" action="login">
 <table>
   <tr>
     <td>User Name : </td>
     <td><input type="text" name="sname"/></td>
   </tr>
 
 <tr>
   <td>Password : </td>
   <td><input type="password" name="spwd"/></td>
 </tr>  
 
 <tr> 
   <td><input type="submit" value="Login"/>
 </tr>       
 </table>
 </form>
</center>
</body>
</html>