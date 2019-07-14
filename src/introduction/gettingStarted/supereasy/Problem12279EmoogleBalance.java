package introduction.gettingStarted.supereasy;

import java.util.Scanner;

/**
 *
 * @author alayon
 */
public class Problem12279EmoogleBalance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t = 1;
        while ((n = sc.nextInt()) != 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int k = sc.nextInt();
                if (k != 0) {
                    sum++;
                } else {
                    sum--;
                }
            }
            System.out.println("Case " + t + ": " + sum);
            t++;
        }
    }
}
