import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer  = new StringTokenizer(bufferedReader.readLine(), " ");

            int h = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());

            int fixM = m - 45;
            if (fixM < 0) {
                h -= 1;
                if (h < 0) {
                    h += 24;
                }
                fixM += 60;
            }

            System.out.println(h + " " + fixM);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}

