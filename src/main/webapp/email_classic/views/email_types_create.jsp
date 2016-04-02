<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="emailTypes.pageTitle"/></title>
    </head>
    <body>
        <h1><s:text name="emailTypes.titleCreate"/></h1>
                <a href="email_types_list" >List</a>
        <p></p>
        
        <div style="color:red">
            <s:actionerror />
        </div>

        
        <s:form action="/email_classic/email_types_create" method="post">
            <s:textfield name="et.emailType"      label="et.name"        size="20" />
            <s:textfield name="et.description"    label="et.description" size="20"/>
            <s:submit method="execute" key="label.login" align="center" />
        </s:form>
    </body>
</html>
