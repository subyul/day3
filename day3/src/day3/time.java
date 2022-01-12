package day3;
import java.util.Scanner;
public class time {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("시간을 입력하세요:");
	int H = sc.nextInt();
	
	System.out.println("분을 입력하세요:");
	int M = sc.nextInt();

	int Min = H*60 + M;
	
	int min2 = Min - 45;
	int H2 = min2 / 60;
	int M2 = min2 % 60;
	
	System.out.println(H2);
	System.out.println(M2);
	
	

}

}
