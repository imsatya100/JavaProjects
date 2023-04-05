<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<style type="text/css">
    label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    input[type=text], input[type=password], select {
        width: 200px;  
    }
    input[type=radio] {
        display: inline-block;
        margin-left: 45px;
    }
    input[type=checkbox] {
        display: inline-block;
        margin-right: 190px;
    }  
     
    button {
        padding: 10px;
        margin: 10px;
    }
   
    .error {
    color: red;
    font-style: italic;
	}
    
</style>
</head>
<body>
    <div align="center">
        <h2>User Registration</h2>
        <form:form action="register" method="post" modelAttribute="user" enctype="multipart/form-data" >
        <table>
        <tr>
        <td> <form:label path="name">Full name:</form:label></td>
        <td><form:input path="name"/></td>
        <td><form:errors path="name" cssClass="error"/></td>
        
        </tr>
        <tr>
        
        
         <td> <form:label path="email">E-mail:</form:label></td>
          <td>  <form:input path="email"/></td>
           <td> <form:errors path="email" cssClass="error"/> </td>
        </tr>
        <tr>
        <td> <form:label path="password">Password:</form:label></td>
           <td> <form:password path="password"/> </td>     
 			<td><form:errors path="password" cssClass="error"/> </td>
 			
        </tr>
        <tr>
         <td>  <form:label path="birthday">Birthday (yyyy-mm-dd):</form:label></td>
          <td>  <form:input path="birthday"/> </td>
          <td>  <form:errors path="birthday" cssClass="error"/> </td>
        </tr>
        <tr>
         <td> <form:label path="gender">Gender:</form:label> </td>
           <td> <form:radiobutton path="gender" value="Male"/>Male 
            <form:radiobutton path="gender" value="Female"/>Female </td>
           <td> <form:errors path="gender" cssClass="error"/> </td>
        </tr>
        <tr>
            
           <td> <form:label path="profession">Profession:</form:label> </td>
          <td>    
           
           <form:select path="profession" items="${professionList}" />
      
          
          	 
          </td>
          <td>   <form:errors path="profession" cssClass="error"/> </td>
                     
        </tr>
        <tr>
         <td> <form:label path="married">Married?</form:label> </td>
           <td> <form:checkbox path="married"/> </td>
           <td> <form:errors path="married" cssClass="error"/> </td>
             
        </tr>
        <tr>
         <td> <form:label path="note">Note:</form:label> </td>
           <td> <form:textarea path="note" cols="25" rows="5"/> </td>
           <td> <form:errors path="note" cssClass="error"/> </td>
                 
        </tr>
         <tr>
         <td> <form:label path="image">File :</form:label> </td>
           <td> <input type="file" name="image"/> </td>
           <td> <form:errors path="note" cssClass="error"/> </td>
                 
        </tr>
        <tr>
         <td colspan="3">  <form:button>Register</form:button> </td>
        </tr>
        </table>
        
        </form:form>
    </div>
</body>
</html>








