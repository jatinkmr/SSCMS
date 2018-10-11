<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" contentType="text/html" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admission Registration</title>
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
            <input type="button" value="search" name="txtbtn1">
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
            <br><center><img src="images/admission2.png" alt="images01" width="700px" height="200px" border="3px"></center>

    <br><center><b><h1><font color="yellow">Admission Registration</font></h1></b></center><br>
    <%
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
        
        %>
        <div style="background-color:deepskyblue;clear:both;text-align:center">
            If you want to go to HomePage then click &nbsp; &nbsp;<a href="Home.jsp">HOME</a><br>
        If you want to go to Admission Registration Page then  &nbsp; &nbsp;<a href="Admission.jsp">ADMISSION</a>
        </div>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>
