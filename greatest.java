import java.util.Scanner;
class greatest
{
public static void main(String args[])
{
int a=10,b=23,c=16;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println(a);
}
else if(b>c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}}}