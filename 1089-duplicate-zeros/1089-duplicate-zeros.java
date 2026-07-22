class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                int p=0,n=0;
                for(int j=i+1;j<arr.length;j++){
                    n=arr[j];
                    arr[j]=p;
                    p=n;
                }
                i++;
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}