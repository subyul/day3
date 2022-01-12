package day3;
import java.util.Scanner;
public class jungsu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("2자리 정수를 입력하세요:");
	int num = sc.nextInt();
	
	
	int ten = num/10;
	int il = num % 10;
	
	if (ten == il)
	{System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
	}
	else
	{System.out.println("10의 자리와 1의 자리가 다릅니다.");
}

}
}
