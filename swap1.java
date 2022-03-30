import java.util.*;
public class Swap1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
a=a+b+c;
b=a-(b+c);
c=a-(b+c);
a=a-(b+c);
System.out.println("a=" +a);
System.out.println("b=" +b);
System.out.println("c=" +c);
}
}