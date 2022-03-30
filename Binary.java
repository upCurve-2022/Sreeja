import java.util.*;
public class Binary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int first,last,mid,key,n;
n=sc.nextInt();
int[] arr= new int[100];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
key=sc.nextInt();
first=0;
last=n-1;
mid=(first+last)/2;
while(first<=last)
{
if(arr[mid]==key)
{
System.out.println("key is found");
break;
}
else if(arr[mid]>key)
{
last=mid-1;
}
else if(arr[mid]<key)
{
first=mid+1;
mid=(first+last)/2;
}
}
if(first>last)
System.out.println("key is not found");
}
}
