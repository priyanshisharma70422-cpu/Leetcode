import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            boolean check=true;
            for(int j=0;j<candies.length;j++){
                if((candies[i]+extraCandies)<candies[j]){
                    check=false;
                }
            }
            result.add(check);
        }
        return result;
        
    }
}