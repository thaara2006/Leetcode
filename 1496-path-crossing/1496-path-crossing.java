class Solution {
    public boolean isPathCrossing(String path) {
        List<String> l=new ArrayList<>();
        l.add("0,0");
        int i=0, j=0, k=0;
        while(k<path.length()){
            if(path.charAt(k)=='N') i++;
            else if(path.charAt(k)=='E') j++;
            else if(path.charAt(k)=='W') j--;
            else if(path.charAt(k)=='S') i--;
            String s=String.valueOf(i)+","+String.valueOf(j);
            l.add(s);
            for(int p=0;p<l.size()-1;p++){
                if(l.get(l.size()-1).equals(l.get(p))) return true;
            }
            k++;
        }
        return false;
    }
}