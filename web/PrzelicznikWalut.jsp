<%--
  Created by IntelliJ IDEA.
  User: Kapitan Planeta
  Date: 2018-11-07
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Przelicznik Walut</title>
</head>
<body>
<h1>PODAJ NOMINAŁ i WALUTĘ PRZELICZANIA</h1>

<form method="get" action="kantor">
    <input type="text" name="kwota" placeholder="0.0"> <br>
    <select name="waluta">
        <option value="eur">EUR</option>
        <option value="usd">USD</option>
        <option value="chf">CHF</option>
        <option value="gbp">GBP</option>
    </select><br>
    <input type="submit" value="PRZELICZ">
</form>



</body>
</html>
