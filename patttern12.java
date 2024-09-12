public class Tommy{
    public static void main(String[] args){
        int n =5;
 
        // numbers
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
        
         // spaces
         int spaces = 2 * (n - i - 1); // Adjust spaces per row
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
        // numbers
        for(int j=i; j>=1; j--){
                System.out.print(j);
        }
        System.out.println();
        spaces = spaces-2;
}
}
}
