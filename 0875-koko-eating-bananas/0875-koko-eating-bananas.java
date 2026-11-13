class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int ans = 0;
        for(int i = 0; i<piles.length ; i++){
            high = Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
        if(isItPossible(piles, mid, h)==true){
            ans = mid;
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
        }
        return ans;
    }

    public static boolean isItPossible(int piles[], int phs, int h){
        int time = 0;
        for(int i = 0; i< piles.length ; i++){
            if(piles[i]<=phs){
                time += 1;
            }

            else{
                if(piles[i]%phs == 0){
                    time += piles[i]/phs;
                }
                else{
                    time += piles[i]/phs + 1;
                }
            }
            if(time>h){
                return false;
            }
        }
        return true;
    }
}