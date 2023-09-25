import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Udhetim udhetimiPare = Krijo();
        udhetimiPare.Afisho();
        udhetimiPare.NdryshoSasi(1000);
        udhetimiPare.Afisho();
        Udhetim udhetimiDyte = Krijo();
        udhetimiDyte.Afisho();
        udhetimiDyte.NdryshoSasi(2100);
        udhetimiDyte.Afisho();
    }

    // metod per te marr te dhenat e per te krijuar objekt
    public static Udhetim Krijo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos te dhenat");
        System.out.print("Nisja: ");
        String nisja = scanner.nextLine();
        System.out.print("Mberritja: ");
        String mberritja = scanner.nextLine();
        System.out.print("Distanca: ");
        float distanca = scanner.nextFloat();
        System.out.print("Sasia e ngarkeses: ");
        float sasia = scanner.nextFloat();

        return new Udhetim(nisja, mberritja, distanca, sasia);
    }
}