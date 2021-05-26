import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public String message() {
        return "Khong la tam giac";
    }

    public void check(int side1, int side2, int side3) throws Exception {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) throw new Exception();
        if (!(side1 + side2 > side3) || !(side2 + side3 > side1) ||
                !(side1 + side3 > side2)) throw new Exception();
    }
}
