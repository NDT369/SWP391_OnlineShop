<%-- 
    Document   : orderlist
    Created on : Jun 25, 2022, 11:43:37 PM
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
                margin-left: 350px;
            }

        </style>

    </head>
    <body>

        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Manage <b>Order</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
                <div id="head">
                    <form action="searchorder">
                        <input name="search" type="text"  placeholder="Text in here" value="${requestScope.search}">
                        <input type="submit" value="Search">
                    </form>

                    <form id="filter" action="filterorder">
                        From 
                        <input type="date" name="from" value="${requestScope.from}" onchange="document.getElementById('filter').submit()">
                        To
                        <input type="date" name="to" value="${requestScope.to}" onchange="document.getElementById('filter').submit()"> 
                    </form>

                    <form id="sort" action="sortorder">
                        Sort by
                        <select name="sort" onchange="document.getElementById('sort').submit()">
                            <option value="0">Default</option>
                            <option value="date" <c:if test="${requestScope.sort.equals('date')}">selected</c:if> >Order Date</option>
                            <option value="name" <c:if test="${requestScope.sort.equals('name')}">selected</c:if> >Name</option>
                            <option value="cost" <c:if test="${requestScope.sort.equals('cost')}">selected</c:if> >Total cost</option>
                            </select>
                        </form>
                    </div><br>

                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Customer Name</th>
                                <th>Address</th>
                                <th>Phone</th>
                                <th>Email</th>
                                <th>Total Money</th>
                                <th>Order Date</th>
                                <th>Note</th>
                                <th>Status</th>
                                <th>Detail</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${requestScope.listOrder}" var="l">
                            <tr>
                                <td>${l.orderID}</td>
                                <td>${l.name}</td>
                                <td>${l.address}</td>
                                <td>${l.phone}</td>
                                <td>${l.email}</td>
                                <td><fmt:formatNumber pattern="###,###,###" value="${l.money}" /> VND</td>
                                <td>${l.date}</td>
                                <td>${l.note}</td>
                                <td>
                                    <c:if test="${l.status == true}">Successfull</c:if>
                                    <c:if test="${l.status == false}">Fail</c:if>
                                    </td>
                                    <td>
                                        <a href="ordermanagedetail?id=${l.orderID}" class="view" data-toggle="modal" ><i class="material-icons" data-toggle="tooltip" title="View Detail">remove_red_eye</i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <c:if test="${requestScope.check.equals('list')}">
                    <div class="clearfix">
                        <ul class="pagination">
                            <c:if test="${requestScope.index >1}">
                                <li class="page-item "><a href="ordermanage?index=${requestScope.index-1}">Previous</a></li>
                                </c:if>
                                <c:forEach begin="1" end="${requestScope.page}" var="i">
                                <li class="page-item <c:if test="${i.equals(requestScope.index)}">active</c:if>"><a href="ordermanage?index=${i}" class="page-link">${i}</a></li>
                                </c:forEach>

                            <c:if test="${requestScope.index < requestScope.page}">
                                <li class="page-item"><a href="ordermanage?index=${requestScope.index+1}" class="page-link">Next</a></li>
                                </c:if>
                        </ul>
                    </div>
                </c:if>
                <c:if test="${requestScope.check.equals('search')}">
                    <div class="clearfix">
                        <ul class="pagination">
                            <c:if test="${requestScope.index >1}">
                                <li class="page-item "><a href="searchorder?search=${requestScope.search}&index=${requestScope.index-1}">Previous</a></li>
                                </c:if>
                                <c:forEach begin="1" end="${requestScope.page}" var="i">
                                <li class="page-item <c:if test="${i.equals(requestScope.index)}">active</c:if>"><a href="searchorder?search=${requestScope.search}&index=${i}" class="page-link">${i}</a></li>
                                </c:forEach>

                            <c:if test="${requestScope.index < requestScope.page}">
                                <li class="page-item"><a href="searchorder?search=${requestScope.search}&index=${requestScope.index+1}" class="page-link">Next</a></li>
                                </c:if>
                        </ul>
                    </div>
                </c:if>
                <c:if test="${requestScope.check.equals('sort')}">
                    <div class="clearfix">
                        <ul class="pagination">
                            <c:if test="${requestScope.index >1}">
                                <li class="page-item "><a href="sortorder?sort=${requestScope.sort}&index=${requestScope.index-1}">Previous</a></li>
                                </c:if>
                                <c:forEach begin="1" end="${requestScope.page}" var="i">
                                <li class="page-item <c:if test="${i.equals(requestScope.index)}">active</c:if>"><a href="sortorder?sort=${requestScope.sort}&index=${i}" class="page-link">${i}</a></li>
                                </c:forEach>

                            <c:if test="${requestScope.index < requestScope.page}">
                                <li class="page-item"><a href="sortorder?sort=${requestScope.sort}&index=${requestScope.index+1}" class="page-link">Next</a></li>
                                </c:if>
                        </ul>
                    </div>
                </c:if>
                <c:if test="${requestScope.check.equals('filter')}">
                    <div class="clearfix">
                        <ul class="pagination">
                            <c:if test="${requestScope.index >1}">
                                <li class="page-item "><a href="filterorder?from=${requestScope.from}&to=${requestScope.to}&index=${requestScope.index-1}">Previous</a></li>
                                </c:if>
                                <c:forEach begin="1" end="${requestScope.page}" var="i">
                                <li class="page-item <c:if test="${i.equals(requestScope.index)}">active</c:if>"><a href="filterorder?from=${requestScope.from}&to=${requestScope.to}&index=${i}" class="page-link">${i}</a></li>
                                </c:forEach>

                            <c:if test="${requestScope.index < requestScope.page}">
                                <li class="page-item"><a href="filterorder?from=${requestScope.from}&to=${requestScope.to}&index=${requestScope.index+1}" class="page-link">Next</a></li>
                                </c:if>
                        </ul>
                    </div>
                </c:if>

            </div>
            <a href="saledashboard"><button type="button" class="btn btn-primary">Back to home</button></a>

        </div>
        <!-- Edit Modal HTML -->
        <div id="addPost" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="addpost" method="get">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add new Post</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Image</label>
                                <input name="image" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>AuthorName</label>
                                <input name="author" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Title</label>
                                <input name="title" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Content</label>
                                <textarea name="content" class="form-control" required></textarea>
                            </div>
                            <div class="form-group">
                                <label>CreateDate</label>
                                <input name="createdate" type="date" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>ModifiedDate</label>
                                <input name="modifieddate" type="date" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Status</label>
                                <select name="status" class="form-select" aria-label="Default select example">
                                    <option value="1">On</option>
                                    <option value="0">Off</option>
                                </select>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="editPost" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Employee</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Name</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Address</label>
                                <textarea class="form-control" required></textarea>
                            </div>
                            <div class="form-group">
                                <label>Phone</label>
                                <input type="text" class="form-control" required>
                            </div>					
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Delete Modal HTML -->
        <div id="ViewPost" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">						
                            <h4 class="modal-title">Delete Product</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <p>Are you sure you want to delete these Records?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-danger" value="Delete">
                        </div>
                    </form>
                </div>
            </div>
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