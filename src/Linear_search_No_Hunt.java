import java.util.Scanner;
public class Linear_search_No_Hunt{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("size of the array");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter target");
        int target = input.nextInt();
        int ans = Linear(arr,target);
        System.out.println(ans);
    }
    static int Linear(int[] arr ,int a){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return arr[i];
            }
        }
        return -1;//nothing in block executes after return ,if not (if case or for case ,this returns -1)
    }
}