class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                res.add(i+1);
            }
        }
        return res;
        
    }
}