<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Person hinzufuegen</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <h2 class="gestaltungUberschrift">Person hinzufuegen</h2>

    <form action="/addPerson" method="POST">

        <label>Vorname:</label>
        <input type="text" name="vorname" size=20px>
        <label>Nachname:</label>
        <input type="text" name="nachname" size=20px>

        <input type="submit" value="Abschicken">

    </form>

    <script src="/js/main.js"></script>
</body>
</html>