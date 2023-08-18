import java.util.*;
class Task_9_17 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num, num1, num2, num3;
	System.out.println("Введите 1 угол : ");
	num1 = in.nextInt();
	System.out.println("Введите 2 угол: ");
	num2 = in.nextInt();
	System.out.println("Введите 3 угол: ");
	num3 = in.nextInt();
	//System.out.println(num1+" "+num2+" "+num3);
	if ((num1+num2+num3) !=180) System.out.println("Такого треугольника быть не может");
	else System.out.println("Треугольник с такими углами существует");
}
}
