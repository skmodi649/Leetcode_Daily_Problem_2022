/** Approach :
        sort both horizontal as well as verticalcuts arrays
        compute the maxx and maxy for finding which pair of horizontal and vertical cut gives us maximum area
        return maxX *  maxY for returning area */

package July;

import java.util.Arrays;

public class July_2_Maximum_Area {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxHorizontal = horizontalCuts[0], maxVertical = verticalCuts[0];
        for (int i = 1; i < horizontalCuts.length; i++) {
            maxHorizontal = Math.max(maxHorizontal, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        maxHorizontal = Math.max(maxHorizontal, h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            maxVertical = Math.max(maxVertical, verticalCuts[i] - verticalCuts[i - 1]);
        }
        maxVertical = Math.max(maxVertical, w - verticalCuts[verticalCuts.length - 1]);
        return (int) ((long) maxHorizontal * (long)maxVertical % 1000000007L);
    }
}
