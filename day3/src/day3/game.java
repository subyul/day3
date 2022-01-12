package day3;
import java.util.Scanner;
public class game {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1~99사이의 정수를 입력하세요:");
	int num = sc.nextInt();
	
	if(num%10==3||num%10==6||num%10==9)
	{if(num/10==3||num/10==6||num/10==9)
	{System.out.println("박수짝짝");
	}
	else
	{System.out.println("박수짝");
	}
}
	else
	{System.out.println("3.6.9가 아닙니다");
}
}
}