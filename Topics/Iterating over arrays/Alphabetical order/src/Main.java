import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] chars = scanner.nextLine().split(" ");

        boolean inOrder = true;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i].compareTo(chars[i + 1]) > 0){
                inOrder = false;
            }
        }
        System.out.println(inOrder);
    }
}