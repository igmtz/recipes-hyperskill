import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square = 0;
        int number = 1;

        while (square < n) {
            square = number*number++;
            if (square <= n ) {
                System.out.println(square);
            }
        }
    }
}
