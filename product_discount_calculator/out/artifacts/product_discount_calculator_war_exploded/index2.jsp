<%--
  Created by IntelliJ IDEA.
  User: giabaoproo347
  Date: 11/12/19
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Ví dụ được biên soạn tại freetuts.net</h2>
<h3>Chọn các chuyên mục từ danh sách dưới đây</h3>

<select multiple onchange="validateSelectBox(this)">
    <option value="tin công nghệ">Tin công nghệ</option>
    <option value="tin thời sự">Tin thời sự</option>
    <option value="tin quốc tế">Tin quốc tế</option>
    <option value="tin thể thao">Tin thể thao</option>
    <option value="tin nông nghiệp">Tin nông nghiệp</option>
</select>

<h3>Danh sách chuyên mục bạn đã chọn:</h3>
<div id="result">
    Bạn chưa chọn chuyên mục nào
</div>
</body>
</html>
