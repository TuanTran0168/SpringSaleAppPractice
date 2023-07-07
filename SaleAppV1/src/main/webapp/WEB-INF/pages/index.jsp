<%-- 
    Document   : index
    Created on : Jul 7, 2023, 1:28:02 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chao tui may</title>
    </head>
    <body>
        <h1>HIHIHIHIHIHIHI</h1>
        <h1>${msg}</h1>
        <ul>
            <c:forEach items = "${products}" var = "p">
                <li>${p.id} - ${p.name} - ${p.price}</li>
            </c:forEach>
        </ul>
    </body>
</html>
