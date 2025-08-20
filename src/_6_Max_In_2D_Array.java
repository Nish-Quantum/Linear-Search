public class _6_Max_In_2D_Array {
    public static void main(String args[]){
        int[][] arr={
                {23,890,-90,567},
                {12,345,9999},
                {12,67895}
        };
        int ans = Max(arr);
        System.out.println("max="+ans);
    }
    static int Max(int[][] arr) {
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
