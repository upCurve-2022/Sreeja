import java.util.*;
public class Amstrong
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int sum=0,rem;
int temp=n;
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==temp)
{
System.out.println("Amstrong number");
}
else
{
System.out.println("Not a Amstrong number");
}
}
}
