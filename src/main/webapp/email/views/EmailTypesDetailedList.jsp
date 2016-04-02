<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<!DOCTYPE html ">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email types Details</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <script src="http://code.jquery.com/jquery-latest.js" ></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>


    </head>
    <body >


        <div class="container">

            <div align="center"><h3>Email Types Details</h3><hr></div>

            <table class="table" >
                <tr>
                    <th><a href="listEmailTypes">@</a></th>
                    <th>Name</th>
                    <th>Description</th>
                    <th><button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#NewEmailType">Create</button></th>
                </tr>

                <c:forEach var="emailTypeItem" items="${emailTypesList}" >

                    <tr>
                        <td>
                            <form action="deleteEmailTypes" method="post">
                                <input type="hidden" name="et.emailType" value="${emailTypeItem.emailType }"  >
                                <input type="submit" class="btn btn-info btn-sm" value="Delete" alt="Delete">
                            </form>
                        </td>
                        <td>${emailTypeItem.emailType}</td>
                        <td>${emailTypeItem.description}</td>
                        <td>
                            <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#Update${emailTypeItem.emailType }">Update</button>
                            <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#Read${emailTypeItem.emailType }">Read</button>
                        </td>
                    </tr>

                    <!-- Modal Update Email Type start-->
                    <div class="modal fade" id="Update${emailTypeItem.emailType}" role="dialog">
                        <div class="modal-dialog">
                            <form action="updateEmailTypes" method="post">
                                <!-- Modal content-->
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title">Update Email Types Details </h4>
                                    </div>
                                    <div class="modal-body">
                                        <div class="form-group">
                                            <label for="v_name_${emailTypeItem.emailType}">Name:</label>
                                            <input type="hidden" name="et.emailType"  value="${emailTypeItem.emailType}" id="v_name_${emailTypeItem.emailType}">
                                            ${emailTypeItem.emailType }
                                        </div>
                                        <div class="form-group">
                                            <label for="v_description_${emailTypeItem.description}">Description:</label>
                                            <input type="text" name="et.description" class="form-control" value="${emailTypeItem.description }" id="v_description_${emailTypeItem.description}">
                                        </div>
                                    </div>
                                    <div class="modal-footer">
                                        <input type="submit"  class="btn btn-default" value="Update">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <!-- Modal Edit Email Type end-->

                    <!-- Modal read Email Type start-->
                    <div class="modal fade" id="Read${emailTypeItem.emailType}" role="dialog">
                        <div class="modal-dialog">

                            <!-- Modal content-->
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    <h4 class="modal-title">Read Email Types Details </h4>
                                </div>
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label for="r_name_${emailTypeItem.emailType}">Name:</label>
                                        ${emailTypeItem.emailType}
                                    </div>
                                    <div class="form-group">
                                        <label for="r_description_${emailTypeItem.description}">Description:</label>
                                        ${emailTypeItem.description}
                                    </div>
                                </div>
                                <div class="modal-footer">

                                </div>
                            </div>

                        </div>
                    </div>
                    <!-- Modal read Email Type end-->


                </c:forEach>


                <!-- Modal Add New Email type start -->
                <div class="modal fade" id="NewEmailType" role="dialog">
                    <div class="modal-dialog">
                        <form action="createEmailTypes" method="post">
                            <!-- Modal content-->
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    <h4 class="modal-title">Add New Email Type  Details </h4>
                                </div>
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label for="et_emailType">Name:</label>
                                        <input type="text" name="et.emailType" class="form-control" id="et_emailType">
                                    </div>
                                    <div class="form-group">
                                        <label for="et_description">Description:</label>
                                        <input type="text" name="et.description" class="form-control"  id="et_description">
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <input type="submit"  class="btn btn-default" value="Save">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- Modal Add new Email type end -->

            </table>
        </div>
    </body>
</html>