class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> result=new HashSet<>();
        for(int x:nums){
            result.add(x);
        }
        int max=0;
        for(int x:result){
            if(!result.contains(x-1)){
                int count=1;
                int current=x;
                while(result.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
        
    }
}