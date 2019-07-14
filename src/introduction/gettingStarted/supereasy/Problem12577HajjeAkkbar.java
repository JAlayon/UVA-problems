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
public class Problem12577HajjeAkkbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int i = 1;
        while (!(line = sc.next()).equals("*")) {
            System.out.print("Case " + (i++) + ": ");
            if(line.equals("Hajj"))
                System.out.println("Hajj-e-Akbar");
            else if(line.equals("Umrah"))
                System.out.println("Hajj-e-Asghar");
        }
    }
}
