<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Liste von Personen</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <h2 class="gestaltungUeberschrift">Liste mit Personen!</h2>
    <a href="/addPerson" target="_self">Person hinzufuegen</a>
    
    <section>
        <div>
            <div class="table">

                <div class="rowh">
                    <div class="cell">Vorname</div>
                    <div class="cell">Nachname</div>
                </div>

                <#list persons as person>
                <div class="row">
                    <div class="cell">${person.vorname}</div>
                    <div class="cell">${person.nachname}</div>
                </div>
                </#list>
            </div>

        </div>
    </section>
    
    <script src="/js/main.js"></script>
</body>
</html>