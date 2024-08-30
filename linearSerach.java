import java.util.Scanner;
public class Main{
   static Scanner sc = new Scanner(System.in);
  public static int[] getArray(){
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter " +size+ " elements: ");
    for(int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static void  LS(int[] arr,int key){
    boolean found = false;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==key){
        System.out.println("Found element at index: "+i);
        found = true;
        break;
      }
      }
    if(!found){
      System.out.println("Not found");
    }
  }
  public static void main(String[] args){
     int[] arr =getArray();
    System.out.println("Enter the element to be searched:");
    int key = sc.nextInt();
    LS(arr,key);
  }
  }
