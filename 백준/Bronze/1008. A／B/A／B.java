import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Spliterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        double a = Double.parseDouble(stringTokenizer.nextToken());
        double b = Double.parseDouble(stringTokenizer.nextToken());

        System.out.println(a / b);
        bufferedReader.close();
    }
}