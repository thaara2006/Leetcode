class Solution {
    public int smallestNumber(int n) {
        String b=Integer.toBinaryString(n);
        return (int)Math.pow(2,b.length())-1;
    }
    //     for(int i=n;i<=2000;i++){
    //         String b=toBin(i);
    //         boolean fb=true;
    //         for(int j=0;j<b.length();j++){
    //             if(b.charAt(j)=='0') {
    //                 fb=false;
    //                 break;
    //             }
    //         }
    //         if(fb) return i;
    //     }
    //     return 0;
    // }
    // private String toBin(int n){
    //     StringBuilder s=new StringBuilder();
    //     while(n>0){
    //         s.append(n%2);
    //         n/=2;
    //     }
    //     return s.reverse().toString();
    // }
}