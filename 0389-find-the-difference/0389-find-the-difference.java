class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e:m2.entrySet()){
            char c=e.getKey();
            if(m1.getOrDefault(c,0)!=e.getValue()) return c;
        }
        return ' ';
    }
}