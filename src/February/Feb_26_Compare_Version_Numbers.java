package February;

import java.util.Scanner;

public class Feb_26_Compare_Version_Numbers {
    public static int compareVersion(String version1, String version2) {
        String[] first = version1.split("\\.");
        String[] second = version2.split("\\.");

        int len = Math.max(first.length , second.length);
        for(int i = 0 ; i < len ; i++){
            int val1 = (i >= first.length) ? 0 : Integer.parseInt(first[i]);
            int val2 =  (i>= second.length) ? 0 : Integer.parseInt(second[i]);
            if(val1 > val2)
                return 1;
            if(val1 < val2)
                return -1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings for comparison : ");
        String version1 = sc.next();
        String version2 =  sc.next();
        System.out.println(compareVersion(version1 , version2));
    }
}
