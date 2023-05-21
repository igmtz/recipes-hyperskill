import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        int[] array = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++){
            array[i] = scanner.nextInt();
        }

        int limit = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < numberOfElements; i++){
            if(array[i] > limit){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}