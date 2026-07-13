class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] st={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int d=0;
        for(int i=1;i<year;i++){
            if(i%400==0 || (i%4==0 && i%100!=0)) d+=366;
            else d+=365;
        }
        boolean l=false;
        if(year%400==0 || (year%4==0 && year%100!=0)) l=true;
        for(int i=1;i<month;i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) d+=31;
            else if(i==2 && l) d+=29;
            else if(i==2 && !l) d+=28;
            else d+=30;
        }
        return st[(d+day)%7];
    }
}