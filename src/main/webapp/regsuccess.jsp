<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Success</title>
    <link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<body>
    <div class="container">
        <h2>Registration Successful!</h2>
        <p class="message"><c:out value="${message}"></c:out></p>
        <a href="emplogin" class="login-link">Login Here</a>
    </div>
</body>
</html>
