class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > sec_largest && arr[i] != largest){
                sec_largest = arr[i];
            }
        }
        if(sec_largest == Integer.MIN_VALUE)
            return -1;
            
        return sec_largest;
    }
}
