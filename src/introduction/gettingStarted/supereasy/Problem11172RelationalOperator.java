/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction.gettingStarted.supereasy;

import java.util.Scanner;

/**
 *
 * @author alayon
 */
public class Problem11172RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, x, y;
        t = sc.nextInt();
        while (t-- > 0) {
            x=sc.nextInt();
            y=sc.nextInt();
            if(x > y)
                System.out.println(">");
            else if(x < y)
                System.out.println("<");
            else
                System.out.println("=");
        }
    }
}
