package vocalstoascii;

import java.util.*;
import java.lang.Math;

/**
 *
 * @author Allen
 */
public class Vocalstoascii {

    /**
     * @param args the command line arguments
     */

    static double converter(int count, char ch) {
        int pos = count;
        int ascii = ch;
        // System.out.println(pos);
        // System.out.println(Math.pow(pos, 2));
        // System.out.println(ascii);
        double calc = pos + Math.pow(pos, 2) + ascii;
        // System.out.println(calc);

        return calc;
    }

    static void print(int p, double calc, char ch) {
        if (p == 1) {
            System.out.print((int) calc);
        } else if (p == 0) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int p;
        int count = 1;
        double calc = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }

            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'u' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'I' || s.charAt(i) == 'U' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'O') {
                calc = converter(count, s.charAt(i));
                p = 1;
            } else {
                p = 0;
            }

            print(p, calc, s.charAt(i));
        }

    }

}