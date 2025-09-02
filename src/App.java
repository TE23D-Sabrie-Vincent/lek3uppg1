
// import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean bool = true;

        int kuponger = 10;
        int val;
        int längdMattan;
        int ålder;
        int längdPumpen;

        System.out.println("Välkommen, välj attraktion!");
        System.out.println("Du börjar med " + kuponger + "kuponger");
        while (bool) {
            System.out.println("\nDu har just nu " + kuponger + "kuponger kvar");
            System.out.println("1. Cirkuskarusellen");
            System.out.println("2  Flygande Mattan");
            System.out.println("3. Pumpen");
            System.out.println("4. Gå hem");
            System.out.println("Ange val: ");

            val = scanner.nextInt();

            if (scanner.hasNextInt()) {
                val = scanner.nextInt();
            } else {
                System.out.println("Skriv bara nummer!");
                scanner.next();
                continue;
            }

            if (val == 4) {
                System.out.println("Ok, gå hem då tråkmåns");
                bool = false;
            }

            else if (val == 1) {
                System.out.println("I denna Attraktion finns det ingen längdgräns :D");
                System.out.println("Dock så är det fortfarande en kupong per åktur :p");
                if (kuponger >= 1) {
                    kuponger -= 1;
                    continue;
                } else {
                    System.out.println("Du har inte tillräckligt många kuponger D:<");
                }
            }

            else if (val == 2) {
                System.out.println("Hur lång är du");
                längdMattan = scanner.nextInt();
                if (längdMattan > 140) {
                    System.out.println("Nice, hur gammal är du?");
                    ålder = scanner.nextInt();
                    if (ålder > 8) {
                        System.out.println("Du åkte flygande mattan");
                        kuponger -= 2;
                        continue;
                    } else {
                        System.out.println("Du är för ung för att åka denna attraktion");
                    }
                } else {
                    System.out.println("Du är för kort lol, man måste vara över 140cm");
                }
            } else if (val == 3) {
                System.out.println("Hur lång är du? ");
                längdPumpen = scanner.nextInt();
                if (längdPumpen > 120) {
                    System.out.println("Nice, hur gammal är du?");
                    ålder = scanner.nextInt();
                    if (ålder > 6) {
                        System.out.println("Du åkte pumpen");
                        kuponger -= 3;
                        continue;
                    }
                    else{
                        System.out.println("Ogiltigt val, gör om gör rätts");
                    }
                }
            }
            scanner.close();
        }
    }
}
