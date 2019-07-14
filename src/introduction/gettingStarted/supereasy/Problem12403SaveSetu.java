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
public class Problem12403SaveSetu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int total = 0;
        while (t-- > 0) {
            String s = sc.next();
            if(s.equals("donate")){
                total+=sc.nextInt();
            }else
                System.out.println(total);
        }
    }
}
