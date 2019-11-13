<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>c:catch example</title>
</head>
<body>
<h2>c:catch example</h2>

    <c:set scope="session" var="salary" value="${2000*2}">
    <c:out value="${salary}"></c:out>

</body>
</html>