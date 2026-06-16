class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int s1 = toMinutes(event1[0]);
        int e1 = toMinutes(event1[1]);
        int s2 = toMinutes(event2[0]);
        int e2 = toMinutes(event2[1]);
        return s1 <= e2 && s2 <= e1;
    }
    private int toMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        return hours * 60 + minutes;
    }
}