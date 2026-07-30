class Solution {
    public int numDifferentIntegers(String word) {
        StringBuilder sb=new StringBuilder(word);
        for(int i=0;i<word.length();i++){
            if(!Character.isDigit(word.charAt(i))){
                sb.replace(i,i+1," ");
            }
        }
        word=sb.toString().trim();
        if(word.equals("")) return 0;
        String s[]=word.split("\\s+");
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length;i++){
            if(!s[i].isEmpty())
                hm.put(zeros(s[i]),hm.getOrDefault(zeros(s[i]),0)+1);
        }
        return hm.size();
    }
    public String zeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0')
            i++;
        return s.substring(i);
    }
}