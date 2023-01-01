import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("kilo: ");
        double kilo = scanner.nextDouble();

        System.out.println("boy: ");
        double boy = scanner.nextDouble();

        System.out.println("endeks: "+ (kilo/(boy*boy)));


    }
}
