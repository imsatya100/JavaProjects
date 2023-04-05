<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<html>
<body>
<h2>Person Registration</h2>
<s:form action="register">
<s:textfield label="Enter Person-ID :" name="person.pid"/>
<s:textfield label="Enter Name :" name="person.name"/>
<s:textfield label="Enter Age :" name="perosn.age"/>
<s:textfield label="Enter Gender :" name="person.gender"/>
<s:textfield label="Enter Mail-Id :" name="person.mailid"/>
<s:submit value="Register"/>


</s:form>
</body>
</html>
