import java.util.*;
public class Reverse
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int rev=0,rem;
while(a>0)
{
rem=a%10;
rev=rev*10+rem;
a=a/10;
}
System.out.println("Reverse of number:" +rev);
}
}