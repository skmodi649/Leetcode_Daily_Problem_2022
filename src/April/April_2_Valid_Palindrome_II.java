// Given a string s, return true if the s can be palindrome after deleting at most one character from it.


package April;

public class April_2_Valid_Palindrome_II {
    public boolean validPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while(lo < hi && s.charAt(lo) == s.charAt(hi)){
            lo++;
            hi--;
        }
        return check(s, lo + 1, hi) || check(s, lo, hi - 1);
    }

    private boolean check(String s, int lo, int hi){
        while(lo < hi && s.charAt(lo) == s.charAt(hi)){
            lo++;
            hi--;
        }
        return lo >= hi;
    }
}
