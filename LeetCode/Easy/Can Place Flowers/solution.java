class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int count = 0;

        while(i<flowerbed.length){
            if(flowerbed[i]==1){
                i = i+2;
            }
            else{  //for [i]==0
            if((i==0||flowerbed[i-1]==0)&&
            (i==flowerbed.length-1||flowerbed[i+1]==0)){
                count++;
                i = i+2;
            }
                else{
                    i++;
                }
            }
        }
            
            if(count>=n)
            return true;

            return false;

            
        }
}
        
    
