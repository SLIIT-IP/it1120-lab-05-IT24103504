import java.util.Scanner;
public class IT24103504Lab5Q2{
public static void main(String[] args){
 
Scanner input= new Scanner(System.in);
String prize;
int members;
 
System.out.print("Enter the number of new members introduced: ");
members=input.nextInt();

if(members>=0)
  switch(members)
 {
  case 0:System.out.print("No prize");
  break;
  case 1:System.out.print("prize is:Pen");
  break;
  case 2:System.out.print("prize is: Umbrella");
  break;
  case 3:System.out.print("prize is:Bag");
  break;
  case 4:System.out.print("prize is:Travelling chair");
  break;
  case 5:System.out.print("prize is:Headphone");
  break;
  default:System.out.print("prize is:Headphone");
  }
}
}