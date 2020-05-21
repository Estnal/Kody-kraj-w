import java.util.Scanner;

public class PodajKod {
    public static String getLineFromKeyboard(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj kod:");
            return scanner.nextLine();
        }
    }
}
