<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <a href="/home">Back to customer list</a>
</p>
<form method="get" action="/add">
        <table>
            <tr>
                <td>ID: </td>
                <td><input type="text" name="id" value="${requestScope["customers"].getId()}"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name"  value="${requestScope["customers"].getName()}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" value="${requestScope["customers"].getEmail()}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" value="${requestScope["customers"].getAddress()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update customer"></td>
            </tr>
        </table>
</form>
</body>
</html>