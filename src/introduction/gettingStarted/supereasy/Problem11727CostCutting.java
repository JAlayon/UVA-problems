/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction.gettingStarted.supereasy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alayon
 */
public class Problem11727CostCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        int salaries[] = new int[3];
        t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < salaries.length; j++) {
                salaries[j] = sc.nextInt();
            }
            Arrays.sort(salaries);
            System.out.println("Case " + i + ": " + salaries[1]);
        }
    }
}
