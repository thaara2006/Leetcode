class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            int f=hm.get(arr[i]);
            for(Map.Entry<Integer,Integer> m:hm.entrySet()){
                if(m.getKey()!=arr[i] && m.getValue()==f) return false;
            }
        }
        return true;
    }
}