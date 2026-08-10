class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> m=new HashMap<>();
        for(List<String> p:paths){
            m.put(p.get(0), p.get(1));
        }
        String curr=paths.get(0).get(0);
        while(m.containsKey(curr)){
            curr=m.get(curr);
        }
        return curr;
    }
}