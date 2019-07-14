
package introduction.gettingStarted.supereasy;

import java.util.Scanner;

/**
 *
 * @author alayon
 */
public class Problem11498DivisionNlogonia {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,n,m,x,y;
        while ((k=sc.nextInt()) != 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i < k; i++) {
                x = sc.nextInt();
                y = sc.nextInt();
                if(x==n || y==m)
                    System.out.println("divisa");
                else if(x > n){
                    if(y > m)
                        System.out.println("NE");
                    else
                        System.out.println("SE");
                }
                else{
                    if(y > m)
                        System.out.println("NO");
                    else
                        System.out.println("SO");
                }
            }
        }
    }
}
