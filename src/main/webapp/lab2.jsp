<%-- 
    Document   : lab2
    Created on : Sep 12, 2017, 9:16:16 PM
    Author     : Mike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Lab 2</title>
    </head>
    <body>
        <div>
            <h1>Lab 2 - Calculate Area of Rectangle and Display Output</h1>
            <h2><a href="index.jsp">Home</a></h2>
            <img src="rectangle.png" height="200px" width="300px">
            <h3>Calculate the area of a rectangle: </h3>
            <form name="rectangleArea" id="rectangleArea" method="POST" action="AreaCalculatorController2">
                <p>Length: <input type="text" value="" name="length"></p>
                <p>Width: <input type="text" value="" name="width"></p>
                <input type="submit" name="submit" value="Submit">
            </form>
            <h2>The area is: ${area}</h2>
        </div>
    </body>
</html>
