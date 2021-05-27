import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IllegalTriangleException test = new IllegalTriangleException();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Nhap canh a");
                int a = scanner.nextInt();
                System.out.println("Nhap canh b");
                int b = scanner.nextInt();
                System.out.println("Nhap canh c");
                int c = scanner.nextInt();
                test.check(a, b, c);
                System.out.println("Day la tam giac");
                System.exit(0);
            } catch (IllegalTriangleException e) {
                System.err.println(test.message());
            } catch (InputMismatchException e) {
                System.err.println("Nhap sai dinh dang so");
            }
        }
    }
}
