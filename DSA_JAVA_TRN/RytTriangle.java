public class RytTriangle {
    public static void main(String[] args){
        int n = 3; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {   // "i == j" part is redundant
                    System.out.print("*"); // stay on same line
                }
            }
            System.out.println(); // new line after each row
        }
    }
}
