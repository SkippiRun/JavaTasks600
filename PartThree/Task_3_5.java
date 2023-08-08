import java.util.*;
class Task_3_5{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double A, B, C;
		System.out.print("Введите катет 1 ");
		A = in.nextDouble();
		System.out.print("Введите катет 2 ");
		B = in.nextDouble();
		//System.out.print("Введите гипотенузу ");
		C = Math.sqrt((A*A)+(B*B));//in.nextDouble();
		System.out.println(C + "\nПлощадь равна " + A*B + "\nПериметр равен " + (A+B+C));
	}
}
