<%-- 
    Document   : trang-chu
    Created on : Apr 10, 2017, 10:13:14 AM
    Author     : hv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
    </head>
    <body>
        <jsp:include page="Views/dau-trang.jsp"/>
        <jsp:include page="Views/chinh-sach.jsp"/>
        <jsp:include page="Views/quang-cao.jsp"/>
        <jsp:include page="Views/san-pham-moi.jsp"/>
        <jsp:include page="Views/ban-chay-yeu-thich.jsp"/>
        <jsp:include page="Views/cuoi-trang.jsp"/>
    </body>
</html>
