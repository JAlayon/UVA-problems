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
public class Problem11364Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n, l = 100, r = 0;
        int lots[];
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            lots = new int[n];
            for (int i = 0; i < n; i++) {
                lots[i] = sc.nextInt();
                if(lots[i] < l){
                    l = lots[i];
                }
                if(lots[i] > r){
                    r = lots[i];
                }
            }
            System.out.println(2*(r-l));
            l = 100;
            r = 0;
        }
    }
}
