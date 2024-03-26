import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String firstLine = bufferedReader.readLine();
        String secondLine = bufferedReader.readLine();
        
        String A = firstLine.substring(0, 1);
        String B = firstLine.substring(1, 2);
        String C = firstLine.substring(2);
        int D = Integer.parseInt(secondLine.substring(0, 1));
        int E = Integer.parseInt(secondLine.substring(1, 2));
        int F = Integer.parseInt(secondLine.substring(2));

        String culBase = A + B + C;
        int culBaseInt = Integer.parseInt(culBase);

        int cul1 = culBaseInt * F;
        int cul2 = culBaseInt * E;
        int cul3 = culBaseInt * D;

        String culUnit = D + String.valueOf(E) + F;
        int culUnitInt = Integer.parseInt(culUnit);

        int result = culBaseInt * culUnitInt;
        bufferedReader.close();

        System.out.println(cul1);
        System.out.println(cul2);
        System.out.println(cul3);
        System.out.println(result);
    }
}

