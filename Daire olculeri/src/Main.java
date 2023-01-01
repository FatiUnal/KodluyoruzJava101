import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("r: ");
        double r = scanner.nextDouble();

        double alan = pi*r*r;

        double cevre = 2*pi*r;

        System.out.println("alan: "+alan+" cevre: "+cevre);

    }
}
