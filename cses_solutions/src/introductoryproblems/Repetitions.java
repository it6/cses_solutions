package introductoryproblems;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        int ch = 0;
        int prev = 0;
        int count = 0;
        int ans = 0;

        while ((ch = reader.read()) != '\n') {
            if (prev == 0) prev = ch;
            if (ch == prev) {
                count++;
            } else {
                count = 1;
                prev = ch;
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
        reader.close();
    }
}