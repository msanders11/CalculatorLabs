<%-- 
    Document   : lab1
    Created on : Sep 12, 2017, 8:11:22 PM
    Author     : Mike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Lab 1</title>
    </head>
    <body>
        <div>
            <a href="index.jsp">Home</a>
            <h1>Lab 1 - Rectangle Area Calculator</h1>

            <h3>Calculate the area of a rectangle: </h3>
            <img src="rectangle.png" height="200px" width="300px">
            <form name="rectangleArea" id="rectangleArea" method="POST" action="AreaCalculatorController">
                <p>Length: <input type="text" value="" name="length"></p>
                <p>Width: <input type="text" value="" name="width"></p>
                <input type="submit" name="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
