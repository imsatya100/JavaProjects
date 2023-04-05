<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
    
<html>
<head>
	<style type="text/css">
		.h2{
			text-align:center;
			color:blue;
			
		}
	</style>
</head>
<body>
<h2>Hello World!</h2>
	<s:form action="result" namespace="/Result">
	<h2>
	 <s:radio label="Gender" name="gender" list="genders" value="DefaultGender"/> 
	 
	<s:radio label="Is It True" name="correct" list="#{'1':'YES'; '2':'NO'; }" value="2"/>
	<s:submit value="Enter"></s:submit>
	</h2>
	</s:form>

</body>
</html>
