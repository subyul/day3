package day3;
import java.util.Scanner;
public class money {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("돈을 입력하세요:");
	int money = sc.nextInt();
	
	int a = money/50000;
	money=money-(a*50000);
	int b = money/10000;
	money -=(b*10000);
	int c = money/1000;
	money -=(c*1000);
	int d = money/100;
	money -=(d*100);
	int e = money/50;
	money -=(e*50);
	int f = money/10;
	money -=(f*10);
	int g = money/1;
	money -=(f*1);
	
	System.out.println("오만원권"+a+"매");
	System.out.println("만원권"+b+"매");
	System.out.println("천원권"+c+"매");
	System.out.println("백원"+d+"매");
	System.out.println("오십원"+e+"매");
	System.out.println("십원"+f+"매");
	System.out.println("일원"+g+"매");
	
	
			

}
}
