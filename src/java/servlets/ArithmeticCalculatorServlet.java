/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Request;

/**
 *
 * @author kisha
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
       return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String button = request.getParameter("calculate");
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        
        
        if (first == null || first.equals("") || second == null || second.equals("") ) {
            request.setAttribute("message", "invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
       
        }
         else {
            try {
            int firstnum = Integer.parseInt(first);
            int secondnum = Integer.parseInt(second);
             
            
            if (button.equals("*")) {
             request.setAttribute("message", (firstnum * secondnum));
            
            }
            
            else if (button.equals("+")) {
            request.setAttribute("message", (firstnum + secondnum));
            }
            
            else if (button.equals("-")) {
            request.setAttribute("message", (firstnum - secondnum));
            }
            
            else if (button.equals("%")) {
            request.setAttribute("message", (firstnum % secondnum));
            }
            
            }catch (Exception e) {
                request.setAttribute("message", "invalid");
            }
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
         } 
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
