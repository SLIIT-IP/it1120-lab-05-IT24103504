import java.util.Scanner;
public class IT24103504Lab5Q3{
public static void main(String[] args){
 
//constant
final int RMCHARGE_DAY =48000;
final int DISCOUNT_3TO_4 =10;
final int DISCOUNT_4_MORE =20;
int strdate;
int endate;
int days;
int discountrate=0;
double tamount;
double disamount=0;

Scanner input=new Scanner(System.in);

System.out.print("Enter start date(1-31): ");
strdate=input.nextInt();
if(strdate>=1 && strdate<=31)
{
  System.out.print("Enter the end date(1-31): ");
  endate=input.nextInt();

  if(endate>=1 && endate<=31)
    {
             if(strdate < endate){
              days=endate-strdate;  
              System.out.println("Room Charge Per Day : "+RMCHARGE_DAY);
              System.out.println("Number of Days Reserved: "+days);

                if(days<3){
                 disamount=RMCHARGE_DAY*days*0;

                 } else if(days>=3 || days<=4){
                 disamount=RMCHARGE_DAY*days*DISCOUNT_3TO_4/100;

                 }if(days>=5 ||days<=4){
                  disamount=RMCHARGE_DAY*days*DISCOUNT_4_MORE/100;
}
             tamount=RMCHARGE_DAY*days-disamount;
             System.out.print("Discount Amountis: "+disamount);
             System.out.print("Total amount to be paid: "+tamount);
             }
                   else {
                   System.out.println("Invalid: Start Date must be less than End Date.");}
             
             } else {
             System.out.println("Invalied End Date");
                    
         }
         }else {
         System.out.println("Invalied start Date");
          }   
 }

}
             
             


        
 
              