
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h2>Person Information</h2>
      <form:form method = "POST" action = "HelloWeb/addStudent">
         <table>
            <tr>
               <td><form:label path = "pid">Person-Id</form:label></td>
               <td><form:input path = "pid" /></td>
            </tr>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
            </tr>
            <tr>
               <td><form:label path = "age">Age</form:label></td>
               <td><form:input path = "age" /></td>
            </tr>
            <tr>
               <td><form:label path = "gender">Gender</form:label></td>
               <td><form:input path = "gender" /></td>
            </tr>
             <tr>
               <td><form:label path = "mailid">Mailid</form:label></td>
               <td><form:input path = "mailid" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
</body>
</html>