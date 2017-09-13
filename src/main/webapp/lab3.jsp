<%-- 
    Document   : lab3
    Created on : Sep 12, 2017, 9:34:23 PM
    Author     : Mike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Lab 3 - Multiple Area Calculators</title>
    </head>
    <body>
        <a href="index.jsp">Home</a>
        <h1>Calculate Areas</h1>
        <img src="rectangle.png" height="200px" width="300px">
        <h3>Calculate the area of a rectangle: </h3>
        <form name="rectangleArea" id="rectangleArea" method="POST" action="AreaCalculatorController3">
            <p>Length: <input type="text" value="" name="length"></p>
            <p>Width: <input type="text" value="" name="width"></p>
            <input type="submit" name="submit" value="Submit">
        </form>
    </body>
</html>
