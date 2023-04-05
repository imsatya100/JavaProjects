<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
                <tr>
                    <td>Name</td>
                    <td>${name}</td>
                </tr>
                <tr>
                    <td>Emp-ID</td>
                    <td>${id}</td>
                </tr>
                <tr>
                    <td>Salary</td>
                    <td>${salary}</td>
                </tr>
                <tr>
                    <td><a href="addEmployee">Add Employee</a></td>
                </tr>
            </table>
</body>
</html>