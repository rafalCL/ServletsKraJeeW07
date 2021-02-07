<%--
  Created by IntelliJ IDEA.
  User: Edu
  Date: 07.02.2021
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Landing page</title>
</head>
<body>
<%@ include file="WEB-INF/jspf/header.jspf"%>
<p>Welcome on my page!!! :)</p>
<c:out value="<b> bold text </b>" escapeXml="false"/>
<c:out value="<b> bold text </b>" escapeXml="true"/>
<%@ include file="WEB-INF/jspf/footer.jspf"%>
</body>
</html>
