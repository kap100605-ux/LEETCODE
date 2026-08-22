class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum =0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        int t =n;
        int prod=1;
        while(t>0){
            int dig=t%10;
            prod*=dig;
            t=t/10;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}