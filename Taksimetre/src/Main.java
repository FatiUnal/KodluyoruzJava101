import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double acilis = 10;

        System.out.println("kac km: ");
        double x = scanner.nextDouble();

        double ucret = acilis+ (x*2.20);

        if (ucret<= 20){
            ucret = 20;
        }

        System.out.println("ucret: "+ucret);


    }
}
