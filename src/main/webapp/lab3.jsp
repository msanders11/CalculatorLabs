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
        <h2>${area}</h2>
        <form name="rectangleArea" id="rectangleArea" method="POST" action="AreaCalculatorController3?calcType=rectangle">
            <p>Length: <input type="text" value="" name="length"></p>
            <p>Width: <input type="text" value="" name="width"></p>
            <input type="submit" name="submit" value="Submit">
        </form><br><br>
        <img src="circle.jpg" height="200px" width="300px">
        <h3>Calculate the area of a circle:</h3>
        <h2>${circleArea}</h2>
        <form name="circleArea" id="circle" method="POST" action="AreaCalculatorController3?calcType=circle">
            <p>Radius: <input type="text" value="" name="radius"></p>
            <input type="submit" name="submit" value="Submit">
        </form><br><br>
        <img src="triangle.gif" height="200px" width="300px">
        <h3>Calculate the third side of the triangle:</h3>
        <h2>${triangleLength}</h2>
        <form name="triangle" id="triangle" method="POST" action="AreaCalculatorController3?calcType=triangle">
            <p>Side 1: <input type="text" value="" name="side1"></p>
            <p>Side 2: <input type="text" value="" name="side2"></p>
            <input type="submit" name="submit" value="Submit">
        </form>
    </body>
</html>
