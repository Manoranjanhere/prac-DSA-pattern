import java.util.*;
public class funavg {
    public static Double avg(Double n1,Double n2,Double n3)
    {
        return((n1+n2+n3)/3);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        System.out.println(avg(a,b,c));
    }
 
}
