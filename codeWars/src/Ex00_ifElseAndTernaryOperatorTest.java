import java.util.Scanner;

public class Ex00_ifElseAndTernaryOperatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(Ex00_ifElseAndTernaryOperator(number));
    }

    public static int Ex00_ifElseAndTernaryOperator(final int n) {
        if ((n < 5)) return n * 100;
        else if ((n >= 5) && (n < 10)) return n * 95;
        else if (n >= 10) return n * 90;

        return n * 0;
    }


}
