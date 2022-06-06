<%-- 
    Document   : homepage
    Created on : May 27, 2022, 1:43:11 PM
    Author     : DUC THINH
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Fashi Template">
        <meta name="keywords" content="Fashi, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Fashi | Template</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">


        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/themify-icons.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Header Section Begin -->
        <header class="header-section">
            <div class="header-top">
                <div class="container">
                    <div class="ht-left">
                        <div class="mail-service">
                            <i class=" fa fa-envelope"></i>
                            hello.colorlib@gmail.com
                        </div>
                        <div class="phone-service">
                            <i class=" fa fa-phone"></i>
                            +65 11.188.888
                        </div>
                    </div>
                    <div class="ht-right">
                        <c:if test="${sessionScope.account==null}">
                            <a href="login" class="login-panel"><i class="fa fa-user"></i>Login</a>
                        </c:if>
                        <c:if test="${sessionScope.account!=null}">       
                            <a class="login-panel"><i class="fa fa-user"></i>Hello ${sessionScope.account.name}</a> -


                        </c:if> 
                        <div class="lan-selector">
                            <select class="language_drop" name="countries" id="countries" style="width:300px;">
                                <option value='yt' data-image="img/flag-1.jpg" data-imagecss="flag yt"
                                        data-title="English">English</option>
                                <option value='yu' data-image="img/flag-2.jpg" data-imagecss="flag yu"
                                        data-title="Bangladesh">German </option>
                            </select>
                        </div>
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
                                    <img src="img/logo.png" alt="">
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
                                <li class="heart-icon">
                                    <a href="#">
                                        <i class="icon_heart_alt"></i>
                                        <span>1</span>
                                    </a>
                                </li>
                                <li class="cart-icon">
                                    <a href="#">
                                        <i class="icon_bag_alt"></i>
                                        <span>3</span>
                                    </a>
                                    <div class="cart-hover">
                                        <div class="select-items">
                                            <table>
                                                <tbody>
                                                    <tr>
                                                        <td class="si-pic"><img src="img/select-product-1.jpg" alt=""></td>
                                                        <td class="si-text">
                                                            <div class="product-selected">
                                                                <p>$60.00 x 1</p>
                                                                <h6>Kabino Bedside Table</h6>
                                                            </div>
                                                        </td>
                                                        <td class="si-close">
                                                            <i class="ti-close"></i>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td class="si-pic"><img src="img/select-product-2.jpg" alt=""></td>
                                                        <td class="si-text">
                                                            <div class="product-selected">
                                                                <p>$60.00 x 1</p>
                                                                <h6>Kabino Bedside Table</h6>
                                                            </div>
                                                        </td>
                                                        <td class="si-close">
                                                            <i class="ti-close"></i>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="select-total">
                                            <span>total:</span>
                                            <h5>$120.00</h5>
                                        </div>
                                        <div class="select-button">
                                            <a href="#" class="primary-btn view-card">VIEW CARD</a>
                                            <a href="#" class="primary-btn checkout-btn">CHECK OUT</a>
                                        </div>
                                    </div>
                                </li>
                                <li class="cart-price">$150.00</li>
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
                            <li><a href="./shop.html">Shop</a></li>
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
                                    <li><a href="userprofile">User Profile</a></li>
                                    <li><a href="./blog-details.html">Blog Details</a></li>
                                    <li><a href="./shopping-cart.html">Shopping Cart</a></li>
                                    <li><a href="./check-out.html">Checkout</a></li>
                                    <li><a href="./faq.html">Faq</a></li>
                                    <li><a href="register">Register</a></li>
                                    <% 
                                        Account a = (Account)session.getAttribute("account");
                                        if(a!=null){
                                        if(a.getRole().toLowerCase().equals("admin")){
                                    %>
                                    <li><a href="admindashboard">Admin DashBoard</a></li>
                                    <%
                                        }
                                    %>
                                   <%    
                                        if(a.getRole().toLowerCase().equals("saler")){
                                    %>
                                    <li><a href="saledashboard">Sale DashBoard</a></li>
                                    <%
                                        }
                                    %>
                                    
                                    <%    
                                    if(a.getRole().toLowerCase().equals("marketer")){
                                    %>
                                    <li><a href="marketingdashboard">Marketing DashBoard</a></li>
                                    <%
                                        }
                                    }
                                    %>
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
        <!-- Header End -->

        <!-- Hero Section Begin -->
        <section class="hero-section">
            <div class="hero-items owl-carousel">
                <!--slide list-->
                <%--<c:forEach items="" var="">--%>
                <div class="single-hero-items set-bg" data-setbg="https://i0.wp.com/jawwaby.club/wp-content/uploads/2022/05/Best-2-in-1-Laptop-for-2022.jpg?fit=1200%2C630&ssl=1">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-5">
                                <!--<span>Bag,kids</span>-->
                                <h1>Our Achievements</h1>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                    incididunt ut labore et dolore</p>
                                <a href="blog" class="primary-btn">View</a>
                            </div>
                        </div>
                        <!--                        <div class="off-card">
                                                    <h2>Sale <span>50%</span></h2>
                                                </div>-->
                    </div>
                </div>
                <div class="single-hero-items set-bg" data-setbg="https://assets1.ignimgs.com/2019/05/17/laptopsmoon-blogroll-1558134085315_160w.jpg?width=1280">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-5">
                                <span>Bag,kids</span>
                                <h1>Black friday</h1>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                    incididunt ut labore et dolore</p>
                                <a href="product" class="primary-btn">Shop Now</a>
                            </div>
                        </div>
                        <div class="off-card">
                            <h2>Sale <span>50%</span></h2>
                        </div>
                    </div>
                </div>
                <%--</c:forEach>--%>
            </div>
        </section>
        <!-- Hero Section End -->

        <!-- Banner Section Begin -->
        <div class="banner-section spad">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="single-banner">
                            <img src="https://cdn.techzones.vn/Data/Sites/1/media/tin-t%E1%BB%A9c-/laptop-gaming-choi-game-cua-asus-hay-msi/laptop-gaming-choi-game-cua-asus-hay-msi-1.jpg?w=1920" alt="">
                            <div class="inner-text">
                                <a href="product?cate=Gaming"><h4>Gaming</h4></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="single-banner">
                            <img src="https://m.media-amazon.com/images/I/81aO-KQ+MdL._SL1500_.jpg" alt="">
                            <div class="inner-text">
                                <a href="product?cate=Design"><h4>Design</h4></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="single-banner">
                            <img src="https://m.media-amazon.com/images/I/81hZ0z4l1kS._AC_SL1500_.jpg" alt="">
                            <div class="inner-text">
                                <a href="product?cate=Office"><h4>Office</h4></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Banner Section End -->

        <!-- Women Banner Section Begin -->
        <section class="women-banner spad">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="product-large set-bg" data-setbg="https://images.unsplash.com/photo-1542393545-10f5cde2c810?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8bGFwdG9wJTIwY29tcHV0ZXJ8ZW58MHx8MHx8&w=1000&q=80">
                            <h2>Top Selling</h2>
                            <a href="product">Discover More</a>
                        </div>
                    </div>
                    <div class="col-lg-8 offset-lg-1">
                        <div class="filter-control">
                            <ul>
                                <li class="active">Hot Deal</li>
                                <!--                                <li>HandBag</li>
                                                                <li>Shoes</li>
                                                                <li>Accessories</li>-->
                            </ul>
                        </div>
                        <div class="product-slider owl-carousel">
                            <c:forEach items="${requestScope.listTop}" var="l">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <img src="${l.imgURL}" alt="">
                                        <div class="sale">Sale</div>
                                        <div class="icon">
                                            <i class="icon_heart_alt"></i>
                                        </div>
                                        <ul>
                                            <li class="w-icon active"><a href="#"><i class="icon_bag_alt"></i></a></li>
                                            <li class="quick-view"><a href="#">+ Quick View</a></li>
                                            <li class="w-icon"><a href="#"><i class="fa fa-random"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="pi-text">
                                        <div class="catagory-name">${l.category}</div>
                                        <a href="productdetail?productID=${l.id}">
                                            <h5>${l.name}</h5>
                                        </a>
                                        <div class="product-price">
                                            <fmt:formatNumber pattern="###,###,###" value="${l.saleprice}" /> VND
                                            <span><fmt:formatNumber pattern="###,###,###" value="${l.price}" /> VND</span>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Women Banner Section End -->

        <!-- Deal Of The Week Section Begin-->
        <!--        <section class="deal-of-week set-bg spad" data-setbg="img/time-bg.jpg">
                    <div class="container">
                        <div class="col-lg-6 text-center">
                            <div class="section-title">
                                <h2>Deal Of The Week</h2>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed<br /> do ipsum dolor sit amet,
                                    consectetur adipisicing elit </p>
                                <div class="product-price">
                                    $35.00
                                    <span>/ HanBag</span>
                                </div>
                            </div>
                            <div class="countdown-timer" id="countdown">
                                <div class="cd-item">
                                    <span>56</span>
                                    <p>Days</p>
                                </div>
                                <div class="cd-item">
                                    <span>12</span>
                                    <p>Hrs</p>
                                </div>
                                <div class="cd-item">
                                    <span>40</span>
                                    <p>Mins</p>
                                </div>
                                <div class="cd-item">
                                    <span>52</span>
                                    <p>Secs</p>
                                </div>
                            </div>
                            <a href="#" class="primary-btn">Shop Now</a>
                        </div>
                    </div>
                </section>-->
        <!-- Deal Of The Week Section End -->

        <!-- Man Banner Section Begin -->
        <section class="man-banner spad">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="filter-control">
                            <ul>
                                <li class="active">New Product</li>
                                <!--                                <li>HandBag</li>
                                                                <li>Shoes</li>
                                                                <li>Accessories</li>-->
                            </ul>
                        </div>
                        <div class="product-slider owl-carousel">
                            <c:forEach items="${requestScope.listNew}" var="l">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <img src="${l.imgURL}" alt="">
                                        <div class="sale">New</div>
                                        <div class="icon">
                                            <i class="icon_heart_alt"></i>
                                        </div>
                                        <ul>
                                            <li class="w-icon active"><a href="#"><i class="icon_bag_alt"></i></a></li>
                                            <li class="quick-view"><a href="#">+ Quick View</a></li>
                                            <li class="w-icon"><a href="#"><i class="fa fa-random"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="pi-text">
                                        <div class="catagory-name">${l.category}</div>
                                        <a href="productdetail?productID=${l.id}">
                                            <h5>${l.name}</h5>
                                        </a>
                                        <div class="product-price">
                                            <fmt:formatNumber pattern="###,###,###" value="${l.saleprice}" /> VND
                                            <span><fmt:formatNumber pattern="###,###,###" value="${l.price}" /> VND</span>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                        </div>
                    </div>
                    <div class="col-lg-3 offset-lg-1">
                        <div class="product-large set-bg m-large" data-setbg="https://cdn.pixabay.com/photo/2015/09/05/22/40/macbook-925856_1280.jpg">
                            <h2>Top Trending</h2>
                            <a href="product">Discover More</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Man Banner Section End -->

        <!-- Instagram Section Begin -->
<!--        <div class="instagram-photo">
            <div class="insta-item set-bg" data-setbg="img/insta-1.jpg">
                <div class="inside-text">
                    <i class="ti-instagram"></i>
                    <h5><a href="#">colorlib_Collection</a></h5>
                </div>
            </div>
            <div class="insta-item set-bg" data-setbg="img/insta-2.jpg">
                <div class="inside-text">
                    <i class="ti-instagram"></i>
                    <h5><a href="#">colorlib_Collection</a></h5>
                </div>
            </div>
            <div class="insta-item set-bg" data-setbg="img/insta-3.jpg">
                <div class="inside-text">
                    <i class="ti-instagram"></i>
                    <h5><a href="#">colorlib_Collection</a></h5>
                </div>
            </div>
            <div class="insta-item set-bg" data-setbg="img/insta-4.jpg">
                <div class="inside-text">
                    <i class="ti-instagram"></i>
                    <h5><a href="#">colorlib_Collection</a></h5>
                </div>
            </div>
            <div class="insta-item set-bg" data-setbg="img/insta-5.jpg">
                <div class="inside-text">
                    <i class="ti-instagram"></i>
                    <h5><a href="#">colorlib_Collection</a></h5>
                </div>
            </div>
            <div class="insta-item set-bg" data-setbg="img/insta-6.jpg">
                <div class="inside-text">
                    <i class="ti-instagram"></i>
                    <h5><a href="#">colorlib_Collection</a></h5>
                </div>
            </div>
        </div>-->
        <!-- Instagram Section End -->

        <!-- Latest Blog Section Begin -->
        <section class="latest-blog spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>From The Blog</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <c:forEach items="${requestScope.blog}" var="b">
                        <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="${b.imgURL}" alt="">
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        May 4,2019
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="blogdetail?blogID=${b.id}">
                                    <h4>${b.title}</h4>
                                </a>
                                <!--<p>${b.content} </p>-->
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                    
                    
<!--                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/latest-2.jpg" alt="">
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        May 4,2019
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="#">
                                    <h4>Vogue's Ultimate Guide To Autumn/Winter 2019 Shoes</h4>
                                </a>
                                <p>Sed quia non numquam modi tempora indunt ut labore et dolore magnam aliquam quaerat </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/latest-3.jpg" alt="">
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        May 4,2019
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="#">
                                    <h4>How To Brighten Your Wardrobe With A Dash Of Lime</h4>
                                </a>
                                <p>Sed quia non numquam modi tempora indunt ut labore et dolore magnam aliquam quaerat </p>
                            </div>
                        </div>
                    </div>-->
                </div>
                <div class="benefit-items">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="single-benefit">
                                <div class="sb-icon">
                                    <img src="img/icon-1.png" alt="">
                                </div>
                                <div class="sb-text">
                                    <h6>Free Shipping</h6>
                                    <p>For all order over 99$</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="single-benefit">
                                <div class="sb-icon">
                                    <img src="img/icon-2.png" alt="">
                                </div>
                                <div class="sb-text">
                                    <h6>Delivery On Time</h6>
                                    <p>If good have prolems</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="single-benefit">
                                <div class="sb-icon">
                                    <img src="img/icon-1.png" alt="">
                                </div>
                                <div class="sb-text">
                                    <h6>Secure Payment</h6>
                                    <p>100% secure payment</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Latest Blog Section End -->

        <!-- Partner Logo Section Begin -->
        <div class="partner-logo">
            <div class="container">
                <div class="logo-carousel owl-carousel">
                    <div class="logo-item">
                        <div class="tablecell-inner">
                            <img src="img/logo-carousel/logo-1.png" alt="">
                        </div>
                    </div>
                    <div class="logo-item">
                        <div class="tablecell-inner">
                            <img src="img/logo-carousel/logo-2.png" alt="">
                        </div>
                    </div>
                    <div class="logo-item">
                        <div class="tablecell-inner">
                            <img src="img/logo-carousel/logo-3.png" alt="">
                        </div>
                    </div>
                    <div class="logo-item">
                        <div class="tablecell-inner">
                            <img src="img/logo-carousel/logo-4.png" alt="">
                        </div>
                    </div>
                    <div class="logo-item">
                        <div class="tablecell-inner">
                            <img src="img/logo-carousel/logo-5.png" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Partner Logo Section End -->

        <!-- Footer Section Begin -->
        <footer class="footer-section">
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
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright-reserved">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="copyright-text">
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </div>
                            <div class="payment-pic">
                                <img src="img/payment-method.png" alt="">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer Section End -->

        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/jquery.dd.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>
