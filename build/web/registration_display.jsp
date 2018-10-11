<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" contentType="text/html" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration</title>
        <link href="Table.css" type="text/css" rel="stylesheet">
    </head>
    <body bgcolor="#663300">
        <div id="Header">
        <h1><center><b>STUDY CENTER MANAGEMENT SYSTEM</b></center></h1>
        <div id="left"> 
            <img src="images/Logo_Web.png" height="100" width="250px" float="left">
        </div>
            <div id="right">
        <form>
            <input type="text" placeholder="Enter the item to search">
            <input type="button" value="serach" name="txtbtn1">
        </form></div>
        </div>
        <div id="Menu">
          
            <ul >
                <li><a href="Home.jsp">Home</a></li>
                <li><a href="Student.jsp">Student</a></li>
                <li><a href="Faculty.jsp">Faculty</a></li>
                <li><a href="Admission.jsp">Admission</a></li>
                <li><a href="AboutUS.jsp">About Us</a></li>
            </ul>
        </div><br><br>
            <br><center><img src="images/singh5.jpg" alt="images01" width="700px" height="200px" border="3px"></center>

        <br><br><br><h1><center><b><font color="yellow">Student Registration</font></b></center></h1><br>
         <%
        try{
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
        }catch(Exception e){
            out.println(e);
        
        }
        
        %>
        <div style="background-color:deepskyblue;clear:both;text-align:center">
            If you want to go to HomePage then click &nbsp; &nbsp;<a href="Home.jsp">HOME</a><br>
        If you want to go to Student Registration Page then  &nbsp; &nbsp;<a href="Student.j\sp">STUDENT</a>
        </div>
        
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>