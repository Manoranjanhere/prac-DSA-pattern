import java.util.*;
public class funpallin {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int a = sc.nextInt();
        pallin(a);
    }
    public static void pallin(int a)
    {
    int l, rev=0;
    int neww =a;
    while(neww>0)
    {
        l=neww%10;
        rev = rev*10+l;
        neww=neww/10;
    }
    if(rev==a){
        System.out.println("is pallindrome");
    }
    else{
        System.out.println("is not pallindrome");
    }
}
}
