import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();
        boolean isContained = false;

        for (int element : array) {
            if(element == number) {
                isContained = true;
            }
        }

        System.out.println(isContained);
    }
}