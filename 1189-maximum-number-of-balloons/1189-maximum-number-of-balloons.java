class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(isB(c)){
                m.put(c,m.getOrDefault(c,0)+1);
            }
        }
        int co=0;
        while(true){
            if(m.getOrDefault('b',0)>=1 && m.getOrDefault('a',0)>=1 && m.getOrDefault('l',0)>=2 && m.getOrDefault('o',0)>=2 && m.getOrDefault('n',0)>=1){
                m.put('b', m.get('b')-1);
                m.put('a', m.get('a')-1);
                m.put('l', m.get('l')-2);
                m.put('o', m.get('o')-2);
                m.put('n', m.get('n')-1);
                co++;
            }
            else break;
        }
        return co;
    }
    public boolean isB(char c){
        return c=='b' || c=='a' || c=='l' || c=='o' || c=='n';
    }
}