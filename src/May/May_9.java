package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class May_9 {
    static void printStrings(String phNo, int i,
                             HashMap<Character, String> hm,
                             StringBuilder str, List<String> list)
    {
        // If all digits are processed, print output
        // string
        if (i == phNo.length())
        {
            list.add(str.toString());
            return;
        }

        // Get current digit of phNo, and recur for all
        // characters that can be used to dial it.
        String s = hm.get(phNo.charAt(i));
        for (int j = 0; j < s.length(); j++)
        {
            str.append(s.charAt(j));
            printStrings(phNo, i+1, hm, str, list);
            str.deleteCharAt(str.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0)
            return list;
        HashMap<Character , String> hash = new HashMap<>();
        hash.put('2',"abc");
        hash.put('3',"def");
        hash.put('4',"ghi");
        hash.put('5',"jkl");
        hash.put('6',"mno");
        hash.put('7',"pqrs");
        hash.put('8',"tuv");
        hash.put('9',"wxyz");
        StringBuilder str = new StringBuilder();
        printStrings(digits , 0 , hash , str , list);
        return list;
    }
}
