<%-- 
    Document   : productdetails
    Created on : Jun 2, 2022, 2:47:57 AM
    Author     : Pham Minh Giang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Fashi Template">
        <meta name="keywords" content="Fashi, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Fashi Shop</title>

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
        <c:set value="${cart}" var="c"/>
        <%@include file="Components/header.jsp" %>
        <!-- Header End -->

        <!-- Breadcrumb Section Begin -->
        <div class="breacrumb-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="breadcrumb-text product-more">
                            <a href="./home.html"><i class="fa fa-home"></i> Home</a>
                            <a href="./shop.html">Shop</a>
                            <span>Detail</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcrumb Section Begin -->

        <!-- Product Shop Section Begin -->

        <c:set value="${requestScope.product}" var="p"></c:set>
            <section class="product-shop spad page-details">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3">
                            <form id="f" action="filter">

                                <div class="filter-widget">
                                    <h4 class="fw-title">Categories</h4>
                                    <ul class="filter-catagories">
                                        <div class="fw-brand-check">
                                        <c:forEach items="${sessionScope.categoryList}" var="l">
                                            <div class="bc-item">
                                                <label >
                                                    <input type="radio" value="${l.name}" name="category" > 
                                                    ${l.name}
                                                    <span class="checkmark"></span>
                                                </label>
                                            </div>
                                        </c:forEach>
                                    </div> 
                                </ul>
                            </div>
                            <div class="filter-widget">
                                <h4 class="fw-title">Brand</h4>
                                <ul class="filter-catagories">
                                    <div class="fw-brand-check">
                                        <c:forEach items="${sessionScope.brandList}" var="l">
                                            <div class="bc-item">
                                                <label >
                                                    ${l.name}
                                                    <input type="radio" name="brand" value="${l.name}" >
                                                    <span class="checkmark"></span>
                                                </label>
                                            </div>
                                        </c:forEach>
                                    </div> 
                                </ul>
                            </div>
                            <div class="filter-widget">
                                <h4 class="fw-title">Display</h4>
                                <ul class="filter-catagories">
                                    <div class="fw-brand-check">
                                        <c:forEach items="${sessionScope.displayList}" var="l">
                                            <div class="bc-item">
                                                <label >
                                                    ${l.name}
                                                    <input type="radio" name="display" value="${l.name}" >
                                                    <span class="checkmark"></span>
                                                </label>
                                            </div>
                                        </c:forEach>
                                    </div> 
                                </ul>
                            </div>
                            <div class="filter-widget">
                                <h4 class="fw-title">CPU</h4>
                                <ul class="filter-catagories">
                                    <div class="fw-brand-check">
                                        <c:forEach items="${sessionScope.cpuList}" var="l">
                                            <div class="bc-item">
                                                <label >
                                                    ${l.name}
                                                    <input type="radio" name="cpu" value="${l.name}" >
                                                    <span class="checkmark"></span>
                                                </label>
                                            </div>
                                        </c:forEach>
                                    </div> 
                                </ul>
                            </div>
                            <input type="submit" value="FILTER">
                        </form>

                    </div>
                    <div class="col-lg-9">
                        <div class="row">
                            <div class="col-lg-6">
                                <div class="product-pic-zoom">
                                    <img class="product-big-img" src="${p.imgURL}" alt="">
                                    <div class="zoom-icon">
                                        <i class="fa fa-search-plus"></i>
                                    </div>
                                </div>
                                <div class="product-thumbs">
                                    <div class="product-thumbs-track ps-slider owl-carousel">
                                        <div class="pt active" data-imgbigurl="${p.imgURL}"><img
                                                src="${p.imgURL}" alt=""></div>
                                        <div class="pt" data-imgbigurl="${p.imgURL}"><img
                                                src="${p.imgURL}" alt=""></div>
                                        <div class="pt" data-imgbigurl="${p.imgURL}"><img
                                                src="${p.imgURL}" alt=""></div>
                                        <div class="pt" data-imgbigurl="${p.imgURL}"><img
                                                src="${p.imgURL}" alt=""></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="product-details">
                                    <div class="pd-title">
                                        <span>${p.category.getName()}</span>
                                        <h3>${p.name}</h3>
                                        <a href="#" class="heart-icon"><i class="icon_heart_alt"></i></a>
                                    </div>
                                    <div class="pd-rating">
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star-o"></i>
                                        <span>(5)</span>
                                    </div>
                                    <div class="pd-desc">
                                        <!--                                        <p>Lorem ipsum dolor sit amet, consectetur ing elit, sed do eiusmod tempor sum dolor
                                                                                    sit amet, consectetur adipisicing elit, sed do mod tempor</p>-->
                                        <h4>
                                            <fmt:formatNumber pattern="###,###,###" value="${p.saleprice}" /> VND
                                            <span><fmt:formatNumber pattern="###,###,###" value="${p.price}" /> VND</span>
                                        </h4>
                                    </div>
                                    <!--                                    <div class="pd-color">
                                                                            <h6>Color</h6>
                                                                            <div class="pd-color-choose">
                                                                                <div class="cc-item">
                                                                                    <input type="radio" id="cc-black">
                                                                                    <label for="cc-black"></label>
                                                                                </div>
                                                                                <div class="cc-item">
                                                                                    <input type="radio" id="cc-yellow">
                                                                                    <label for="cc-yellow" class="cc-yellow"></label>
                                                                                </div>
                                                                                <div class="cc-item">
                                                                                    <input type="radio" id="cc-violet">
                                                                                    <label for="cc-violet" class="cc-violet"></label>
                                                                                </div>
                                                                            </div>
                                                                        </div>-->
                                    <!--                                    <div class="pd-size-choose">
                                                                            <div class="sc-item">
                                                                                <input type="radio" id="sm-size">
                                                                                <label for="sm-size">s</label>
                                                                            </div>
                                                                            <div class="sc-item">
                                                                                <input type="radio" id="md-size">
                                                                                <label for="md-size">m</label>
                                                                            </div>
                                                                            <div class="sc-item">
                                                                                <input type="radio" id="lg-size">
                                                                                <label for="lg-size">l</label>
                                                                            </div>
                                                                            <div class="sc-item">
                                                                                <input type="radio" id="xl-size">
                                                                                <label for="xl-size">xs</label>
                                                                            </div>
                                                                        </div>-->
                                    <form name="addCart" action="" method="post">
                                        <div class="quantity">
                                            <div class="pro-qty">
                                                <input id="num" name="num" type="text" value="1">
                                            </div>

                                            <!--<a href="buy?productID=${p.id}&num=1"  class="primary-btn pd-cart">Add To Cart</a>-->
                                            <input type="button" onclick="buyDetail('${p.id}')" value="Add To Cart" class="primary-btn pd-cart"/>
                                        </div>
                                    </form>
                                    <script type="text/javascript">
                                        function buyDetail(productID) {
                                            var q = document.getElementById("num").value;
                                            document.addCart.action = "buydetail?id=" + productID + "&num=" + q;
                                            document.addCart.submit();
                                        }
                                    </script>
                                    <ul class="pd-tags">
                                        <li><span>CATEGORIES</span>: ${p.category.getName()}</li>
                                        <!--<li><span>TAGS</span>: Clothing, T-shirt, Woman</li>-->
                                    </ul>
                                    <div class="pd-share">
                                        <div class="p-code">Quantity: ${p.getQuantity()}</div>
                                        <div class="pd-social">
                                            <a href="#"><i class="ti-facebook"></i></a>
                                            <a href="#"><i class="ti-twitter-alt"></i></a>
                                            <a href="#"><i class="ti-linkedin"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="product-tab">
                            <div class="tab-item">
                                <ul class="nav" role="tablist">
                                    <li>
                                        <a class="active" data-toggle="tab" href="#tab-1" role="tab">DESCRIPTION</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" href="#tab-2" role="tab">SPECIFICATIONS</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" href="#tab-3" role="tab">Customer Reviews</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="tab-item-content">
                                <div class="tab-content">
                                    <div class="tab-pane fade-in active" id="tab-1" role="tabpanel">
                                        <div class="product-content">
                                            <div class="row">
                                                <div class="col-lg-7">
                                                    <h5>Introduction</h5>
                                                    <p>${p.description}</p>
                                                </div>
                                                <!--                                                <div class="col-lg-5">
                                                                                                    <img src="img/product-single/tab-desc.jpg" alt="">
                                                                                                </div>-->
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade" id="tab-2" role="tabpanel">
                                        <div class="specification-table">
                                            <table>
                                                <tr>
                                                    <td class="p-catagory">Customer Rating</td>
                                                    <td>
                                                        <div class="pd-rating">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <span>(5)</span>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="p-catagory">Price</td>
                                                    <td>
                                                        <div class="p-price">$495.00</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="p-catagory">Add To Cart</td>
                                                    <td>
                                                        <div class="cart-add">+ add to cart</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="p-catagory">Availability</td>
                                                    <td>
                                                        <div class="p-stock">22 in stock</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="p-catagory">Weight</td>
                                                    <td>
                                                        <div class="p-weight">1,3kg</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="p-catagory">Size</td>
                                                    <td>
                                                        <div class="p-size">Xxl</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="p-catagory">Color</td>
                                                    <td><span class="cs-color"></span></td>
                                                </tr>
                                                <tr>
                                                    <td class="p-catagory">Sku</td>
                                                    <td>
                                                        <div class="p-code">00012</div>
                                                    </td>
                                                </tr>
                                            </table>
                                        </div>
                                    </div>
                                    <!--comment-->
                                    <div class="tab-pane fade" id="tab-3" role="tabpanel">
                                        <div class="customer-review-option">
                                            <h4>Customer Comments</h4>
                                            <c:forEach items="${requestScope.feedbackList}" var="feedback">
                                                <div class="comment-option">
                                                    <div class="co-item">
                                                        <div class="avatar-pic">
                                                            <!--<img src="img/product-single/avatar-1.png" alt="">-->
                                                        </div>
                                                        <div class="avatar-text">
                                                            <h5>${feedback.account.name}<span>${feedback.createDate}</span></h5>
                                                            <div class="at-reply">${feedback.content}</div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:forEach>

                                            <!--                                            <div class="personal-rating">
                                                                                            <h6>Your Ratind</h6>
                                                                                            <div class="rating">
                                                                                                <i class="fa fa-star"></i>
                                                                                                <i class="fa fa-star"></i>
                                                                                                <i class="fa fa-star"></i>
                                                                                                <i class="fa fa-star"></i>
                                                                                                <i class="fa fa-star-o"></i>
                                                                                            </div>
                                                                                        </div>-->

                                            <div class="leave-comment">
                                                
                                                <c:if test="${requestScope.check==true}">
                                                    <h4>Leave A Comment</h4>
                                                    <form action="feedback" class="comment-form">
                                                        <div class="row">
                                                            <div class="col-lg-12">
                                                                <input name="productID" value="${requestScope.product.id}" hidden/>
                                                                <textarea placeholder="Messages" name="comment"></textarea>
                                                                <button type="submit" class="site-btn">Send message</button>
                                                            </div>
                                                        </div>
                                                    </form>
                                                </c:if>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Product Shop Section End -->

        <!-- Related Products Section End -->
        <!--        <div class="related-products spad">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="section-title">
                                    <h2>Related Products</h2>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-3 col-sm-6">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <img src="img/products/women-1.jpg" alt="">
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
                                        <div class="catagory-name">Coat</div>
                                        <a href="#">
                                            <h5>Pure Pineapple</h5>
                                        </a>
                                        <div class="product-price">
                                            $14.00
                                            <span>$35.00</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <img src="img/products/women-2.jpg" alt="">
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
                                        <div class="catagory-name">Shoes</div>
                                        <a href="#">
                                            <h5>Guangzhou sweater</h5>
                                        </a>
                                        <div class="product-price">
                                            $13.00
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <img src="img/products/women-3.jpg" alt="">
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
                                        <div class="catagory-name">Towel</div>
                                        <a href="#">
                                            <h5>Pure Pineapple</h5>
                                        </a>
                                        <div class="product-price">
                                            $34.00
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <img src="img/products/women-4.jpg" alt="">
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
                                        <div class="catagory-name">Towel</div>
                                        <a href="#">
                                            <h5>Converse Shoes</h5>
                                        </a>
                                        <div class="product-price">
                                            $34.00
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>-->
        <!-- Related Products Section End -->

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
        <%@include file="Components/footer.jsp" %>
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
