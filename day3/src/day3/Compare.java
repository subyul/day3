package day3;
import java.util.Scanner;
public class Compare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("A를 입력하시오");
	int A = sc.nextInt();
	
	System.out.println("B를 입력하시오");
	int B = sc.nextInt();
	
	if (A > B)
	{ System.out.println(">");
	}
	else if (A < B)
	{ System.out.println("<");
	}
	else
	{ System.out.println("==");
	}
}
}
