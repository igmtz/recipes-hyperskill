import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = 0;
        while(scanner.nextInt() != 0) {
            numberOfEntries++;
        }
        System.out.println(numberOfEntries);
    }
}