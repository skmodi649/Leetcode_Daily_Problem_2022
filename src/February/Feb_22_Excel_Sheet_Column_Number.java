// Own devised algorithm

package February;

import java.util.Scanner;

public class Feb_22_Excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        int val = 0;
        for(int i = 0 ; i < columnTitle.length() - 1 ; i++){
            char ch = columnTitle.charAt(i);
            int ascii = (int)ch - 64;
            ascii = ascii * 26;
            val = val*26 + ascii;
        }
        char lastch = columnTitle.charAt(columnTitle.length() - 1);
        val = val + (int)lastch - 64;
        return val;
    }
    public static void main(String[] argasdf){
        Feb_22_Excel_Sheet_Column_Number obj = new Feb_22_Excel_Sheet_Column_Number();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required string : ");
        String st = sc.next();
        int value = obj.titleToNumber(st);
        System.out.println(value);
    }
}
