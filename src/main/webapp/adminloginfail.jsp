<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Fail</title>
    <link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<body>
    <div class="container">
        <h2>Login Fail</h2>
        <p class="message"><c:out value="${message}"></c:out></p>
        <a href="adminlogin" class="login-link">Try Again</a>
    </div>
</body>
</html>
