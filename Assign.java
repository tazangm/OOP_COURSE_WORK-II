import java.util.Scanner;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner scn =new Scanner(System.in);
System.out.print("1 ");
int num =scn.nextInt();
System.out.print(" 2");
int num2=scn.nextInt();
int sum = num +num2;
System.out.print("sum of numbers;"+sum);*/

System.out.print("Enter a mark");
Scanner k=new Scanner(System.in);

  int m= k.nextInt();
       if((m>80)&&(m<=100)){
	       System.out.print("Student has:A");
	       
	return;
       }
     if((m>=75)&&(m<=79)){
	       System.out.print("Student has:B+");
	return;
     }
	
	 if((m>=70)&&(m<=74)){
	       System.out.print("Student hasB");
	return;
	 }
	 if((m>=65)&&(m<=69)){
	       System.out.print("Student has:C+");
	return;
	 }
	 if((m>=60)&&(m<=64)){
	       System.out.print("Student has:C");
	return;
	
	 }
	 if((m>=55)&&(m<=59)){
	       System.out.print("Student has:D+");
	       
	return;
       }
	 if((m>=50)&&(m<=54)){
	       System.out.print("Student has:D");
	return;
	 
       }
	 if((m>=40)&&(m<=49)){
	       System.out.print("Student has:F");
	return;
	}
	 else System.out.print("No student");
	 return;
}
}