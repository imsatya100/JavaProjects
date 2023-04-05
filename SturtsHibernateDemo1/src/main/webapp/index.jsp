<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<body>
<h2>Add Person Details</h2>
<s:form action="addPerson">
	<s:textfield name="pid" label="Enter person-Id :"/><br>
	<s:textfield name="name" label="Enter Name :"/><br>
	<s:textfield name="age" label="Enter Age :"/><br>
	<s:textfield name="gender" label="Enter Gender :"/><br>
	<s:textfield name="mailid" label="Enter Mail-Id :"/><br>
	<s:submit value="Add Person"></s:submit>

</s:form>
</body>
</html>
