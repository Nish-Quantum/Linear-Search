import java.util.Scanner;
import java.util.Arrays;
public class _5_SearchIn2DArray {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                {1,4,67,89,90},
                {34,67,87,45,67},
                {1,980,87},
                {1,2}
        };
        int target = input.nextInt();
        int[]ans= Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr,int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }





}
