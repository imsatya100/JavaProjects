<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" 
          action="/addEmp" modelAttribute="emp">
             <table>
                <tr>
                    <td>Name</td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td>Emp-Id</td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td>Salary</td>
                    <td><form:input path="salary"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Add Details"></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>