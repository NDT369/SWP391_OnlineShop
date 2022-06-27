<%-- 
    Document   : customerdetail
    Created on : Jun 28, 2022, 4:32:33 AM
    Author     : Pham Minh Giang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Customer Manager</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/elegant-icons.css" rel="stylesheet" type="text/css"/>
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/jquery-ui.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/nice-select.css" rel="stylesheet" type="text/css"/>
        <link href="../css/owl.carousel.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/slicknav.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <link href="../css/themify-icons.css" rel="stylesheet" type="text/css"/>

        <style>
            img{
                width: 200px;
                height: 120px;
            }
            #head form{
                display: inline-block;
                align-items: center;
            }
            #sort{
                float: right;
            }
            #filter{
                margin-left: 550px;
            }
        </style>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Customer <b>Detail</b></h2>
                            <c:set value="${requestScope.Customer}" var="c"/> 
                            <h4>CustomerID: ${c.accountID}</h4>
                        </div>
                    </div>
                </div>
                <div>
                    <form action="editcustomer">
                        <input name="id" value="${c.accountID}" hidden>
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" class="form-control" required name="name" value="${c.name}">
                        </div>
                        <div class="form-group">
                            <label>Gender</label>
                            <select name="gender">
                                <option value="true" <c:if test="${c.gender == true}">selected</c:if> >Male</option>
                                <option value="false" <c:if test="${c.gender == false}">selected</c:if> >Female</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control" required name="email" value="${c.email}" >
                        </div>
                        <div class="form-group">
                            <label>Phone</label>
                            <input type="tel" class="form-control" required name="phone" value="${c.phone}" >
                        </div>
                        <div class="form-group">
                            <label>Address</label>
                            <input type="text" class="form-control" name="address" required value="${c.address}">
                        </div>					
                        <div class="form-group">
                            <label>Status</label>
                            <input class="form-control"
                                   <c:if test="${c.status == true}">value="Active"</c:if>
                                   <c:if test="${c.status == false}">value="Deactive"</c:if>
                                   readonly>
                        </div>					

                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
            <a href="customermanage"><button type="button" class="btn btn-primary">Back to Customer manage</button></a>  
        </div>

        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/imagesloaded.pkgd.min.js" type="text/javascript"></script>
        <script src="../js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="../js/jquery-ui.min.js" type="text/javascript"></script>
        <script src="../js/jquery.countdown.min.js" type="text/javascript"></script>
        <script src="../js/jquery.dd.min.js" type="text/javascript"></script>
        <script src="../js/jquery.nice-select.min.js" type="text/javascript"></script>
        <script src="../js/jquery.slicknav.js" type="text/javascript"></script>
        <script src="../js/jquery.zoom.min.js" type="text/javascript"></script>
        <script src="../js/main.js" type="text/javascript"></script>
        <script src="../js/manager.js" type="text/javascript"></script>
        <script src="../js/owl.carousel.min.js" type="text/javascript"></script>

    </body>
</html>
