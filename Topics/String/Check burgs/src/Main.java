import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        boolean endsWithBurg = false;
        if(cityName.endsWith("burg")) {
            endsWithBurg = true;
        }
        System.out.println(endsWithBurg);
    }
}