package ArrayInJava;

public class trappingRainWater {
    public static void calculateTrappingWater(int[] height, int width){
        int[] leftMax = new int[height.length]; // left Max Boundary
        int[] rightMax = new int[height.length]; // right max boundary
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        System.out.println("left Max boundary Array:");
        for(int j : leftMax){
            System.out.print("\t" + j);
        }
        System.out.println();
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i=height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        System.out.println("Right Max boundary Array:");
        for(int j : rightMax){
            System.out.print("\t" + j);
        }
        int trappedWater =0;
        for(int i=0 ; i<height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]) * width ;
        }
        System.out.println("\nTrapped rain Water =" + trappedWater);

    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5}; // height of every bar
        int width = 1; // width of each bar
        calculateTrappingWater(height, width);

    }
}
