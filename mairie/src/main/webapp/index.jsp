<%@ page  language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %>
<%@ taglib  prefix="s" uri="/struts-tags"  %>
<html>
<head>
<body>
<s:head/>
<form action="login">
<table>
<tr><s:textfield key="personne.login" /></tr>
<tr><s:textfield key="personne.password" /></tr>
<s:submit value="Se connecter" />
</table>
</form>

</body>
</head>
</html>
