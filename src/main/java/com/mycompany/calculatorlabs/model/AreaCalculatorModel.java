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
    private double circum;
    
    public String setRectangleValues(String length, String width){
        this.length = Integer.valueOf(length);
        this.width = Integer.valueOf(width);
        calculateRectangleArea();
        return generateReturnMessage();
        
    }
    
    public void calculateRectangleArea(){
        area = length * width;
    }

    private String generateReturnMessage() {
        return "The area is: " + area;
    }
}
