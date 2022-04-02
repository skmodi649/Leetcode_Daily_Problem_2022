// Own algorithm to find the reverse of a string using in place algorithm

package April;

public class April_1_in_place_reverse_string {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
