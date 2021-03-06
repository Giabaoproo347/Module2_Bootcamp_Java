<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
    <h1>Customer Manager</h1>
    <p>
        <a href="/formAdd">Create a new customer</a>
    </p>
  <table border="1">
      <tr>
          <td>Name</td>
          <td>Email</td>
          <td>Address</td>
      </tr>
   <c:forEach items='${requestScope["customers"]}'  var="customer">
       <tr>
           <td>${customer.getName()}</td>
           <td>${customer.getEmail()}</td>
           <td>${customer.getAddress()}</td>
           <td><a href="/formUpdate">edit</a></td>
           <td><a href="/formDelete">delete</a></td>
       </tr>
   </c:forEach>
  </table>
</body>
</html>