import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fiyatı giriniz: ");
        double x = scanner.nextDouble();

        double kdv = 0.18;
        double yenifiyat = x +(x*kdv);
        System.out.println("kdv li fiyat: "+yenifiyat);
    }
}
