<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="emailTypes.pageTitle"/></title>
    </head>
    <body>
        <h1><s:text name="emailTypes.titleRead"/></h1>
        <a href="email_types_list" >List</a>
        <p></p>
        <s:text name="email.type"/> : <s:property value="et.emailType"/><br/>
        <s:text name="email.description"/> : <s:property value="et.description"/>


    </body>
</html>
