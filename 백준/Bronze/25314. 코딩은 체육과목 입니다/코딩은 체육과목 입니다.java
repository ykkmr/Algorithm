import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int total = x/4;

        for (int i = 0; i < total; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}


