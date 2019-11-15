
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form method="post" action="/calculate">
  <fieldset>
    <legend>Calculator</legend>
    First Operand: <input type="text" name="first">
    Operator:
    <select name="operator">
        <option value="+">Cộng</option>
        <option value="-">Trừ</option>
        <option value="*">Nhân</option>
        <option value="/">Chia</option>
    </select>
    Second Operand: <input type="text" name="second">
    <input type="submit" id="submit" value="Submit">

  </fieldset>
  </form>
  </body>
</html>
