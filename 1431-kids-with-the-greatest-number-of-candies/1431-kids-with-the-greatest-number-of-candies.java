class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            boolean check=true;
            for(int j=0;j<candies.length;j++){
                if((candies[i]+extraCandies)<candies[j]){
                    check=false;
                    break;
                }
            }
            result.add(check);
        }
        return result;

        
    }
}