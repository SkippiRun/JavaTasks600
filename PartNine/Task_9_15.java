import java.util.*;
class Task_9_15 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num, num1, num2, num3;
	System.out.println("Введите номер месяца");
	num = in.nextInt();
	//System.out.println(num1+" "+num2+" "+num3);
	if (num >=1 && num <=12){
		if (num == 12 || num == 1 || num == 2) System.out.println("Ваш месяц - Зима");
		else if (num >= 3 && num <= 5) System.out.println("Ваш месяц - Весна");
		else if (num >= 6 && num <= 8) System.out.println("Ваш месяц - Лето");
		else if (num >= 9 && num <= 11) System.out.println("Ваш месяц - Осень");
	}
	else System.out.println("Нет месяца с таким номером");
}
}
