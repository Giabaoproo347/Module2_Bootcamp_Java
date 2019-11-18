<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: giabaoproo347
  Date: 11/15/19
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/usd">
  USD  <input type="text" name="usd" >
  RATE  <input type="text" name="rate" value="23000">
  RESULT  <input type="submit">
        <input type="text" name="output" value="${vnd}">
    </form>
</body>
</html>
