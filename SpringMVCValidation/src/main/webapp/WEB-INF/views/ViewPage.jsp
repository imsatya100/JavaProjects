<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>  
    <style>  
        .error {color:red}  
    </style>  
</head>  
<body>  
    <form:form action="addEmployee" modelAttribute="emp">  
        Username: <form:input path="name" />        
        <br><br>  
          
        Password (*): <form:password path="password" />  
        <form:errors path="password" cssClass="error" />  
        <br><br>  
          
        Age (*): <form:input path="age" />  
        <form:errors path="age" cssClass="error" />  
        <br><br>  
        <input type="submit" value="Submit" />  
    </form:form>  
</body>  
</html>  