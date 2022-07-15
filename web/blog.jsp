<%-- 
    Document   : blog.jsp
    Created on : Jun 2, 2022, 8:48:08 PM
    Author     : Pham Minh Giang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <%@include file="Components/header.jsp" %>
        <!-- Header End -->

        <!-- Breadcrumb Section Begin -->
        <div class="breacrumb-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="breadcrumb-text">
                            <a href="#"><i class="fa fa-home"></i> Home</a>
                            <span>Blog</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcrumb Section Begin -->

        <!-- Blog Section Begin -->
        <section class="blog-section spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1">
                        <div class="blog-sidebar">
                            <div class="search-form">
                                <h4>Search</h4>
                                <form action="searchblog">
                                    <input type="text" name="search" placeholder="Search . . .  ">
                                    <button type="submit"><i class="fa fa-search"></i></button>
                                </form>
                            </div>
                            <!--                            <div class="blog-catagory">
                                                            <h4>Categories</h4>
                                                            <ul>
                                                                <li><a href="#">Fashion</a></li>
                                                                <li><a href="#">Travel</a></li>
                                                                <li><a href="#">Picnic</a></li>
                                                                <li><a href="#">Model</a></li>
                                                            </ul>
                                                        </div>-->
                            <div class="recent-post">
                                <h4>Recent Post</h4>
                                <div class="recent-blog">
                                    <c:forEach items="${requestScope.listBlog}" var="b">
                                        <a href="#" class="rb-item">
                                            <div class="rb-pic">
                                                <img src="img/${b.imgURL}" alt="">
                                            </div>
                                            <div class="rb-text">
                                                <h6>${b.title}</h6>
                                                <p>Tech  <span>${b.modyfieDate}</span></p>
                                            </div>
                                        </a>
                                    </c:forEach>

                                    <!--                                    <a href="#" class="rb-item">
                                                                            <div class="rb-pic">
                                                                                <img src="img/blog/recent-2.jpg" alt="">
                                                                            </div>
                                                                            <div class="rb-text">
                                                                                <h6>The Personality Trait That Makes...</h6>
                                                                                <p>Fashion <span>- May 19, 2019</span></p>
                                                                            </div>
                                                                        </a>
                                                                        <a href="#" class="rb-item">
                                                                            <div class="rb-pic">
                                                                                <img src="img/blog/recent-3.jpg" alt="">
                                                                            </div>
                                                                            <div class="rb-text">
                                                                                <h6>The Personality Trait That Makes...</h6>
                                                                                <p>Fashion <span>- May 19, 2019</span></p>
                                                                            </div>
                                                                        </a>
                                                                        <a href="#" class="rb-item">
                                                                            <div class="rb-pic">
                                                                                <img src="img/blog/recent-4.jpg" alt="">
                                                                            </div>
                                                                            <div class="rb-text">
                                                                                <h6>The Personality Trait That Makes...</h6>
                                                                                <p>Fashion <span>- May 19, 2019</span></p>
                                                                            </div>
                                                                        </a>-->
                                </div>
                            </div>
                            <div class="blog-tags">
                                <h4>Product Tags</h4>
                                <div class="tag-item">
                                    <a href="#">Towel</a>
                                    <a href="#">Shoes</a>
                                    <a href="#">Coat</a>
                                    <a href="#">Dresses</a>
                                    <a href="#">Trousers</a>
                                    <a href="#">Men's hats</a>
                                    <a href="#">Backpack</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9 order-1 order-lg-2">
                        <div class="row">

                            <c:forEach items="${requestScope.listBlog}" var="b">
                                <c:if test="${b.status==true}">
                                    <div class="col-lg-6 col-sm-6">
                                        <div class="blog-item">
                                            <div class="bi-pic">
                                                <img src="img/${b.imgURL}" alt="">
                                            </div>
                                            <div class="bi-text">
                                                <a href="blogdetail?id=${b.id}">
                                                    <h4>${b.title}</h4>
                                                </a>
                                                <!--<p>travel <span>- May 19, 2019</span></p>-->
                                            </div>
                                        </div>
                                    </div>
                                </c:if>

                            </c:forEach>


                            <!--                            <div class="col-lg-6 col-sm-6">
                                                            <div class="blog-item">
                                                                <div class="bi-pic">
                                                                    <img src="img/blog/blog-2.jpg" alt="">
                                                                </div>
                                                                <div class="bi-text">
                                                                    <a href="./blog-details.html">
                                                                        <h4>This was one of our first days in Hawaii last week.</h4>
                                                                    </a>
                                                                    <p>Fashion <span>- May 19, 2019</span></p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-6 col-sm-6">
                                                            <div class="blog-item">
                                                                <div class="bi-pic">
                                                                    <img src="img/blog/blog-3.jpg" alt="">
                                                                </div>
                                                                <div class="bi-text">
                                                                    <a href="./blog-details.html">
                                                                        <h4>Last week I had my first work trip of the year to Sonoma Valley</h4>
                                                                    </a>
                                                                    <p>travel <span>- May 19, 2019</span></p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-6 col-sm-6">
                                                            <div class="blog-item">
                                                                <div class="bi-pic">
                                                                    <img src="img/blog/blog-4.jpg" alt="">
                                                                </div>
                                                                <div class="bi-text">
                                                                    <a href="./blog-details.html">
                                                                        <h4>Happppppy New Year! I know I am a little late on this post</h4>
                                                                    </a>
                                                                    <p>Fashion <span>- May 19, 2019</span></p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-6 col-sm-6">
                                                            <div class="blog-item">
                                                                <div class="bi-pic">
                                                                    <img src="img/blog/blog-5.jpg" alt="">
                                                                </div>
                                                                <div class="bi-text">
                                                                    <a href="./blog-details.html">
                                                                        <h4>Absolue collection. The Lancome team has been one…</h4>
                                                                    </a>
                                                                    <p>Model <span>- May 19, 2019</span></p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-6 col-sm-6">
                                                            <div class="blog-item">
                                                                <div class="bi-pic">
                                                                    <img src="img/blog/blog-6.jpg" alt="">
                                                                </div>
                                                                <div class="bi-text">
                                                                    <a href="./blog-details.html">
                                                                        <h4>Writing has always been kind of therapeutic for me</h4>
                                                                    </a>
                                                                    <p>Fashion <span>- May 19, 2019</span></p>
                                                                </div>
                                                            </div>
                                                        </div>-->
                            <div class="col-lg-12">
                                <div class="loading-more">
                                    <i class="icon_loading"></i>
                                    <a href="#">
                                        Loading More
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Blog Section End -->

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
