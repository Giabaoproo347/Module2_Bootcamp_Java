<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body >
<h1>Edit customer</h1>
<p>
    <a href="/home">Back to customer list</a>
</p>
<form action="/update" method="post">
    <c:forEach items='${requestScope["customers"]}'  var="customer">
        <tr>
            <td><input type="text" name="id" value= "${customer.getId()}"/></td>
            <td><input type="text" name="name" value= "${customer.getName()}"/></td>
            <td><input type="text" name="email" value= "${customer.getEmail()}"/></td>
            <td><input type="text" name="address" value= "${customer.getAddress()}"/></td>
            <button type="submit" >Add</button>
        </tr>
    </c:forEach>
</form>
</body>
</html>