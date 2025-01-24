<%@page import="database.DataOperations"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Events</title>
    <link rel="stylesheet" href="styles.css"> <!-- Add a valid CSS file if available -->
</head>
<body>
<h1><center>Booked Events</center></h1>

<table border="1" class="table">
    <thead>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Phone Number</th>
           
        </tr>
    </thead>
    <tbody>
<% 
DataOperations db=new DataOperations();
ResultSet rs = null;

try {
    rs = db.getTable();
    while (rs.next()) {
        // Retrieve data from the ResultSet
        String name = rs.getString(2); // Adjust column names as per your database schema
        String email = rs.getString(3);
        String password = rs.getString(4);
        String phone_number = rs.getString(5);
        
        
%>
        <tr>
            <td><%= name %></td>
            <td><%= email %></td>
             <td><%= password %></td>
            <td><%= phone_number %></td>
           
            
        </tr>
<% 
    }
} catch (Exception e) {
    e.printStackTrace(); // For debugging
%>
    <tr>
        <td colspan="6" style="text-align: center; color: red;">
            Error retrieving data. Please try again later.
        </td>
    </tr>
<% 
} finally {
    try {
        if (rs != null) rs.close(); // Close the ResultSet to prevent resource leaks
    } catch (Exception e) {
        e.printStackTrace();
    }
}
%>
    </tbody>
</table>

</body>  
</html>
