package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shoppping_002dcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Components/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.release();
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"Fashi Template\">\n");
      out.write("    <meta name=\"keywords\" content=\"Fashi, unica, creative, html\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Fashi | Template</title>\n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Css Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/themify-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Page Preloder -->\n");
      out.write("    <div id=\"preloder\">\n");
      out.write("        <div class=\"loader\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Header Section Begin -->\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<header class=\"header-section\">\r\n");
      out.write("            <div class=\"header-top\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"ht-left\">\r\n");
      out.write("                        <div class=\"mail-service\">\r\n");
      out.write("                            <i class=\" fa fa-envelope\"></i>\r\n");
      out.write("                            hello.colorlib@gmail.com\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"phone-service\">\r\n");
      out.write("                            <i class=\" fa fa-phone\"></i>\r\n");
      out.write("                            +65 11.188.888\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"ht-right\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                        <div class=\"lan-selector\">\r\n");
      out.write("                            <select class=\"language_drop\" name=\"countries\" id=\"countries\" style=\"width:300px;\">\r\n");
      out.write("                                <option value='yt' data-image=\"../img/flag-1.jpg\" data-imagecss=\"flag yt\"\r\n");
      out.write("                                        data-title=\"English\">English</option>\r\n");
      out.write("                                <option value='yu' data-image=\"../img/flag-2.jpg\" data-imagecss=\"flag yu\"\r\n");
      out.write("                                        data-title=\"Bangladesh\">German </option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"top-social\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"ti-facebook\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"ti-twitter-alt\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"ti-linkedin\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"ti-pinterest\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"inner-header\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-2 col-md-2\">\r\n");
      out.write("                            <div class=\"logo\">\r\n");
      out.write("                                <a href=\"./index.html\">\r\n");
      out.write("                                    <img src=\"../img/logo.png\" alt=\"\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-7 col-md-7\">\r\n");
      out.write("                            <div class=\"advanced-search\">\r\n");
      out.write("                                <button type=\"button\" class=\"category-btn\">All Categories</button>\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"What do you need?\">\r\n");
      out.write("                                    <button type=\"button\"><i class=\"ti-search\"></i></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 text-right col-md-3\">\r\n");
      out.write("                            <ul class=\"nav-right\">\r\n");
      out.write("                                <li class=\"heart-icon\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"icon_heart_alt\"></i>\r\n");
      out.write("                                        <span>1</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"cart-icon\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"icon_bag_alt\"></i>\r\n");
      out.write("                                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.totalQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    \r\n");
      out.write("                                        <div class=\"cart-hover\">\r\n");
      out.write("                                            <div class=\"select-items\">\r\n");
      out.write("                                                <table>\r\n");
      out.write("                                                    <tbody>\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("<!--                                                        <tr>\r\n");
      out.write("                                                            <td class=\"si-pic\"><img src=\"img/select-product-2.jpg\" alt=\"\"></td>\r\n");
      out.write("                                                            <td class=\"si-text\">\r\n");
      out.write("                                                                <div class=\"product-selected\">\r\n");
      out.write("                                                                    <p>");
      if (_jspx_meth_fmt_formatNumber_1(_jspx_page_context))
        return;
      out.write(" VND x ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                                                    <h6>Kabino Bedside Table</h6>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </td>\r\n");
      out.write("                                                            <td class=\"si-close\">\r\n");
      out.write("                                                                <i class=\"ti-close\"></i>\r\n");
      out.write("                                                            </td>\r\n");
      out.write("                                                        </tr>-->\r\n");
      out.write("                                                    </tbody>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"select-total\">\r\n");
      out.write("                                                <span>total:</span>\r\n");
      out.write("                                                <h5>");
      if (_jspx_meth_fmt_formatNumber_2(_jspx_page_context))
        return;
      out.write(" VND</h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"select-button\">\r\n");
      out.write("                                                <a href=\"#\" class=\"primary-btn view-card\">VIEW CARD</a>\r\n");
      out.write("                                                <a href=\"#\" class=\"primary-btn checkout-btn\">CHECK OUT</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                                      \r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!--<li class=\"cart-price\">");
      if (_jspx_meth_fmt_formatNumber_3(_jspx_page_context))
        return;
      out.write(" VND</li>-->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav-item\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"nav-depart\">\r\n");
      out.write("                        <div class=\"depart-btn\">\r\n");
      out.write("                            <i class=\"ti-menu\"></i>\r\n");
      out.write("                            <span>All departments</span>\r\n");
      out.write("                            <ul class=\"depart-hover\">\r\n");
      out.write("                                <li class=\"active\"><a href=\"#\">Women’s Clothing</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Men’s Clothing</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Underwear</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Kid's Clothing</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Brand Fashion</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Accessories/Shoes</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Luxury Brands</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Brand Outdoor Apparel</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <nav class=\"nav-menu mobile-menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"active\"><a href=\"home\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"product\">Shop</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Collection</a>\r\n");
      out.write("                                <ul class=\"dropdown\">\r\n");
      out.write("                                    <li><a href=\"#\">Men's</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Women's</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Kid's</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"./blog.html\">Blog</a></li>\r\n");
      out.write("                            <li><a href=\"./contact.html\">Contact</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Pages</a>\r\n");
      out.write("                                <ul class=\"dropdown\">\r\n");
      out.write("                                    <li><a href=\"./blog-details.html\">Blog Details</a></li>\r\n");
      out.write("                                    <li><a href=\"./shopping-cart.html\">Shopping Cart</a></li>\r\n");
      out.write("                                    <li><a href=\"./check-out.html\">Checkout</a></li>\r\n");
      out.write("                                    <li><a href=\"./faq.html\">Faq</a></li>\r\n");
      out.write("                                    <li><a href=\"./register.html\">Register</a></li>\r\n");
      out.write("                                    <li><a href=\"./login.html\">Login</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <div id=\"mobile-menu-wrap\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\n");
      out.write("    <!-- Header End -->\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("    <div class=\"breacrumb-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"breadcrumb-text product-more\">\n");
      out.write("                        <a href=\"home\"><i class=\"fa fa-home\"></i> Home</a>\n");
      out.write("                        <a href=\"./shop.html\">Shop</a>\n");
      out.write("                        <span>Shopping Cart</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("\n");
      out.write("    <!-- Shopping Cart Section Begin -->\n");
      out.write("    <section class=\"shopping-cart spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"cart-table\">\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Image</th>\n");
      out.write("                                    <th class=\"p-name\">Product Name</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Quantity</th>\n");
      out.write("                                    <th>Total</th>\n");
      out.write("                                    <th><i class=\"ti-close\"></i></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"cart-pic first-row\"><img src=\"img/cart-page/product-1.jpg\" alt=\"\"></td>\n");
      out.write("                                    <td class=\"cart-title first-row\">\n");
      out.write("                                        <h5>Pure Pineapple</h5>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"p-price first-row\">$60.00</td>\n");
      out.write("                                    <td class=\"qua-col first-row\">\n");
      out.write("                                        <div class=\"quantity\">\n");
      out.write("                                            <div class=\"pro-qty\">\n");
      out.write("                                                <input type=\"text\" value=\"1\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"total-price first-row\">$60.00</td>\n");
      out.write("                                    <td class=\"close-td first-row\"><i class=\"ti-close\"></i></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"cart-pic\"><img src=\"img/cart-page/product-2.jpg\" alt=\"\"></td>\n");
      out.write("                                    <td class=\"cart-title\">\n");
      out.write("                                        <h5>American lobster</h5>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"p-price\">$60.00</td>\n");
      out.write("                                    <td class=\"qua-col\">\n");
      out.write("                                        <div class=\"quantity\">\n");
      out.write("                                            <div class=\"pro-qty\">\n");
      out.write("                                                <input type=\"text\" value=\"1\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"total-price\">$60.00</td>\n");
      out.write("                                    <td class=\"close-td\"><i class=\"ti-close\"></i></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"cart-pic\"><img src=\"img/cart-page/product-3.jpg\" alt=\"\"></td>\n");
      out.write("                                    <td class=\"cart-title\">\n");
      out.write("                                        <h5>Guangzhou sweater</h5>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"p-price\">$60.00</td>\n");
      out.write("                                    <td class=\"qua-col\">\n");
      out.write("                                        <div class=\"quantity\">\n");
      out.write("                                            <div class=\"pro-qty\">\n");
      out.write("                                                <input type=\"text\" value=\"1\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"total-price\">$60.00</td>\n");
      out.write("                                    <td class=\"close-td\"><i class=\"ti-close\"></i></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4\">\n");
      out.write("                            <div class=\"cart-buttons\">\n");
      out.write("                                <a href=\"#\" class=\"primary-btn continue-shop\">Continue shopping</a>\n");
      out.write("                                <a href=\"#\" class=\"primary-btn up-cart\">Update cart</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"discount-coupon\">\n");
      out.write("                                <h6>Discount Codes</h6>\n");
      out.write("                                <form action=\"#\" class=\"coupon-form\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Enter your codes\">\n");
      out.write("                                    <button type=\"submit\" class=\"site-btn coupon-btn\">Apply</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 offset-lg-4\">\n");
      out.write("                            <div class=\"proceed-checkout\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"subtotal\">Subtotal <span>$240.00</span></li>\n");
      out.write("                                    <li class=\"cart-total\">Total <span>$240.00</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <a href=\"#\" class=\"proceed-btn\">PROCEED TO CHECK OUT</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Shopping Cart Section End -->\n");
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
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setVar("c");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"login\" class=\"login-panel\"><i class=\"fa fa-user\"></i>Login</a>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("       \r\n");
        out.write("                            <a class=\"login-panel\"><i class=\"fa fa-user\"></i>Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a> -\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setVar("c");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.item}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                        <tr>\r\n");
          out.write("                                                            <td class=\"si-pic\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.imgURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"></td>\r\n");
          out.write("                                                            <td class=\"si-text\">\r\n");
          out.write("                                                                <div class=\"product-selected\">\r\n");
          out.write("                                                                    <p>");
          if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" VND x ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                                                    <h6>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                                                                </div>\r\n");
          out.write("                                                            </td>\r\n");
          out.write("                                                            <td class=\"si-close\">\r\n");
          out.write("                                                                <i class=\"ti-close\"></i>\r\n");
          out.write("                                                            </td>\r\n");
          out.write("                                                        </tr>\r\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_0.setPattern("###,###,###");
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.saleprice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent(null);
    _jspx_th_fmt_formatNumber_1.setPattern("###,###,###");
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.saleprice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent(null);
    _jspx_th_fmt_formatNumber_2.setPattern("###,###,###");
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.totalPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent(null);
    _jspx_th_fmt_formatNumber_3.setPattern("###,###,###");
    _jspx_th_fmt_formatNumber_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.totalPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }
}
