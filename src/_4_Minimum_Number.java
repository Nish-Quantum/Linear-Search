import java.util.Scanner;
public class _4_Minimum_Number{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        int ans = min(arr);
        System.out.println("min = " + ans);

    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                arr[i]=min;
            }
        }
        return min;
    }




}
