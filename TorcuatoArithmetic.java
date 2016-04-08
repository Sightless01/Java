/**
 * PreLabAct01: Incomplete solution (modular approach)
 *     Complete the body of the other methods
 *     to make this program FULLY functional.
 */

import java.util.Scanner;

public class TorcuatoArithmetic {

public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   byte choice = 0;
   while (choice != 5) {
      showMenu();
      choice = readChoice((byte) 1, (byte) 5);
      performCalculation(choice);
      System.out.print("\nPress enter to continue...");
      kbd.nextLine();
   }
   System.exit(0);  // optional
}

 public static void showMenu() {
 	System.out.println();
 	System.out.println("What do you want to do?");
 	System.out.println("\t1> Add\n\t2> Subtract\n\t3> Multiply\n\t4> Divide\n\t5> Quit");
 	System.out.print("Enter the number corresponding to your choice: ");
 	return;
 }

 public static byte readChoice(byte lLimit, byte uLimit) {
    Scanner kbd = new Scanner(System.in);
    byte cho = 0;
    do {
       cho = Byte.parseByte(kbd.nextLine());
       if ((cho < lLimit) || (cho > uLimit)) {
          System.out.println("Invalid choice! Enter a number in the range " + lLimit + " to " + uLimit + ".");
     	  System.out.print("\nPress enter to continue...");
     	  kbd.nextLine();
          showMenu();
       }
    } while (cho < lLimit || cho > uLimit);
 	return cho;
 }

 public static double add(double n1, double n2) {
    return n1 + n2;
 }

 public static double subtract(double n1, double n2) {
    return n1 - n2;
 }

 public static double multiply(double n1, double n2) {
    return n1 * n2;
 }

 public static double divide(double n1, double n2) {
    return n1 / n2;
 }

 public static void performAdd() {
 	Scanner kbd = new Scanner(System.in);
 	double a1 = 0, a2 = 0;
 	System.out.print("Enter the first addend: ");
 	a1 = Double.parseDouble(kbd.nextLine());
 	System.out.print("Enter the second addend: ");
 	a2 = Double.parseDouble(kbd.nextLine());
 	System.out.println("Sum = " + add(a1, a2));
 	return;  // this statement can be deleted (optional)
 }

 public static void performSubtract() {
 	Scanner kbd = new Scanner(System.in);
 	double a1 = 0, a2 = 0;
 	System.out.print("Enter the minuend: ");
 	a1 = Double.parseDouble(kbd.nextLine());
 	System.out.print("Enter the subtrahend: ");
 	a2 = Double.parseDouble(kbd.nextLine());
 	System.out.println("Difference = " + subtract(a1, a2));

 }

 public static void performMultiply() {
 	Scanner kbd = new Scanner(System.in);
 	double a1 = 0, a2 = 0;
 	System.out.print("Enter the multiplicand: ");
 	a1 = Double.parseDouble(kbd.nextLine());
 	System.out.print("Enter the multiplier: ");
 	a2 = Double.parseDouble(kbd.nextLine());
 	System.out.println("Product = " + multiply(a1, a2));
 }

 public static void performDivide(){
  	Scanner kbd = new Scanner(System.in);
 	double a1 = 0, a2 = 0;
 	System.out.print("Enter the dividend: ");
 	a1 = Double.parseDouble(kbd.nextLine());
 	System.out.print("Enter the divisor: ");
 	a2 = Double.parseDouble(kbd.nextLine());
 	System.out.println("Quotient = " + divide(a1, a2));
 }

 public static void performCalculation(byte choice) {
 	switch (choice) {
 	  case 1:
 	     performAdd();
 	     break;
 	  case 2:
 	  	 performSubtract();
 	  	 break;
 	  case 3:
	  	 performMultiply();
	  	 break;
 	  case 4:
 	  	 performDivide();
 	  	 break;
 	  case 5:
 	  	 System.out.println("Thank you for using the program.");
 	}
 }

}