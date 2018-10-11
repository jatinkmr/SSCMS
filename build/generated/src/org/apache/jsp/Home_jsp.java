package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Singh_Study_Center_Management_System</title>\n");
      out.write("        <link href=\"Table.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#663300\">\n");
      out.write("        <div id=\"Header\">\n");
      out.write("            <h1><center><b><font color=\"white\">STUDY CENTER MANAGEMENT SYSTEM</font></b></center></h1>\n");
      out.write("        <div id=\"left\"> \n");
      out.write("            <img src=\"images/Logo_Web.png\" height=\"100\" width=\"250px\" float=\"left\">\n");
      out.write("        </div>\n");
      out.write("            <div id=\"right\">\n");
      out.write("        <form>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter the item to search\">\n");
      out.write("            <input type=\"button\" value=\"serach\" name=\"txtbtn1\">\n");
      out.write("        </form></div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Menu\">\n");
      out.write("          \n");
      out.write("            <ul >\n");
      out.write("                <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"Student.jsp\">Student</a></li>\n");
      out.write("                <li><a href=\"Faculty.jsp\">Faculty</a></li>\n");
      out.write("                <li><a href=\"Admission.jsp\">Admission</a></li>\n");
      out.write("                <li><a href=\"AboutUS.jsp\">About Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div><br><br>\n");
      out.write("        <br><div style=\"background-color:green;clear:both;text-align:center\">\n");
      out.write("            <marquee><b><font color=\"yellow\">Announcements   >>New Courses Will Be Added Soon...    \n");
      out.write("                    >>Date Sheet For Examination Will Be Uploded Soon... </font></b></marquee>\n");
      out.write("        </div> \n");
      out.write("        <br><center><div id=\"Slider\">\n");
      out.write("                <fieldset><legend><b><u>Photo Gallery</u></b></legend><br>\n");
      out.write("                    <img src=\"images/singh2.jpg\" alt=\"images01\" width=\"275px\" height=\"200px\" align=\"center\">\n");
      out.write("                    <img src=\"images/singh1.jpg\" alt=\"images01\" width=\"275px\" height=\"200px\" align=\"center\">\n");
      out.write("                    <img src=\"images/singh3.jpg\" alt=\"images01\" width=\"275px\" height=\"200px\" align=\"center\">\n");
      out.write("            \n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("            </div></center>\n");
      out.write("    <br>\n");
      out.write("    <div style=\"background-color:green;clear:both;text-align:center ;\">\n");
      out.write("            <marquee><b><font color=\"yellow\">Up Comming Events   >>New Courses Will Be Added Soon...    \n");
      out.write("                    >>Date Sheet For Examination Will Be Uploded Soon...</font> </b></marquee>\n");
      out.write("        </div> <br><br>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("        <img src=\"images/footer.png\"  height=\"200px\" width=\"1000px\" border=\"2px\"  >\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
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
