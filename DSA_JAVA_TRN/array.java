import java.util.Scanner;
public class array {
    public static void main(String[] args)
    {
        // method 1 to declare and initialize an array
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }


        // method

        int[] arr1= {10,12};
        System.out.print(arr1[0]);       
    
}
    
    

}
