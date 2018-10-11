<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" contentType="text/html" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faculty Registration</title>
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
                <li><a href="AboutUS.jsp">About Us    </a></li>
            </ul>
        </div><br><br>
            <br><center><img src="images/faculty.jpg" alt="images01" width="700px" height="200px" border="3px"></center>

    <br><center><b><h1><font color="yellow">Faculty Registration</font></h1></b></center><br>
    
    <%
        try
        {
            String f_name=request.getParameter("fntxtbx1");
            String l_name=request.getParameter("lntxtbx2");
            String dob=request.getParameter("dobtxtbx3");
            String age=request.getParameter("agetxtbx4");
            String add=request.getParameter("addtxtbx5");
            String city=request.getParameter("ctytxtbx6");
            String state=request.getParameter("sttxtbx7");
            String pin=request.getParameter("pctxtbx8");
            String mobile=request.getParameter("mbtxtbx9");
            String email=request.getParameter("e_idtxtbx10");
            String gender=request.getParameter("gentxtbx11");
            String subject=request.getParameter("subtxtb12");
            String desg=request.getParameter("degtxtbx13");
            String teach_yr=request.getParameter("yeartxtbx14");
            
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            out.print("hello1");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","password");
            out.print("hello2");
            Statement stmt=con.createStatement();
            out.print("hello3");
            int a=stmt.executeUpdate("insert into faculty values('"+f_name+"','"+l_name+"','"+dob+"','"+age+"','"+add+"','"+city+"','"+state+"','"+pin+"','"+mobile+"','"+email+"','"+gender+"','"+subject+"','"+desg+"','"+teach_yr+"' )");
            out.print("data inserted");
            out.println("<center>");
            out.println(f_name+l_name+"&nbsp;&nbsp;<b>Helloo...</b><br>");
            out.println("<b>you have been registered successfullyy...</b><br>");
            out.println("</center>");
        } 
        catch(Exception e)
         {
            out.println(e);
        
        }
        
        %>
        <div style="background-color:deepskyblue;clear:both;text-align:center">
            If you want to go to HomePage then click &nbsp; &nbsp;<a href="Home.jsp">HOME</a><br>
        If you want to go to Faculty Registration Page then  &nbsp; &nbsp;<a href="Faculty.jsp">FACULTY</a>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>
