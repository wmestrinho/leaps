<%--
  Created by IntelliJ IDEA.
  User: WagnerMestrinho
  Date: 1/16/17
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Almost There</title>
</head>
<body>
<h2>"We're <%=request.getAttribute("days")%> days away from freedom!"</h2>
<form action="index.jsp" >
    <button type="submit">Back to Main Menu</button>
</form>

</body>
</html>
