<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   <script >
  $(document).ready(function(){
		$("div").hide();
		
	  $("#upd").click(function(){
		  $("div").hide();
		$("#update").slideDown("slow");
	});
	  $("#dlt").click(function(){
		  $("div").hide();
			$("#delete").slideDown("slow");
		});
  });
  
  </script>
 
 </head>
 <body>
  
<a href="showForm"><button>Add Employee</button></a>
<a href="viewEmployees"><button>View Employee</button></a>
<button id="upd" class="show">Update Employee</button>  
<button  id="dlt" class="show">Delete Employee</button> 

<div id="delete" >
<form action="deleteEmployee">  
<h3>Enter Employee Id to Delete</h3> 
<input type="text" name="id"><br />   <br/> 
<input type="submit" value="Delete">  
</form>
</div>
<div id="update" >
<form action="updateEmployee">  
<h3>Enter Employee Id </h3> 
<input type="text" name="id"><br />   
<h3>Enter Employee Salary </h3> 
<input type="text" name="salary"><br />    <br/>
<input type="submit" value="Update">  
</form>
</div>
</body>
</html>