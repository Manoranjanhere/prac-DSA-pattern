import java.util.*;
public class funiseven {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
    public static boolean isEven(int a)
    {
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
