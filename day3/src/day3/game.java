package day3;
import java.util.Scanner;
public class game {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1~99������ ������ �Է��ϼ���:");
	int num = sc.nextInt();
	
	if(num%10==3||num%10==6||num%10==9)
	{if(num/10==3||num/10==6||num/10==9)
	{System.out.println("�ڼ�¦¦");
	}
	else
	{System.out.println("�ڼ�¦");
	}
}
	else
	{System.out.println("3.6.9�� �ƴմϴ�");
}
}
}