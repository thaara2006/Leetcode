class Solution {
    public int dayOfYear(String date) {
        int d=Integer.parseInt(date.substring(8));
        int m=Integer.parseInt(date.substring(5,7));
        int y=Integer.parseInt(date.substring(0,4));
        int r=d;
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
            days[1] = 29;

        for (int i = 0; i < m - 1; i++)
            r += days[i];
        return r;
    }
}