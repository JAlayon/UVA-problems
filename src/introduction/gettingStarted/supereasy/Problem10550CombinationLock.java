
package introduction.gettingStarted.supereasy;
import java.util.*;
/**
 *
 * @author alayon
 */
public class Problem10550CombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        while (!(position == 0 && c1 == 0 && c2 == 0 && c3 == 0)) {
            int sum = 1080 + ((position-c1 + 40)%40 +(c2-c1+40)%40 + (c2-c3+40)%40)*9;  
            System.out.println(sum);
            position = sc.nextInt();
            c1 = sc.nextInt();
            c2 = sc.nextInt();
            c3 = sc.nextInt();
        }
        
        
    }
}
