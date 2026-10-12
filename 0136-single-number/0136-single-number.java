class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for(int x:nums){
            frequency.put(x,frequency.getOrDefault(x,0)+1);
        }
        for(int x:nums){
            if(frequency.get(x)==1){
                return x;
            }
        }
        return -1;

        
    }
}