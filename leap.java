import java.util.Scanner;
class leap

{
public static void main(String args[])
{
int n=2026;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%4==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
}}