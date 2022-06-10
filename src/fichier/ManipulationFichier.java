package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationFichier {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/Davzer/Documents/Dev/Java_Objet/J5-J6/section 2 - traitement des fichiers/recensement.csv");
        Path habitantPath = Paths.get("C:\\Users\\Davzer\\IdeaProjects\\approche-objet\\src\\fichier\\habitants.csv");

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        //System.out.println(lines);

        List<String>newLines = new ArrayList<>();

        for (String line: lines) {
            String[]value = line.split(";");

            String noSpace= value[9].trim().replaceAll(" ", "");

            long totalPopulation = -1;

            try {
                totalPopulation = Long.parseLong(noSpace);
            } catch (NumberFormatException e) {

            }

            System.out.println(value[9]);
            if(totalPopulation > 25000) {
                newLines.add(line);

            }

        }

        Files.write(habitantPath, newLines);

        List<String> linesHab = Files.readAllLines(habitantPath, StandardCharsets.UTF_8);

        System.out.println();



    }


}
