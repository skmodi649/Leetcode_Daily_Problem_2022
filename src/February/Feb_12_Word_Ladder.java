package February;

import java.util.*;

public class Feb_12_Word_Ladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet();
        for (String word : wordList)
            set.add(word);
        if (!set.contains(endWord))
            return 0;
        Queue<String> queue = new LinkedList();
        queue.add(beginWord);
        int result = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] chArr = word.toCharArray();
                for (int j = 0; j < chArr.length; j++) {
                    char ch = chArr[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == chArr[j])
                            continue;
                        else {
                            chArr[j] = c;
                            String transformed = new String(chArr);
                            if (transformed.equals(endWord))
                                return result + 1;
                            if (set.contains(transformed)) {
                                set.remove(transformed);
                                queue.add(transformed);
                            }
                        }
                    }
                    chArr[j] = ch;
                }
            }
            result++;
        }
        return 0;
    }
}
