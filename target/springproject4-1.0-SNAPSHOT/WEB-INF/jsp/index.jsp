<%-- 
    Document   : header
    Created on : Dec 23, 2015, 2:26:59 PM
    Author     : prongbang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/fragments/taglib.jsp"/>
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        
        <jsp:include page="/WEB-INF/fragments/header.jsp"/>
        
        <div class="container">
            <p>Hello! This is the default welcome page for a Spring Web MVC project.</p> 
            <p>by ${message}</p>
            <p><a href="./service/book">Book RESTful Web Service</a></p>
        </div>
        
        <jsp:include page="/WEB-INF/fragments/footer.jsp"/>
        
    </body>
</html>
