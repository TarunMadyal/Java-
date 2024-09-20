public class Recursion{
    public static void printName(int i, int n){
        if(i<n){
            return;
        }
        printName(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        printName(5,0);
    }
}
