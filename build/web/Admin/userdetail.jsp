<%-- 
    Document   : UserDetails
    Created on : May 28, 2022, 2:53:41 PM
    Author     : Pham Minh Giang
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>User Detail</title>
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
        <c:set var="a" value="${requestScope.Account}"/>
        <!--        <div class="container">
                    <div class="table-wrapper">
        
                        <div class="table-title">
        
                            <div class="row">
                                <div class="col-sm-6">
                                    <h2>User <b>Details</b></h2>
                                </div>
                                <div class="col-sm-6">
                                </div>
                            </div>
                        </div>
        
                        <form action="userupdate">
                            <table class="table table-striped table-hover" >
                                
                                    <tr>
                                        <th>User ID</th>
                                        <th>Full Name</th>
                                        <th>Gender</th>
                                        <th>Email</th>
                                        <th>Phone Number</th>
                                        <th>Role</th>
                                        <th>Address</th>
                                        <th>Status</th>
                                    </tr>
                                
                              
                                    <td>${a.accountID}</td>
                                    <td>${a.name}</td>
                                    <td>
        <c:if test="${a.gender==true}">Male</c:if> 
        <c:if test="${a.gender==false}">Female</c:if>
        </td>
        <td>${a.email}</td>
    <td>${a.phone}</td>
    <td>
        <select name="role">
            <option>${a.role}</option>
        <c:forEach items="${requestScope.RoleList}" var="r">
            <option value="${r.roleID}">${r.roleName}</option>
        </c:forEach>
    </select></td>
<td>${a.address}</td>
<td>
    <select name="status">
        <c:if test="${a.status==true}">
            <option>1</option>
        </c:if>
        <c:if test="${a.status==false}">
            <option>0</option>
        </c:if>
        <c:forEach items="${requestScope.StatusList}" var="s">
            <option value="${s}">${s}</option>
        </c:forEach>
    </select>
</td>

</table>
<input type="submit" value="Save Change" class="btn btn-primary"/>
</form>

</div><br>
<a href="userlist"><button type="button" class="btn btn-primary">Back to home</button>

</div>-->

        <!--=======================================-->

        <h1>User Detail</h1>

             <form action="userupdate">
       
                   <table border = "1px">
                       <tr>
                           <td>ID</td>
                           <td><input name="id" value="${a.accountID}"/></td>
                       </tr>
                       <tr>
                           <td>Name</td>
                           <td>${a.name}</td>
                       </tr>
                       <tr>
                           <td>Gender</td>
        <c:if test="${a.gender==true}"><td>Male</td></c:if> 
        <c:if test="${a.gender==false}"><td>Female</td></c:if> 
        </tr>
        <tr>
            <td>Email</td>
            <td>${a.email}</td>
    </tr>
    <tr>
        <td>Phone</td>
        <td>${a.phone}</td>
    </tr>
    <tr>
        <td>Role</td>
        <td>
            <select name="role">
                <option>${a.role}</option>
        <c:forEach items="${requestScope.RoleList}" var="r">
            <option value="${r.roleID}">${r.roleName}</option>
        </c:forEach>
    </select>
</td>
</tr>
<tr>
<td>Address</td>
<td>${a.address}</td>
</tr>
<tr>
<td>Status</td>
<td>
    <select name="status">
        <c:if test="${a.status==true}">
            <option>1</option>
        </c:if>
        <c:if test="${a.status==false}">
            <option>0</option>
        </c:if>
        <c:forEach items="${requestScope.StatusList}" var="s">
            <option value="${s}">${s}</option>
        </c:forEach>


    </select>
</td>
</tr>
</table>  
<input type="submit" value="Save Change" /><br/>
<a href="userlist"><input type="submit" value="Back to UserList" /></a>
</form>
      
        <script src="../js/manager.js" type="text/javascript"></script>
    </body>
</html>
