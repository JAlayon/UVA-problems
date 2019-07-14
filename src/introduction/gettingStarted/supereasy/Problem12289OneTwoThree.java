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
public class Problem12289OneTwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.length() > 3)
                System.out.println(3);
            else if(s.contains("on") || s.contains("ne") || 
                    (s.startsWith("o") && s.endsWith("e")))
                System.out.println(1);
            else 
                System.out.println(2);
        }
    }
}
