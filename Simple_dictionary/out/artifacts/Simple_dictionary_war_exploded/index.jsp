<%--
  Created by IntelliJ IDEA.
  User: giabaoproo347
  Date: 11/12/19
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary Simple</title>
    <style type="text/css">
      input {
        position: absolute;
        border: 3px;
        border-radius: 20px;
        top: 10px;
        left: 5px;
      }

      #submit {
        position: absolute;
        top: 40px;
        left: 5px;
        border: 10px;
      }
    </style>
  </head>
  <body>
    <form method="get" action="/translate">
        <input type="text" name="txtSearch" placeholder="Enter your word...">
        <input type="submit" id="submit" value="Search">
    </form>
  </body>
</html>
