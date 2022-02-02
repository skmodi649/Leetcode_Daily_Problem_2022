package February;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feb_2_Find_All_Anagrams_in_a_string {
    // ************* NAIVE SOLUTION *********************
    /*
    1. Find all the possible anagrams of the word and store it in a ArrayList of type string
    2. Now run a for loop from i = 0 to s.length() - p.length() and find substrings accordingly
    3. Check if the ArrayList contains the substring or not, if it does then store the value of i in the integer type
       ArrayList index
    4. Now just diplay the index arraylist elements
     */

    //******************* Efficient solution ********************

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();
        int len = p.length();
        if(s.length() < len) return ans;

        int[] original = new int[26];

        for(int i = 0 ; i < len ; i ++){
            original[p.charAt(i) - 'a'] ++;
        }

        for(int i = 0 ; i < len - 1; i ++){
            original[s.charAt(i) - 'a'] --;
        }

        for(int i = 0; i <= s.length() - len; i++ ){
            original[s.charAt(i + len - 1) - 'a'] --;
            if(isZero(original)){
                ans.add(i);
            }
            original[s.charAt(i) - 'a'] ++;

        }

        return ans;
    }

    public static boolean isZero(int[] original){
        for(int num : original){
            if(num != 0) return false;
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parent string : ");
        String s = sc.next();
        System.out.println("Enter the string whose anagrams are to be checked : ");
        String p = sc.next();
        List<Integer> list = new ArrayList<>();
        list = findAnagrams(s , p);
        for(int i = 0 ; i < list.size() ; i++)
            System.out.print(list.get(i) + " ");
    }
}
