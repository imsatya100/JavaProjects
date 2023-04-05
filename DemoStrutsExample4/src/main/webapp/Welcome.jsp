<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<style type="text/css">
		.h2{
			text-align:center;
			color:blue;
			
		}
	</style>

</head>
<body>
	<h2>Your Gender :<s:property value="gender"/></h2>
	<h2>Your Answer :<s:property value="correct"/></h2>
	
</body>
</html>