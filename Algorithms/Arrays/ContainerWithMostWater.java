class ContainerWithMostWater {
    public int maxArea(int[] height) {
        
        //Initializing area, left pointer and right pointer
        int area = 0, left = 0, right = height.length - 1;
        
        //Loop until left is less than right
        while(left < right){
            
            //Maximum area will be lesser array value * right - left
            if(height[left] < height[right]){
                area = Math.max(area, height[left] * (right - left));
                left++;
            }else{
                area = Math.max(area, height[right] * (right - left));
                right--;
            }
        }
        
        //return result
        return area;
    }
}
