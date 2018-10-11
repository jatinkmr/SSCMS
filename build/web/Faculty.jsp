<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <li><a href="AboutUS.jsp">About Us</a></li>
            </ul>
        </div><br><br>
    <br><center><img src="images/faculty-banner.jpg" alt="images01" width="700px" height="200px" border="3px"></center>

    <br><center><b><h1><font color="yellow">Faculty Registration</font></h1></b></center><br><br>
    <center>
        <form action="faculty_display.jsp" method="post">
            <input type="text" name="fntxtbx1" placeholder="Enter ur First Name">&nbsp;&nbsp; 
            <input type="text" name="lntxtbx2" placeholder="Enter ur Last Name "><br><br>
            <input type="text" name="dobtxtbx3" placeholder="Enter ur Date Of Birth">&nbsp;&nbsp;
            <input type="text" name="agetxtbx4" placeholder="Enter ur Age"><br><br>
            <input type="text" name="addtxtbx5" placeholder="Enter ur Current Address">&nbsp;&nbsp;
            <input type="text" name="ctytxtbx6" placeholder="Enter ur City"><br><br>
            <input type="text" name="sttxtbx7" placeholder="Enter ur State">&nbsp;&nbsp;
            <input type="text" name="pctxtbx8" placeholder="Enter ur PinCode"><br><br>
            <input type="text" name="mbtxtbx9" placeholder="Enter ur Mobile Number">&nbsp;&nbsp;
            <input type="text" name="e_idtxtbx10" placeholder="Enter ur email address"><br><br>
            <input type="text" name="gentxtbx11" placeholder="Enter ur Gender">&nbsp;&nbsp;
            <input type="text" name="subtxtbx12" placeholder="Enter ur Subject"><br><br>
            <input type="text" name="degtxtbx13" placeholder="Enter ur Desgnination">&nbsp;&nbsp;
            <input type="text" name="yeartxtbx14" placeholder="Enter ur Teaching Year"><br><br>
            <input type="submit" value="   Add   " name="txtbtn1" />&nbsp;&nbsp;
            <input type="reset" value="   Reset   " name="txtbtn2">
            </form>
    </center><br><br>
    </body>
</html>
