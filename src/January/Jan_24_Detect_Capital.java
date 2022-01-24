package January;

import java.util.Scanner;

public class Jan_24_Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        int l = word.length();
        if(l == 1)
            return true;
        char ch = word.charAt(0);
        boolean res = false;
        if(Character.isUpperCase(ch)){
            int valu = 0;
            int vall = 0;
            for(int i = 1 ; i < l ; i++){
                char ch1 = word.charAt(i);
                if(Character.isUpperCase(ch1))
                    valu++;
                else
                    vall++;
            }
            if(valu == l-1 && vall == 0)
                res = true;
            if(vall == l-1 && valu == 0)
                res = true;

        }
        else{
            for(int i = 1 ; i < l ; i++){
                char ch1 = word.charAt(i);
                if(Character.isUpperCase(ch1)){
                    res = false;
                    break;}
                else{
                    res = true;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = sc.next();
        boolean res = detectCapitalUse(word);
        System.out.println(res);
    }
}
