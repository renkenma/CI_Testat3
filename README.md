# CI_Testat3
fuer testat3

Es wurde GitHub verwendet.

Die Pipeline ist wie folgt aufgebaut:
- name
- wird aktiviert bei push auf den main branch
- führt dann aus:
- - läuft auf aktuellster ubuntu-Version
  - lädt Code auf virtuellen Server, auf dem die Pipelien läuft
  - Installation von JDK Version 17 über Eclipse
  - Dateien werden kompiliert (.java --> .class)
  - tests werden ausgeführt

Zu beachten: Der Test wird immer erfolgreich! Ausgabe, ob korrekt erfolgt unter: 'Tests ausführen'

Verhalten bei Push:
-neue Änderungen werden auf GitHub hochgeladen
--> hierbei automatischer Start der Actions, also der o.g. Pipeline
