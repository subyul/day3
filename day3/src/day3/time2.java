package day3;
import java.util.Scanner;
public class time2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�ð��� �Է��ϼ���:");
	int H = sc.nextInt();
	
	System.out.println("���� �Է��ϼ���:");
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
