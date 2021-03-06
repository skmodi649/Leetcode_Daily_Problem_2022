// ******* Efficient solution ****************
// Own devised Alogrithm
// Difficulty : Medium
// Concept : A string is permutation of another string only if frequencies of all the characters is same


package February;

import java.util.HashMap;
import java.util.Scanner;

public class Feb_11_Permutation_in_String {
    public static HashMap<Character , Integer> freq(String s){
        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!hash.containsKey(ch)){
                hash.put(ch , 1);
            }
            else{
                hash.put(ch , hash.get(ch) + 1);
            }
        }
        return hash;
    }
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character , Integer> hash1 = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(!hash1.containsKey(ch)){
                hash1.put(ch , 1);
            }
            else{
                hash1.put(ch , hash1.get(ch) + 1);
            }
        }
        int k = s1.length();
        for(int j = 0 ; j <= s2.length() - k ; j++){
            String substr = s2.substring(j , j + k);
            HashMap<Character , Integer> hash2 = new HashMap<>();
            hash2 = freq(substr);
            if(hash1.equals(hash2))
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first string");
        String str1 = sc.next();
        System.out.println("Enter your second string");
        String str2 = sc.next();
        if(checkInclusion(str1 , str2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
