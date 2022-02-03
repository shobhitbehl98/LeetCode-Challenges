public int nthMagicalNumber(int n, int a, int b) {
    long lo=Math.min(a,b);
    long hi=lo*n;
    long g=((a*b)/gcd(a,b));
    
    while(lo<hi){
        long mid=(lo+((hi-lo)/2));
        long s=((mid/a)+(mid/b)-(mid/g));
        if(s<n){
            lo=mid+1;
        }else{
            hi=mid;
        }
    }
    long ans=(lo%1000000007);
    return (int)(ans);
}

public int gcd(int a,int b){
    if(b==0){
        return a;
    }
    
    return gcd(b,a%b);
}