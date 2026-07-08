class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String s[]=new String[names.length];
        int h[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            h[i]=heights[i];
        }
        Arrays.sort(h);
        int k=0;
        for(int i=h.length-1;i>=0;i--){
            for(int j=0;j<heights.length;j++){
                if(heights[j]==h[i]){
                    s[k++]=names[j];
                }
            }
        }
        return s;
    }
}