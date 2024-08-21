import java.util.Scanner;
public class IT24103504Lab5Q1{
public static void main(String[] args){
 
 Scanner input= new Scanner(System.in);
 int num1;
 int num2;
 int num3;
 int max;
 int min;
 

System.out.print("Enter the first integer: ");
num1=input.nextInt();

System.out.print("Enter the second integer: ");
num2=input.nextInt();

System.out.print("Enter the third integer: ");
num3=input.nextInt();

min=num1;
if(num2<min)
{
 min=num2;

}

if(num3<min)
{  min=num3;

}
max=num1;
if(num2>max)
{
  max=num2;
}
if(num3>max)
{
 max=num3; 
}

System.out.println("user entered numbers are:  "+num1+" "+num2+" "+num3+" ");
System.out.println("The smallest number is: "+min);
System.out.println("The largest number is: "+max);
}
}