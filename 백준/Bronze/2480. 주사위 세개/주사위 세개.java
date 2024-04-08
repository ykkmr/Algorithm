import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());

            int prize = 0;

            if (a == b && b == c) {
                prize = 10000 + a * 1000;
            }
            else if (a == b || b == c || a == c) {
                if (a == b) {
                    prize = 1000 + a * 100;
                } else if (b == c) {
                    prize = 1000 + b * 100;
                } else {
                    prize = 1000 + c * 100;
                }
            }
            else {
                prize = Math.max(a, Math.max(b, c)) * 100;
            }

            System.out.println(prize);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

