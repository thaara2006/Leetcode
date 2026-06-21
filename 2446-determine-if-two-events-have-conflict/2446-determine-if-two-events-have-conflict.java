class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int s1 = toMin(event1[0]);
        int e1 = toMin(event1[1]);
        int s2 = toMin(event2[0]);
        int e2 = toMin(event2[1]);
        return s1<=e2 && s2<=e1;
    }
    public int toMin(String time) {
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3, 5));
        return h*60+m;
    }
}