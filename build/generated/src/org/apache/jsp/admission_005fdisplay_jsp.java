package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admission_005fdisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admission Registration</title>\n");
      out.write("        <link href=\"Table.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#663300\">\n");
      out.write("        <div id=\"Header\">\n");
      out.write("        <h1><center><b>STUDY CENTER MANAGEMENT SYSTEM</b></center></h1>\n");
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
      out.write("            <br><center><img src=\"images/admission2.png\" alt=\"images01\" width=\"700px\" height=\"200px\" border=\"3px\"></center>\n");
      out.write("\n");
      out.write("    <br><center><b><h1><font color=\"yellow\">Admission Registration</font></h1></b></center><br>\n");
      out.write("    ");

        try
        {
            String id=request.getParameter("idtxtbx1");
            String f_name=request.getParameter("fntxtbx2");
            String l_name=request.getParameter("lntxtbx3");
            String course=request.getParameter("coursetxtbx4");
            String sem=request.getParameter("semtxtbx5");
            String batch_details=request.getParameter("batchtxtbx6");
            String batch_time=request.getParameter("batch_timetxtbx7");
            String fees=request.getParameter("feestxtbx8");
            String mobile=request.getParameter("mobiletxtbx9");
            String dob=request.getParameter("dobtxtbx10");
              
            Class.forName("oracle.jdbc.driver.OracleDriver");
            out.print("hello1");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","password");
            out.print("hello2");
            Statement stmt=con.createStatement();
            out.print("hello3");
            int a=stmt.executeUpdate("insert into admission values('"+id+"','"+f_name+"','"+l_name+"','"+course+"','"+sem+"','"+batch_details+"','"+batch_time+"','"+fees+"','"+mobile+"','"+dob+"' )");
            out.print("data inserted");
            out.println("<center>");
            out.println(f_name+l_name+"&nbsp;&nbsp;<b>Helloo...</b><br>");
            out.println("<b>your admission have been successfullyy completed...</b><br>");
            out.println("<b>Welcome to Singh Study Center...</b>");
            out.println("</center>");
        } 
        catch(Exception e)
        {
            out.println(e);
        
        }
        
        
      out.write("\n");
      out.write("        <div style=\"background-color:deepskyblue;clear:both;text-align:center\">\n");
      out.write("            If you want to go to HomePage then click &nbsp; &nbsp;<a href=\"Home.jsp\">HOME</a><br>\n");
      out.write("        If you want to go to Admission Registration Page then  &nbsp; &nbsp;<a href=\"Admission.jsp\">ADMISSION</a>\n");
      out.write("        </div>\n");
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
