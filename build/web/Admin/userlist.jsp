<%-- 
    Document   : UserList
    Created on : May 28, 2022, 1:09:54 AM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>User List</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="../css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    </head>

    <body>

        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Manage <b>User</b></h2>
                        </div>
                        <!--                        <div class="col-sm-6">
                                                    <a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Product</span></a>
                                                    <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
                                                </div>-->
                    </div>
                </div>

                <form id="f" action="userlist" method="post">
                    Search
                    <input type="text" name="search" placeholder="Text in here" value = "${requestScope.search}"/> 
                    <input type="submit" value="Search"/> <br><br>

                    Gender
                    <select name="gender" onchange="document.getElementById('f').submit()" value = "${requestScope.gender}">
                        <option value="" >All</option>
                        <option value="1" <%= request.getAttribute("gender").equals("1") ? "selected='selected'" : ""%> >Male</option>
                        <option value="0" <%= request.getAttribute("gender").equals("0") ? "selected='selected'" : ""%> >Female</option>
                    </select>
                    Role
                    <select name="role" onchange="document.getElementById('f').submit()" value = "${requestScope.role}">
                        <option value="" >All</option>
                        <option value="1" <%= request.getAttribute("role").equals("1") ? "selected='selected'" : ""%> >Admin</option>
                        <option value="2" <%= request.getAttribute("role").equals("2") ? "selected='selected'" : ""%> >Customer</option>
                        <option value="3" <%= request.getAttribute("role").equals("3") ? "selected='selected'" : ""%> >Sale</option>
                        <option value="4" <%= request.getAttribute("role").equals("4") ? "selected='selected'" : ""%> >Marketing</option>
                    </select>
                    Status
                    <select name="status" onchange="document.getElementById('f').submit()" value = "${requestScope.status}">
                        <option value="" >All</option>
                        <option value="1" <%= request.getAttribute("status").equals("1") ? "selected='selected'" : ""%> >Active</option>
                        <option value="0" <%= request.getAttribute("status").equals("0") ? "selected='selected'" : ""%> >Deactive</option>
                    </select><br><br>

                    Sort by:
                    <select name="sort" onchange="document.getElementById('f').submit()" value="${requestScope.sort}">
                        <option value="Account_ID" <%= request.getAttribute("sort").equals("Account_ID") ? "selected='selected'" : ""%>  >Account_ID</option>
                        <option value="Name" <%= request.getAttribute("sort").equals("Name") ? "selected='selected'" : ""%>>Name</option>
                        <option value="Email" <%= request.getAttribute("sort").equals("Email") ? "selected='selected'" : ""%> >Email</option>
                        <option value="Phone" <%= request.getAttribute("sort").equals("Phone") ? "selected='selected'" : ""%> >Phone</option>
                        <option value="Role_ID" <%= request.getAttribute("sort").equals("Role_ID") ? "selected='selected'" : ""%> >Role</option>
                    </select>

                </form>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
<!--                            <th>
                                                                <span class="custom-checkbox">
                                                                    <input type="checkbox" id="selectAll">
                                                                    <label for="selectAll"></label>
                                                                </span>
                            </th>-->
                            <th>User ID</th>
                            <th>Full Name</th>
                            <th>Gender</th>
                            <th>Email</th>
                            <th>Phone Number</th>
                            <th>Role</th>
                            <th>Status</th>
                            <th>#</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.UserList}" var="a">
                            <tr>
                                <td>${a.getAccountID()}</td>
                                <td>${a.getName()}</td>
                                <td>
                                    <c:if test="${a.isGender()== true}">Male</c:if>
                                    <c:if test="${a.isGender()== false}">Female</c:if>
                                    </td>
                                    <td>${a.getEmail()}</td>
                                <td>${a.getPhone()}</td>
                                <td>
                                    <c:if test="${a.getRole()== 1}">Admin</c:if>
                                    <c:if test="${a.getRole()== 2}">Customer</c:if>
                                    <c:if test="${a.getRole()== 3}">Sale</c:if>
                                    <c:if test="${a.getRole()== 4}">Marketing</c:if>
                                    </td>
                                    <td>
                                    <c:if test="${a.isStatus()== true}">Active</c:if>
                                    <c:if test="${a.isStatus()== false}">Deactive</c:if>
                                    </td>
                                    <td> <a href="userdetail?id=${a.getAccountID()}">Detail</a> </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <!--                <div class="clearfix">
                                    <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                                    <ul class="pagination">
                                        <li class="page-item disabled"><a href="#">Previous</a></li>
                                        <li class="page-item"><a href="#" class="page-link">1</a></li>
                                        <li class="page-item"><a href="#" class="page-link">2</a></li>
                                        <li class="page-item active"><a href="#" class="page-link">3</a></li>
                                        <li class="page-item"><a href="#" class="page-link">4</a></li>
                                        <li class="page-item"><a href="#" class="page-link">5</a></li>
                                        <li class="page-item"><a href="#" class="page-link">Next</a></li>
                                    </ul>
                                </div>-->
            </div>
            <a href="admin"><button type="button" class="btn btn-primary">Back to home</button>

        </div>
        <!-- Edit Modal HTML -->
        <!--        <div id="addEmployeeModal" class="modal fade">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <form action="add" method="post">
                                <div class="modal-header">						
                                    <h4 class="modal-title">Add Product</h4>
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                </div>
                                <div class="modal-body">					
                                    <div class="form-group">
                                        <label>Name</label>
                                        <input name="name" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Image</label>
                                        <input name="image" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Price</label>
                                        <input name="price" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Title</label>
                                        <textarea name="title" class="form-control" required></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label>Description</label>
                                        <textarea name="description" class="form-control" required></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label>Category</label>
                                        <select name="category" class="form-select" aria-label="Default select example">
        <c:forEach begin="1" end="3" var="o">
            <option value="1">Giày Adidas</option>
        </c:forEach>
    </select>
</div>


        <h1>User List</h1>
        <form action="search">

        </form><br>

        <form id="f" action="userlist" method="post">
            Search
            <input type="text" name="search" placeholder="Text in here" value = "${requestScope.search}"/> 
            <input type="submit" value="Search"/> <br>

            Gender
            <select name="gender" onchange="document.getElementById('f').submit()" value = "${requestScope.gender}">
                <option value="" >All</option>
                <option value="1" <%= request.getAttribute("gender").equals("1") ? "selected='selected'" : ""%> >Male</option>
                <option value="0" <%= request.getAttribute("gender").equals("0") ? "selected='selected'" : ""%> >Female</option>
            </select>
            Role
            <select name="role" onchange="document.getElementById('f').submit()" value = "${requestScope.role}">
                <option value="" >All</option>
                <option value="1" <%= request.getAttribute("role").equals("1") ? "selected='selected'" : ""%> >Admin</option>
                <option value="2" <%= request.getAttribute("role").equals("2") ? "selected='selected'" : ""%> >Customer</option>
                <option value="3" <%= request.getAttribute("role").equals("3") ? "selected='selected'" : ""%> >Sale</option>
                <option value="4" <%= request.getAttribute("role").equals("4") ? "selected='selected'" : ""%> >Marketing</option>
            </select>
            Status
            <select name="status" onchange="document.getElementById('f').submit()" value = "${requestScope.status}">
                <option value="" >All</option>
                <option value="1" <%= request.getAttribute("status").equals("1") ? "selected='selected'" : ""%> >Active</option>
                <option value="0" <%= request.getAttribute("status").equals("0") ? "selected='selected'" : ""%> >Deactive</option>
            </select><br>

            Sort by:
            <select name="sort" onchange="document.getElementById('f').submit()" value="${requestScope.sort}">
                <option value="Account_ID" <%= request.getAttribute("sort").equals("Account_ID") ? "selected='selected'" : ""%>  >Account_ID</option>
                <option value="Name" <%= request.getAttribute("sort").equals("Name") ? "selected='selected'" : ""%>>Name</option>
                <option value="Email" <%= request.getAttribute("sort").equals("Email") ? "selected='selected'" : ""%> >Email</option>
                <option value="Phone" <%= request.getAttribute("sort").equals("Phone") ? "selected='selected'" : ""%> >Phone</option>
                <option value="Role_ID" <%= request.getAttribute("sort").equals("Role_ID") ? "selected='selected'" : ""%> >Role</option>
            </select>

        </form>

        <table border = "1px" width = "80%">
            <tr>
                <th>User ID</th>
                <th>Full Name</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Role</th>
                <th>Status</th>
                <th>#</th>
            </tr>
            <c:forEach items="${requestScope.UserList}" var="a">
                <tr>
                    <td>${a.getAccountID()}</td>
                    <td>${a.getName()}</td>
                    <td>
                        <c:if test="${a.isGender()== true}">Male</c:if>
                        <c:if test="${a.isGender()== false}">Female</c:if>
                        </td>
                        <td>${a.getEmail()}</td>
                    <td>${a.getPhone()}</td>
                    <td>
                        <c:if test="${a.getRole()== 1}">Admin</c:if>
                        <c:if test="${a.getRole()== 2}">Customer</c:if>
                        <c:if test="${a.getRole()== 3}">Sale</c:if>
                        <c:if test="${a.getRole()== 4}">Marketing</c:if>
                        </td>
                        <td>
                        <c:if test="${a.isStatus()== true}">Active</c:if>
                        <c:if test="${a.isStatus()== false}">Deactive</c:if>
                        </td>
                        <td> <a href="userdetail?id=${a.getAccountID()}">Detail</a> </td>
                </tr>
            </c:forEach>
        </table>
        <a href="#"><input type="submit" value="Add User" /></a><br/>
        <a href="admindashboard"><input type="submit" value="Back to Admin DashBoard" /></a>

        <!-- Footer Section Begin -->
<!--        <footer class="footer-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="footer-left">
                            <div class="footer-logo">
                                <a href="#"><img src="img/footer-logo.png" alt=""></a>
                            </div>
                            <ul>
                                <li>Address: 60-49 Road 11378 New York</li>
                                <li>Phone: +65 11.188.888</li>
                                <li>Email: hello.colorlib@gmail.com</li>
                            </ul>
                            <div class="footer-social">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-pinterest"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-2 offset-lg-1">
                        <div class="footer-widget">
                            <h5>Information</h5>
                            <ul>
                                <li><a href="#">About Us</a></li>
                                <li><a href="#">Checkout</a></li>
                                <li><a href="#">Contact</a></li>
                                <li><a href="#">Serivius</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-2">
                        <div class="footer-widget">
                            <h5>My Account</h5>
                            <ul>
                                <li><a href="#">My Account</a></li>
                                <li><a href="#">Contact</a></li>
                                <li><a href="#">Shopping Cart</a></li>
                                <li><a href="#">Shop</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="newslatter-item">
                            <h5>Join Our Newsletter Now</h5>
                            <p>Get E-mail updates about our latest shop and special offers.</p>
                            <form action="#" class="subscribe-form">
                                <input type="text" placeholder="Enter Your Mail">
                                <button type="button">Subscribe</button>

</div>
<div class="modal-footer">
<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
<input type="submit" class="btn btn-success" value="Add">
</div>
</form>
</div>
</div>
</div>-->
        <!-- Edit Modal HTML -->
        <!--        <div id="editEmployeeModal" class="modal fade">
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
                </div>-->
        <!-- Delete Modal HTML -->
        <!--        <div id="deleteEmployeeModal" class="modal fade">
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
                </div>-->
    </a>

    <script src="../js/manager.js" type="text/javascript"></script>

</body>



</html>
