import java.io.FileNotFoundException;
import java.util.Map;

public class KrajInfo {
    public static void main(String[] args) {
        try {
            Map<String, Kraj> countries = CzytnikKaraju.readCountriesByCode("KodyKraju");
            String countryCode = PodajKod.getLineFromKeyboard();
            Kraj kraj = countries.get(countryCode);
            if (kraj == null) {
                System.out.println("Nie ma kraju w kodzie" + countryCode);
            } else {
                System.out.println("Wybrałeś kraj:" + kraj);
            }
        }catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");

        }
    }
}
