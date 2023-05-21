import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int limit = scanner.nextInt();

        int ready = 0, needFix = 0, rejected = 0;

        while(scanner.hasNext()) {
            input = scanner.nextInt();
            if (input == 0) {
                ready++;
            } else if (input > 0) {
                needFix++;
            } else if (input < 0) {
                rejected++;
            }
        }

        System.out.printf("%s %s %s", ready, needFix, rejected);
    }
}