package InputArithmetic;

public class quotientOfTwoNumbers {
    public static float quotient(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return (float) num1 / num2;
    }
    public static void main(String[] args) {
        System.out.println(quotient(5, 0));
    }
}
