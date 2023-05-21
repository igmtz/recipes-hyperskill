import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxElement = 0;
        int input;
        while (scanner.hasNext()) {
            input = scanner.nextInt();
             if (input > maxElement) {
                 maxElement = input;
             }
        }
        System.out.println(maxElement);
    }
}