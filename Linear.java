import java.util.*;
public class Linear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int key,n,flag=0;
n=sc.nextInt();
int[] arr= new int[100];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
key=sc.nextInt();
for(int i=0;i<n;i++)
{
if(arr[i]==key)
{
 flag=1;
}}

if(flag==1)
{
System.out.println("key is found");
}
else
{
System.out.println("key is not a found");
}
}
}
