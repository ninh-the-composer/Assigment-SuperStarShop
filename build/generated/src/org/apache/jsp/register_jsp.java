package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!-- Basic -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Mobile Metas -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Site Metas -->\r\n");
      out.write("    <title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Site Icons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Site CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <!-- Responsive CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Start Main Top -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-top.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- End Main Top -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Main Top -->\r\n");
      out.write("    <header class=\"main-header\">\r\n");
      out.write("        <!-- Start Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Start Header Navigation -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Header Navigation -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("                        <li class=\"dropdown megamenu-fw\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">Product</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu megamenu-content\" role=\"menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-menu col-md-3\">\r\n");
      out.write("                                            <h6 class=\"title\">Top</h6>\r\n");
      out.write("                                            <div class=\"content\">\r\n");
      out.write("                                                <ul class=\"menu-col\">\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Jackets</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Shirts</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Sweaters & Cardigans</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">T-shirts</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- end col-3 -->\r\n");
      out.write("                                        <div class=\"col-menu col-md-3\">\r\n");
      out.write("                                            <h6 class=\"title\">Bottom</h6>\r\n");
      out.write("                                            <div class=\"content\">\r\n");
      out.write("                                                <ul class=\"menu-col\">\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Swimwear</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Skirts</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Jeans</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Trousers</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- end col-3 -->\r\n");
      out.write("                                        <div class=\"col-menu col-md-3\">\r\n");
      out.write("                                            <h6 class=\"title\">Clothing</h6>\r\n");
      out.write("                                            <div class=\"content\">\r\n");
      out.write("                                                <ul class=\"menu-col\">\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Top Wear</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Party wear</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Bottom Wear</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Indian Wear</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-menu col-md-3\">\r\n");
      out.write("                                            <h6 class=\"title\">Accessories</h6>\r\n");
      out.write("                                            <div class=\"content\">\r\n");
      out.write("                                                <ul class=\"menu-col\">\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Bags</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Sunglasses</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Fragrances</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop.jsp\">Wallets</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- end col-3 -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- end row -->\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown active\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">SHOP</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"cart.jsp\">Cart</a></li>\r\n");
      out.write("                                <li><a href=\"checkout.jsp\">Checkout</a></li>\r\n");
      out.write("                                <li><a href=\"my-account.jsp\">My Account</a></li>\r\n");
      out.write("                                <li><a href=\"wishlist.jsp\">Wishlist</a></li>\r\n");
      out.write("                                <li><a href=\"shop-detail.jsp\">Shop Detail</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"service.jsp\">Our Service</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"contact-us.jsp\">Contact Us</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Start Atribute Navigation -->\r\n");
      out.write("                <div class=\"attr-nav\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"search\"><a href=\"#\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("                        <li class=\"side-menu\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-shopping-bag\"></i>\r\n");
      out.write("                            <span class=\"badge\">3</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Atribute Navigation -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Start Side Menu -->\r\n");
      out.write("            <div class=\"side\">\r\n");
      out.write("                <a href=\"#\" class=\"close-side\"><i class=\"fa fa-times\"></i></a>\r\n");
      out.write("                <li class=\"cart-box\">\r\n");
      out.write("                    <ul class=\"cart-list\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"photo\"><img src=\"images/img-pro-01.jpg\" class=\"cart-thumb\" alt=\"\" /></a>\r\n");
      out.write("                            <h6><a href=\"#\">Delica omtantur </a></h6>\r\n");
      out.write("                            <p>1x - <span class=\"price\">$80.00</span></p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"photo\"><img src=\"images/img-pro-02.jpg\" class=\"cart-thumb\" alt=\"\" /></a>\r\n");
      out.write("                            <h6><a href=\"#\">Omnes ocurreret</a></h6>\r\n");
      out.write("                            <p>1x - <span class=\"price\">$60.00</span></p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"photo\"><img src=\"images/img-pro-03.jpg\" class=\"cart-thumb\" alt=\"\" /></a>\r\n");
      out.write("                            <h6><a href=\"#\">Agam facilisis</a></h6>\r\n");
      out.write("                            <p>1x - <span class=\"price\">$40.00</span></p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"total\">\r\n");
      out.write("                            <a href=\"#\" class=\"btn btn-default hvr-hover btn-cart\">VIEW CART</a>\r\n");
      out.write("                            <span class=\"float-right\"><strong>Total</strong>: $180.00</span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End Side Menu -->\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- End Navigation -->\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- End Main Top -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Top Search -->\r\n");
      out.write("    <div class=\"top-search\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"input-group\">\r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-search\"></i></span>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("                <span class=\"input-group-addon close-search\"><i class=\"fa fa-times\"></i></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Top Search -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start All Title Box -->\r\n");
      out.write("    <div class=\"all-title-box\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h2>Wishlist</h2>\r\n");
      out.write("                    <ul class=\"breadcrumb\">\r\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"#\">Shop</a></li>\r\n");
      out.write("                        <li class=\"breadcrumb-item active\">Wishlist</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End All Title Box -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Wishlist  -->\r\n");
      out.write("    <div class=\"wishlist-box-main\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"table-main table-responsive\">\r\n");
      out.write("                        <table class=\"table\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>Images</th>\r\n");
      out.write("                                    <th>Product Name</th>\r\n");
      out.write("                                    <th>Unit Price </th>\r\n");
      out.write("                                    <th>Stock</th>\r\n");
      out.write("                                    <th>Add Item</th>\r\n");
      out.write("                                    <th>Remove</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td class=\"thumbnail-img\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/img-pro-01.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"name-pr\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"price-pr\">\r\n");
      out.write("                                        <p>$ 80.0</p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"quantity-box\">In Stock</td>\r\n");
      out.write("                                    <td class=\"add-pr\">\r\n");
      out.write("                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"remove-pr\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td class=\"thumbnail-img\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/img-pro-02.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"name-pr\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"price-pr\">\r\n");
      out.write("                                        <p>$ 60.0</p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"quantity-box\">In Stock</td>\r\n");
      out.write("                                    <td class=\"add-pr\">\r\n");
      out.write("                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"remove-pr\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td class=\"thumbnail-img\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/img-pro-03.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"name-pr\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"price-pr\">\r\n");
      out.write("                                        <p>$ 30.0</p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"quantity-box\">In Stock</td>\r\n");
      out.write("                                    <td class=\"add-pr\">\r\n");
      out.write("                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td class=\"remove-pr\">\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Wishlist -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Instagram Feed  -->\r\n");
      out.write("    <div class=\"instagram-box\">\r\n");
      out.write("        <div class=\"main-instagram owl-carousel owl-theme\">\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-01.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-02.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-03.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-04.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-06.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-07.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-08.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-09.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Instagram Feed  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\r\n");
      out.write("\r\n");
      out.write("    <!-- ALL JS FILES -->\r\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- ALL PLUGINS -->\r\n");
      out.write("    <script src=\"js/jquery.superslides.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-select.js\"></script>\r\n");
      out.write("    <script src=\"js/inewsticker.js\"></script>\r\n");
      out.write("    <script src=\"js/bootsnav.js\"></script>\r\n");
      out.write("    <script src=\"js/images-loded.min.js\"></script>\r\n");
      out.write("    <script src=\"js/isotope.min.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/baguetteBox.min.js\"></script>\r\n");
      out.write("    <script src=\"js/form-validator.min.js\"></script>\r\n");
      out.write("    <script src=\"js/contact-form-script.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
