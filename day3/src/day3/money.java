package day3;
import java.util.Scanner;
public class money {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� �Է��ϼ���:");
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
	
	System.out.println("��������"+a+"��");
	System.out.println("������"+b+"��");
	System.out.println("õ����"+c+"��");
	System.out.println("���"+d+"��");
	System.out.println("���ʿ�"+e+"��");
	System.out.println("�ʿ�"+f+"��");
	System.out.println("�Ͽ�"+g+"��");
	
	
			

}
}
