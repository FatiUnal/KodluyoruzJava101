import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("mat: ");
        int mat = scanner.nextInt();

        System.out.println("turk: ");
        int türk = scanner.nextInt();

        System.out.println("fen: ");
        int fen = scanner.nextInt();

        int ortalama = (mat+türk+fen)/3;

        System.out.println(ortalama>60 ? "geçti":"kaldı");
    }
}
