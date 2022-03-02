package March;

public class Mar_2_Is_Subsequence {
    public boolean isSubsequence(String s, String t) {

        /*
        if(s.length() == 1 && t.length() == 1){
            if(s.charAt(0) != t.charAt(0))
                return false;
            else
                return true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int index = t.indexOf(ch);
            if(!list.contains(index))
                list.add(index);
        }
        for(int j = 0 ; j < list.size() - 1; j++){
            if(list.get(j) >= list.get(j+1))
                return false;
        }
        return true;
    } */

        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
