<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Danh sách sản phẩm</title>
  <style>
    table, tr, td {
      border: 1px solid grey;
    }
  </style>
</head>
<body>

<table>

  <tr>
    <td>Tên KH</td>
    <td>Tuổi</td>
    <td>Địa chỉ</td>
  </tr>

  <c:forEach items="${customers}" var="customer">

    <tr>
      <td>${customer.getName()}</td>
      <td>${customer.getAge()}</td>
      <td>${customer.getAddress()}</td>


    </tr>


  </c:forEach>
</table>

</body>
</html>