/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorlabs.controller;

import com.mycompany.calculatorlabs.model.AreaCalculatorModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mike
 */
@WebServlet(name = "AreaCalculatorController3", urlPatterns = {"/AreaCalculatorController3"})
public class AreaCalculatorController3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String length = request.getParameter("length");
        String width = request.getParameter("width");
        String radius = request.getParameter("radius");
        String side1 = request.getParameter("side1");
        String side2 = request.getParameter("side2");
        String calcType = request.getParameter("calcType");
        try {
            AreaCalculatorModel acm = new AreaCalculatorModel();
            if (calcType.equalsIgnoreCase("rectangle")) {
                String area = acm.getRectangleArea(length, width);
                request.setAttribute("area", area);
            } else if(calcType.equalsIgnoreCase("circle")){
                String circleArea = acm.getCircleArea(radius);
                request.setAttribute("circleArea", circleArea);
            }else{
                String triangleLength = acm.getMissingTriangleLength(side1, side2);
                request.setAttribute("triangleLength", triangleLength);
            }

        } catch (Exception e) {

        }

        RequestDispatcher view
                = request.getRequestDispatcher("/lab3.jsp"); // Where you are sending the data
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
