<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<h1>Persons List</h1>  
<table>  
<tr><th>Id</th><th>Name</th><th>Age</th><th>Gender</th><th>Mail-Id</th></tr>  
   <c:forEach var="per" items="${list}">
   <tr>  
   <td>${per.pid}</td>  
   <td>${per.name}</td>  
   <td>${per.age}</td>  
   <td>${per.gender}</td>  
   <td>${per.mailid}</td>  
   <td><a href="editemp/${emp.id}">Edit</a></td>  
   <td><a href="deleteemp/${emp.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="perForm">Add New Person Details</a>  