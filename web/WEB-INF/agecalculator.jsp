<%-- 
    Document   : agecalculator
    Created on : 22-Sep-2021, 3:40:20 PM
    Author     : kish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <div>
            <label> Enter your age: </label>
            <input type="text" name="age" value="${age}"> 
            </div>
            
            <div>
                <input type="submit" value="Age next birthday">
            </div>
            <div> ${futureAge} </div>                
        </form>
        <div>
            <a href="arithmetic">Arithmetic Calculator</a>
        </div>
        
    </body>
</html>
