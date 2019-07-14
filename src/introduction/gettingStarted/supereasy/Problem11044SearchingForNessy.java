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
public class Problem11044SearchingForNessy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,n,m;
        t = sc.nextInt();
        while (t-- > 0) {
            n=sc.nextInt();
            m=sc.nextInt();
            System.out.println((n/3)*(m/3));
        }
    }
}
