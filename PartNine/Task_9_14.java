import java.util.*;
class Task_9_14 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num, num1, num2, num3;
	System.out.println("Введите оценку");
	num = in.nextInt();
	//System.out.println(num1+" "+num2+" "+num3);
	if (num == 2 || num == 1) System.out.println("Неудовлетворительно");
	else if (num == 3) System.out.println("Удовлетворительно");
	else if (num == 4) System.out.println("Хорошо");
	else if (num == 5) System.out.println("Отлично");
}
}
