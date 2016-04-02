<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="emailTypes.pageTitle"/></title>
    </head>
    <body>
        <h1><s:text name="emailTypes.titleUpdate"/></h1>
                <a href="email_types_list" >List</a>
        <p></p>
        
        <div style="color:red">
            <s:actionerror />
        </div>

        
        <s:form action="/email_classic/email_types_update" method="post">

            <s:textfield name="et.emailType"   value="%{et.emailType}"   label="%{getText('et.name')}"        size="40"/>
            <s:textfield name="et.description" value="%{et.description}" label="%{getText('et.description')}" size="40"/>
            <s:submit method="execute" key="label.update" align="center" />
        </s:form>
    </body>
</html>
