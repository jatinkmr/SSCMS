package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admission Registration</title>\n");
      out.write("        <link href=\"Table.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"skyblue\">\n");
      out.write("        <div id=\"Header\">\n");
      out.write("        <h1><center><b>STUDY CENTER MANAGEMENT SYSTEM</b></center></h1>\n");
      out.write("        <div id=\"left\"> \n");
      out.write("            <img src=\"images/067.jpg\" height=\"100\" width=\"250px\" float=\"left\">\n");
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
      out.write("                <li><a href=\"#\">About Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div><br><br>\n");
      out.write("    <br><center><b><h1>Admission Registration</h1></b></center><br><br>\n");
      out.write("    <center>\n");
      out.write("        <form action=\"admission_display.jsp\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"idtxtbx1\" placeholder=\"Enter ur Student ID\" required/>&nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"fntxtbx2\" placeholder=\"Enter ur Student Name\" required/><br><br> \n");
      out.write("            <input type=\"text\" name=\"lntxtbx3\" placeholder=\"Enter ur Student Last Name \" required/>&nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"coursetxtbx4\" placeholder=\"Enter ur Course\" required/><br><br>\n");
      out.write("            <input type=\"text\" name=\"semtxtbx5\" placeholder=\"Enter ur Semester\" requird/>&nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"batchtxtbx6\" placeholder=\"Enter ur Batch Details\" required/><br><br>\n");
      out.write("            <input type=\"text\" name=\"batch_timetxtbx7\" placeholder=\"Enter ur Batch Timinings\" required/>&nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"feestxtbx8\" placeholder=\"Enter ur Fees\" required/><br><br>\n");
      out.write("            <input type=\"text\" name=\"mobiletxtbx9\" placeholder=\"Enter ur Mobile Number\" required/>&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"   Add   \" name=\"txtbtn1\" />&nbsp;&nbsp;\n");
      out.write("            <input type=\"reset\" value=\"   Reset   \" name=\"txtbtn2\">\n");
      out.write("            </form>\n");
      out.write("    </center><br><br>\n");
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
