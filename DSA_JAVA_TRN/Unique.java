public class Unique {
    public static void main(String[] args){
        String str="PAYPAL IS HIRING";
        Boolean[] seen= new Boolean[256];

        Boolean allUnique=true;

        for(int i=0; i<str.length(); i++){
            int val=str.charAt(i);
            if(seen[val]==true){
                allUnique=false;
                break;
            }
            seen[val]=true;
        }
        
        if(allUnique){
            System.out.println("All characters are unique");
        }
        else{
            System.out.println("All characters are not unique");
        }}

    }
