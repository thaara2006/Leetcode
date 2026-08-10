class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> h=new HashSet<>();
        for(List<String> p:paths){
            h.add(p.get(0));
        }
        for(List<String> p:paths){
            if(!h.contains(p.get(1))) return p.get(1);
        }
        return "";
    }
}