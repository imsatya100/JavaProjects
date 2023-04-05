<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<html>
<body>
<h2>Hello World!</h2>
<s:form action="uploadFile" method="POST" enctype="multipart/form-data">
	<s:file label="Select a File to Uplaod :" name="uploadedFile" size="400"></s:file>
	<s:submit value="Dipslay"/>


</s:form>
</body>
</html>
