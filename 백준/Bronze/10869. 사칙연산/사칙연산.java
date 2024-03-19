import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Spliterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        int sum = a+b;
        int minus = a-b;
        int multiplication = a*b;
        int divide = a/b;
        int per = a%b;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiplication);
        System.out.println(divide);
        System.out.println(per);
        bufferedReader.close();
    }
}