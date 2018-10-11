package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registration_005fdisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Registration</title>\n");
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
      out.write("            <br><center><img src=\"images/singh5.jpg\" alt=\"images01\" width=\"700px\" height=\"200px\" border=\"3px\"></center>\n");
      out.write("\n");
      out.write("        <br><br><br><h1><center><b><font color=\"yellow\">Student Registration</font></b></center></h1><br>\n");
      out.write("         ");

        try
        {
            String f_name=request.getParameter("fntxtbx1");
            String l_name=request.getParameter("lntxtbx2");
            String dob=request.getParameter("dobtxtbx3");
            String add=request.getParameter("addtxtbx5");
            String city=request.getParameter("ctytxtbx6");
            String state=request.getParameter("sttxtbx7");
            String pin=request.getParameter("pctxtbx8");
            String mobile=request.getParameter("mbtxtbx9");
            String email=request.getParameter("e_idtxtbx10");
            String gender=request.getParameter("gentxtbx11");
            String category=request.getParameter("cattxtb12");
            String course=request.getParameter("coursetxtbx13");
            String sem=request.getParameter("semtxtbx14");
            String age=request.getParameter("agetxtbx4");
            String id="101";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","password");
            Statement stmt=con.createStatement();
            int a=stmt.executeUpdate("insert into student_registration values('"+id+"','"+f_name+"','"+l_name+"','"+dob+"','"+add+"','"+city+"','"+state+"','"+pin+"','"+mobile+"','"+email+"','"+gender+"','"+category+"','"+course+"','"+sem+"','"+age+"' )");
            out.println("<center>");
            out.println(f_name+l_name+"&nbsp;&nbsp;<b>Helloo...</b><br>");
            out.println("<b>you have been registered successfullyy...</b><br>");
            out.println("</center>");
        } 
        catch(Exception e)
        {
            out.println(e);
        
        }
        
        
      out.write("\n");
      out.write("        <div style=\"background-color:deepskyblue;clear:both;text-align:center\">\n");
      out.write("            If you want to go to HomePage then click &nbsp; &nbsp;<a href=\"Home.jsp\">HOME</a><br>\n");
      out.write("        If you want to go to Student Registration Page then  &nbsp; &nbsp;<a href=\"Student.j\\sp\">STUDENT</a>\n");
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
