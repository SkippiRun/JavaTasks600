import java.util.*;
class Task_9_16 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num, num1, num2, num3;
	System.out.println("Введите час");
	num = in.nextInt();
	//System.out.println(num1+" "+num2+" "+num3);
	if (num >=0 && num <=23){
		if (num >= 6 && num <= 10) System.out.println("Сейчас утро");
		else if (num > 10 && num <= 18) System.out.println("Сейчас день");
		else if (num > 18 && num <= 22) System.out.println("Сейчас вечер");
		else if (num > 22 || num >= 0 && num < 6) System.out.println("Сейчас ночь");
	}
	else System.out.println("Неверно введено время");
}
}
