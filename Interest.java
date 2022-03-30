import java.util.*;
public class Interest{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int t=sc.nextInt();
int r=sc.nextInt();
float simple;
simple=(p*t*r)/100;
System.out.println("simpleInterest=" +simple);
}
}