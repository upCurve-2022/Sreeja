import java.util.*;
public class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int X=sc.nextInt();
int a=0,b=1,c;
System.out.print( b );
for(int i=1;i<X;i++)
{
c=a+b;
System.out.print( c );
a=b;
b=c;
}
}
}
