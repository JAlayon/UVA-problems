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
public class Problem11547AutomaticAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            n = (n*567/9+7492)*235/47-498;
            n/=10;
            System.out.println(Math.abs(n%10));
        }
    }
}
