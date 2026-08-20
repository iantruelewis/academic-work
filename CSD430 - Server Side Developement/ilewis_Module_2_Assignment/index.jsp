<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World JSP</title>
</head>
<body>
    <h1>Hello, World!</h1>
    
    <%-- Scriptlet 1: Display a personalized greeting --%>
    <% 
        String name = "Student";
    %>
    <p>Welcome, <%= name %>! This is a simple JSP example.</p>
    
    <%-- Scriptlet 2: Display the current date and time --%>
    <% 
        java.util.Date currentDate = new java.util.Date();
    %>
    <p>Current Date and Time: <%= currentDate %></p>
    
    <%-- Scriptlet 3: Perform a simple calculation --%>
    <% 
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
    %>
    <p>The sum of <%= num1 %> and <%= num2 %> is: <%= sum %></p>
</body>
</html>
