<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="emailTypes.pageTitle"/></title>
    </head>
    <body>
        <h1><s:text name="emailTypes.titleList"/></h1>
        <a href="email_types_list" >List</a>
        <a href="email_types_create_start" >Create</a>
        <p></p>

        <table border="1">
            <thead>
                <tr>
                    <th><s:text name="emailTypes.name"/></th>
                    <th><s:text name="emailTypes.description"/></th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="emailTypesList" status="etlStatus">
                    <tr>
                        <td><s:property value="emailType"/></td>
                        <td><s:property value="description"/></td>
                        <td>
                            <s:url action="email_types_update_start" var="urlUpdate">
                                <s:param name="et.emailType" value="%{emailType}" />
                            </s:url>

                            <s:url action="email_types_read" var="urlRead">
                                <s:param name="et.emailType" value="%{emailType}" />
                            </s:url>

                            <a href="<s:property value="#urlUpdate" />" >Update</a>
                            <a href="<s:property value="#urlRead" />" >Read</a>

                        </td>
                        <td>                         
                            <s:form action="email_types_delete" method="post">
                                <s:hidden name="et.emailType" value="%{emailType}"/>
                                <input type="submit" value="delete"/>
                            </s:form>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>


        </table>
    </body>
</html>
