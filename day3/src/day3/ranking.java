package day3;
import java.util.Scanner;
public class ranking {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("시험점수를 입력하세요:");
	int score = sc.nextInt();
	
	if (score < 0)
	{ System.out.println("재입력하세요");
	}
	else if (score > 100)
	{ System.out.println("재입력하세요");
	}
	else
	{ if (score >= 90)
	{System.err.println("A");
	}
	else if (score >= 80)
	{System.out.println("B");
	}
	else if (score >= 70)
	{System.out.println("C");
	}
	else if (score >= 60)
	{System.out.println("D");
	}
	else
	{ System.out.println("F");
	}

}
}
}
