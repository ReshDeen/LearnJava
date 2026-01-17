class orthomorphic{
    public static void main(String[] args){
        int n=76;
        int sqrt= n*n;

//         // int res= n%10;
//         // System.out.println(res);

//         int sum=(sqrt+sqrt);    
// 0        System.out.pintln(sum%10);
        
        int digit=0, temp=n;
        while(temp>0){
            digit++;
            temp=temp/10;
        }

        int pow=1;
        for(int i=1; i<=digit; i++){
            pow=pow*10;
        }
        if(n==sqrt%pow){
            System.out.println("Orthomorphic"); 

        

        }
    }
}