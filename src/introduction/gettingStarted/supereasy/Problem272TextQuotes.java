package introduction.gettingStarted.supereasy;

import java.util.Scanner;

/**
 *
 * @author alayon
 */
public class Problem272TextQuotes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean first = true;
        while (sc.hasNext()) {
            s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '\"') {
                    if (first) {
                        s = s.replaceFirst("\"", "``");
                        first = false;
                    } else {
                        s = s.replaceFirst("\"", "''");
                        first = true;
                    }
                }
            }
            System.out.println(s);
        }
    }
}
