import java.util.Scanner;
 public class IT24103535Lab6Q1{
	 public static void main(String[]args){
		 double number;
		 double square;
		 double squareroot;
		  
		 Scanner input=new Scanner (System.in);
		 
		 System.out.print("Enter a number");
		 number=input.nextDouble();
		 
		 square= number*number;
		 squareroot=Math.sqrt(number);
		 
		 System.out.println("The square of"+number+"is"+square);
		 System.out.println("The squareroot of"+number+"is"+squareroot);
		 
		 
	 }
 }