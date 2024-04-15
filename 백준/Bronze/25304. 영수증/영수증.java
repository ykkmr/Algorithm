import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());

            int t = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                int a = Integer.parseInt(stringTokenizer.nextToken());
                int b = Integer.parseInt(stringTokenizer.nextToken());
                t += a * b;
            }

            if (t == x) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
