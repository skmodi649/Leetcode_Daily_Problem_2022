package March;

import java.util.HashSet;
import java.util.List;

public class Mar_10_Word_Break {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Using the concept of finding the starting index of the substring that matches the words present
        // in the dictionary given
        HashSet<String> hash = new HashSet<>();
        for(String word : wordDict) {
            hash.add(word);
        }

        int[] arr = new int[s.length()];
        int i=0;
        while(i<s.length()) {

            int start = 0;

            while(start<=i) {

                String subWord = s.substring(start,i+1);
                if(hash.contains(subWord)) {
                    if(start == 0 || arr[start - 1] == 1) {
                        arr[i] = 1;
                        break;
                    }
                }

                start++;
            }

            i++;
        }

        return arr[s.length()-1] == 1? true: false;
    }
}
