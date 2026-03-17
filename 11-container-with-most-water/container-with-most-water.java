class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp= height.length-1;
        int max=0;
        while(lp<rp){
            int wid = (rp-lp);
            int hgt= Math.min(height[lp] ,height[rp]);
            int area= wid* hgt;
            max= Math.max(area ,max);
            if(height[lp] < height[rp]) lp++;
            else rp--;
        }
        return max;
    }
}