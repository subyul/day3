package day3;
import java.util.Scanner;
public class jungsu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("2�ڸ� ������ �Է��ϼ���:");
	int num = sc.nextInt();
	
	
	int ten = num/10;
	int il = num % 10;
	
	if (ten == il)
	{System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
	}
	else
	{System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
}

}
}
