package Exercice2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Test LogManager ===");
        LogManager logger = new LogManager("application.log");
        logger.log("INFO", "Démarrage de l'application");
        logger.log("DEBUG", "Chargement de la configuration");
        logger.log("ERROR", "Erreur lors de la connexion");
        System.out.println(" Fichier application.log généré.");

        System.out.println("\n=== Test CsvWriter ===");
        List<String> header = Arrays.asList("id", "nom", "score");
        List<String[]> rows = List.of(
                new String[]{"1", "Alice", "85"},
                new String[]{"2", "Bob", "92"},
                new String[]{"3", "Carol", "78"}
        );
        CsvWriter.writeCsv("report.csv", header, rows);
        System.out.println(" Fichier report.csv généré.");

        System.out.println("\n=== Test HtmlGenerator ===");
        HtmlGenerator.writeHtml(
                "index.html",
                "TP PrintWriter",
                "Bienvenue dans le TP de génération HTML via PrintWriter !"
        );
        System.out.println(" Fichier index.html généré.");
    }
}
