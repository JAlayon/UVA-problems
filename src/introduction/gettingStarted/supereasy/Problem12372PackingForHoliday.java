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
public class Problem12372PackingForHoliday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int l,w,h;
        for (int i = 1; i <= t; i++) {
            l=sc.nextInt();
            w=sc.nextInt();
            h=sc.nextInt();
            System.out.print("Case " + i + ": ");
            if(l>20 || w >20 || h >20)
                System.out.println("bad");
            else
                System.out.println("good");
        }
    }
}
