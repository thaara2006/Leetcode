class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean b=false, h=false;
        long l=length, w=width, he=height;
        long v=l*w*he;
        if((v>=1000000000)||(length>=10000 || width>=10000 || height>=10000 || mass>=10000)) b=true;
        if(mass>=100) h=true;
        if(b && !h) return "Bulky";
        else if(h && !b) return "Heavy";
        else if(b && h) return "Both";
        return "Neither";

    }
}