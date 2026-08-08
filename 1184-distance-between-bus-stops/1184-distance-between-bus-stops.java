class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=distance.length;
        int rev=0, frw=0;
        int t=0;
        for(int i=0;i<n;i++){
            t+=distance[i];
        }
        if(destination<start){
            for(int i=destination;i<start;i++){
                rev+=distance[i];
            }
            frw=t-rev;
        }
        else{
            for(int i=start;i<destination;i++){
                frw+=distance[i];
            }
            rev=t-frw;
        }
        
        System.out.println(frw+" "+rev);
        return Math.min(frw, rev);
    }
}