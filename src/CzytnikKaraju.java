import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CzytnikKaraju {
    public static Map<String, Kraj> readCountriesByCode(String filename) throws FileNotFoundException{
        Map<String, Kraj> countriesByCode =  new HashMap<>();
        try (Scanner scanner = new Scanner(new File(filename))) {

            while ((scanner.hasNextLine())) {
                String line = scanner.nextLine();
                String split[] = line.split(";");
                if (split.length <3) {
                    System.out.println("nie poprawna linijka w" + filename);
                    break;
                }
                String countryShortCut = split[0];
                String countryName = split[1];
                int countryPopulation = Integer.valueOf(split[2]);
                countriesByCode.put(countryShortCut, new Kraj(countryShortCut, countryName, countryPopulation));
            }
            return countriesByCode;

        }
    }
}
