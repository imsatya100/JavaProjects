<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Person Details</h2>
<s:form action="register">
<s:textfield name="pid" label="Enter Person Id  :" />
<s:textfield name="name" label="Enter Name      :"/>
<s:textfield name="age" label="Enter Age        :"/>
<s:textfield name="gender" label="Enter Gender  :"/>
<s:textfield name="mailid" label="Enter Mail-Id :"/>
<s:submit value="Add Person"></s:submit>

</s:form>
</body>
</html>