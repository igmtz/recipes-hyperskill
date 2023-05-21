import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int[] array = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int index = 0;

        for (int i = 0; i < numOfElements; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        System.out.println(index);

    }
}