package day3;
import java.util.Scanner;
public class jungsu2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력 :");
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	if((A>B&&B>C)||(C<B&&B<A))
	{System.out.println("중간 값은" +B);
	}
	else if((C>A&&A>B)||(B<A&&A<C))
	{System.out.println("중간 값은" +A);
	}
	else if((A>C&&C>B)||(C<B&&B>A))
	{System.out.println("중간 값은" +C);
}
}
}

