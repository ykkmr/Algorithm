import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer  = new StringTokenizer(bufferedReader.readLine());
            StringTokenizer stringTokenizer2  = new StringTokenizer(bufferedReader.readLine());

            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer2.nextToken());

            if (x > 0 && y > 0) {
                System.out.println(1);
            }
            if (x < 0 && y > 0) {
                System.out.println(2);
            }
            if (x < 0 && y < 0) {
                System.out.println(3);
            }
            if (x > 0 && y < 0) {
                System.out.println(4);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

