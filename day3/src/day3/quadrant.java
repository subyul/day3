package day3;
import java.util.Scanner;
public class quadrant {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� x�� �Է��ϼ���:");
	int x = sc.nextInt();
	
	System.out.println("���� y�� �Է��ϼ���:");
	int y = sc.nextInt();
	
	if (x > 0)
	{ if (y > 0)
	{System.out.println("1");
	}
	else
	{System.out.println("4");
	}
	}
	else if(x < 0)
	{ if (y > 0)
		{System.out.println("2");
	}
	else
	{System.out.println("3");
	}
	}
	
}
}
