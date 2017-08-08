package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cuoi_002dtrang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"footer-top-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-about-us\">\n");
      out.write("                        <h2>Phuong<span>Perfume</span></h2>\n");
      out.write("                        <p>Chuyên cung cấp các loại nước hoa ngoại nhập với chất lượng đảm bảo và giá cả phải chăng</p>\n");
      out.write("                        <div class=\"footer-social\">\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Loại</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">My account</a></li>\n");
      out.write("                            <li><a href=\"#\">Order history</a></li>\n");
      out.write("                            <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                            <li><a href=\"#\">Vendor contact</a></li>\n");
      out.write("                            <li><a href=\"#\">Front page</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Đăng nhập</h2>\n");
      out.write("                        <form name=\"frmDangNhap\" action=\"ServletDangNhap\" method=\"POST\">\n");
      out.write("                            <table border=\"1\">\n");
      out.write("                       \n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Email</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtemail\" value=\"\" placeholder=\"Enter your email\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Password</td>\n");
      out.write("                                        <td><input type=\"password\" name=\"txtPassword\" value=\"\" placeholder=\"Enter your password\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                            \n");
      out.write("                                        <td colspan=\"2\" style=\"text-align: center;\"> <input type=\"submit\" value=\"Login\" name=\"btnDangNhap\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        </form>                  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-newsletter\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Nhận tin</h2>\n");
      out.write("                        <p>Vui lòng cung cấp email để nhận tin mới cập nhật thường xuyên</p>\n");
      out.write("                        <div class=\"newsletter-form\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Type your email\">\n");
      out.write("                                <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End footer top area -->\n");
      out.write("    \n");
      out.write("    <div class=\"footer-bottom-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"footer-card-icon\">\n");
      out.write("                        <i class=\"fa fa-cc-discover\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-mastercard\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-paypal\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-visa\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End footer bottom area -->\n");
      out.write("   \n");
      out.write("    <!-- Latest jQuery form server -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap JS form CDN -->\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- jQuery sticky menu -->\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- jQuery easing -->\n");
      out.write("    <script src=\"js/jquery.easing.1.3.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Main Script -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Slider -->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bxslider.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/script.slider.js\"></script>\n");
      out.write("  </body>\n");
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
