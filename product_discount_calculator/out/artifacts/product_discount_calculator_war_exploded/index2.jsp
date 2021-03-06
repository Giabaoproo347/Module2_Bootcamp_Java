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

<script language="javascript">
    function validateSelectBox(obj)
    {
        // Lấy danh sách các options
        var options = obj.children;

        // Biến lưu trữ các chuyên mục đa chọn
        var html = '';

        // lặp qua từng option và kiểm tra thuộc tính selected
        for (var i = 0; i < options.length; i++){
            if (options[i].selected){
                html += '<li>'+options[i].value+'</li>';
            }
        }

        // Gán kết quả vào div#result
        document.getElementById('result').innerHTML = html;
    }
</script>
</body>
</html>
