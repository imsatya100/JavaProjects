<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
    table {
    	border:none;
        width: 10px;
        text-align: center;
    }
</style>
</head>
<body>
 <div align="center">
    <h1>User Details</h1>
    <a href="/"><button>Add New User</button></a>
    <br/><br/>
    <table>
        
        <tr>
        
        		 <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Password</th>
                <th>Profession</th>
                <th>Note</th>
                <th>Birthday</th>
                <th>Married</th>
                <td>File</td>
                <th>Actions</th>
        
        
        </tr>
        <c:forEach var="user"  items="${userList}"> 
        <tr>
        
        
           		<td> <span>${user.name}</span></td>
           		<td> <span>${user.email}</span></td>
                <td> <span>${user.gender}</span></td>
                <td> <span>${user.password}</span></td>
                <td> <span>${user.profession}</span></td>
                <td> <span>${user.note}</span></td>
                <td> <span>${user.birthday}</span></td>
                <td> 
                	<c:choose>
                		<c:when test="${user.married}"><span>YES</span></c:when>
                		<c:otherwise><span>NO</span></c:otherwise>
                	</c:choose>
                </td>
                <td><img src="user-file/${user.fileName}"></td>
                <td> <a href="/edit/${user.name}"><button>Edit</button></a> &nbsp;
                 <a href="/delete/${user.name}"><button>Delete</button></a></td>
               
        
        
        </tr>
        
        </c:forEach> 
      </table>
      <c:forEach var="i" begin="1" end="${totalPages}">
        		<a href="/${i}"><c:out value="${i}"/></a>
        		
      </c:forEach>
      </div>
      </body>
      