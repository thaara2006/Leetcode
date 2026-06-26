class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        for(String l:logs){
            if(l.equals("../")){
                if(c>0) c--;
            }
            else if(!(l.equals("./"))) c++;
        }
        return c;
    }
}