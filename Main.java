import java.util.Scanner;

public class Main {

    // TOPIC 1
    public static int sumSquares(int n) {
        if (n <= 1) return n;
        return n * n + sumSquares(n - 1);
    }



    // TOPIC 2
    public static int sumInput(int n, Scanner sc) {
        if (n == 0) return 0;
        int x = sc.nextInt();
        return x + sumInput(n - 1, sc);
    }




    // TOPIC 3
    public static int power(int b, int n) {
        if (n == 0) return 1;
        return b * power(b, n - 1);
    }

    public static int powerSum(int b, int n) {
        if (n == 0) return 1;
        return power(b, n) + powerSum(b, n - 1);
    }




    // TOPIC 4
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;

        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }


    // Main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Topic 1
        int n1 = sc.nextInt();
        System.out.println(sumSquares(n1));

        // Topic 2
        int n2 = sc.nextInt();
        System.out.println(sumInput(n2, sc));

        // Topic 3
        int b = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(powerSum(b, n3));

        // Topic 4
        int n4 = sc.nextInt();
        reversePrint(n4, sc);
    }
}
