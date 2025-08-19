import java.util.Scanner;
public class _4_Minimum_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("size");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("elements");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min is "+min);





    }
}
