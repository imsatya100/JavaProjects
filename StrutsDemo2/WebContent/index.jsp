<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="display">
<h2>Enter Your Details</h2>
<s:textfield label="Name :" name="user.name"/>
<s:textfield label="Age :" name="user.age"/>
<s:textfield label="Gender :" name="user.gender"/>
<s:textfield label="Mail-Id" name="user.mailid"/>
<s:datetextfield format="mm-dd-yyyy"/>
<s:date name="date4"/>
<s:submit value="Display" align="center"/>
</s:form>

</body>
</html>