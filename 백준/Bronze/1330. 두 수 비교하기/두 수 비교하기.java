import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer  = new StringTokenizer(bufferedReader.readLine()," ");

            long A = Long.parseLong(stringTokenizer.nextToken());
            long B = Long.parseLong(stringTokenizer.nextToken());

            if(A > B){
                System.out.println(">");
            }else if (A < B){
                System.out.println("<");
            }else {
                System.out.println("==");
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}

