import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        int check = 0;
        if(number == 0) {
            check = 0;
        } else if(number < 0) {
            check = -1;
        } else if (number > 0) {
            check = 1;
        }
        return check;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}