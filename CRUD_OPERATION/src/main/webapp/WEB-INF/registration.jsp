 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <!DOCTYPE html PUBLIC "-
//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h2 style="color:red;" align="center">Durga software solution</h2>
<h3 style="color:blue;" align="center">Student Registration form</h3>
<!--<form:form method="POST" action="reg" commandName="user">-->
<form:form method="POST" action="register" modelAttribute="user">

<center>
<table>
<tr>
 <td>User Name</td>
 <td><form:input path="uname"/></td>
 </tr>
 
 <tr>
   <td>User password   </td>
   <td><form:password path="upwd"/></td>  
 </tr>

<tr>
  <td>
      <td>User Age  </td>
       <td><form:input path="uage"/></td>
      
  </tr>
  
  
<tr>
  <td>
      <td>User Date of birth  </td>
       <td><form:input path="udob"/></td>
      
  </tr>
  
  
<tr>
  <td>
      <td>User Email id  </td>
       <td><form:input path="uemail"/></td>
      
  </tr>
  
  
<tr>
  <td>
      <td>User Mobile  </td>
       <td><form:input path="umobile"/></td>
      
  </tr>
  
  <tr>
    <td><input type="submit" value="Registration/">
  </td>
 
</tr> 
 
 
 


</table>

</center>

</form:form>
</body>
</html>