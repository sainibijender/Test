<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hi!${n}
<form action="register" method="post">
  <table>
    <tr>
      <td>Name : </td>
      <td><input type="text" name="uname" placeholder="enter here"/></td>
     </tr>
    <tr>
       <td>Password : </td>   
       <td><input type="password" name="upwd" placeholder="enter here"/></td>      
    </tr>
    
    <tr>
    <td>
    <input type="submit" value="Sign Up"/>
    </td>
    </tr>
  </table>
  
</form>



</body>
</html>