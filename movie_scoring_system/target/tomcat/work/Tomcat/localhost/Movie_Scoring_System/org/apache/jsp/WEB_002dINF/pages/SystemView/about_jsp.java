/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-10 06:12:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.SystemView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Video Catalog</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"fontawesome/css/all.min.css\"> <!-- https://fontawesome.com/ -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- https://fonts.google.com/ -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/templatemo-video-catalog.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"tm-page-wrap mx-auto\">\r\n");
      out.write("    <div class=\"position-relative\">\r\n");
      out.write("        <div class=\"potition-absolute tm-site-header\">\r\n");
      out.write("            <div class=\"container-fluid position-relative\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-7 col-md-4\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"tm-bg-black text-center tm-logo-container\">\r\n");
      out.write("                            <i class=\"fas fa-video tm-site-logo mb-3\"></i>\r\n");
      out.write("                            <h1 class=\"tm-site-name\">Video Catalog</h1>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-5 col-md-8 ml-auto mr-0\">\r\n");
      out.write("                        <div class=\"tm-site-nav\">\r\n");
      out.write("                            <nav class=\"navbar navbar-expand-lg mr-0 ml-auto\" id=\"tm-main-nav\">\r\n");
      out.write("                                <button class=\"navbar-toggler tm-bg-black py-2 px-3 mr-0 ml-auto collapsed\" type=\"button\"\r\n");
      out.write("                                        data-toggle=\"collapse\" data-target=\"#navbar-nav\" aria-controls=\"navbar-nav\"\r\n");
      out.write("                                        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                                        <span>\r\n");
      out.write("                                            <i class=\"fas fa-bars tm-menu-closed-icon\"></i>\r\n");
      out.write("                                            <i class=\"fas fa-times tm-menu-opened-icon\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <div class=\"collapse navbar-collapse tm-nav\" id=\"navbar-nav\">\r\n");
      out.write("                                    <ul class=\"navbar-nav text-uppercase\">\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link tm-nav-link\" href=\"index.html\">Videos</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item active\">\r\n");
      out.write("                                            <a class=\"nav-link tm-nav-link\" href=\"about.html\">About <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link tm-nav-link\" href=\"contact.html\">Contact</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tm-welcome-container tm-fixed-header tm-fixed-header-2\">\r\n");
      out.write("            <div class=\"text-center\">\r\n");
      out.write("                <p class=\"pt-5 px-3 tm-welcome-text tm-welcome-text-2 mb-1 mt-lg-0 mt-5 text-white mx-auto\">Another Image BG<br>it can be fixed.<br>Content will simply slide over.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"tm-fixed-header-bg\"></div> <!-- Header image -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page content -->\r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"container-fluid px-0\">\r\n");
      out.write("            <div class=\"mx-auto tm-content-container\">\r\n");
      out.write("                <div class=\"row mt-3 mb-5 pb-3\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"mx-auto tm-about-text-container px-3\">\r\n");
      out.write("                            <h2 class=\"tm-page-title mb-4 tm-text-primary\">About the Video Catalog</h2>\r\n");
      out.write("                            <p class=\"mb-4\">Video Catalog is free HTML CSS template for your website. This Bootstrap v4.4.1 website template is 100% free download for everyone. You can modify and expand this template for your CMS websites. You can use it for commercial or non-commercial work. If you wish to support <a href=\"https://templatemo.com\" class=\"tm-text-primary\">TemplateMo</a>, please contact us.</p>\r\n");
      out.write("                            <p class=\"mb-4\">You are <u>not allowed</u> to re-distribute the template ZIP file on any template collection website.</p>\r\n");
      out.write("                            <p class=\"mb-4\">Vivamus sit amet justo sed erat iaculis consequat. Nulla suscipit posuere lectus ut venenatis. Proin sed orci eget tellus euismod vulputate eu eu arcu. Etiam a bibendum lorem. Curabitur ac bibendum odio. Vivamus euismod dui mauris, ut tincidunt mi congue quis.</p>\r\n");
      out.write("                            <p class=\"mb-0\">Phasellus luctus orci dolor, a luctus massa tincidunt vitae. Integer sit amet odio id libero tincidunt dignissim in eget arcu. Aliquam tristique ut magna sit amet tincidunt. Sed tempor tellus nulla, molestie luctus lectus tincidunt id. Cras duismod leo a urna placerat, vel blandit turpis fermentum.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"parallax-window\" data-parallax=\"scroll\" data-image-src=\"img/about-2.jpg\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mx-auto tm-content-container mt-4 px-3\">\r\n");
      out.write("                <div class=\"row tm-catalog-item-list mb-4\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-12 tm-catalog-item\">\r\n");
      out.write("                        <div class=\"tm-bg-gray p-4\">\r\n");
      out.write("                            <i class=\"fas fa-headphones fa-5x p-3 mb-4 tm-about-icon\"></i>\r\n");
      out.write("                            <h3 class=\"tm-text-primary mb-3\">Cras convallis mollis justo</h3>\r\n");
      out.write("                            <p>Sed dapibus vulputate diam nec hendrerit. In libero purus, interdum vitae purus nec, convallis sollicitudin nunc. Curabitur maximus maximus ex a scelerisque.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-12 tm-catalog-item\">\r\n");
      out.write("                        <div class=\"tm-bg-gray p-4\">\r\n");
      out.write("                            <i class=\"fas fa-broadcast-tower fa-5x p-3 mb-4 tm-about-icon\"></i>\r\n");
      out.write("                            <h3 class=\"tm-text-primary mb-3\">Nullam dictum pretium</h3>\r\n");
      out.write("                            <p>Quisque vestibulum lectus eros, tincidunt ultricies ante euismod non. Ut sed consequat est, quis lobortis lorem. Nullam dictum pretium mauris eu aliquam.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-12 tm-catalog-item\">\r\n");
      out.write("                        <div class=\"tm-bg-gray p-4\">\r\n");
      out.write("                            <i class=\"fas fa-film fa-5x p-3 mb-4 tm-about-icon\"></i>\r\n");
      out.write("                            <h3 class=\"tm-text-primary mb-3\">Etiam in quam dolor</h3>\r\n");
      out.write("                            <p>Aliquam in congue diam, non tincidunt ligula. Suspendisse facilisis elit eget quam semper aliquet. Donec ut purus aliquet, imperdiet lacus id, faucibus lectus.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-12 tm-catalog-item\">\r\n");
      out.write("                        <div class=\"tm-bg-gray p-4\">\r\n");
      out.write("                            <i class=\"far fa-map fa-5x p-3 mb-4 tm-about-icon\"></i>\r\n");
      out.write("                            <h3 class=\"tm-text-primary mb-3\">Duis ornare felis nec orci</h3>\r\n");
      out.write("                            <p>Nam dapibus lectus ultricies neque feugiat eleifend. Donec ornare dolor suscipit metus hendrerit, vel malesuada neque mattis. Fusce posuere cursus mattis.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-12 tm-catalog-item\">\r\n");
      out.write("                        <div class=\"tm-bg-gray p-4\">\r\n");
      out.write("                            <i class=\"fas fa-rainbow fa-5x p-3 mb-4 tm-about-icon\"></i>\r\n");
      out.write("                            <h3 class=\"tm-text-primary mb-3\">Class aptent taciti sociosqu</h3>\r\n");
      out.write("                            <p>Maecenas et libero in eros laoreet finibus sed vitae diam. Etiam consetetur, nunc sed pretium elementum, diam erat fringilla tortor, placerat condimentum.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-12 tm-catalog-item\">\r\n");
      out.write("                        <div class=\"tm-bg-gray p-4\">\r\n");
      out.write("                            <i class=\"fas fa-cloud-sun-rain fa-5x p-3 mb-4 tm-about-icon\"></i>\r\n");
      out.write("                            <h3 class=\"tm-text-primary mb-3\">Suspendisse ut malesuada</h3>\r\n");
      out.write("                            <p>Vestibulum non lectus id lacus aliquet porttitor in non nulla. Aenean urna diam, finibys id lorem nec, feugiat convallis dolor. Integer aliquam, eros eget rutrum iaculis.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"parallax-window\" data-parallax=\"scroll\" data-image-src=\"img/about-3.jpg\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid tm-content-container mx-auto pt-5\">\r\n");
      out.write("        <!-- Subscribe form and footer links -->\r\n");
      out.write("        <div class=\"row mt-5 pt-3\">\r\n");
      out.write("            <div class=\"col-xl-6 col-lg-12 mb-4\">\r\n");
      out.write("                <div class=\"tm-bg-gray p-5 h-100\">\r\n");
      out.write("                    <h3 class=\"tm-text-primary mb-3\">Do you want to get our latest updates?</h3>\r\n");
      out.write("                    <p class=\"mb-5\">Please subscribe our newsletter for upcoming new videos and latest information about our\r\n");
      out.write("                        work. Thank you.</p>\r\n");
      out.write("                    <form action=\"\" method=\"GET\" class=\"tm-subscribe-form\">\r\n");
      out.write("                        <input type=\"text\" name=\"email\" placeholder=\"Your Email...\" required>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn rounded-0 btn-primary tm-btn-small\">Subscribe</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6 col-sm-6 col-12 mb-4\">\r\n");
      out.write("                <div class=\"p-5 tm-bg-gray\">\r\n");
      out.write("                    <h3 class=\"tm-text-primary mb-4\">Quick Links</h3>\r\n");
      out.write("                    <ul class=\"list-unstyled tm-footer-links\">\r\n");
      out.write("                        <li><a href=\"#\">Duis bibendum</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Purus non dignissim</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Sapien metus gravida</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Eget consequat</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Praesent eu pulvinar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6 col-sm-6 col-12 mb-4\">\r\n");
      out.write("                <div class=\"p-5 tm-bg-gray h-100\">\r\n");
      out.write("                    <h3 class=\"tm-text-primary mb-4\">Our Pages</h3>\r\n");
      out.write("                    <ul class=\"list-unstyled tm-footer-links\">\r\n");
      out.write("                        <li><a href=\"#\">Our Videos</a></li>\r\n");
      out.write("                        <li><a href=\"#\">License Terms</a></li>\r\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Privacy Policies</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> <!-- row -->\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"row pt-5\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <p class=\"text-right\">Copyright 2020 The Video Catalog Company\r\n");
      out.write("\r\n");
      out.write("                    - Designed by <a href=\"https://templatemo.com\" rel=\"nofollow\" target=\"_parent\">TemplateMo</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/parallax.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
