package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class codeverify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Fashi Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Fashi, unica, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Fashi | Template</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"preloder\">\n");
      out.write("        <div class=\"loader\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Header Section Begin -->\n");
      out.write("    <header class=\"header-section\">\n");
      out.write("        <div class=\"header-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"ht-left\">\n");
      out.write("                    <div class=\"mail-service\">\n");
      out.write("                        <i class=\" fa fa-envelope\"></i>\n");
      out.write("                        hello.colorlib@gmail.com\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"phone-service\">\n");
      out.write("                        <i class=\" fa fa-phone\"></i>\n");
      out.write("                        +65 11.188.888\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ht-right\">\n");
      out.write("                    <a href=\"#\" class=\"login-panel\"><i class=\"fa fa-user\"></i>Login</a>\n");
      out.write("                    <div class=\"lan-selector\">\n");
      out.write("                        <select class=\"language_drop\" name=\"countries\" id=\"countries\" style=\"width:300px;\">\n");
      out.write("                            <option value='yt' data-image=\"img/flag-1.jpg\" data-imagecss=\"flag yt\"\n");
      out.write("                                data-title=\"English\">English</option>\n");
      out.write("                            <option value='yu' data-image=\"img/flag-2.jpg\" data-imagecss=\"flag yu\"\n");
      out.write("                                data-title=\"Bangladesh\">German </option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"top-social\">\n");
      out.write("                        <a href=\"#\"><i class=\"ti-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"ti-twitter-alt\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"ti-linkedin\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"ti-pinterest\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"inner-header\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-2 col-md-2\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <a href=\"home\">\n");
      out.write("                                <img src=\"img/logo.png\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-7 col-lg-7\">\n");
      out.write("                        <div class=\"advanced-search\">\n");
      out.write("                            <button type=\"button\" class=\"category-btn\">All Categories</button>\n");
      out.write("                            <form action=\"#\" class=\"input-group\">\n");
      out.write("                                <input type=\"text\" placeholder=\"What do you need?\">\n");
      out.write("                                <button type=\"button\"><i class=\"ti-search\"></i></button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 text-right col-lg-3\">\n");
      out.write("                        <ul class=\"nav-right\">\n");
      out.write("                            <li class=\"heart-icon\"><a href=\"#\">\n");
      out.write("                                    <i class=\"icon_heart_alt\"></i>\n");
      out.write("                                    <span>1</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"cart-icon\"><a href=\"#\">\n");
      out.write("                                    <i class=\"icon_bag_alt\"></i>\n");
      out.write("                                    <span>3</span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"cart-hover\">\n");
      out.write("                                    <div class=\"select-items\">\n");
      out.write("                                        <table>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"si-pic\"><img src=\"img/select-product-1.jpg\" alt=\"\"></td>\n");
      out.write("                                                    <td class=\"si-text\">\n");
      out.write("                                                        <div class=\"product-selected\">\n");
      out.write("                                                            <p>$60.00 x 1</p>\n");
      out.write("                                                            <h6>Kabino Bedside Table</h6>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"si-close\">\n");
      out.write("                                                        <i class=\"ti-close\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"si-pic\"><img src=\"img/select-product-2.jpg\" alt=\"\"></td>\n");
      out.write("                                                    <td class=\"si-text\">\n");
      out.write("                                                        <div class=\"product-selected\">\n");
      out.write("                                                            <p>$60.00 x 1</p>\n");
      out.write("                                                            <h6>Kabino Bedside Table</h6>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"si-close\">\n");
      out.write("                                                        <i class=\"ti-close\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"select-total\">\n");
      out.write("                                        <span>total:</span>\n");
      out.write("                                        <h5>$120.00</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"select-button\">\n");
      out.write("                                        <a href=\"#\" class=\"primary-btn view-card\">VIEW CARD</a>\n");
      out.write("                                        <a href=\"#\" class=\"primary-btn checkout-btn\">CHECK OUT</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"cart-price\">$150.00</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"nav-item\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"nav-depart\">\n");
      out.write("                    <div class=\"depart-btn\">\n");
      out.write("                        <i class=\"ti-menu\"></i>\n");
      out.write("                        <span>All departments</span>\n");
      out.write("                        <ul class=\"depart-hover\">\n");
      out.write("                            <li class=\"active\"><a href=\"#\">Women’s Clothing</a></li>\n");
      out.write("                            <li><a href=\"#\">Men’s Clothing</a></li>\n");
      out.write("                            <li><a href=\"#\">Underwear</a></li>\n");
      out.write("                            <li><a href=\"#\">Kid's Clothing</a></li>\n");
      out.write("                            <li><a href=\"#\">Brand Fashion</a></li>\n");
      out.write("                            <li><a href=\"#\">Accessories/Shoes</a></li>\n");
      out.write("                            <li><a href=\"#\">Luxury Brands</a></li>\n");
      out.write("                            <li><a href=\"#\">Brand Outdoor Apparel</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"nav-menu mobile-menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home\">Home</a></li>\n");
      out.write("                        <li><a href=\"./shop.html\">Shop</a></li>\n");
      out.write("                        <li><a href=\"#\">Collection</a>\n");
      out.write("                            <ul class=\"dropdown\">\n");
      out.write("                                <li><a href=\"#\">Men's</a></li>\n");
      out.write("                                <li><a href=\"#\">Women's</a></li>\n");
      out.write("                                <li><a href=\"#\">Kid's</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"./blog.html\">Blog</a></li>\n");
      out.write("                        <li><a href=\"./contact.html\">Contact</a></li>\n");
      out.write("                        <li><a href=\"#\">Pages</a>\n");
      out.write("                            <ul class=\"dropdown\">\n");
      out.write("                                <li><a href=\"./blog-details.html\">Blog Details</a></li>\n");
      out.write("                                <li><a href=\"./shopping-cart.html\">Shopping Cart</a></li>\n");
      out.write("                                <li><a href=\"./check-out.html\">Checkout</a></li>\n");
      out.write("                                <li><a href=\"./faq.html\">Faq</a></li>\n");
      out.write("                                <li><a href=\"./register.html\">Register</a></li>\n");
      out.write("                                <li><a href=\"./login.html\">Login</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <div id=\"mobile-menu-wrap\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- Header End -->\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("    <div class=\"breacrumb-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"breadcrumb-text\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-home\"></i> Home</a>\n");
      out.write("                        <span>Login</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Breadcrumb Form Section Begin -->\n");
      out.write("\n");
      out.write("    <!-- Register Section Begin -->\n");
      out.write("    <div class=\"register-login-section spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 offset-lg-3\">\n");
      out.write("                    <div class=\"login-form\">\n");
      out.write("                        <h2>Verify email</h2>\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess!=null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        </c:if>\n");
      out.write("                        <form action=\"verificationemail\" method=\"post\">\n");
      out.write("                            <div class=\"group-input\">\n");
      out.write("                                <label for=\"username\">Code *</label>\n");
      out.write("                                <input type=\"text\" name=\"codeInput\">\n");
      out.write("                            </div>\n");
      out.write("                            <h5 style=\"color: #664d03;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.notCorrect}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                             <input type=\"submit\" value=\"submit\"/>\n");
      out.write("                        </form>\n");
      out.write("                \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Register Form Section End -->\n");
      out.write("\n");
      out.write("    <!-- Partner Logo Section Begin -->\n");
      out.write("    <div class=\"partner-logo\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"logo-carousel owl-carousel\">\n");
      out.write("                <div class=\"logo-item\">\n");
      out.write("                    <div class=\"tablecell-inner\">\n");
      out.write("                        <img src=\"img/logo-carousel/logo-1.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"logo-item\">\n");
      out.write("                    <div class=\"tablecell-inner\">\n");
      out.write("                        <img src=\"img/logo-carousel/logo-2.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"logo-item\">\n");
      out.write("                    <div class=\"tablecell-inner\">\n");
      out.write("                        <img src=\"img/logo-carousel/logo-3.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"logo-item\">\n");
      out.write("                    <div class=\"tablecell-inner\">\n");
      out.write("                        <img src=\"img/logo-carousel/logo-4.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"logo-item\">\n");
      out.write("                    <div class=\"tablecell-inner\">\n");
      out.write("                        <img src=\"img/logo-carousel/logo-5.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Partner Logo Section End -->\n");
      out.write("\n");
      out.write("    <!-- Footer Section Begin -->\n");
      out.write("    <footer class=\"footer-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"footer-left\">\n");
      out.write("                        <div class=\"footer-logo\">\n");
      out.write("                            <a href=\"#\"><img src=\"img/footer-logo.png\" alt=\"\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Address: 60-49 Road 11378 New York</li>\n");
      out.write("                            <li>Phone: +65 11.188.888</li>\n");
      out.write("                            <li>Email: hello.colorlib@gmail.com</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"footer-social\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2 offset-lg-1\">\n");
      out.write("                    <div class=\"footer-widget\">\n");
      out.write("                        <h5>Information</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Checkout</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact</a></li>\n");
      out.write("                            <li><a href=\"#\">Serivius</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <div class=\"footer-widget\">\n");
      out.write("                        <h5>My Account</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">My Account</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact</a></li>\n");
      out.write("                            <li><a href=\"#\">Shopping Cart</a></li>\n");
      out.write("                            <li><a href=\"#\">Shop</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <div class=\"newslatter-item\">\n");
      out.write("                        <h5>Join Our Newsletter Now</h5>\n");
      out.write("                        <p>Get E-mail updates about our latest shop and special offers.</p>\n");
      out.write("                        <form action=\"#\" class=\"subscribe-form\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Your Mail\">\n");
      out.write("                            <button type=\"button\">Subscribe</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"copyright-reserved\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"copyright-text\">\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"payment-pic\">\n");
      out.write("                            <img src=\"img/payment-method.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("    <!-- Js Plugins -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.countdown.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.dd.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("        <form action=\"verificationemail\" method=\"POST\">\n");
      out.write("            <div>\n");
      out.write("                <h3>Please enter code in Email</h3>\n");
      out.write("                \n");
      out.write("                    <input type=\"text\" name=\"codeInput\" class=\"form-control bg-light border-0\" placeholder=\"Code\" style=\"height: 40px;\"><br/>\n");
      out.write("                    \n");
      out.write("            </div></form>\n");
      out.write("                    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}