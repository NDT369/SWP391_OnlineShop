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
                                    <c:if test="${a.getRole().getRoleID()== 1}">Admin</c:if>
                                    <c:if test="${a.getRole().getRoleID()== 2}">Customer</c:if>
                                    <c:if test="${a.getRole().getRoleID()== 3}">Sale</c:if>
                                    <c:if test="${a.getRole().getRoleID()== 4}">Marketing</c:if>
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
                <div class="clearfix">
                    <ul class="pagination">
                        <li class="page-item disabled"><a href="#">Previous</a></li>
                            <c:forEach begin="1" end="${requestScope.page}" var="i">
                                <li class="page-item"><a href="userlist?index=${i}" class="page-link">${i}</a></li>
                            </c:forEach>
                        <li class="page-item"><a href="#" class="page-link">Next</a></li>
                    </ul>
                </div>
            </div>
            <a href="admindashboard"><button type="button" class="btn btn-primary">Back to home</button></a>
        </div>
        
    

    <script src="../js/manager.js" type="text/javascript"></script>

</body>



</html>
