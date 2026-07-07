class Solution {
    public long sumAndMultiply(int n) {
        long sum=0, x=0, t=0;
        String s=String.valueOf(n);
        char c[]=s.toCharArray();
        //Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            if(c[i]!='0'){
                long d=c[i]-'0'; 
                x=x*10+d;
                sum+=d;
            }
        }/*
        if(sum>0){
            while(sum>0){
                long co=sum;
                long r=co%10;
                t+=r;
                co/=10;
            }
        }*/
        return x*sum;
    }
}