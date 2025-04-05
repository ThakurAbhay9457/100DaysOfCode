class Solution {
    public boolean halvesAreAlike(String s) {
        
        int n=s.length()/2;
        int midIdx=n;
        
        int count1=0,count2=0;
        for(int i=0;i<midIdx;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U'){
                count1++;
            }
            if(s.charAt(n)=='a' || s.charAt(n)=='e' || s.charAt(n)=='i'|| s.charAt(n)=='o' || s.charAt(n)=='u' || s.charAt(n)=='A'||s.charAt(n)=='E'||s.charAt(n)=='I'||s.charAt(n)=='O'||s.charAt(n)=='U'){
                count2++;
            }
            n++;

        }
        if(count1==count2){
            return true;
        }else{
            return false;
        }
    }
}
