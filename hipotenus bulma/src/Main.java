import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("kısa kenar: ");
        double kısa = scanner.nextDouble();


        System.out.println("uzun kesanr: ");
        double uzun = scanner.nextDouble();

        double hipo = Math.sqrt((kısa*kısa)+(uzun*uzun));
        System.out.println("hipo: "+hipo);
    }
}
