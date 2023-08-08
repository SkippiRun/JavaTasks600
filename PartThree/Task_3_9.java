import java.util.*;
class Task_3_9{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int a, b, c;
		System.out.print("Введите количество 10 бальных крышек ");
		a = in.nextInt();
		System.out.print("Введите количество 100 бальных крышек ");
		b = in.nextInt();
		System.out.print("Введите количество 1000 бальных крышек ");
		c = in.nextInt();
		System.out.println("Общее число баллов " + (a*10+b*100+c*1000));
	}
}
