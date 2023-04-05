<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<h1>Employee List</h1>  
<table>  
<tr><th>EId</th><th>Name</th><th>Salary</th></tr>  
   <c:forEach var="employee" items="${employees}">
   <tr>  
   <td>${employee.id}</td>  
   <td>${employee.name}</td>  
   <td>${employee.salary}</td>  
   <td><a href="updateEmployee/${employee.id}">Edit</a></td>  
   <td><a href="deleteEmployee/${employee.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/> 
 <a href="showForm">Add New Employee Details</a>  
   