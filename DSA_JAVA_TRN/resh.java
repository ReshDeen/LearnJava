public class resh {
    public static void main(String[] args){
        int n=5;
        int i,j;
        for( i=0; i<n; i++){
            
            // R
            for( j=0; j<n; j++){
                if(i==0 || j==0 || i==2 || (j>=n-1 && i==1) || (i==n-2 && j==n-3) || (i==n-1 && j==n-2) || (i==n-1 && j==n-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
             
            // K
            for(j=0; j<n; j++){
                if(j==0 || (i==0 && j==3) || (i==0 && j==4) || (i==1 && j==2) || (i==2 && j==1) || (i==3 && j==2) || (i==4 && j==3) || (j==4 && i==4)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.print("  ");
        

            //M 
            for(j=0; j<n; j++){
                if(j==0 || (i==1 && j==1) || (i==2 && j==2) || (i==1 && j==3) || j==n-1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.print("  ");


            // for HEART
            for(j=0; j<n; j++){
                if((i==0 && j==1) || (i==0 && j==3) || (i==1 && j==0) || (i==1 && j==2) || (i==1 && j==4) || (i==2 && j==0) || (i==2 && j==4) || (i==3 && j==1) || (i==3 && j==3) || (i==4 && j==2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            
            // R
            for( j=0; j<n; j++){
                if(i==0 || j==0 || i==2 || (j>=n-1 && i==1) || (i==n-2 && j==n-3) || (i==n-1 && j==n-2) || (i==n-1 && j==n-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.print("  ");


            // B
            for( j=0; j<n; j++){
                if((i==0 && j!=n-1) || j==0 || (i==2 && j!=4) || (i==1 && j==n-1) || (i==n-2 && j==n-1) || (i==n-1 && j!=4)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
  

}}