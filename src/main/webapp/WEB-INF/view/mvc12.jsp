<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Mvc12</title>
</head>
<body>
    <c:if test="${not empty start}">
        <ul>
            <c:forEach begin="${start}" end="${end}" var="i">
                <li>${i}</li>
            </c:forEach>
        </ul>
    </c:if>
</body>
</html>
