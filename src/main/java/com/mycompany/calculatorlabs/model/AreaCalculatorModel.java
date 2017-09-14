/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorlabs.model;

/**
 *
 * @author Mike
 */
public class AreaCalculatorModel {
    private double area;
    private int length;
    private int width;

    private double radius;
    
    private double side1;
    private double side2;
    private double side3;

    public String getRectangleArea(String length, String width) {
        this.length = Integer.valueOf(length);
        this.width = Integer.valueOf(width);
        calculateRectangleArea();
        return generateReturnMessage();
    }

    public String getCircleArea(String radius) {
        this.radius = Integer.valueOf(radius);
        calculateCircleArea();
        return generateReturnMessage();
    }
    
    public String getMissingTriangleLength(String side1, String side2){
        this.side1 = Double.valueOf(side1);
        this.side2 = Double.valueOf(side2);
        calculateRemainingTriangleSide();
        return generateReturnMessageForTriangle();
    }

    public void calculateRemainingTriangleSide(){
        side3 = Math.sqrt((Math.pow(side1, 2))+(Math.pow(side2, 2)));
    }
    public void calculateRectangleArea() {
        area = length * width;
    }

    private void calculateCircleArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    private String generateReturnMessage() {
        return "The area is: " + String.format("%.3f",area);
    }

    private String generateReturnMessageForTriangle() {
        return "The length of the third side is: " + String.format("%.3f",side3);
    }

}
