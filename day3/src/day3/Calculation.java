package day3;
import java.util.Scanner;
public class Calculation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println();
	int A = sc.nextInt();
	
	System.out.println();
	int B = sc.nextInt();
	
	int sum = A + B;
	int minus = A - B;
	int mult = A * B;
	int divide = A / B;
	int remainder = A % B;
	
	System.out.println(sum);
	System.out.println(minus);
	System.out.println(mult);
	System.out.println(divide);
	System.out.println(remainder);
	
	

}

}
