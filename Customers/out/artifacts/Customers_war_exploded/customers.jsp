<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
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
      <td>Ngày</td>
      <td>Địa chỉ</td>

    </tr>

    <c:forEach items="${customers}" var="customer">

    <tr>
      <td>${customer.getName()}</td>
      <td>${customer.getDate()}</td>
      <td>${customer.getAddress()}</td>
      <td>
        <img src="${customer.getImage()}" height="100" width="100" />
      </td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>
