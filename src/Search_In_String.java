import java.util.Scanner;
public class Search_In_String {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        String name = input.next();
        System.out.println("enter char to search");
        char target = input.next().charAt(0);
        boolean Present = Search(name,target);
        System.out.println(Present);


    }
    static boolean Search(String name ,char a){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==a){
                return true;
            }
        }
        return false;
    }
}
