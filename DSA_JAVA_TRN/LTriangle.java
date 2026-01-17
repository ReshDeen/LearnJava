public class LTriangle {
    public static void main(String[] args)
    {
        int n=3;
        int i,j;

        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i+j>=n-1){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
            
                }


            }
            System.out.println();
        }

System.out.println();

        // inverted left triangle
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i+j<=n-1)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
    }

    // (0,0) (0,1) (0,2)
    // (1,0) (1,1) (1,2)
    // (2,0) (2,1) (2,2)
 
 System.out.println();

            // right triangle
            for(i=0; i<n; i++)
            {
                for(j=0; j<n; j++)
                {
                    if(j >= i)
                    {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

}
}
