package April;
import java.util.Scanner;

public class April_5_Container_with_most_water {
    public int maxArea(int[] height) {
         /*if(height.length == 2)
            return (height[0] * height[1]); */
        // Simple two pointer approach
        int i = 0 , j = height.length - 1;
        int max = 0;
        while(i < j){
            int chotta = height[i] < height[j] ? height[i] : height[j];
            int area = (j - i) * chotta;
            if(area > max){
                max = area;
            }
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the array : ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the height for each container : ");
        for(int i = 0 ; i < n ; i++){
            height[i] = sc.nextInt();
        }
        April_5_Container_with_most_water obj = new April_5_Container_with_most_water();
        System.out.println(obj.maxArea(height));
    }
}
