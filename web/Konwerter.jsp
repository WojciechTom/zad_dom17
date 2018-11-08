<%--
  Created by IntelliJ IDEA.
  User: Kapitan Planeta
  Date: 2018-11-07
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Konwerter</title>
</head>
<body>
<h1>Przelicznik Metryczny</h1>

<form method="get" action="konwerterMiary">
<input type="text" name="metry" placeholder="metry"><br>
<input type="text" name="centymetry" placeholder="centymetry"><br>
<input type="text" name="milimetry" placeholder="milimetry"><br>
<input type="submit" value="PRZELICZ">
</form>


<h1>Przelicznik wag</h1>
<form method="get" action="konwerterWagi">
<input type="text" name="kilogramy" placeholder="kilogramy"><br>
<input type="text" name="gramy" placeholder="gramy"><br>
<input type="text" name="miligramy" placeholder="miligramy"><br>
<input type="submit" value="PRZELICZ">
</form>

</body>
</html>
