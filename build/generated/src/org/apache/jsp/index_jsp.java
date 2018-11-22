package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                                <meta charset=\"utf-8\">\n");
      out.write("                                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("                                <title>Snippet - Bootsnipp.com</title>\n");
      out.write("                                <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("                                <style>body{\n");
      out.write("    background: -webkit-linear-gradient(left, #0072ff, #00c6ff);\n");
      out.write("}\n");
      out.write(".contact-form{\n");
      out.write("    background: #fff;\n");
      out.write("    margin-top: 10%;\n");
      out.write("    margin-bottom: 5%;\n");
      out.write("    width: 70%;\n");
      out.write("}\n");
      out.write(".contact-form .form-control{\n");
      out.write("    border-radius:1rem;\n");
      out.write("}\n");
      out.write(".contact-image{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".contact-image img{\n");
      out.write("    border-radius: 6rem;\n");
      out.write("    width: 11%;\n");
      out.write("    margin-top: -3%;\n");
      out.write("    transform: rotate(29deg);\n");
      out.write("}\n");
      out.write(".contact-form form{\n");
      out.write("    padding: 14%;\n");
      out.write("}\n");
      out.write(".contact-form form .row{\n");
      out.write("    margin-bottom: -7%;\n");
      out.write("}\n");
      out.write(".contact-form h3{\n");
      out.write("    margin-bottom: 8%;\n");
      out.write("    margin-top: -10%;\n");
      out.write("    text-align: center;\n");
      out.write("    color: #0062cc;\n");
      out.write("}\n");
      out.write(".contact-form .btnContact {\n");
      out.write("    width: 50%;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 1rem;\n");
      out.write("    padding: 1.5%;\n");
      out.write("    background: #dc3545;\n");
      out.write("    font-weight: 600;\n");
      out.write("    color: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".btnContactSubmit\n");
      out.write("{\n");
      out.write("    width: 50%;\n");
      out.write("    border-radius: 1rem;\n");
      out.write("    padding: 1.5%;\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: #0062cc;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}</style>\n");
      out.write("                                <script type=\"text/javascript\" src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("                                <script type=\"text/javascript\" src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("                                <script type=\"text/javascript\"></script>\n");
      out.write("                            </head>\n");
      out.write("                            <body>\n");
      out.write("                            <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<div class=\"container contact-form\">\n");
      out.write("            <div class=\"contact-image\">\n");
      out.write("                <img src=\"https://image.ibb.co/kUagtU/rocket_contact.png\" alt=\"rocket_contact\">\n");
      out.write("            </div>\n");
      out.write("            <form method=\"post\">\n");
      out.write("                <h3>Drop Us a Message</h3>\n");
      out.write("               <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"txtName\" class=\"form-control\" placeholder=\"Your Name *\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"txtEmail\" class=\"form-control\" placeholder=\"Your Email *\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"txtPhone\" class=\"form-control\" placeholder=\"Your Phone Number *\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"submit\" name=\"btnSubmit\" class=\"btnContact\" value=\"Send Message\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea name=\"txtMsg\" class=\"form-control\" placeholder=\"Your Message *\" style=\"width: 100%; height: 150px;\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("</div>\n");
      out.write("                            \n");
      out.write("</body>\n");
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
