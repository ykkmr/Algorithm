import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());

        int firstCul = (A+B)%C;
        int secondCul = ((A%C) + (B%C))%C;
        int thirdCul = (A*B)%C;
        int fourthCul =  ((A%C) * (B%C))%C;

        System.out.println(firstCul);
        System.out.println(secondCul);
        System.out.println(thirdCul);
        System.out.println(fourthCul);
        bufferedReader.close();
    }
}

