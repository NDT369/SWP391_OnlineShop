<%-- 
    Document   : orderdetail
    Created on : Jun 26, 2022, 12:25:59 AM
    Author     : Pham Minh Giang
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/elegant-icons.css" rel="stylesheet" type="text/css"/>
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/jquery-ui.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/nice-select.css" rel="stylesheet" type="text/css"/>
        <link href="../css/owl.carousel.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/slicknav.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <link href="../css/themify-icons.css" rel="stylesheet" type="text/css"/>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>

        <style>
            img{
                width: 200px;
                height: 180px;
            }
            #head form{
                display: inline-block;
                align-items: center;
            }
            #sort{
                float: right;
            }
            #filter{
                margin-left: 400px;
            }
            #order span{
                color: greenyellow;
            }
        </style>

    </head>
    <body>

        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6" id="order">
                            <h1>Order <b>Detail</b></h1><br>

                            <c:set value="${requestScope.order}" var="o"/>
                            <h4>OrderID: <span>${o.orderID}</span></h4>
                            <h4>Customer Name: <span>${o.name}</span></h4>
                            <h4>Phone: <span>${o.phone}</span></h4>
                            <h4>Email: <span>${o.email}</span></h4>
                            <h4>Address: <span>${o.address}</span></h4>
                            <h4>Note: <span>${o.note}</span></h4>
                            <h4>Total: <span><fmt:formatNumber pattern="###,###,###" value="${o.money}" /> VND</span></h4>

                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>

                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Product ID</th>
                            <th>Product Name</th>
                            <th>Image</th>
                            <th>Price</th>
                            <th>Quantity</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.listOrderDetail}" var="l">
                            <tr>
                                <td>${l.product.id}</td>
                                <td>${l.product.name}</td>
                                <td><img src="img/${l.product.imgURL}"/></td>
                                <td><fmt:formatNumber pattern="###,###,###" value="${l.price}" /> VND</td>
                                <td>${l.quantity}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <a href="ordermanage"><button type="button" class="btn btn-primary">Back to home</button></a>

        </div>
        
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/imagesloaded.pkgd.min.js" type="text/javascript"></script>
        <script src="../js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="../js/jquery-ui.min.js" type="text/javascript"></script>
        <script src="../js/jquery.countdown.min.js" type="text/javascript"></script>
        <script src="../js/jquery.dd.min.js" type="text/javascript"></script>
        <script src="../js/jquery.slicknav.js" type="text/javascript"></script>
        <script src="../js/jquery.nice-select.min.js" type="text/javascript"></script>
        <script src="../js/jquery.zoom.min.js" type="text/javascript"></script>
        <script src="../js/main.js" type="text/javascript"></script>
        <script src="../js/manager.js" type="text/javascript"></script>
        <script src="../js/owl.carousel.min.js" type="text/javascript"></script>
    </body>

</html>
