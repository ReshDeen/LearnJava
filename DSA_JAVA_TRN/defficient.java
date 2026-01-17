public class defficient {
    public static void main(String[] args){
        int n=24;
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                System.out.println("Divisor of n is "+i+" ");
                sum=sum+i;  
            }       
        }
    System.out.println("Sum of n divisor "+sum+" ");

    if(sum<n){
        System.out.println("Defficient Number");
    }
    else if(sum>n){
        System.out.print("Abudant Number");
    }
    else{
        System.out.print("Perfect Number"); 
    }

}}
    
    

