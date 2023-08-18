import java.util.*;
class Task_9_18 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num1, num2, num3;
	System.out.println("Введите длину 1 стороны треугольника ");
	num1 = in.nextInt();
	System.out.println("Введите длину 2 стороны треугольника ");
	num2 = in.nextInt();
	System.out.println("Введите длину 3 стороны треугольника ");
	num3 = in.nextInt();
	//System.out.println(num1+" "+num2+" "+num3);
	if ((num1+num2)>num3 && (num1+num3)>num2 && (num3+num2)>num1) System.out.println("Треугольник с такими сторонами существует!");
	else System.out.println("Треугоник с такими сторонами НЕ существует");
}
}
