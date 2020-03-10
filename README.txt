Bonjour.
Prérequis

- installez wampserver64

- créez une bbd vide avec le nom "demoformation"

COTE SERVEUR
1/ démarrez votre serveur tomcat 9.0 ( le fichier /bin/Tomcat.exe)
(laissez la console Ouverte, minimisée.)

2/ récupérez le dossier demoFormation sur votre poste

3/ placez vous dans le repertoire où se trouve le fichier pom.xml : Ouvrez un invité de commandes à cet encroit.

4/ lancer la commande "mvn clean package". Un repertoire target est créé.

5/ copiez le fichier war puis collez le dans le repertoire /webapps de votre tomcat 9.0

6/ votre application s'installe automatiquement

7/ ouvrez un cmd et tapez:java eu.ensup.demoFormation.presentation.Publisher;


COTE CLIENT

1/ démarrez votre serveur tomcat 9.0 ( le fichier /bin/Tomcat.exe)
(laissez la console Ouverte, minimisée.)

2/

3/