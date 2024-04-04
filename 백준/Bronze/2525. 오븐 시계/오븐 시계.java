import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer  = new StringTokenizer(bufferedReader.readLine(), " ");
            StringTokenizer stringTokenizer2  = new StringTokenizer(bufferedReader.readLine());

            int h = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            int setTime = Integer.parseInt(stringTokenizer2.nextToken());

            int minute = m + setTime;
            int hour = h + minute / 60;
            minute = minute % 60;
            hour = hour % 24;

            System.out.println(hour + " " + minute);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}

