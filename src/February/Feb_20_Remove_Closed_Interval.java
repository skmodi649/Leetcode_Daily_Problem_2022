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
        int row = intervals .length;
        boolean[] check = new boolean[row];
        for(int i = 0; i < row ;i++){
            if(!check[i]){
                for(int j = i + 1;j < row ; j++){
                    if(!check[j]){
                        if(intervals[i][0]<=intervals[j][0] && intervals[j][1]<=intervals[i][1]){
                            check[j] = true;
                        }
                        else if(intervals[i][0]>=intervals[j][0] && intervals[j][1]>=intervals[i][1]){
                            check[i] = true;
                        }
                    }
                }
            }
        }
        int count = 0;
        for(int a = 0 ; a < check.length ; a++){
            if(!check[a])
                count++;
        }
        System.out.println(count);
    }
}
