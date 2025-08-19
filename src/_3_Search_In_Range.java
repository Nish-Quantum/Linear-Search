import java.util.Scanner;
public class _3_Search_In_Range{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("size");
        int n = input.nextInt();
        System.out.println("elements");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("target");
        int target = input.nextInt();
        boolean answer = Present(arr,n,1,5);
        System.out.println(answer);
    }
    static boolean Present(int[] arr,int n,int start,int end){
        boolean present = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                present =true;
            }
        }
        return present;
    }
}