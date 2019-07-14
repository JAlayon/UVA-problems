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
public class Problem12250LanguageDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int i = 1;
        while (!(line=sc.next()).equals("#")) {
            switch (line) {
                case "HELLO":
                    System.out.println("Case " + i + ": " + "ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("Case " + i + ": " + "SPANISH");
                    break;
                case "HALLO":
                    System.out.println("Case " + i + ": " + "GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("Case " + i + ": " + "FRENCH");
                    break;
                case "CIAO":
                    System.out.println("Case " + i + ": " + "ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("Case " + i + ": " + "RUSSIAN");
                    break;
                default:
                     System.out.println("Case " + i + ": UNKNOWN");
            }
            i++;
        }    
    }
}
