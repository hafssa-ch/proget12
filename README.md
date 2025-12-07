#  TP12 – Gestion des fichiers en Java

Ce projet pédagogique présente deux TP liés à la **gestion des fichiers en Java** :

1. Manipulation de fichiers texte, CSV et objets sérialisés.
2. Utilisation de **PrintWriter** pour écrire des logs, générer des CSV et créer des pages HTML.

---

##  Structure des projets

### Exercice 1
TPFiles/
└─ src/
└─ Exercice1/
├ FileUtils.java
├ TextReader.java
├ TextWriter.java
├ CsvParser.java
├ ObjectSerializer.java
└ Main.java
Exercice2/
├ LogManager.java
├ CsvWriter.java
├ HtmlGenerator.java
└ Main.java

---

## Contenu des exercices

###  Exercice 1 – TPFiles

- **Lecture de fichiers texte** (`input.txt`) ligne par ligne avec `BufferedReader`.
- **Écriture et copie de fichiers** (`output.txt`) avec résumé du nombre de lignes.
- **Parsing CSV** (`data.csv`) : lecture et filtrage des scores ≥50 pour générer `passed.csv`.
- **Sérialisation d’objets** (`records.ser`) : sérialisation et désérialisation de `List<Record>`.

####  Classe principale
- `TextReader.java` – lecture de fichiers texte
- `TextWriter.java` – copie et ajout résumé
- `CsvParser.java` – lecture et écriture CSV
- `ObjectSerializer.java` – sérialisation d’objets
- `Main.java` – tests et exécution
<img width="658" height="446" alt="image" src="https://github.com/user-attachments/assets/981a86d0-8708-4ee1-a86f-bd1d260e2a84" />

---

###  Exercice 2 – TPPrintWriter

- **LogManager** : création d’un journal horodaté (`application.log`) avec `PrintWriter`.
- **CsvWriter** : génération de fichiers CSV (`report.csv`) à partir de listes de données.
- **HtmlGenerator** : création de pages HTML simples (`index.html`) avec titre et paragraphe.

####  Classe principale
- `LogManager.java` – gestion des logs
- `CsvWriter.java` – génération CSV
- `HtmlGenerator.java` – génération HTML
- `Main.java` – tests et exécution
<img width="645" height="384" alt="image" src="https://github.com/user-attachments/assets/274a2c96-3554-4f65-bc71-a4fbb85c682b" />

---
## Fichiers générés après exécution
TP	Fichiers	Description
TPFiles	output.txt, passed.csv, records.ser	Copie texte, CSV filtré, objets sérialisés
TPPrintWriter	application.log, report.csv, index.html	Logs, CSV, page HTML


