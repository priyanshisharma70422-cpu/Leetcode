class Solution {
    public int[] replaceElements(int[] arr) {
        int[] copy=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
           int max=-1;
            for(int j=i+1;j<arr.length;j++){
                if (max<copy[j]){
                    max=copy[j];
                }          
            }
            arr[i]=max;
            
        }
        return arr;
        
    }
}