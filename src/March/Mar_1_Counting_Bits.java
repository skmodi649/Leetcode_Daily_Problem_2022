package March;

public class Mar_1_Counting_Bits {
    public static int oneNumber(int num){
        int count = 0;
        while(num > 0){
            if(num % 2 == 1)
                count++;
            num = num / 2;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0 ; i < n+1 ; i++){
            ans[i] = oneNumber(i);
        }
        return ans;
    }
}
