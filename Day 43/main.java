class Solution {
    public int secondHighest(String s) {
        int max=-1,secmax=-1,n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch-'0'>=0 && ch-'0'<=9){
                int k=ch-'0';
                if(k>max){
                    secmax=max;
                    max=k;
                }
                if(k<max && k>secmax){
                    secmax=k;
                }
            }
        }
        return (secmax>=0)?secmax:-1;
    }
}