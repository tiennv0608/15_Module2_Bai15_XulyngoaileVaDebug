import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IllegalTriangleException test = new IllegalTriangleException();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a");
        int a = scanner.nextInt();
        System.out.println("Nhap canh b");
        int b = scanner.nextInt();
        System.out.println("Nhap canh c");
        int c = scanner.nextInt();
        try {
            test.check(a, b, c);
            System.out.println("Day la tam giac");
        } catch (IllegalTriangleException e) {
            System.err.println(test.message());
        }
    }
}
