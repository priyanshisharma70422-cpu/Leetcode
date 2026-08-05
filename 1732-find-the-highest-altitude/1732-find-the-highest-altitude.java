class Solution {
    public int largestAltitude(int[] gain) {
        int[] result=new int[gain.length+1];
        int k=0;
        result[k]=0;
        k++;
        
        int sum=0;
        for(int i=0;i<gain.length;i++){
            result[k]=sum+gain[i];
            sum=result[k];
            k++;   
        }
        int max=result[0];
        for(int i=1;i<gain.length+1;i++){
            if(result[i]>max){
                max=result[i];
            }
        }
        return max;
        
    }
}