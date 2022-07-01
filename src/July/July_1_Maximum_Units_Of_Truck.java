package July;

import java.util.Arrays;

public class July_1_Maximum_Units_Of_Truck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int row = boxTypes.length;
        int ans = 0, j = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        while(j < row && truckSize > 0){
            int maxi = Math.min(boxTypes[j][0], truckSize);
            ans = ans + maxi * boxTypes[j][1];
            j++;
            truckSize -= maxi;
        }
        return ans;
    }
}
