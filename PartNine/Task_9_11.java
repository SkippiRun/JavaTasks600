import java.util.*;
class Task_9_11 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num, num1, num2, num3;
	System.out.println("Введите трехзначное число");
	num = in.nextInt();
	num1 = (num%1000)/100;
	num2 = (num%100)/10;
	num3 = num%10;
	//System.out.println(num1+" "+num2+" "+num3);
	if ((num1 == num2) && (num2 == num3)) System.out.println("Ваше число плоское");
	else System.out.println("Ваше число не плоское");
}
}
