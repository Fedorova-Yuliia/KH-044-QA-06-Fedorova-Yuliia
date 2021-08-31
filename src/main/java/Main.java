import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input in console first value");
        double a = scanner.nextDouble();
        System.out.println(a + " First value");
        System.out.println("Input in console operation");
        String b = scanner.next();
        System.out.println("Input in console second value");
        double c = scanner.nextInt();
        double d = 0;
        if (b.equals("*")) {
            d = a * c;
        } else if (b.equals("+")) {
            d = a + c;
        } else if (b.equals("-")) {
            d = a - c;
        } else if (b.equals("%")) {
            d = a % c;
        } else if (b.equals("/")) {
            d = a / c;
        } else {
            System.out.println("");
        }
        System.out.println("Answer:" + d);
    }
}

