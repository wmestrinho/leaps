

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Leaping over the years</title>
</head>
<body>
<h2>Leaping over the years</h2>
<form action="/graduate" method="post">
    <button type="submit">Days left till Graduation...</button>
</form>
<form action="/leapy" method="post">
    <input type="text" name="year">
    <button type="submit">Is this a Leap year??</button>
</form>
    <form action="/ageindays" method="post">
        <input type="text" name="yearBorn">
        <button type="submit">How many days old are you??</button>
</form>
</body>
</html>
