package day3;
import java.util.Scanner;
public class Compare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("A�� �Է��Ͻÿ�");
	int A = sc.nextInt();
	
	System.out.println("B�� �Է��Ͻÿ�");
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
