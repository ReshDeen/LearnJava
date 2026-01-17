class amicable {
    public static void main(String[] args){
        int n=220;
        int n1=284;

        int sum1=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                // System.out.print("Divisor of n is "+i+" ");
                sum1=sum1+i;  
            }
            
        }
        int sum2=0;
        for(int i=1; i<n1; i++){
            if(n1%i==0){
                // System.out.print("Divisor of n is "+i+" ");
                sum2=sum2+i;  
            }
            
        }
        if(sum1==n1 && sum2==n  ){
            System.out.println("Amicable Number");
        }
    }
}