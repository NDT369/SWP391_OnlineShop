<%-- 
    Document   : profile
    Created on : May 30, 2022, 3:28:46 PM
    Author     : MSI
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>





<div class="breacrumb-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb-text">
                    <a href="#"><i class="fa fa-home"></i> Home</a>
                    <span>Login</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Form Section Begin -->

<!-- Register Section Begin -->
<div class="register-login-section spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 offset-lg-3">
                <div class="login-form">
                    <h2>Forget Password</h2>
                    <p>Enter username, email and we'll send you a new password to get back into your account.</p>
                    <form action="resetpass" method="POST">
                        <div class="group-input">
                            <!--<label for="username">Username *</label>-->
                            <input type="text" id="username" name="username" placeholder="Username">
                        </div>
                        <div class="group-input">
                            <!--<label for="email">Email *</label>-->
                            <input type="text" id="email" name="email" placeholder="Email">
                        </div>

                        <div class="group-input gi-check">
                            <div class="gi-more">

                                <c:if test="${error != null && error != ''}">
                                    <h5 style="color: red">${requestScope.error}</h5>

                                </c:if>

                                <c:if test="${send != null && send != ''}">
                                    <h5 style="color: green">${requestScope.send}</h5>
                                </c:if>
                                <!--<a href="#" class="forget-pass">Forget your Password</a>-->
                            </div>
                        </div>
                        <button type="submit" class="site-btn login-btn">Send Email</button>
                    </form>
                    <div class="switch-login">
                        <a href="./register.html" class="or-login">Or Create An Account</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>