<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2021, 8:15:49 PM
    Author     : kisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <div>
            <label> First: </label>
            <input type="text" name="first" value="${first}">
            </div>
            <div>
            <label> Second: </label>
            <input type="text" name="second" value="${second}">
            </div>
            <div>
            <input type="submit" name="calculate" value="+">
            <input type="submit" name="calculate" value="-">
            <input type="submit" name="calculate" value="*">
            <input type="submit" name="calculate" value="%">
            </div>
            
            <div>
                Result: ${message}
            </div>
        </form>
        
        <div>
                        
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
