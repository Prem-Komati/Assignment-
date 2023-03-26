import java.util.Scanner;
class posnegzero
{
public static void main(String args[])
{
int n;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n==0)
{
System.out.println("number is zero");
}
else if(n>0)
{
System.out.println("Positive number");
}
else
{
System.out.println("negative number");
}
}}