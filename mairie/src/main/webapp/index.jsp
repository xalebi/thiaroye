<%@ page  language=" java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %>
<%@ taglib  prefix="s" uri="/struts-tags"  %>
<html>
<body>
<s:form action="identifier" >

<h2>Mairie de thiaroye</h2>
<s:textfield key="personne.login"/>
<s:textfield key="personne.password"/>
<s:submit name="Valider" />
</s:form>
</body>

</html>
