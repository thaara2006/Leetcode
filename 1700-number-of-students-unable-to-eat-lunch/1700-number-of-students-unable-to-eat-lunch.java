class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer> st=new ArrayList<>();
        for(int i=0;i<students.length;i++){
            st.add(students[i]);
        }
        List<Integer> sw=new ArrayList<>();
        for(int i=0;i<sandwiches.length;i++){
            sw.add(sandwiches[i]);
        }
        int i=0,k=0;
        while(i<st.size()){
            if(st.get(0)==sw.get(0)){
                st.remove(0);
                sw.remove(0);
                i=0;
            }
            else{
                st.add(st.remove(0));
                i++;
                if(i>=st.size()) return st.size();
            }
        }
        return 0;
    }
}