import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean bool = true;

        System.out.println("Välkommen, välj attraktion!");
        while (bool) {
            System.out.println("1. Cirkuskarusellen");
            System.out.println("2  Flygande Mattan");
            System.out.println("3. Pumpen");
            System.out.println("4. Gå hem");
            System.out.println("Ange val: ");
           
            int val;
            val = scanner.nextInt();
            if (scanner.hasNextInt()){
                val = scanner.nextInt();
            }
            else{
                System.out.println("Skriv bara nummer!");
                scanner.next();
            }
            
            if (val == 1) {
                
            }
        
        }
            scanner.close();
    }
}

