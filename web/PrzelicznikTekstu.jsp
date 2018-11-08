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
    <title>Przelicznik Tekstu</title>
</head>
<body>

<h1>Przelicznik Tekstu</h1>
<output name="tekst"></output>


<form method="post" action="licznikTekstu">
<textarea name="pole" cols="30" rows="10" placeholder="Tu wpisz tekst do analizy"></textarea><br>
<input type="submit" value="Wyślij">
</form>
</body>
</html>
