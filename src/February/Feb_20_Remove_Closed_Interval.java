package February;

import java.util.Arrays;
import java.util.Scanner;

public class Feb_20_Remove_Closed_Interval {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 2 ; j++){
                intervals[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(intervals,
                (a,b)->(a[0]==b[0]?b[1]-a[1]:a[0]-b[0]));
        int max=intervals[0][1];
        int count=1;

        for(int i=1;i<intervals.length;i++){
            if(max<intervals[i][1] ){
                count++;
                max=intervals[i][1];
            }
        }
        System.out.println(count);
    }
}
