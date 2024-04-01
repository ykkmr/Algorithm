import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer  = new StringTokenizer(bufferedReader.readLine());

            int year = Integer.parseInt(stringTokenizer.nextToken());

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

