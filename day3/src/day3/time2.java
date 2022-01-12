package day3;
import java.util.Scanner;
public class time2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("시간을 입력하세요:");
	int H = sc.nextInt();
	
	System.out.println("분을 입력하세요:");
	int M = sc.nextInt();
	
	if (M < 30)
	{ H -= 1;
	M = 60-(45-M);
	
	System.out.println(H);
	System.out.println(M);
	}
	else
	{ M = 60-(45-M);
	System.out.println(H);
	System.out.println(M);
	}
}
}
