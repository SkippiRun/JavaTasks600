import java.util.*;
class Task_9_8 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num, num1, num2, sum1, sum2;
	System.out.println("Введите шестизначный номер билета");
	num = in.nextInt();
	num1 = num/100000*100+(num%100000)/10000*10+(num%10000)/1000;
	num2 = (num%1000)/100*100+(num%100)/10*10+num%10;
	sum1 = (num1%1000)/100+(num1%100)/10+num1%10;
	sum2 = (num2%1000)/100+(num2%100)/10+num2%10;
	if ((sum1 == sum2) && (sum1%2==0) && (sum2%2==0)) System.out.println("Ваш билет счастливый");
	else System.out.println("Ваш билет не счастливый");
}
}
