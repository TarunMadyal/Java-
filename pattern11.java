public class Tommy{
    public static void main(String[] args){
        int n =5;
        for(int i=0; i<n; i++){
            int start = (i%2==0)?1:0; 
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = (start ==1)?0:1;
            }
            System.out.println();
        }
}
}
