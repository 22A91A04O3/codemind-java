import java.util.Scanner;
public class trio
{
    public static void main(String args[])throws Exception
    {
        int a,b,c;
        float area,s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
        sc.close();
        
    }
}