<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <br><center><img src="images/admissions1.jpg" alt="images01" width="700px" height="200px" border="3px"></center>

    <br><center><b><h1><font color="yellow">Admission Registration</font></h1></b></center><br><br>
    <center>
        <form action="admission_display.jsp" method="post">
            <input type="text" name="idtxtbx1" placeholder="Enter ur Student ID" required/>&nbsp;&nbsp;
            <input type="text" name="fntxtbx2" placeholder="Enter ur Student Name" required/><br><br> 
            <input type="text" name="lntxtbx3" placeholder="Enter ur Student Last Name " required/>&nbsp;&nbsp;
            <input type="text" name="coursetxtbx4" placeholder="Enter ur Course" required/><br><br>
            <input type="text" name="semtxtbx5" placeholder="Enter ur Semester" requird/>&nbsp;&nbsp;
            <input type="text" name="batchtxtbx6" placeholder="Enter ur Batch Details" required/><br><br>
            <input type="text" name="batch_timetxtbx7" placeholder="Enter ur Batch Timinings" required/>&nbsp;&nbsp;
            <input type="text" name="feestxtbx8" placeholder="Enter ur Fees" required/><br><br>
            <input type="text" name="mobiletxtbx9" placeholder="Enter ur Mobile Number" required/>&nbsp;&nbsp;
            <input type="text" name="dobtxtbx10" placeholder="Enter ur DOB" required/><br><br>

            <input type="submit" value="   Add   " name="txtbtn1" />&nbsp;&nbsp;
            <input type="reset" value="   Reset   " name="txtbtn2">
            </form>
    </center><br><br>
    </body>
</html>
