<%-- 
    Document   : Header
    Created on : May 28, 2022, 1:14:21 AM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<header class="header-section">
    <div class="header-top">
        <div class="container">
            <div class="ht-left">
                <div class="mail-service">
                    <i class=" fa fa-envelope"></i>
                    laptot@laptot.com
                </div>
                <div class="phone-service">
                    <i class=" fa fa-phone"></i>
                    +9999999999
                </div>
            </div>
            <div class="ht-right">
                <c:if test="${sessionScope.account==null}">
                    <a href="login" class="login-panel"><i class="fa fa-user"></i>Login</a>
                </c:if>
                <c:if test="${sessionScope.account!=null}">       
                    <a class="login-panel"><i class="fa fa-user"></i>Hello ${sessionScope.account.name}</a> -


                </c:if> 
                <!--                        <div class="lan-selector">
                                            <select class="language_drop" name="countries" id="countries" style="width:300px;">
                                                <option value='yt' data-image="../img/flag-1.jpg" data-imagecss="flag yt"
                                                        data-title="English">English</option>
                                                <option value='yu' data-image="../img/flag-2.jpg" data-imagecss="flag yu"
                                                        data-title="Bangladesh">German </option>
                                            </select>
                                        </div>-->
                <div class="top-social">
                    <a href="#"><i class="ti-facebook"></i></a>
                    <a href="#"><i class="ti-twitter-alt"></i></a>
                    <a href="#"><i class="ti-linkedin"></i></a>
                    <a href="#"><i class="ti-pinterest"></i></a>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="inner-header">
            <div class="row">
                <div class="col-lg-2 col-md-2">
                    <div class="logo">
                        <a href="home">
                            <img src="../img/logo.png" alt="">
                        </a>
                    </div>
                </div>
                <div class="col-lg-7 col-md-7">
                    <div class="advanced-search">
                        <button type="button" class="category-btn">All Categories</button>
                        <div class="input-group">
                            <input type="text" placeholder="What do you need?">
                            <button type="button"><i class="ti-search"></i></button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 text-right col-md-3">
                    <ul class="nav-right">
                        
                        <c:set value="${cart}" var="c"/>

                        <li class="cart-icon">
                            <a href="shoppingcart">
                                <i class="icon_bag_alt"></i>
                                <span>${c.totalQuantity}</span>
                            </a>

                            <div class="cart-hover">
                                <div class="select-items">
                                    <table>
                                        <tbody>
                                            <c:forEach items="${c.item}" var="i">
                                                <tr>
                                                    <td class="si-pic"><img src="${i.product.imgURL}" alt=""></td>
                                                    <td class="si-text">
                                                        <div class="product-selected">
                                                            <p><fmt:formatNumber pattern="###,###,###" value="${i.product.saleprice}" /> VND x ${i.quantity}</p>
                                                            <h6>${i.product.name}</h6>
                                                        </div>
                                                    </td>
                                                </tr>
                                            </c:forEach>  
                                          
                                        </tbody>
                                    </table>
                                </div>
                                <div class="select-total">
                                    <span>total:</span>
                                    <h5><fmt:formatNumber pattern="###,###,###" value="${c.totalPrice}" /> VND</h5>
                                </div>
                                <div class="select-button">
                                    <a href="shoppingcart" class="primary-btn view-card">VIEW CART</a>
                                    <a href="cartcontact" class="primary-btn checkout-btn">CHECK OUT</a>
                                </div>
                            </div>

                        </li>
                        <!--<li class="cart-price"><fmt:formatNumber pattern="###,###,###" value="${c.totalPrice}" /> VND</li>-->
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="nav-item">
        <div class="container">
            <div class="nav-depart">
                <div class="depart-btn">
                    <i class="ti-menu"></i>
                    <span>All departments</span>
                    <ul class="depart-hover">
                        <li class="active"><a href="#">Women’s Clothing</a></li>
                        <li><a href="#">Men’s Clothing</a></li>
                        <li><a href="#">Underwear</a></li>
                        <li><a href="#">Kid's Clothing</a></li>
                        <li><a href="#">Brand Fashion</a></li>
                        <li><a href="#">Accessories/Shoes</a></li>
                        <li><a href="#">Luxury Brands</a></li>
                        <li><a href="#">Brand Outdoor Apparel</a></li>
                    </ul>
                </div>
            </div>
            <nav class="nav-menu mobile-menu">
                <ul>
                    <li class="active"><a href="home">Home</a></li>
                    <li><a href="product">Shop</a></li>
                    <li><a href="#">Collection</a>
                        <ul class="dropdown">
                            <li><a href="#">Men's</a></li>
                            <li><a href="#">Women's</a></li>
                            <li><a href="#">Kid's</a></li>
                        </ul>
                    </li>
                    <li><a href="blog">Blog</a></li>
                    <li><a href="./contact.html">Contact</a></li>
                    <li><a href="#">Pages</a>
                        <ul class="dropdown">
                            <c:if test="${sessionScope.account!=null}"> 
                                <li><a href="userprofile">User Profile</a></li>
                                <li><a href="shoppingcart">Shopping Cart</a></li>
                                <li><a href="cartcontact">Checkout</a></li>
                                 <li><a href="changepass">Change Password</a></li>
                            </c:if>
      
                                <c:if test="${sessionScope.account==null}"> 
                                <li><a href="register">Register</a></li>
                                </c:if>
                                <c:set value="${sessionScope.account}" var="a"></c:set>
                                <c:if test="${a.getRole().getRoleName().toLowerCase().equals('admin')}">
                                <li><a href="admindashboard">Admin DashBoard</a></li>
                                </c:if>
                                <c:if test="${a.getRole().getRoleName().toLowerCase().equals('saler')}">
                                <li><a href="saledashboard">Sale DashBoard</a></li>
                                </c:if>
                                <c:if test="${a.getRole().getRoleName().toLowerCase().equals('marketer')}">
                                <li><a href="marketingdashboard">Marketing DashBoard</a></li>
                                </c:if>
                                <c:if test="${sessionScope.account!=null}">
                                <li><a href="logout">Logout</a></li>
                                </c:if>
                        </ul>
                    </li>
                </ul>
            </nav>
            <div id="mobile-menu-wrap"></div>
        </div>
    </div>
</header>
