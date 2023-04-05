<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<html>
<body>
<h2>Hello World!</h2>
	<s:form action="result">
		<s:checkboxlist label="Choose Your Favourite Colors :" name="favColor" list="colors" value="DefaultColors"/>
		<s:checkboxlist label="Select Your Favourite Fruuits :" name="favFruit" list="fruits" value="DefaultFruits"/>
		<s:submit value="Display"></s:submit>
	</s:form>
</body>
</html>
