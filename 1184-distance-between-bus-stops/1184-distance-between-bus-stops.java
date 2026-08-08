class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=distance.length;
        int s1=0, s2=0;
        if(destination<start){
            for(int i=destination;i<start;i++){
                s1+=distance[i];
            }
            for(int i=0;i<destination;i++){
                s2+=distance[i];
            }
            for(int i=start;i<n;i++){
                s2+=distance[i];
            }
        }
        else{
            for(int i=start;i<destination;i++){
                s1+=distance[i];
            }
            for(int i=0;i<start;i++){
                s2+=distance[i];
            }
            for(int i=destination;i<n;i++){
                s2+=distance[i];
            }
        }
        System.out.println(s1+" "+s2);
        return Math.min(s1, s2);
        //return s1;
    }
}