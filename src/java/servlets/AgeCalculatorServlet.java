package servlets;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
       return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        String age = request.getParameter("age");
        
        
        if (age == null || age.equals("") ) {
            request.setAttribute("futureAge", "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }
        
        else {
            request.setAttribute("age", age);
            try{ 
                int futureAge = Integer.parseInt(age) + 1;
                request.setAttribute("futureAge", "Your age next birthday will be " + futureAge);
            } catch (Exception e) {
                request.setAttribute("futureAge", "You must enter a number");
            }       
        
               
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }
    }



    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
