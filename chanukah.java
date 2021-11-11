import java.io.*;
import java.util.*;

public class chanukah {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(in.readLine());
        while (cases-- > 0) {
            String[] tokens = in.readLine().split(" ");
            int n = Integer.parseInt(tokens[1]);
            out.write(tokens[0] + " " + (n * (n + 1) / 2 + n) + "\n");
        }

        out.close();
        in.close();
    }
}